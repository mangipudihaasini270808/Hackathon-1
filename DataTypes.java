import java.util.*;
class DataTypes {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle number: ");
        int vehicleNumber = sc.nextInt();
        System.out.println("Enter waste collected in kg: ");
        double wasteCollected = sc.nextDouble();
        System.out.println("Enter no. of collection points: ");
        int collectionPoints = sc.nextInt();
        System.out.println("Enter vehicle status: ");
        char vehicleStatus = sc.next().charAt(0);

        System.out.println("Vehicle number is: " + vehicleNumber );
        System.out.println("Waste collected in kilograms is: " + wasteCollected );
        System.out.println("Number of collection points are: " + collectionPoints );
        System.out.println("Vehicle status is: " + vehicleStatus );
    } 
}
