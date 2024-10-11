package Streams.Streams1;

public class Car {
    int speed;
    int price;
    String brand;
    public Car(int speed,int power,String name){
        this.speed=speed;
        this.price=power;
        this.brand=name;
    }

    @Override
    public String toString(){
        return "[Speed=" + this.speed + ", Price=" + this.price + ", Name=" + this.brand + "]\n";
    }
}
