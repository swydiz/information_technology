package lab8;

import java.util.List;
import java.util.stream.Collectors;

//класс трансформатор
public class UppercaseProcessor {

    @DataProcessor
    public List<String> process(List<String> input) {
        return input.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }
}
