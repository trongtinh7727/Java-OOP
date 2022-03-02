# **Object Oriented Programming**

## **OOP concepts (basic)**
- OOP stands for Object-Oriented Programming.
    - object-oriented programming is about 
    creating objects that contain both data and methods.
    - Object-oriented programming has several advantages over procedural programming:
        - OOP is faster and easier to execute
        - OOP provides a clear structure for the programs
        - OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
        - OOP makes it possible to create full reusable applications with less code and shorter development time
    
### **Modifiers**
- Access Modifiers:
    - For classes
        |Modifier|	Description|
        |:---------:|:------|
        |`public`|The class is accessible by any other class|
        |`default`|The class is only accessible by classes in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter|

    - For attributes, methods and constructors:
     
        |Modifier|	Description	|
        |:---------:|:------|
        |`public`|	The code is accessible for all classes|	
        |`private`|	The code is only accessible within the declared class	|
        |`default`|	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	|
        |`protected`|	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter|

- Non-Access Modifiers:
    - For classes:
        |Modifier|	Description|	
        |:---------:|:------|
        |`final`|	The class cannot be inherited by other classes|
        |`abstract`|	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.)
    - For attributes and methods:
        |Modifier|	Description|
        |:---------:|:------|
        |`final`|	Attributes and methods cannot be overridden/modified|
        |`static`|	Attributes and methods belongs to the class, rather than an object
        |`abstract`|Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example: `abstract void run();`. The body is provided by the subclass (inherited from).|
        |`transient`|	Attributes and methods are skipped when serializing the object containing them|
        |`synchronized`|	Methods can only be accessed by one thread at a time|
        |`volatile`|	The value of an attribute is not cached thread-locally, and is always read from the "main memory"|
- Static
    - A static method means that it can be 
accessed without creating an object of the class, unlike public:
    - An example to demonstrate the differences between static and public methods:
        ```java 
        public class Main {
            // Static method
            static void myStaticMethod() {
                System.out.println("Static methods can be called without creating objects");
            }

            // Public method
            public void myPublicMethod() {
                System.out.println("Public methods must be called by creating objects");
            }

            // Main method
            public static void main(String[] args) {
                myStaticMethod(); // Call the static method

                Main myObj = new Main(); // Create an object of MyClass
                myObj.myPublicMethod(); // Call the public method
            }
        }
        ```
- Final:
    - If you don't want the ability to override existing attribute values, declare 
attributes as final

- Abstract
    - An abstract method belongs to an abstract class, and it does not have a body. 
The body is provided by the subclass:
    - Example: 
   
### **Class vs Instance methods**

- A static method (preferably called a 
class method) means that no object 
(instance) of the class is needed to 
use the method.
- A non-static method (preferably 
called an instance method) means 
that the method must be applied to 
an object (instance) of that class

### **Constructors**
- A constructor initializes an object when it is created. It has the same name as its class and is syntactically similar to a method. However, constructors have no explicit return type.
- No argument Constructors
    Example:
    ```java
    Public class MyClass {
        Int num;
        MyClass() {
            num = 100;
        }
    }
    ```
    You would call constructor to initialize objects as follows:
    ```java
    public class ConsDemo {
        public static void main(String args[]) {
            MyClass t1 = new MyClass();
            MyClass t2 = new MyClass();
            System.out.println(t1.num + " " + t2.num);
        }
    }
    ```
    Result:
    ```
    100 100
    ```
- Parameterized Constructors Example:
    ```java
    // A simple constructor.
    class MyClass {
        int x;
        
        // Following is the constructor
        MyClass(int i ) {
            x = i;
        }
    }
    ```
    You would call constructor to initialize objects as follows 
    ```java
    public class ConsDemo {
        public static void main(String args[]) {
            MyClass t1 = new MyClass(10);
            MyClass t2 = new MyClass(20);
            System.out.println(t1.x + " " + t2.x);
        }
    }
    ```
    Result:
    ```
    10 20
    ```

### **Overloading**
- Observe that some methods have identical names, but with different parameters. This is called overloading:

```java
// Java program to demonstrate working of method
// overloading in Java.

public class Sum {

	// Overloaded sum(). This sum takes two int parameters
	public int sum(int x, int y)
	{
		return (x + y);
	}

	// Overloaded sum(). This sum takes three int parameters
	public int sum(int x, int y, int z)
	{
		return (x + y + z);
	}

	// Overloaded sum(). This sum takes two double parameters
	public double sum(double x, double y)
	{
		return (x + y);
	}

	// Driver code
	public static void main(String args[])
	{
		Sum s = new Sum();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.5, 20.5));
	}
}
```
Result:
```
30
60
31.0
```