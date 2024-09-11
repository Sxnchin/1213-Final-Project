import java.util.*;

public class Bakery implements BakingInterface {
    private List<Baked> menu;

    public Bakery() {
        menu = new ArrayList<>();
        }
    @Override
    public void addBakedItem(Baked baked) {
        menu.add(baked);
        }
    @Override
    public void displayMenu() {
        for (int c = 0; c < menu.size(); c++) {
            System.out.println((c + 1) + ". " + menu.get(c));
         }
        }

    public void buyItem(int index) {
        if (index >= 1 && index <= menu.size()) {
            Baked item = menu.get(index - 1);
            System.out.println("You bought: " + item);
            menu.remove(index - 1);
            } else {
                System.out.println("Invalid item number.");
                }
            }
}