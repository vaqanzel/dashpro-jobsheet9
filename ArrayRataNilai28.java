import java.util.Scanner;
public class ArrayRataNilai28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jmlLulus = 0;
        int jmlTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
         if (nilaiMhs[i] > 70) {
            totalLulus += nilaiMhs[i];
            jmlLulus++; 
        } else {
            totalTidakLulus += nilaiMhs[i];
            jmlTdkLulus++;
      }
     }
        double rataLulus = (jmlLulus>0) ? totalLulus / jmlLulus : 0;
        double rataTdkLulus = (jmlTdkLulus > 0) ? totalTidakLulus /jmlTdkLulus : 0;
        
        System.out.println("Rata-rata nilai lulus = " +rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataTdkLulus);
}
}