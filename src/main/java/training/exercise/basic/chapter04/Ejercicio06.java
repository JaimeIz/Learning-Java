package training.exercise.basic.chapter04;

/**
 * <h2>Sexto Ejercicio.</h2>
 * Ahora se tienen que listar todos los argumentos hasta que se encuentre la palabra “fin”,
 *  pero esta no debe ser incluida en la lista. ¿Qué pasa si no se recibe ninguno?
 * 
 *  @author JaimeIz
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        try {
            if (args.length == 0)
                throw new Exception("No se ha introducido ningún argumento");

            String delimiter = "fin";
            
            boolean hasEnd = false;
            for (String arg : args) {
                if (arg.equalsIgnoreCase(delimiter)) {
                    hasEnd = true;
                    break;
                }
            }

            if (!hasEnd)
                throw new Exception("No tiene la palabra fin, asegurate de incluirla entre los argumentos.");

            if (args.length == 1)
                System.out.println("Se ha recivido un argumento");
            else
                System.out.printf("Se han recivido %d argumentos\n", args.length);

            System.out.print("Se han recivido los sigientes argumentos: ");

            int i = 0;
            while (!args[i].equalsIgnoreCase(delimiter)) {
                System.out.printf("\n\t %d - %s", i, args[i++]);
            }

        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
