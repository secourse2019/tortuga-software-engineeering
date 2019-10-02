package geolocation;

public class Address {

    private String city;
    private String country;
    private String number;
    private String street;

    Address(String city, String country, String number, String street) {
       this.city = city;
       this.country = country;
       this.number = number;
       this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
