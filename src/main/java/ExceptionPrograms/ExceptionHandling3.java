package ExceptionPrograms;

// 3. Take 2 inputs from user item name and quantity.
// If the user enter item name other than "Box" throw exception ItemNotFoundException.
// if the amount is > 50 throw exception "InventoryNotAvailableException"

import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) throws UserdefinedException {
        String item = "Box";
        System.out.println("Enter item-name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (item.equals(name)) {
            System.out.println("Enter quantity:");
            Scanner sc2 = new Scanner(System.in);
            int quantity = sc2.nextInt();
            if (quantity > 50) {
                throw new UserdefinedException("InventoryNotAvailableException");
            }
        } else {
            throw new UserdefinedException("ItemNotFoundException");
        }
    }
}
