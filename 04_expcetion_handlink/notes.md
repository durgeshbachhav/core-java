\
```markdown
# Java Exception Handling

## Introduction
Exception handling in Java is a mechanism to handle runtime errors gracefully. When an exceptional condition occurs, an object representing the exception is created and thrown in the method that caused the error. The program can catch and handle these exceptions, preventing abrupt termination.

## Types of Exceptions
1. **Checked Exceptions:** These are exceptions that are checked at compile-time. They must be either caught or declared in the method signature using the `throws` keyword.

2. **Unchecked Exceptions (RuntimeExceptions):** These are exceptions that are not checked at compile-time. They usually occur due to programming bugs and can be avoided by writing robust code.

## Try-Catch Block
The `try` block contains the code that may cause an exception. The `catch` block handles the exception if it occurs.

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }
    }
}
```

## Multiple Catch Blocks
Multiple `catch` blocks can be used to handle different types of exceptions.

```java
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("NullPointerException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handling other exceptions
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
```

## Finally Block
The `finally` block contains code that will be executed whether an exception is thrown or not. It is often used for cleanup tasks.

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // Code in this block will be executed regardless of whether an exception occurred
            System.out.println("Finally block executed.");
        }
    }
}
```

## Throwing Exceptions
The `throw` keyword is used to explicitly throw an exception.

```java
public class ThrowExample {
    public static void main(String[] args) {
        int age = -5;
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```

## Custom Exceptions
You can create your own custom exceptions by extending the `Exception` class or its subclasses.

```java
// Custom exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may cause a custom exception
            throw new MyException("This is a custom exception.");
        } catch (MyException e) {
            // Handling the custom exception
            System.out.println("Custom exception: " + e.getMessage());
        }
    }
}
```

Exception handling is an essential aspect of writing robust and error-tolerant Java programs. It allows for graceful handling of errors, preventing the program from crashing and providing valuable information for debugging.
```

