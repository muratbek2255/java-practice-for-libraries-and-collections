package optionals;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if(noVal.isPresent()) System.out.println("Не подлежит выводу");
        else System.out.println("Не содержит значение");

        if (hasVal.isPresent()) System.out.println(hasVal.get());

        String defStr = noVal.orElse("Строка по умолчанию");
        System.out.println(defStr);
    }
}
