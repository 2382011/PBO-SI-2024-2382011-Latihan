public class Soal01 {
    public static void main(String[] args) {
        int [] ar = {1, 2, 3};
        int sum = 0;

        // For loop
        for (int i = 0; i< ar.length; i++){
            sum += ar[i];
        }

        // Mencetak hasil penjumlahan
        System.out.println("Jumlah elemen array adalah: " + sum);
    }
}
