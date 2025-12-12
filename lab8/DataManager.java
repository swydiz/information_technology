package lab8;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataManager {

    private final List<Object> processors = new ArrayList<>();
    private List<String> data = new ArrayList<>();
    private List<String> processedData = new ArrayList<>();

    //регистрация объекта
    public void registerDataProcessor(Object processor) {
        processors.add(processor);
    }

    //загружаем данные из исходного источника
    public void loadData(String source) {
        try {
            data = Files.readAllLines(Paths.get(source));
            System.out.println("Данные загружены: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //запускает многопоточную обработку данных
    public void processData() {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<List<String>>> futures = new ArrayList<>(); 
        for (Object processor : processors) { 
            for (Method method : processor.getClass().getDeclaredMethods()) { 
                if (method.isAnnotationPresent(DataProcessor.class)) {

                    futures.add(executor.submit(() -> {
                        try {
                            return (List<String>) method.invoke(processor, data);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return new ArrayList<String>();
                    }));
                }
            }
        }

        processedData = futures.stream() 
                .flatMap(f -> { 
                    try { return f.get().stream(); }
                    catch (Exception e) { return Stream.<String>empty(); }
                })
                .collect(Collectors.toList()); 

        executor.shutdown(); 
        System.out.println("Обработанные данные: " + processedData);
    }

    //сохраняем обработанные данные в новый источник
    public void saveData(String destination) {
        try {
            Files.write(Paths.get(destination), processedData);
            System.out.println("Результат сохранён в " + destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
