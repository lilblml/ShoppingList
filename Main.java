import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    private static ShoppingList shoppingList = new ShoppingList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice  =0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    shoppingList.printShoppingList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions () {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of shopping items");
        System.out.println("\t 2 - to add an item to the list");
        System.out.println("\t 3 - to modify an item in the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item in the list");
        System.out.println("\t 6 - to quit the application");
    }

    public static void addItem () {
        System.out.println("Please enter the shopping item: ");
        shoppingList.addShoppingItem(scanner.nextLine());
    }

    public static void modifyItem () {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        shoppingList.modifyShoppingList(itemNo - 1, newItem);
    }

    public static void removeItem () {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        shoppingList.removeShoppingItem(itemNo - 1);
    }

    public static void searchForItem () {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();

        if (shoppingList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in shopping list");
        }
        else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

}