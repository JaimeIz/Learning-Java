package exercise.basic.chapter04;

/**
 * <h2>Segundo Ejercicio.</h2>
 *  Se deberá comprobar el número de argumentos que reciba el programa. Si no recibe argumentos,
 *  se deberá avisar al usuario. En caso contrario, se deberá indicar cuántos ha recibido.
 * 
 *  @author JaimeIz
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        try {
            if (args.length == 0)
                throw new Exception("No se ha introducido ningún argumento");
            

            if (args.length == 1)
                System.out.println("Se ha recivido un argumento");
            else
                System.out.printf("Se han recivido %d argumentos\n", args.length);

        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
