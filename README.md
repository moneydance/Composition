# Composition Exercise

## Requirements

A Dog must poop and bark

A Robot must beepBoop and maintain its battery state.
- beepBoop cost 50% of battery
- If the battery goes below zero the battery must be charged before the action is performed

A RobotDog must beepBoop bark and mantain its battery state.
- beepBoop cost 25% of battery, bark costs 50%
- If the battery goes below zero the battery must be charged before the action is performed

A CyborgDog must beepBoop, bark, poop, and mantain its battery state.
- beepBoop cost 25% of battery, bark costs 50%
- If the battery goes below zero the battery must be charged before the action is performed

## Explanation

These requirements are hard to fulfill with hierarchal inheritance. The problem here specifically lying with RobotDog and CyborgDog. Should the RobotDog and CyborgDog inherit from the Robot or the Dog? If they inherit from the Robot we need to reimplement the Dog class's poop and bark functions. If they inherit from the Dog we need to reimplement the Robot class's battery management and beepBoop functions.

What they really need to do is inherit from both. However, Multiple inheritance isn't a common feature in most languages. Instead composition can be used to achieve this.

Composition splits out behaviors into classes. In the example code these behavior classes are called services. These services implement an interface. Business domain classes (Dog, Robot, RobotDog, CyborgDog) inherit these interfaces and "inject" the services they needs via their constructors. By "composing" the services together our Business domain classes are able to fullfill their inherited interfaces and share functionallity without being locked into a heirarchal chain. Behaviors of our business domain classes can be modified by injecting different services.

*ex. The Robot, RobotDog, CyborgDog could inject an atomic power service that removes the need for them to be charged as long as the service fullfills the Powerable interface*