import java.util.Scanner;

public class Tugas15 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("=== Survei responden ===\nMasukkan nilai 1-5 untuk setiap pertanyaan!\n");
    int[][] survei = new int[10][6];
    double[] nilai = new double[10];

    for (int i = 0; i < survei.length; i++) {
      System.out.println("Data responden ke-" + (i + 1));
      int k = 0;

      while (k < survei[i].length) {
        System.out.print("Masukkan nilai untuk pertanyaan ke-" + (k + 1) + " : ");
        survei[i][k] = userInput.nextInt();

        if (survei[i][k] < 1 || survei[i][k] > 5) {
          System.out.println("Invalid nilai.\nMohon masukkan nilai 1-5!");
          continue;
        }
        k++;
      }
      System.out.println();
    }
    // mengisi elemen array nilai
    for (int i = 0; i < survei.length; i++) {
      int total = 0;
      double rataRata = 0;
      for (int j = 0; j < survei[i].length; j++) {
        total += survei[i][j];
      }
      rataRata = (double) total / survei[i].length;
      nilai[i] = rataRata;
    }
    // menjumlahkan semua elemen array nilai lalu cari rata rata
    double total = 0;
    double rataRata;
    for (int a = 0; a < nilai.length; a++) {
      total += nilai[a];
    }
    rataRata = total / nilai.length;

    System.out.println("Nilai rata-rata keseluruhan = " + rataRata);

    userInput.close();
  }
}