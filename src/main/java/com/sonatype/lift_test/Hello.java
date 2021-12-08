package lift_test;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface TestService extends Remote {
    boolean register(String name) throws RemoteException;
    void check(Object obj) throws RemoteException;
 }

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
        if(test_lift == test_lift)
            System.out.println("true");
    }
}