package praktikum3;

public class Dadu {
    private int nilai;
    
    public int acakNilai(){
        return nilai = (int) (Math.random()*(6-1+1)+1);
    }

    public int getNilai() {
        return nilai;
    }
    
    
}
  