package net.dnns.giessy.torch.model;

/**
 * Created by Tincho on 2/27/2017.
 */

public class Shop {

    private long id;
    private String shopName;
    private String street;
    private String city;
    private String province;
    private String country;
    private String latLon;

    public Shop(long id, String shopName, String street, String city, String province, String country, String latLon) {
        this.id = id;
        this.shopName = shopName;
        this.street = street;
        this.city = city;
        this.province = province;
        this.country = country;
        this.latLon = latLon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatLon() {
        return latLon;
    }

    public void setLatLon(String latLon) {
        this.latLon = latLon;
    }
}
