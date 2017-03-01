package net.dnns.giessy.torch.model;

import android.widget.EditText;

import net.dnns.giessy.torch.R;

/**
 * Created by Tincho on 2/28/2017.
 */

public class Product {

    private long id;
    private String name;
    private String brand;
    private String model;
    private String amount;
    private String price;
    private String weight;
    private String code;

    public Product(long id, String name, String brand, String amount, String weight, String code, String price, String model) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.amount = amount;
        this.weight = weight;
        this.code = code;
        this.price = price;
        this.model = model;
    }

    public Product(String name, String brand, String model, String amount, String price, String weight, String code) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.amount = amount;
        this.price = price;
        this.weight = weight;
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
