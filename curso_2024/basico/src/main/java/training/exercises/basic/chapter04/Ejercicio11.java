package training.exercises.basic.chapter04;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

/**
 * <h2>Septimo Ejercicio.</h2>
 * Se deberá calcular el valor absoluto de un float.
 * 
 * 
 * @author JaimeIz
 */
public class Ejercicio11 {
    // THIS MAKES NO SENSE! dont judge please :c

    public static final String HINT = "";

    private static boolean main_loop = true;
    private static boolean game_loop = true;

    public static void main(String[] args) throws Exception {

        try (Scanner in = new Scanner(System.in)) {
            // TODO: Extract to a string resource utility.
            System.out.println("""
                                ###############################
                                ### Piedra Papel o Tijera!! ###
                                ###############################

                                La reglas son las mismas del clasico!

                    Para jugar el jugador correspondiente debera introducir su
                            opcion tal y como se indicara en pantalla.

                    """);

            System.out.println("Pulsa [enter] para empezar una partida.");
            System.in.read();

            while (main_loop) {

                // TODO: search for alternative
                Player player_one = new Player("Player One", 0);
                Player player_two = new Player("Player Two", 0);

                int turn = 0;
                final int LAST_TURN = 1;
                game_loop = true;

                while (game_loop) {
                    Player player = turn == 0 ? player_one : player_two;

                    System.out.println("\nTurno del jugador " + player.getName());
                    printOptions(Player.OPTIONS);
                    boolean valid_option = true;
                    int selectedOption = 0;
                    while (valid_option) {
                        try {
                            System.out.print("Introduce jugada: ");
                            selectedOption = Integer.valueOf(in.next());

                            if (selectedOption < 0 || selectedOption > 3) {
                                System.out.printf("La opcion '%s' no es valida\n", selectedOption);
                            } else {
                                valid_option = false;
                            }
                        } catch (NumberFormatException ex) {
                            System.err.println("No es un numero.");
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }

                    player.setCurOpt(selectedOption);

                    // TODO: Extract logic from here; HIDE IT SOMEWHERE ELSE xD
                    if (turn == LAST_TURN) {
                        player_one.getCurOpt();
                        if (player_one.getCurOpt() == player_two.getCurOpt()) {
                            System.out.println("Empate!");
                            game_loop = false;
                        } else if (player_one.getCurOpt() == 3) {
                            winner(player_two);
                        } else if (player_two.getCurOpt() == 3) {
                            winner(player_one);
                        } else if (player_one.getCurOpt() == 0 & player_two.getCurOpt() == 1) {
                            winner(player_two);
                        } else if (player_one.getCurOpt() == 0 & player_two.getCurOpt() == 2) {
                            winner(player_one);
                        } else if (player_one.getCurOpt() == 1 & player_two.getCurOpt() == 1) {
                            winner(player_one);
                        } else if (player_one.getCurOpt() == 1 & player_two.getCurOpt() == 2) {
                            winner(player_one);
                        } else if (player_one.getCurOpt() == 2 & player_two.getCurOpt() == 1) {
                            winner(player_one);
                        } else if (player_one.getCurOpt() == 2 & player_two.getCurOpt() == 2) {
                            winner(player_one);
                        }

                        turn = 0;
                    } else {
                        turn++;
                    }
                }

                System.out.print("Revancha? [y/n]: ");
                if (!in.next().equalsIgnoreCase("y")) {
                    main_loop = false;
                    int result = player_one.compareTo(player_two);
                    if (result > 0) {
                        System.out.printf("El jugador '%s' ha ganado con una puntiacion de %d!", 
                            player_one.getName(), player_one.getScore());
                    } else if (player_one.compareTo(player_two) < 0) {
                        System.out.printf("El jugador '%s' ha ganado con una puntiacion de %d!", 
                            player_two.getName(), player_two.getScore());
                    } else {
                        System.out.println("El juego ha terminado en empate!");    
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void winner(Player player) {
        player.addScore(100);
        System.out.printf("The playet, %s, won the game\n", player.getName());
        game_loop = false;
    }

    public static void printOptions(String[] args) {
        System.out.println("Elije to jugada entra las siquientes:\n");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("  [%d] - %s\n", i, args[i]);
        }
        System.out.println();
    }
}

class Player implements Comparable<Player>, Comparator<Player> {
    public static final String[] OPTIONS = { "Piedra", "Papel", "Tijera", "Rendirse" };

    private String name;
    private int score;
    private int currentOpt;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public int getCurOpt() {
        return currentOpt;
    }

    public void setCurOpt(int currentOpt) {
        this.currentOpt = currentOpt;
    }

    public String displayCurrentOpt() {
        return OPTIONS[currentOpt];
    }

    @Override
    public int compareTo(Player p) {
        return Integer.compare(this.score, p.getScore());
    }

    @Override
    public int compare(Player p1, Player p2) {
        return p2.compareTo(p2);
    }
}
