/*9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.


EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.


Explanation:
 Tests inheritance where logic changes depending on product type.
*/
class Product {
    int id;
    String name;
    double basePrice;

    Product(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    double finalPrice() {
        return basePrice; // default, will be overridden
    }
}

class LuxuryProduct extends Product {
    LuxuryProduct(int id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    double finalPrice() {
        double tax = basePrice * 0.20; // 20% tax
        return basePrice + tax;
    }
}

class EssentialProduct extends Product {
    EssentialProduct(int id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    double finalPrice() {
        double tax = basePrice * 0.05; // 5% tax
        return basePrice + tax;
    }
}

public class PApp {
    public static void main(String args[]) {
        EssentialProduct ep = new EssentialProduct(101, "Rice Bag", 200);
        LuxuryProduct lp = new LuxuryProduct(102, "Perfume", 300);

        // Using polymorphism
        Product p1 = ep;
        Product p2 = lp;

        System.out.println("Essential Product: " + p1.name + 
                           " | Final Price: ₹" + p1.finalPrice());
        System.out.println("Luxury Product: " + p2.name + 
                           " | Final Price: ₹" + p2.finalPrice());
    }
}