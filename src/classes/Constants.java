package classes;

public final class Constants { // no se puede heredar
    // variable final - no podemos reasignarla
    // static -> variable pertenezca a la clase y no a la instancia de la clase (objeto)
    public static final double PI  = 3.14159;

    // no se puede sobreescribir (override)
    public final void printMessage(){
        System.out.println("This method cannot be overriden");
    }
}
