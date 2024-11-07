import java.util.Scanner;

public class BioskopWithScanner15 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int baris, kolom;
    String nama, next;

    String[][] penonton = new String[4][2];

    while (true) {
      System.out.print("Masukkan nama: ");
      nama = userInput.nextLine();
      System.out.print("Masukkan baris: ");
      baris = userInput.nextInt();
      System.out.print("Masukkan kolom: ");
      kolom = userInput.nextInt();
      userInput.nextLine();

      penonton[baris - 1][kolom - 1] = nama;

      System.out.print("Input penonton lainnya? (y/n): ");
      next = userInput.nextLine();

      if (next.equalsIgnoreCase("n")) {
        break;
      }
    }
    
  }
}