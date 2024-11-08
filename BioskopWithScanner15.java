import java.util.Scanner;
public class BioskopWithScanner15 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int baris, kolom, pilihan;
    String nama, next;
    next = "y";
    String[][] penonton = new String[4][2];

    while (true) {
      System.out.println("Menu 1: Input data penonton");
      System.out.println("Menu 2: Tampilkan daftar penonton");
      System.out.println("Menu 3: Exit");
      System.out.print("Pilih menu : ");
      pilihan = userInput.nextInt();
      userInput.nextLine();
      System.out.println();
      switch (pilihan) {
        case 1:
          System.out.print("Masukkan nama: ");
          nama = userInput.nextLine();
          while (true) {
            System.out.print("Masukkan baris: ");
            baris = userInput.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = userInput.nextInt();
            if (baris > 4 || kolom > 2) {
              System.out.println("Maaf kursi tidak tersedia!");
              continue;
            } else if (penonton[baris - 1][kolom - 1] != null) {
              System.out.println("Maaf kursi sudah terisi.\nMohon masukkan baris dan kolom kembali!");
              continue;
            } else {
              break;
            }
          }
          userInput.nextLine();
          penonton[baris - 1][kolom - 1] = nama;
          break;
        case 2:
          for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
              if (penonton[i][j] == null) {
                penonton[i][j] = "***";
              }
            }
            System.out.println("Penonton baris ke-" + (i + 1) + ": " + String.join("\t", penonton[i]));
          }
          break;
        case 3:
          next = "n";
          break;
        default:
          System.out.println("Input menu tidak valid!");
      }
      System.out.println();

      if (next.equalsIgnoreCase("n")) {
        break;
      }
    }
    System.out.println("=== SELESAI ===");
  }
}