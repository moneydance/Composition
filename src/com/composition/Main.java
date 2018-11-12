package com.composition;

public class Main {

    public static void main(String[] args) {
        // Services;
        BarkService dogBarkService = new BarkService("Woof");
        PoopService dogPoopService = new PoopService();
        // Dog
        Dog dog = new Dog(dogBarkService, dogPoopService);
        System.out.println("===Dog===");
        dog.bark();
        dog.bark();
        dog.bark();
        dog.poop();

        // Services
        BeepBoopService robotBeepBoopService = new BeepBoopService();
        ChargeService robotChargeService = new ChargeService();
        // Robot
        Robot robot = new Robot(robotChargeService, robotBeepBoopService);
        System.out.println("===Robot===");
        robot.beepBoop();
        robot.beepBoop();
        robot.beepBoop();

        // Services
        BeepBoopService robotDogBeepBoopService = new BeepBoopService();
        ChargeService robotDogChargeService = new ChargeService();
        BarkService robotDogBarkService = new BarkService("Bork");
        // RobotDog
        RobotDog robotDog = new RobotDog(robotDogChargeService, robotBeepBoopService, robotDogBarkService);
        System.out.println("===Robot Dog===");
        robotDog.bark();
        robotDog.bark();
        robotDog.beepBoop();

        // Services
        BeepBoopService cyborgDogBeepBoopService = new BeepBoopService();
        ChargeService cyborgDogChargeService = new ChargeService();
        BarkService cyborgDogBarkService = new BarkService("Bork");
        PoopService cyborgDogPoopService = new PoopService();
        // RobotDog
        System.out.println("===Cyborg Dog===");
        CyborgDog cyborgDog = new CyborgDog(cyborgDogChargeService, cyborgDogBeepBoopService, cyborgDogBarkService, cyborgDogPoopService);
        cyborgDog.bark();
        cyborgDog.bark();
        cyborgDog.beepBoop();
        cyborgDog.poop();
    }
}
