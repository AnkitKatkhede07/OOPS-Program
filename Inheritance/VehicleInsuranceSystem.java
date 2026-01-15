import java.util.*;

class Vehicle {
    String brand, model;
    double basePrice;

    Vehicle(String brand, String model, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
    }

    double calculatePremium() {
        return basePrice * 0.05; // Base premium = 5%
    }
}

class Car extends Vehicle {
    boolean hasAirbags;

    Car(String brand, String model, double basePrice, boolean hasAirbags) {
        super(brand, model, basePrice);
        this.hasAirbags = hasAirbags;
    }

    @Override
    double calculatePremium() {
        double premium = super.calculatePremium();
        if (hasAirbags)
            premium += premium * 0.12;  // +12%
        else
            premium += premium * 0.05;  // +5%
        return premium;
    }
}

class Bike extends Vehicle {
    boolean hasABS;

    Bike(String brand, String model, double basePrice, boolean hasABS) {
        super(brand, model, basePrice);
        this.hasABS = hasABS;
    }

    @Override
    double calculatePremium() {
        double premium = super.calculatePremium();
        if (hasABS)
            premium += premium * 0.08;  // +8%
        else
            premium += premium * 0.03;  // +3%
        return premium;
    }
}

public class VehicleInsuranceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Vehicle Type (1.Car  2.Bike):");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Base Price: ");
            double base = sc.nextDouble();

            if (type == 1) {
                System.out.print("Airbags? (true/false): ");
                boolean airbags = sc.nextBoolean();
                vehicles[i] = new Car(brand, model, base, airbags);

            } else {
                System.out.print("ABS? (true/false): ");
                boolean abs = sc.nextBoolean();
                vehicles[i] = new Bike(brand, model, base, abs);
            }
        }

        // 🔍 Find vehicle with highest premium
        Vehicle maxVehicle = vehicles[0];
        double maxPremium = vehicles[0].calculatePremium();

        for (int i = 1; i < 5; i++) {
            double premium = vehicles[i].calculatePremium();
            if (premium > maxPremium) {
                maxPremium = premium;
                maxVehicle = vehicles[i];
            }
        }

        System.out.println("\n===== Vehicle With Highest Premium =====");
        System.out.println("Brand: " + maxVehicle.brand);
        System.out.println("Model: " + maxVehicle.model);
        System.out.println("Premium Amount: " + maxPremium);
    }
}
