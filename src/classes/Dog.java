package classes;

public class Dog extends Animal {

    // polimorfismo -> puedo override / sobreescribir + overloading / sobrecarga

    //anotación
    @Override // sobreescrbir - solo para la subclase
    public void makeSound() {
        System.out.println("The dog barks");
    }

    //sobrecarga
    public void makeSound(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Woof");
        }
    }
}
