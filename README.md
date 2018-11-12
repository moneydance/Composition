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

These requirements are hard to fulfill with hierarchal inheritance. The problem here specifically lying with RobotDog and CyborgDog. Should the RobotDog and CyborgDog inherit from the Robot or the Dog? If we inherit from the Robot we need to reimplement the Dog class's poop and bark functions. If we inherit from the Dog class we need to reimplement the Robot class's battery management and beepBoop functions.

What we really need to do is inherit from both. However, Multiple inheritance isn't a common feature in most languages. Instead we will use composition to achieve this.

Composition splits out behaviors into classes. We will call these behavior classes services. These services implement an interface. Our business domain classes (Dog, Robot, RobotDog, CyborgDog) inherits these interfaces and "inject" the services they needs via their constructors. By "composing" the services together we are able to fullfill the inherited interfaces and share functionallity without locking ourselves into a heirarchal chain. This also allows to to inject different services changing the behaviors of our business domain classes. 

*ex. Our robots could inject an atomic battery service that practically removes the need for them to charge because their battery is so large.*