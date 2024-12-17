package training;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        training.exercises.basic.chapter04.Ejercicio01.main(new String[] { "2", "3" });
        SumaNums suma = (a, b) -> a + b;
        
        System.out.println(suma.cNum(2, 4));

        System.out.println("\u001B[43masdasd\u001B[0m");

        ArrayList<String> array = new ArrayList<String>() {{
            add("caballo");
            add("silla");
            add("zapato");
            add("yegua");
        }};

        array.forEach(System.out::println);
    }
}

@FunctionalInterface
interface SumaNums {
    int cNum(int a, int b);
}