package app.entity;

import app.utils.Constants;

public record Product(String name, double price) {

    @Override
    public String toString() {
        return name + ", price is " + Constants.CURRENCY +
                " " + price;
    }
}
