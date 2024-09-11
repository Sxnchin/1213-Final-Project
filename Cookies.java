public class Cookies extends Baked{
    private int quantity;

    public Cookies(String name, double price, int quantity) throws InvalidPriceException{
        super(name,price);
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int newQuantity){
        quantity = newQuantity;
    }
    @Override
    public String toString(){
        return super.toString() + ", Number of Cookies : "+ quantity;
    }
}