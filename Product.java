package OOP.HomeWork1;

public abstract class Product {
    protected String name;
    protected double cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }


}