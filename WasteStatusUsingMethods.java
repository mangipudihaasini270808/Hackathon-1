import java.util.*;

class WasteStatusUsingMethods {
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste collected at point 1 in kilograms: ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste collected at point 2 in kilograms: ");
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total waste collected is: " + totalWaste + " kg");
    }
}