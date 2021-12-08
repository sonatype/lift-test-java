package lift_test;

public class Hello {
    public class Location {
        String city;
        String state;
    }

    public static void foo(Location x) {
        System.out.println(x.state);
    }

    public static void main(String[] args) {
        Location loc = null;
        foo(loc);
        System.out.println("Hello World");
        int test_lift = (int) Math.random();
        String s = String.valueOf(test_lift);
        System.out.println(s);
        if(s == loc.city)
            System.out.println("true");
    }
}