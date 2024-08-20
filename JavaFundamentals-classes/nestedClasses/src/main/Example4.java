package main;

class LocalClassExample {
    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(
            String phoneNumber1, String phoneNumber2) {

        int numberLength = 10; // effectively final = A variable or parameter whose value is never changed after it is initialized is effectively final
//         numberLength = 7;

        interface  h1 {}
        class PhoneNumber implements h1{

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                if (currentNumber.length() == numberLength) // Variable 'numberLength' is accessed from within inner class, needs to be final or effectively final
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            // Valid in JDK 8 and later:

//            public void printOriginalNumbers() {
//                System.out.println("Original numbers are " + phoneNumber1 +
//                    " and " + phoneNumber2);
//            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        // Valid in JDK 8 and later:

//        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }
    public void greetInEnglish(String name) {
        interface HelloThere {
            public void greet();
        }
        class EnglishHelloThere implements HelloThere {
            public void greet() {
                System.out.println("Hello " + name);
            }
        }
        HelloThere myGreeting = new EnglishHelloThere();
        myGreeting.greet();
    }

    public void sayGoodbyeInEnglish() {
        class EnglishGoodbye {
            public static void sayGoodbye() {
                System.out.println("Bye bye");
            }
        }
        EnglishGoodbye.sayGoodbye();
    }
}

public class Example4 {
    public static void main(String[] args) {
        LocalClassExample.validatePhoneNumber("123-456-7890", "456-7890");
        new LocalClassExample().greetInEnglish("Smn");
        new LocalClassExample().sayGoodbyeInEnglish();
        new Example().greetInEnglish();
    }
}

class Example {

    public void greetInEnglish() {
        interface HelloThere { // The interface-inside-a-method feature was introduced in JDK 16.
            void greet();
        }
        HelloThere hello = () -> System.out.println("Hello!");
        hello.greet();
    }
}

/*
In short:
Accessing Members of an Enclosing Class
1. A local class has access to the members of its enclosing class.
2. starting in Java SE 8, a local class can access local variables and parameters of the enclosing block
that are final or effectively final. A variable or parameter whose value is never changed after it is
initialized is effectively final.
3. Starting in Java SE 8, if you declare the local class in a method, it can access the method's parameters. As without
modification those parameters are treated as effectively final parameters in Java.
5. interfaces are inherently static.
4. The interface-inside-a-method feature was introduced in JDK 16.

 */