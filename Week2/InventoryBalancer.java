import java.util.Scanner;

public class InventoryBalancer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current inventory: ");
        int current = sc.nextInt();

        System.out.print("Enter target inventory: ");
        int target = sc.nextInt();

        if (current < target) {
            System.out.println("Need to add " + (target - current) + " items.");
        } else if (current > target) {
            System.out.println("Need to remove " + (current - target) + " items.");
        } else {
            System.out.println("Inventory is balanced.");
        }

        sc.close();
    }
}