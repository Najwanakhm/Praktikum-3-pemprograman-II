package Prakitikum3_2;

/**
 *
 * @author LENOVO
 */

    // Import All util pada package
import java.util.*; 

public class Negara{
 private String namaNegara, jenisP, namaP;
 private int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
 
// Constructor
public Negara(String namaNegara,String jenisKepemimpinan, String namaPemimpin,
        int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
 this.namaNegara =namaNegara;
  this.jenisP = jenisKepemimpinan;
   this.namaP = namaPemimpin;
    this.tanggalKemerdekaan = tanggalKemerdekaan;
     this.bulanKemerdekaan =bulanKemerdekaan;
      this.tahunKemerdekaan =tahunKemerdekaan;
}
//encapsulation
public int getBulan(){
return bulanKemerdekaan;
}
 
void getData(){
Scanner input=new Scanner(System.in);
namaNegara= input.nextLine();
jenisP= input.nextLine();
namaP= input.nextLine();
if(!(jenisP.equalsIgnoreCase("Monarki"))){
tanggalKemerdekaan= input.nextInt();
bulanKemerdekaan= input.nextInt();
tahunKemerdekaan= input.nextInt();
}
}

void tampil(){
    HashMap<Integer, String> Bulan =new HashMap <Integer,String>();
    Bulan.put(1,"Januari");
    Bulan.put(2,"Februari");
    Bulan.put(3,"Maret");
    Bulan.put(4,"April");
    Bulan.put(5,"Mei");
    Bulan.put(6,"Juni");
    Bulan.put(7,"July");
    Bulan.put(8,"Agustus");
    Bulan.put(9,"September");
    Bulan.put(10,"Oktober");
    Bulan.put(11,"November");
    Bulan.put(12,"Desember");
    
    //yang di print pada kalimat pertama
    if(jenisP.equalsIgnoreCase("Monarki")){
        System.out.println("Negara " + namaNegara + " mempunyai Raja bernama " + 
namaP + "\n");
        
         if(jenisP.equalsIgnoreCase("Presiden")){
        System.out.println("Negara " + namaNegara + " mempunyai Presiden bernama " + 
namaP + "\n");
         if(jenisP.equalsIgnoreCase("Perdana menteri")){
        System.out.println("Negara " + namaNegara + " mempunyai Perdana Menteri bernama " + 
namaP+ "\n");
        }
     
}
  // yang di print pada kalimat kedua
  if(jenisP.equalsIgnoreCase("presiden")||jenisP.equalsIgnoreCase("perdana menteri")){
  
      System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + 
" " + Bulan.get(getBulan())+ " " + tahunKemerdekaan + "\n");
  
  
  
  }

   }
 }
}
