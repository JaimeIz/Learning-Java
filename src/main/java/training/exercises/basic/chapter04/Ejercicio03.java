package training.exercises.basic.chapter04;

/**
 * <h2>Tercer Ejercicio.</h2>
 *  Se deberá comprobar el número de argumentos que reciba el programa. Si no recibe argumentos,
 *  se deberá avisar al usuario. Si recibe hasta 4, se deberá indicar cuántos se han recibido.
 *  Si recibe más, se deberá avisar al usuario.
 * 
 *  @author JaimeIz
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        try {
            if (args.length == 0)
                throw new Exception("No se ha introducido ningún argumento");

            if (args.length == 1)
                System.out.println("Se ha recivido un argumento");
            else if (args.length >= 4)
                System.out.printf("Se han recivido mas de cuatro argumentos");
            else
                System.out.printf("Se han recivido %d argumentos\n", args.length);

        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
