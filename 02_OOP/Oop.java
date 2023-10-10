public class Oop {
    public static void main(String[] args) {
     // FOR ABSTRACTION
        // Creating a car object
        Car myCar = new Car("Toyota", 2023, 4);
        myCar.start(); // Calling the start method for a car
        myCar.stop();  // Calling the stop method for a car

        // Creating a bicycle object
        Bicycle myBicycle = new Bicycle("Giant", 2023, 18);
        myBicycle.start(); // Calling the start method for a bicycle
        myBicycle.stop();  // Calling the stop method for a bicycle

     //    ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

     //  FOR ENCAPSULTAION
     //  // Create a BankAccount object
     //    BankAccount myAccount = new BankAccount("John Doe", 1000);

     //    // Accessing data through methods
     //    System.out.println("Account Holder: " + myAccount.getAccountHolder());
     //    System.out.println("Initial Balance: $" + myAccount.getBalance());

     //    // Performing operations through methods
     //    myAccount.deposit(500);
     //    myAccount.withdraw(200);

     //    // Accessing updated balance
     //    System.out.println("Final Balance: $" + myAccount.getBalance());


     // INHERITANCE

     //  // Create an instance of the Animal class
     //  Animal genericAnimal = new Animal("Generic Animal", 5);

     //  // Display information about the generic animal
     //  genericAnimal.displayInfo();
     //  // Call the makeSound method of the generic animal
     //  genericAnimal.makeSound();

     //  System.out.println(); // Just to separate the outputs

     //  // Create an instance of the Dog class
     //  Dog myDog = new Dog("Buddy", 3, "Labrador");

     //  // Display information about the dog
     //  myDog.displayInfo();
     //  // Call the makeSound method of the dog (overridden method)
     //  myDog.makeSound();
     //  // Call the wagTail method specific to dogs
     //  myDog.wagTail();
    }
}



// OPPS CONCEPTS START FROM HERE
// =======================================================
// ABSTRACTION
// =======================================================



// Abstract class representing a generic vehicle
abstract class Vehicle {
    // Common properties for all vehicles
    String brand;
    int year;

    // Abstract method representing a common action for all vehicles
    abstract void start();

    // Abstract method representing a common action for all vehicles
    abstract void stop();
}

// Concrete class representing a Car, which is a type of Vehicle
class Car extends Vehicle {
    // Specific property for a car
    int numberOfDoors;

    // Constructor for Car
    Car(String brand, int year, int numberOfDoors) {
        this.brand = brand;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    // Implementation of the start method for a car
    void start() {
        System.out.println("The car is starting.");
    }

    // Implementation of the stop method for a car
    void stop() {
        System.out.println("The car is stopping.");
    }
}

// Concrete class representing a Bicycle, which is a type of Vehicle
class Bicycle extends Vehicle {
    // Specific property for a bicycle
    int numberOfGears;

    // Constructor for Bicycle
    Bicycle(String brand, int year, int numberOfGears) {
        this.brand = brand;
        this.year = year;
        this.numberOfGears = numberOfGears;
    }

    // Implementation of the start method for a bicycle
    void start() {
        System.out.println("The bicycle is moving.");
    }

    // Implementation of the stop method for a bicycle
    void stop() {
        System.out.println("The bicycle has stopped.");
    }
}

// Main class to demonstrate abstraction



// ========================================||||||||||||||||||||||||||||
// ENCAPSULATION
// ========================================||||||||||||||||||||||||||||

class BankAccount {
    // Private attributes (data)
    private String accountHolder;
    private double balance;

    // Public constructor to initialize the BankAccount
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Ensure that the initial balance is non-negative
        this.balance = Math.max(0, initialBalance);
    }

    // Public method to get the account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

// ======================================================
// INHERITANCE
// ========================================================

class Animal {
    // Common properties of all animals
    String name;
    int age;

    // Constructor for Animal class
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the animal
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }

    // Method representing a common behavior for all animals
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// The subclass or derived class (inherits from Animal)
class Dog extends Animal {
    // Additional property specific to dogs
    String breed;

    // Constructor for Dog class
    public Dog(String name, int age, String breed) {
        // Call the constructor of the superclass (Animal)
        super(name, age);
        this.breed = breed;
    }

    // Override the makeSound method to provide a specific behavior for dogs
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to dogs
    public void wagTail() {
        System.out.println("Tail is wagging!");
    }
}
