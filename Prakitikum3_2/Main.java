
package Prakitikum3_2;

/**
 *
 * @author LENOVO
 */
// 
import java.util.*;
 
public class Main {
 public static void main(String[] args) {

 String namaNegara = "", jenisP = "", namaP = "";
 int tanggalKemerdekaan = 0, bulanKemerdekaan = 0, tahunKemerdekaan = 0;

 Scanner input = new Scanner(System.in);
 
 LinkedList<Negara> ssNegara = new LinkedList<Negara>();
  
 int pengulang = input.nextInt();
 
 for (int i = 0; i < pengulang; i++){
 Negara sementara = new Negara(namaNegara, jenisP, 
namaP, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
 sementara.getData();
 ssNegara.add(sementara);
 }
 
 
 for (int i = 0; i < ssNegara.size(); i++){
 Negara Cetak = ssNegara.get(i);
 Cetak.tampilkan();
 }
 }
}