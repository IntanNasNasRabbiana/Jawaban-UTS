/*Nama : Intan Nas Nas Rabbiana
NIM    : 11200930000010
Kelas  : 2A- Sistem Informasi
Matkul : Pemrograman lanjut
*/

package uts;

public class Matematikacanggihbangetberaksi {
    private int pertambahanEmpat,pertambahan,perkalian,modulus;
     public static void main (String [] args){
        Matematikacanggihbanget mtk = new Matematikacanggihbanget();
        
        mtk.setpertambahanEmpat(10,10,10,10);        
                System.out.println("Hasil dari 10 + 10 + 10 + 10 adalah : " +mtk.getpertambahanEmpat());
        mtk.setpertambahan(10,20);
                System.out.println("Hasil dari 10 + 20 adalah : " +mtk.getpertambahan());
        mtk.setperkalian(10,20);
                System.out.println("Hasil dari 10 * 20 adalah : " +mtk.getperkalian());
        mtk.setmodulus(10,5);
                System.out.println("Hasil modulus adalah : " +mtk.getmodulus());
                
}
}