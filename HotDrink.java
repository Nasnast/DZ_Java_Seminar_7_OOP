package temp2;

public class HotDrink extends Product {
    private int temperature;
    private double volume;

    public HotDrink(String name, double cost, int temperature, double volume) {
        // this.name = name;
        // this.cost = cost;
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String toString() {
        return "\n" + "Горячий напиток: " + super.name + " объем: " + volume + " темперутура напитка: " + temperature
                + " цена: "
                + super.cost;
    }
}
