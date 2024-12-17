package exercises.basic.chapter04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;
import org.junit.jupiter.params.provider.MethodSource;

import training.exercises.basic.chapter04.Ejercicio01;

public class TestsEjercicio01 {

    static Stream<Arguments> wrongNumberOfArguments() {
        return Stream.of(
                Arguments.of((Object) new String[] { "5" }),
                Arguments.of((Object) new String[] { "8", "3", "6" }));
    }

    @ParameterizedTest
    @MethodSource("wrongNumberOfArguments")
    void testWrongNumberOfArguments(String[] arguments) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
