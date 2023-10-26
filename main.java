import java.util.Scanner;

public class main {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.print("Lunghezza array: ");
          int Lunghezza = input.nextInt();
          int[] numeri = new int[Lunghezza];
          for (int i = 0; i < Lunghezza; i++) {
               System.out.print("Elemento " + (i + 1) + ": ");
               numeri[i] = input.nextInt();
          }
          // System.out.print(numeri);

          // somma
          int somma = 0;
          for (int i = 0; i < Lunghezza; i++) {
               somma += numeri[i];
          }
          System.out.println("Somma: " + somma);

          // media
          double media = (double) somma / Lunghezza;
          System.out.println("Media: " + media);
     }
}