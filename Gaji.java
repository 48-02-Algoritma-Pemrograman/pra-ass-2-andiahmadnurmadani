import java.util.Scanner;

public class Gaji{
    public static int masaKerja;

    static int gaji() {
      int gaji;
      if (masaKerja < 5) {
        gaji = 5000000;
      } else if (masaKerja >= 5 && masaKerja <= 10){
        gaji = 7500000;
      } else {
        gaji = 10000000;
      }
      return gaji;
    }

    static int lembur(int jumlahJam) {
      int honor;
      if (masaKerja < 5) {
        honor = 40000 * jumlahJam;
      } else if (masaKerja >= 5 && masaKerja <= 10) {
        honor = 50000 * jumlahJam;
      } else {
        honor = 75000 * jumlahJam;
      }
      return honor;

    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */
        int hasil = gaji() + lembur(jamLembur);
        System.out.println(hasil);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
    }
}
