import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                // Meminta input string dalam format camelCase
                System.out.println("Masukkan kata dalam format camelCase: ");
                String camelCase = input.nextLine();

                int wordCount = 1; // Mulai dengan 1 karena kata pertama selalu huruf kecil

                // Loop melalui setiap karakter dalam string
                for (int i = 0; i < camelCase.length(); i++){
                    // Jika ada huruf besar, itu mennadakan kata baru
                    if (Character.isUpperCase(camelCase.charAt(i))){
                         wordCount++;
                    }
                }

                // Menampilkan jumlah kata
                System.out.println("Jumlah kata dalam camelCase: " + wordCount);

                input.close();
    }
}



