public class Bread extends Baked{
    private String type;

    public Bread(String name, double price, String type) throws InvalidPriceException{
        super(name,price);
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setType(String newType){
        type = newType;
    }
    @Override
    public String toString(){
        return super.toString() + ", Type of Bread : "+ type;
    }
}