package training.examples;

import java.util.*;
import java.util.function.*;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("frog", true, true));
        animals.add(new Animal("bear", false, true));

        print(animals, a -> a.canHop());

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(13);
        numbers.add(-1);
        numbers.add(3);
        numbers.add(-20);
        numbers.add(-3);

        print(numbers, n -> n < 0);

        // animals.stream().filter(a -> a.canHop()).forEach(System.out::println);
    }

    private static <T> void print(List<T> things, Predicate<? super T> checker) {
        for (T thing : things) {
            if (checker.test(thing))
                System.out.print(thing + " ");
        }
        System.out.println();
    }
}

class Animal {
    private String name;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String name, boolean canHop, boolean canSwim) {
        this.name = name;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean canHop() {
        return canHop;
    }

    public void setCanHop(boolean canHop) {
        this.canHop = canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    @Override
    public String toString() { 
        return name;
    }

}