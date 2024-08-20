package main;

public class Example5 {
    public static void main(String[] args) {
        // Anonymous Classes
        // type-1
        new HelloWorldAnonymousClasses.HelloWorld() {

            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hello, %s!".formatted(someone));
            }
        }.greet();

        // type-2
        new HelloWorldAnonymousClasses.lvl1.Hi() {

            @Override
            public void greet() {
                greetSomeone("friend");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hello, %s!".formatted(someone));
            }
        }.greet();

        // type-3
        new HelloWorldAnonymousClasses().sayHello();

        // type-4
        new HelloWorldAnonymousClasses().new lvl1().annonymous().greet();
    }
}

// Declaring Anonymous Classes
/*
While local classes are class declarations, anonymous classes are expressions,
which means that you define the class in another expression. The following example,
HelloWorldAnonymousClasses, uses anonymous classes in the initialization statements of the local variables
frenchGreeting and spanishGreeting, but uses a local class for the initialization of the variable englishGreeting:
 */

class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();

        public void greetSomeone(String someone);
    }

    class lvl1 {
        interface Hi {
            public void greet();

            public void greetSomeone(String someone);
        }
        Hi annonymous() {
            return new Hi() {

                @Override
                public void greet() {
                    greetSomeone("there");
                }

                @Override
                public void greetSomeone(String someone) {
                    System.out.println("Hey, %s!".formatted(someone));
                }
            };
        }
    }

    public void sayHello() {
        interface HelloWorld {
            public void greet();

            public void greetSomeone(String someone);
        }

        class EnglishGreeting implements HelloWorld {
            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            public void greet() {
                greetSomeone("tout le monde");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            public void greet() {
                greetSomeone("mundo");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
}

/*
Like local classes, anonymous classes can capture variables;
they have the same access to local variables of the enclosing scope:

1. An anonymous class has access to the members of its enclosing class.
2. An anonymous class cannot access local variables in its enclosing scope
that are not declared as final or effectively final.
3. Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other
declarations in the enclosing scope that have the same name.
 */