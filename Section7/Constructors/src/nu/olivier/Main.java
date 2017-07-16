package nu.olivier;

public class Main {

    public static void main(String[] args) {
        VipCustomer Default = new VipCustomer();
        System.out.println(Default.toString());

        VipCustomer Stephan = new VipCustomer("John", "john@doe.com");
        System.out.println(Stephan.toString());

        VipCustomer Mike = new VipCustomer("Mike", "mike@test.com", 200);
        System.out.println(Mike.toString());
    }
}

