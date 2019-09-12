package source.model;

public class Product {
    private int id;
    private String name;
    private int weight;
    private String address;

    public Product() {
    }

    public Product(int id, String name, int weight, String address) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
