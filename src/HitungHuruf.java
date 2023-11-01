import java.util.Scanner;

public class HitungHuruf {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eko");

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        int jumlahHuruf = hitungHuruf(kalimat);
        System.out.println("Jumlah huruf dalam kalimat adalah: " + jumlahHuruf);

        scanner.close();
    }

    /**
     *
     * @param kalimat
     * @return
     */
    public static int hitungHuruf(String kalimat) {

        int jumlahHuruf = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);

            if (Character.isLetter(karakter)) {
                jumlahHuruf++;
            }
        }

        return jumlahHuruf;
    }
}

