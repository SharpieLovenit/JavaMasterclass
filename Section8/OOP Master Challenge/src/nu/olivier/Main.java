package nu.olivier;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is: " + hamburger.itemizedHamburger());

        HealthyBurger healty = new HealthyBurger("Bacon", 5.67);
        healty.addHamburgerAddition1("Egg", 2);
        healty.addHealthAddition1("Lentils", 0.50);
        System.out.println("Total Healty burger price is: " + healty.itemizedHamburger());

        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.addHamburgerAddition1("should not work", 1);
        deluxe.itemizedHamburger();
    }
}
