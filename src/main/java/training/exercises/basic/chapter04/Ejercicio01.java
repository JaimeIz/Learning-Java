package training.exercises.basic.chapter04;

/**
 * <h2>Primer Ejercicio.</h2>
 *  Se creará un programa que implemente una funcionalidad para calcular el área de un rectángulo y que
 *  imprima por pantalla el texto “El rectángulo de … por … tiene un área de …”. Recibirá el tamaño
 *  de los dos lados como argumentos.
 * 
 *  @author JaimeIz
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        try {
            if (args.length != 2)
                throw new Exception("Solo hay que introducir dos argumentos numericos");
            
            float a = Float.valueOf(args[0]);
            float b = Float.valueOf(args[1]);

            System.out.printf("El rectángulo de %s por %s tiene un área de %s\n", a, b, a * b);
        } catch (NumberFormatException ex) {
            System.err.println("Uno o ambos de los argumentos no es un numero");
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
