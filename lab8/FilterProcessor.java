package lab8;

import java.util.List;
import java.util.stream.Collectors;

//класс фильтрации данных
public class FilterProcessor {

    @DataProcessor
    public List<String> filterStrings(List<String> input) {
        return input.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
    }
}
