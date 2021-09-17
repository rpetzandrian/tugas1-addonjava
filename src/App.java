import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("");
            System.out.println("Info pilihan opsi :");
            System.out.println("0. Close Program");
            System.out.println("1. See Biodata");
            System.out.println("2. Main Program");
            System.out.print("Masukkan Input opsi: ");
            int opt = Integer.valueOf(sc.nextLine());
            System.out.println("");

            if (opt == 1) {
                identitas();
            } else if (opt == 2) {
                System.out.print("Masukkan angka ganjil: ");
                int n = Integer.valueOf(sc.nextLine());
                pola(n);
            } else {
                run = false;
            }
        }

        sc.close();
    }

    private static void identitas() {
        String firstName = "Rico Andrian";
        String lastName = "Firmansyah";
        String birthPlace = "Klaten";
        int birthYear = 2003;
        String favLanguage = "Javascript, Java";

        System.out.println("Ini adalah biodata saya: ");
        System.out.println("Nama: " + firstName + " " + lastName);
        System.out.println("Lahir: " + birthPlace + ", " + birthYear);
        System.out.println("Bahasa Fav: " + favLanguage);
    }

    private static void pola(int n) {
        // Baris
        for (int i = 0; i < n; i++) {
            String str = "";
            // kolom
            for (int j = 0; j < n; j++) {
                str += "*";
            }
            // space
            char[] strArray = str.toCharArray();
            for (int j2 = 0; j2 < (i <= n / 2 ? i : n - 1 - i); j2++) {
                strArray[n - 1 - j2] = ' ';
                strArray[j2] = ' ';
            }
            // return value
            str = String.valueOf(strArray);
            System.out.println(str);
        }
    }
}
