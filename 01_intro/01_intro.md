# introduction to JAVA
## background electronics consumer devices
## develop by sunmicrosystems by games goslings
## develop language => oak later named java

### OOP => object oriented programming
## platform independent language similar to cpp.

# FEATURES
## popular 
## for java programmer everything is object
## simple 
## design closely to cpp posible
## garbage collection (automatic memory management)
## no header files operator overloading virtural base class etc
## distrubuted system 
## extensive library support for protocols like tcp/ip http , ftp
## robust exception handling mechanism


# platform independent 
## compiler and interpreter are same

# other features

## robust => progams are reliable
## secure environment
## portable
## multi-threaded


## primitive dataTypes
### int 4 bytes
### char 2 bytes
### float 4 byte
### double 8 byte
### boolean true or false
## reference variables

# jvm  java virtual machine
# jvm is platform independent
## virtual machine ARE USE  for running A java program
# how it works
## javac compiles the source code into bytecode
## then runs on JVM which interprets this bytecode
## jst (just in time) compilers attempt to increase speed

# class loader
## loads classes from .class file in memory
## class loader loads can load file from => local disk , over a local network and over the internet

# ex. of class

```java

class person{
     String name;
     int age;

     void birthday(){
          age++;
          System.out.print(name+ "is now"+ age);
     }
}

```
# class is fundamental concept in java
## everything in java is an object
## every object and method are belong to the class
## class have feild(datatypes) , methods and functions and classess(member classes and inner classes)
## static classes and method are belong to the class itselt
### class is template for creating a object and object is instance of class

# ACCESS MODIFIERS
## PUBLIC/PRIVATE 
## CHECK QUICKREF.ME FOR ACCESS MODIFIER TABLE 

### public accessible anywhere
### private only within same Class
### protected access in same package

# demo program
```
class HelloWorld{
     public static void main(String[] args){
          System.out.println("Hello World");
     }
}
```
# how java program executes
## Java Code ==> Compilation ==> Bytecode Generation ==> Java Virtual Machine (JVM) ==> Execution


#    INTERVIEW QUESTIONS
## WHAT IS JVM ?
### => JVM IS JAVA virtual machine which provides a runtime environment for run a java program 

### Iska main kaam Java bytecode ko execute karne ke liye ek platform-independent environment dena hai. 
### VM platform independence bhi provide karta hai, jisse Java code ko kisi bhi device ya operating system par run kiya ja sake. Ye "write once, run anywhere" capability ka ek important aspect hai. 

# WHO LOADS THE CLASS ?
## loads classes from .class file in memory
## class loader loads can load file from => local disk , over a local network and over the internet


# WHEN IS THE CLASS LOADED?
##   jvm loads class dynamically in memory

# what is byte code verifier
## it checks that the bytecodes written conform to the specification

# what is JIT compiler
## just in time compiler translates byte codes into native machine code at runtime




