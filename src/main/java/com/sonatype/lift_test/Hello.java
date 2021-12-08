package lift_test;

public class Hello {
    static String[] arr = null;

    public static void foo(String[] x) {
        System.out.println(x[0]);
    }

    public static void main(String[] args) {
        foo(arr);
        System.out.println("Hello World");
        int test_lift = (int) Math.random();
        String s = String.valueOf(test_lift);
        System.out.println(s);
        if(s == arr[0])
            System.out.println("true");
    }
}