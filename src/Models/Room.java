package Models;

public class Room {
    private int number;
    private int price;

    public Room(int number, int price) {
        this.number = number;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}