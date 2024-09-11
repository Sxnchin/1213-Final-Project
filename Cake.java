public class Cake extends Baked{
    private String flavor;

    public Cake(String name, double price, String flavor) throws InvalidPriceException{
        super(name,price);
        this.flavor = flavor;
    }
    public String getFlavor(){
        return flavor;
    }
    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }
    @Override
    public String toString(){
        return super.toString() + ", Flavor of Cake : "+ flavor;
    }
}