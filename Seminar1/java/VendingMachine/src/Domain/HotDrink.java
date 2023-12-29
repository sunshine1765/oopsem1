package Domain;

public class HotDrink extends Product {
    
    //Поля

    private float temperature;

    //Конструктор

    public HotDrink(int price, int place, String name, long id, float temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    //Методы

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    // переопределение метода toString
    @Override
    public String toString() {
        return super.toString() + "temperature = " + temperature+"\n";
    }

}
