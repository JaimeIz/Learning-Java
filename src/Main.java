import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // chapter04.Ejercicio01.main(new String[]{"2", "3"});
        Consumer<String> fun = (String a) -> System.out.println(a);

        System.out.println(new String("aaaa") + "a");
        int casa = 0;
        casa = casa(casa);
    }

    public static int casa(int casa) {
        return casa;
    }
} 