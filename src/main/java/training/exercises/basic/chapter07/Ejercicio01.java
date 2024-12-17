package training.exercises.basic.chapter07;

public class Ejercicio01 {
    public static void main(String[] args) {
        SumaNums suma = (a, b) -> a + b;

        System.out.println(suma.cNum(2, 4));
    }
}

@FunctionalInterface
interface SumaNums {
    int cNum(int a, int b);
}