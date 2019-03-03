package notjustpackage;



public class Human implements Mammal {

    public Human(int oxygen) {
        this.oxygen = oxygen;
    }

    public int getOxygen() {
        return oxygen;
    }

    public void setOxygen(int oxygen) {
        this.oxygen = oxygen;
    }

    public int oxygen = 0;
    public int Breathe(){
        oxygen++;
        return oxygen;
    }
}
