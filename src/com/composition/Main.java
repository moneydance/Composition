package com.composition;

public class Main {

    public static void main(String[] args) {
        // Services;
        BarkService dogBarkService = new BarkService("Woof", 3);
        PoopService dogPoopService = new PoopService(.5);
        // Dog
        Dog dog = new Dog(dogBarkService, dogPoopService);
        System.out.println("===Dog===");
        dog.bark();
        dog.bark();
        dog.bark();
        dog.poop();

        // Services
        BeepBoopService robotBeepBoopService = new BeepBoopService(5);
        ChargeService robotChargeService = new ChargeService();
        // Robot
        Robot robot = new Robot(robotChargeService, robotBeepBoopService);
        System.out.println("===Robot===");
        robot.beepBoop();
        robot.beepBoop();
        robot.beepBoop();

        // Services
        BeepBoopService robotDogBeepBoopService = new BeepBoopService(5);
        ChargeService robotDogChargeService = new ChargeService();
        BarkService robotDogBarkService = new BarkService("Bark", 3);
        // RobotDog
        RobotDog robotDog = new RobotDog(robotDogChargeService, robotBeepBoopService, robotDogBarkService);
        System.out.println("===Robot Dog===");
        robotDog.bark();
        robotDog.bark();
        robotDog.beepBoop();

        // Services
        BeepBoopService cyborgDogBeepBoopService = new BeepBoopService(5);
        ChargeService cyborgDogChargeService = new ChargeService();
        BarkService cyborgDogBarkService = new BarkService("Bark", 3);
        PoopService cyborgDogPoopService = new PoopService(.5);
        // RobotDog
        System.out.println("===Cyborg Dog===");
        CyborgDog cyborgDog = new CyborgDog(cyborgDogChargeService, cyborgDogBeepBoopService, cyborgDogBarkService, cyborgDogPoopService);
        cyborgDog.bark();
        cyborgDog.bark();
        cyborgDog.beepBoop();
        cyborgDog.poop();
    }
}
