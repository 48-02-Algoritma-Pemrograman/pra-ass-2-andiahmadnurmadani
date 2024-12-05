import java.util.Scanner;
import java.util.ArrayList;

public class Hitung{

    public static ArrayList<Integer> data = new ArrayList<>();

    static int terkecil() {
      int terkecil = data.get(0);
      for (int i = 0; i < data.size(); i++) {
        if (terkecil > data.get(i)) {
          terkecil = data.get(i);
        }
      }
      return terkecil;
    }

    static double rataRata() {
      double jumlah = 0;
      double hasil = 0;
      for (int semuaNilai : data) {
        jumlah += semuaNilai;
      }
      hasil = jumlah / data.size();
      return hasil;
    }

    static int terbesar() {
      int terbesar = data.get(0);
      for (int i = 0; i < data.size();i++) {
        if (terbesar < data.get(i)) {
          terbesar = data.get(i);
        }
      }
      return terbesar;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Pekerjaan anda mulai dari sini */
        boolean ulangi = true;

        while (ulangi) {
          int nilaiBaru = input.nextInt();
          data.add(nilaiBaru);

          String lanjut = input.next();
          if (lanjut.equalsIgnoreCase("T")) {
            break;
          }
        }

        System.out.println("Nilai minimal : " + terkecil());
        System.out.println("Nilai maksimal : " + terbesar());
        System.out.println("Nilai rata-rata : " + rataRata());
        
        /* Pekerjaan anda berakhir sini */
    }
}
