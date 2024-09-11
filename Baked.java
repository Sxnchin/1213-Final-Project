public abstract class Baked{
    private String name;
    private double price;

    public Baked(String name, double price) throws InvalidPriceException{
        if (price < 0){
            throw new InvalidPriceException("Price is Negative, fix that.");
        }
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Price: $" + price;
    }
}