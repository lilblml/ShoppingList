import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<String> shoppingList = new ArrayList<>();

    public void addShoppingItem (String item) {
        shoppingList.add(item);
    }

    public void printShoppingList () {
        System.out.println("You have " + shoppingList.size() + " items in your list");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }

    public void modifyShoppingList (int position, String newItem) {
        shoppingList.set(position, newItem);
        System.out.println("Shopping Item " + (position + 1) + " has been modified");
    }

    public void removeShoppingItem (int position) {
        String theItem = shoppingList.get(position);
        shoppingList.remove(position);
    }

    public String findItem (String searchItem) {
        int position = shoppingList.indexOf(searchItem);
        if (position >= 0) {
            return shoppingList.get(position);
        }
        return null;
    }
}
