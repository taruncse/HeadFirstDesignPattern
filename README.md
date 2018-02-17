# HeadFirstDesignPattern

### Strategy Pattern
https://github.com/taruncse/DesignPatternsExperiment#strategy-design-pattern-

### Strategy Pattern Example1:

**A game on Duck**

**Feature:** The game can show a large variety of duck species swimming and making quacking sounds.
 *	Duck will make sound (but not all duck)
 *  Duck will fly (but not all duck)
 *  Duck will have it’s own outlook.
 *  Duck will swim.

**Design Principles:**
 *  Identify the aspects of your application that vary and separate them from what stays the same.
 *  Program to an interface, not an implementation. Program to an interface” really means “Program to a super type.  programming to a super type so that the actual runtime object isn’t locked into the code. “the declared type of the variables should be a super type, usually an abstract class or interface, so that the objects assigned to those variables can be of any concrete implementation of the super type, which means the class declaring them doesn’t have to know about the actual object types!”

 *  Favor composition over inheritance. 

**Quotes and comments :**
Take what varies and “encapsulate” it so it won't affect the rest of your code.
The result? Fewer unintended consequences from code changes and more flexibility in your systems!
