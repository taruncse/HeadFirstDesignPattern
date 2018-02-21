# HeadFirstDesignPattern

### Strategy Pattern
https://github.com/taruncse/DesignPatternsExperiment#strategy-design-pattern-

### Strategy Pattern Example1:

**A game on Duck**

**Feature:** The game can show a large variety of duck species swimming and making quacking sounds.
 *	Duck will make sound (but not all duck) [changeable part]
 *  Duck will fly (but not all duck) [changeable part]
 *  Duck will have it’s own look.
 *  Duck will swim.

**Design Principles:**
 *  Identify the aspects of your application that vary and separate them from what stays the same.
 *  Program to an interface, not an implementation. Program to an interface” really means “Program to a super type.  programming to a super type so that the actual runtime object isn’t locked into the code. “the declared type of the variables should be a super type, usually an abstract class or interface, so that the objects assigned to those variables can be of any concrete implementation of the super type, which means the class declaring them doesn’t have to know about the actual object types!”

 *  Favor composition over inheritance. 

**Quotes and comments :**
Take what varies and “encapsulate” it so it won't affect the rest of your code.
The result? Fewer unintended consequences from code changes and more flexibility in your systems!

**2nd Example:** 
*(reference: https://www.codeproject.com/Articles/1018930/Strategy-Design-Pattern-Explained-With-A-Real-Worl)*

**Basic simulator for the mobile handset**

Let us consider, we are creating a basic simulator for the mobile handset. A user (client application) selects a handset, and should be able to function whatever is supported in the handset.

As we all know, there can be different types of mobile devices. Old (and cheapest) devices just support Call and SMS functionalities, and there is a range of smart phones/ new handsets which supports cool hardware and features like, rear camera (i.e., main camera), or front camera (i.e., the camera to take your selfie!). There are a number of features in the smartphones (much more than camera), but to make the article a bit simple, we will only focus on the following four features:

*	 Phone Call
*	 SMS
*	 Front Camera
*	 Rear Camera

**We are taking an example of three different handsets:**

*	 Nokia 5510 - having only basic features (i.e., phone call and SMS)
*	 Nokia Lumia 920 - having tons of cool features (but for our case, it's only Front Camera and Rear Camera that matters!)
*	 Nokia 6600 - having only rear camera (sorry, but there was no facility to take a selfie with this 10 year old handsets!)
In the Object-oriented world, these three classes are called as "concrete implementations". So in future, we should be able to add a number of handsets, and so a concrete class for each of them.

**Step 1: Identify the Behavior(s) Which Are Common Across All the Clients**

This means, there is a need of an abstract class containing the behavior which is common across all devices. This will be a base class for all the handsets.

**Step 2: Do Something For What Varies!**

In our example, we have Camera features which are varying in different devices. That means, a few handsets support both front and rear cameras, whereas a few support only rear camera, and there are those old phones which don't have a camera at all.

**Step 3: Integrating the Behavior(s) Which Vary**

The abstract class should now delegate the photography related behavior to Photography interface.
For that, we need to inform the Handset class about Photography interface, so all the concrete classes of handsets inheriting from Handset class can use photography features, if they need to support them (i.e., taking photos, and record videos through Front and/ or Rear cameras).

**Step 4: Implement the Methods for the New Behavior**

Handset class revisited to add takePhoto and recordVideo methods which call relevant methods from concrete photography classes, if supported by the handset.

**Step 5: Setting Behavior Dynamically**

Our application allows users to change the camera run-time. Notice the "Activate Front Camera" and "Activate Rear Camera" buttons in the screenshot.
Here is the beauty of Strategy pattern wherein you can change the behavior dynamically (run-time polymorphism, as they say!)

**Step 6: Implement Concrete Classes from the Strategy**

Now we have our Strategy (i.e. Handset abstract class) is ready, it's time to create concrete classes.

### Observer Pattern:
**URL:** https://github.com/taruncse/DesignPatternsExperiment#observer-design-pattern-

**Defination:**

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically. It has following parts.

**Subject:**

Objects Use this interface to register observers sandals to remove themselves from being observers. Each subject can have many observers.

**Observer:**

 All potential observers need to implement the Observer interface.This interface just has one method, update(), that gets called when the Subject’s state changes.
 
**Concrete Subject:**

A concrete subject always implements the Subject interface.  In addition to the register and remove methods, the concrete subject  implements a notifyObservers() method that is used to update all the current observers whenever state changes. The concrete subject may also have methods for setting and getting its state.

**Concrete Observer :**

Concrete observers can be any class that implements the Observer interface.  Each observer registers with a concrete subject to receive updates.


**The Weather Monitoring application overview:**

The three players in the system are the weather station (the physical device that acquires the actual weather data), the WeatherData object (that tracks the data coming from the Weather Station and updates the displays), and the display that shows users the current weather conditions.

The WeatherData object knows how to talk to the physical Weather Station, to get updated data. The WeatherData object then updates its displays for the three different display elements: Current Conditions (shows temperature, humidity, and pressure), Weather Statistics, and a simple forecast.

Our job, if we choose to accept it, is to create an app that uses the WeatherData object to update three displays for 
current conditions, weather stats, and a forecast. 

**Implementation:**

**Please the source code**

**Design Principal:**
Strive For loosely coupled designs between objects that interact

Loosely coupled designs allow us to build flexible *OO* systems that can handle change because they minimize the interdependency between objects.

**Design Principle: How Observer pattern follow the design principala**

**Identify the aspects of your application that vary and separate them from what stays the same.**

 Ans: The thing that varies in the Observer Pattern is the state of the Subject and the number and types of Observers.   With this pattern, you can  vary the objects that are dependent on the state of the Subject, without having to change that Subject.   That’s called planning ahead!

**Design Principle: *Program to an interface, not an implementation.**

Ans: Both the Subject and Observer use interfaces.  The Subject keeps track of objects implement-ing the Observer interface, while the observers register with, and get notified by, the Subject interface.  As we’ve seen, this keeps things nice and loosely coupled.

**Design Principle: *Favor composition over inheritance.**

Ans: The Observer Pattern uses composition to compose any number of Observers with their Subjects.  These relationships aren’t set up by some kind of inheritance hierarchy.  No, they are set up at runtime by composition!

**The dark side of java.util.Observable:**

There are some demerits of using default Java observer pattern.
Observable is a class, not an interface, and worse, it doesn’t even implement an interface. Unfortunately, the java.util.Observable implementation has a number of problems that limit its usefulness and reuse.

**Observable is a class:**

You already know from our principles this is a bad idea, but what harm does it really cause? First, because Observable is a class, you have to subclass it. That means you can’t add on the Observable behavior to an existing class that already extends another superclass.

If you look at the Observable API, the setChanged() method is protected. So what?  Well, this means you can’t call setChanged() unless you’ve subclassed Observable.

***BULLET POINTS***

* The Observer Pattern defines a one-to-many relationship between objects. 
* Subjects, or as we also know them, Observables, update Observers using a common interface. 
* Observers are loosely coupled in that the Observable knows nothing about them, other than that they implement the Observer  Interface. 
* You can push or pull data from the Observable when using the pattern (pull is considered more “correct”). 
* Don’t depend on a specific order of notification for your Observers.
* Java has several implementations of the Observer Pattern, including the general purpose java.util. Observable. 
* Watch out for issues with the java.util.Observable implementation. 
* Don’t be afraid to create your own Observable implementation if needed. 
* Swing makes heavy use of the Observer Pattern, as do many GUI frameworks. 
* You’ll also find the pattern in many other places, including JavaBeans and RMI.

