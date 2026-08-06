package com.fidelity.leap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet("Sprint 11"));
        System.out.println("Container is up and running for the skeleton. Sleeping so you can docker ps / docker logs / docker exec into it.");
        System.out.println("So long farewell, goodbye, adios!!");
        Thread.sleep(600_000);
    }
}
