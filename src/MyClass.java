public class MyClass { // Pascal naming convention
    //campos - atributos - propiedades -> attributes
    //métodos -> methods
    //constructores -> constructors

    // modificadores de acceso , si es visible/accesible-> access modifiers
    // public, private, protected, default

    // ATTRIBUTES:
    public int publicAttribute = 1; // accesible desde cualquier otra clase
    protected int protectedAttribute; // accesible desde dentro del mismo paquete y subclases
    int defaultAttribute; // DEFAULT - lo mismo que protected
    private int privateAttribute; // accesible solo dentro de la clase

    public void publicMethod() {
        System.out.println("I'm the public method " + publicAttribute);
    }

    protected void protectedMethod() {
        System.out.println("I'm the protected method " + protectedAttribute);
    }

    void defaultMethod() {
        System.out.println("I'm the default method " + defaultAttribute);
    }

    private void privateMethod() {
        System.out.println("I'm the private method");
    }

    public void accessPrivateAttribute() {
        // controlando el acceso a miembros privados
        System.out.println("I'm the private attribute " + privateAttribute);
        privateMethod();
    }
}

