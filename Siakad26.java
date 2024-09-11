import java.util.Scanner;

public class Siakad26 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);     
 String nama, nim;
 char kelas;
 byte absen;
 double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
 System.out.print("Masukan  Nama: ");
 nama = sc.nextLine();
 System.out.print("Masukkan NIM: ");
 nim = sc.nextLine();
 System.out.print("Masukkan Kelas: ");
 kelas = sc.nextLine().charAt(0);
 System.out.print("Masukkan Nomor Absen: ");
 absen = sc.nextByte();

 System.out.print("Masukkan nilai kuis: ");
 nilaiKuis = sc.nextDouble();
 System.out.print("Masukkan nilai tugas: ");
 nilaiTugas = sc.nextDouble();
 System.out.print("Masukkan nilai ujian: ");
 nilaiUjian = sc.nextDouble();

 nilaiAkhir = ( nilaiKuis + nilaiTugas + nilaiUjian) / 3;

 System.out.print("Nama: " + nama + "NIM: " + nim);
 System.out.print("kelas: " + nama + "Absen" + absen );
 System.out.print("Nilai Akhir:" + nilaiAkhir);
    
    }

}