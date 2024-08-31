import classes.*;
import libraryExercise.Book;
import libraryExercise.Library;

public class Main {
    public static void main(String[] args) {

        // métodos

//        tipoDatoRetorno nombreMétodo (tipoDatoParámetro nombreParámetro, tipoDatoParámetro nombreParámetro2){
//            // cuerpo del método
//            return value; // solo si el método no es void
//        }

//        void nombreMétodo (){
//            // cuerpo del método
//            // NO TIENE RETURN
//        }

//        String greeting = "Hola Lisa !";
//        String greeting = "Hola Haroldo !";
//        String greeting = "Hola Álvaro !";

//        String greeting = sayHello("Lisa");
//        String greeting2 = sayHello("Haroldo", "Oliveria");
//        String greeting3 = sayHello("Álvaro");
//        String greeting4 = sayHello();

//        System.out.println(greeting);
//        System.out.println(greeting2);
//        System.out.println(greeting3);
//        System.out.println(greeting4);

//        int sum1 = add(5, 3);
//        System.out.println("Resulting sum " + sum1);
//        System.out.println("Resulting sum " + add(1, 19));

//        printMessage("This is a message, tesing!");
//        printHelloWorld();

//        System.out.println(multiply(2));
//        System.out.println(multiply(2, 4));

        MethodExercise.executeMethodExercise();

        // Creando el nuevo objeto myClass a partir de la plantilla clas MyClass
        MyClass myClass = new MyClass();

        // Acceder a los miembros (atributos y métodos) públicos
        System.out.println("Public attribute " + myClass.publicAttribute);
        myClass.publicMethod();

        // Acceder a los miembros protegidos -- mover MyClass a paquete examplePackage para test
        System.out.println("Protected attribute " + myClass.protectedAttribute);
        myClass.protectedMethod();

        // Acceder a los miembros default -- mover MyClass a paquete examplePackage para test
        System.out.println("Default attribute " + myClass.defaultAttribute);
        myClass.defaultMethod();

        // Acceder a los miembros privados
//        System.out.println("Private attribute " + myClass.privateAttribute);
//        myClass.privateMethod();

        // Acceder a los miembros privados através de miembros públicos
        myClass.accessPrivateAttribute();

        System.out.println(Constants.PI);

        // no necesito instanciar la clase Counter para usar sus métodos
        Counter counter = new Counter(); // no usado

        System.out.println(Counter.getCount());
        Counter.incrementCount();
        System.out.println(Counter.getCount());

        Person person = new Person();
        System.out.println(person.getName());
        System.out.println(person.age);

        Person person1 = new Person("Ana", 1);
        System.out.println(person1.getName());
        System.out.println(person1.age);

        Vehicle vehicle = new Vehicle();
        Car car = new Car("Toyota", 4);
        System.out.println(car.getNumberOfDoors());
        System.out.println(car.getBrand());
        car.honk();

        Dog dog = new Dog();
        dog.makeSound();
        dog.makeSound(4);

        Cat cat = new Cat();
        cat.makeSound();

        System.out.println("-------------- LibraryExercise --------------");
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "123456789");

        library.addBook(book1);

        library.displayBook();

        library.borrowBook();

        // intento de préstamo de libro ya prestado
        library.borrowBook();

        library.returnBook();

        library.removeBook();

        // intento de mostrar el libro cuando no hay ninguno
        library.displayBook();
    }

    // camelCase naming convention
    static String sayHello() {
        return "Hello unknown user !";
    }

    // sobrecarga de métodos
    static String sayHello(String name) {
        return "Hello " + name + " !";
    }

    // sobrecarga de métodos
    static String sayHello(String name, String surname) {
        return "Hello " + name + " " + surname + " !";
    }

    static int add(int number1, int number2) {
        // int sum = number1 + number2;
        return number1 + number2;
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    static int multiply(int number) {
        return number * number;
    }

    // sobrecarga de métodos
    static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    // sobrecarga de métodos
    static int multiply(int number1, int number2, String message) {
        System.out.println(message);
        return number1 * number2;
    }
}