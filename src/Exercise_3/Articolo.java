package Exercise_3;

import java.util.Random;

public class Articolo {
    private String articleCode;
    private String description;
    private double price;
    private int storageQty;

    public Articolo(String description, double price, int storageQty) {
        Random rndm = new Random();
        int idCode = rndm.nextInt(100000, 900000);
        articleCode = String.valueOf(idCode);
        this.description = description;
        this.price = price;
        this.storageQty = storageQty;
    }

    @Override
    public String toString() {
        return "articleCode= " + articleCode + '\n' +
                "description= " + description + '\n' +
                "price= " + price + '\n' +
                "storageQty= " + storageQty;
    }

    public double getPrice() {
        return price;
    }
}
