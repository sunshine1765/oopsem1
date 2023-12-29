package Domain;

public class Bootle extends Product {

    private float bootleVolume;

    public Bootle(int price, int place, String name, long id, float bootleVolume) {
        super(price, place, name, id);
        this.bootleVolume = bootleVolume;
    }

    public float getBootleVolume() {
        return bootleVolume;
    }

    public void setBootleVolume(float bootleVolume) {
        this.bootleVolume = bootleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + "volume = " + bootleVolume+"\n";
    }
    
    
}
