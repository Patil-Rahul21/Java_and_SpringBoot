class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class StaticVariable {

    public static void main(String[] args) {

        Mobile mob = new Mobile();
        mob.brand = "Redmi";
        mob.price = 29990;
        Mobile.name = "SamrtPhone"; // refer by class name

        Mobile mob1 = new Mobile();
        mob1.brand = "Realme";
        mob1.price = 24990;
        Mobile.name = "SamrtPhone";  // refer by class name


        mob.show();
        mob1.show();
    }

   
}