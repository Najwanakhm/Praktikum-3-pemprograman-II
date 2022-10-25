
package praktikum3;

import java.util.LinkedList;
import java.util.Scanner;

public class main { 
  public static void main(String[] args) { 
      
    Scanner inputDadu = new Scanner(System.in);
    int input = inputDadu.nextInt();
    int total = 0;
    
    LinkedList<Dadu> objdadu = new LinkedList<Dadu>();
    for (int i=0; i < input; i++ ) {
        objdadu.add(new Dadu());
        
        objdadu.getLast().acakNilai();
    }
    
    for (int j = 0; j < input; j++) {
        System.out.println("Dadu ke-" + (j+1) + " Bernilai : " + objdadu.get(j).getNilai());
    
        total = total + objdadu.get(j).getNilai();
    }
    
      System.out.println("Total nilai dadu   : " + total);
  } 
}
