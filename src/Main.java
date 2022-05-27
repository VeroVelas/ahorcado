import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Juego ahorcado = new Juego((byte)3, "Manzana");
        Scanner teclado = new Scanner(System.in);

        while(ahorcado.isLive()){
            System.out.println("Letra: ");
            if(ahorcado.buscarLetra(teclado.nextLine().charAt(0))){
                for (char letra: ahorcado.getAux()) {
                    if (letra == null)
                        System.out.print(" _ ");
                    else
                        System.out.print(letra);
                }
            }
        }
    }
}