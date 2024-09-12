import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long jmljam, upah, gajiawal, gajiakhir, bonus, pajak, gajisebelumpajak;

        System.out.println("Masukkan jumlah kerja anda: ");
        jmljam = input.nextLong();
        System.out.println("Masukkan upah per jam anda: ");
        upah = input.nextLong();

        gajiawal = upah*jmljam;
        bonus = gajiawal*10/100;
        gajisebelumpajak = gajiawal + bonus;
        pajak = gajiawal*5/100;
        gajiakhir = (gajisebelumpajak-pajak) *30;

        System.out.println("gaji akhir anda adalah: " + gajiakhir);
        
    }
}
