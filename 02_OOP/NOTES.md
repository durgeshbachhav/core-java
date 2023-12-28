# OPP => Object-Oriented Programming

## OPPS (Object-Oriented Programming System) means organizing the program structure.
## oops design program using classes and objects.

### It is a programming paradigm based on objects, which are data structures that contain data in the form of fields, often known as attributes, and code in the form of procedures, often known as methods.

# Need for OPP Approach

1. Better suited for team development
2. Creating utilizable software components
3. Reusability of code
4. Easier GUI programming
5. Easier software maintenance
6. Scalable
7. Adaptable
8. Extensible

### Structure Programming Techniques
* Top-down, bottom-up
* It's all about thinking and logic and actions

* The platform is broken down into a number of units, and these units are called objects.

# Objects

* Entity that has state, behavior known as objects
* Real-world example: a book. A book has a name (state), author (behavior), etc.
* It can be physical or logical
* Instance of a class
* Class is a template from which an object is created, so the object is an instance of a class

## Characteristics of an Object

### State
* Set of data consisting of fields (attributes can be static and dynamic)

### Behavior
* Represents functionality

### Identity
* Identity (object name)

### Responsibility

# Object Model

* Abstraction
* Encapsulation
* Inheritance
* Polymorphism
# Abstraction

#### Check code example.

* It is a concept like complex systems ko simplify karne aur user ko unnecessary details se bachane ka ek tareeka hai.
* Abstraction ka use information hiding ke liye hota hai, jisse users ko sirf essential information dikhai de aur unhe background details ya complexity se nijaat mile. Yeh programming languages mein bhi istemal hota hai taki developers ko details se door rah kar high-level functionality par focus karne mein madad mile.

* Ek simple taur par, agar aap ek car ki driving karte hain, to aapko car ke engine ke internal details ya functioning ke bare mein jyada jaankari nahi chahiye hoti. Aap sirf steering wheel, pedals aur dashboard jaise components se interact karte hain. Yahan, car ke internal workings ko abstract kiya gaya hai, jisse aap as a driver sirf necessary details ke saath deal karte hain.

# Encapsulation == Binding Data

* Wrapping up of data and functions/operations into a single unit (called class) is known as encapsulation.
* The main idea behind encapsulation is to restrict access to the internal state of an object and only allow interactions through well-defined interfaces.

# Inheritance

* It creates an is-a relation between classes.
* It means one class acquires the properties of another class.
* Two types of inheritance: has-a and is-a

### Inheritance ek fundamental concept hai object-oriented programming (OOP) mein. Iska matlab hai ki ek nayi class (subclass ya derived class) ko kisi existing class (superclass ya base class) se attributes aur behaviors inherit karne ka permission hota hai. Isse code ko dobara use karne mein madad milti hai aur ek rishta banta hai classes ke beech mein, jahan subclass superclass ke functionalities ka istemal kar sakti hai ya unhe override kar sakti hai.

### Code is added to oop.java file


# Types of Inheritance
## 1. Single Inheritance
## 2. Multi Inheritance (Not supported in Java and .NET)
## 3. Hierarchical Inheritance
## 4. Multilevel Inheritance
## 5. Hybrid Inheritance

###Certainly! Let's briefly discuss each type of inheritance:

### 1. **Single Inheritance:**
   - **Definition:** In single inheritance, a class can inherit from only one superclass(parent class). There is a single chain of inheritance.
   - **Example:** Class A is a superclass, and Class B is a subclass that inherits from class A.

### 2. **Multi Inheritance (Not Supported in Java and .NET):**
   - **Definition:** In multi inheritance, a class can inherit from more than one superclass. However, Java and .NET don't support multiple inheritance for classes to avoid complications like the diamond problem.
   - **Example:** If class B and class C both inherit from class A, and class D inherits from both B and C, it leads to ambiguity (diamond problem) which can be problematic.

### 3. **Hierarchical Inheritance:**
   - **Definition:** In hierarchical inheritance, multiple classes inherit from a single base class. It forms a tree-like structure.
   - **Example:** Class A is a base class, and Class B and Class C are subclasses that inherit from class A.

### 4. **Multilevel Inheritance:**
   - **Definition:** In multilevel inheritance, a class derives from a class, and then another class derives from that class, forming a chain of inheritance.
   - **Example:** Class A is a base class, Class B inherits from A, and then Class C inherits from B.

### 5. **Hybrid Inheritance:**
   - **Definition:** Hybrid inheritance is a combination of two or more types of inheritance mentioned above. It can involve multiple inheritance, hierarchical inheritance, or multilevel inheritance.
   - **Example:** A situation where a class inherits from two classes (multiple inheritance) and those two classes are part of a hierarchical inheritance.


### Que. what is object?
 -an object is an instance of a class. A class is a blueprint or template for creating objects, and objects are instances of these classes. Each object has its own set of properties (also known as attributes or fields) and methods (functions) defined by the class.



