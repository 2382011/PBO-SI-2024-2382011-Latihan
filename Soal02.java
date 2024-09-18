public class Soal02 {
    public static void main(String[] args) {
                int n = 4; // Ukuran tangga

                // Menggunakan perulangan for untuk mencetak setiap baris tangga
                for (int i = 1; i <= n; i++) {
                    // Mencetak spasi terlebih dahulu
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }

                    // Mencetak simbol #
                    for (int k = 1; k <= i; k++) {
                        System.out.print("#");
                    }

                    // Berpindah ke baris berikutnya
                    System.out.println();
                }
            }
        }

