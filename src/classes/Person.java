package classes;

public class Person {
    private String name;
    public int age;

    // constructor por defecto -> siempre públicos para poder crear objetos desde toda nuestra aplicación
    // no tipo de retorno, no nombre
    public Person(){
        name = "Jane Doe";
        age = 0;
    }

    // constructor con parámetros
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String myName){
        name = myName;
        age = 0;
    }

    public Person(int myAge){
        name = "Jane Doe";
        age = myAge;
    }

    public String getName(){
        return name;
    }
}
