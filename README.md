# Tabla de Contenidos

- [Métodos en Java](#métodos-en-java)
    - [Introducción a los Métodos en Java](#introducción-a-los-métodos-en-java)
    - [¿Por qué Usar Métodos en Java?](#por-qué-usar-métodos-en-java)
    - [Conceptos Básicos de los Métodos en Java](#conceptos-básicos-de-los-métodos-en-java)
    - [Definir un Método](#definir-un-método)
    - [Parámetros de Método y Valores de Retorno](#parámetros-de-método-y-valores-de-retorno)
        - [Método con Parámetros](#método-con-parámetros)
        - [Método con Valores de Retorno](#método-con-valores-de-retorno)
    - [Métodos Void](#métodos-void)
    - [Sobrecarga de Métodos](#sobrecarga-de-métodos)
    - [Notas Importantes sobre los Métodos en Java](#notas-importantes-sobre-los-métodos-en-java)
    - [Ejercicio Práctico: Calculadora Simple](#ejercicio-práctico-calculadora-simple-15-minutos)
        - [Descripción de la Tarea](#descripción-de-la-tarea-2)
        - [Desafíos Adicionales](#desafíos-adicionales-si-el-tiempo-lo-permite-2)

- [Clases en Java](#clases-en-java)
    - [Introducción a las Clases en Java](#introducción-a-las-clases-en-java)
    - [¿Por qué Usar Clases en Java?](#por-qué-usar-clases-en-java)
    - [Conceptos Básicos de Clases en Java](#conceptos-básicos-de-clases-en-java)
    - [Modificadores de Acceso](#modificadores-de-acceso)
    - [Palabra Clave Final](#palabra-clave-final)
    - [Palabra Clave Static](#palabra-clave-static)
    - [Clases y Objetos](#clases-y-objetos)
    - [Herencia](#herencia)
    - [Constructores](#constructores)
    - [Polimorfismo](#polimorfismo)
    - [Notas Importantes sobre las Clases en Java](#notas-importantes-sobre-las-clases-en-java)
    - [Ejercicio Práctico: Sistema de Gestión de Biblioteca](#ejercicio-práctico-sistema-de-gestión-de-biblioteca-20-minutos)
        - [Descripción de la Tarea](#descripción-de-la-tarea-3)
        - [Desafíos Adicionales](#desafíos-adicionales-si-el-tiempo-lo-permite-3)

# Métodos en Java

## Introducción a los Métodos en Java

En Java, los métodos son como recetas que le indican al programa cómo realizar una tarea específica. Piensa en los
métodos como las instrucciones para hacer un sándwich: cada paso (método) te dice qué hacer a continuación, ya sea
agregar el pan, untar la mantequilla de maní o cortar el sándwich. De manera similar, los métodos en Java te permiten
organizar tu código en secciones que realizan tareas específicas.

### ¿Por qué Usar Métodos en Java?

Usar métodos en Java te ayuda a:

- **Mejorar la Organización del Código:** Divide tareas complejas en pasos más pequeños y manejables.
- **Promover la Reutilización del Código:** Escribe un método una vez y úsalo múltiples veces dentro de tu programa.
- **Mejorar la Legibilidad:** Haz que tu código sea más fácil de leer y entender agrupando operaciones relacionadas.
- **Simplificar el Mantenimiento:** Actualizar un método en un lugar actualiza todas las partes de tu programa que lo
  usan, facilitando el mantenimiento.

### Conceptos Básicos de los Métodos en Java

Un método en Java es un bloque de código que realiza una tarea específica. Puedes definir un método una vez y llamarlo (
o invocarlo) siempre que necesites realizar esa tarea. Los métodos pueden aceptar entradas, llamadas parámetros,
realizar acciones y devolver un resultado. Si un método no necesita devolver nada, se declara con la palabra
clave `void`.

### Definir un Método

Para definir un método en Java, especificas su tipo de retorno, nombre y parámetros (si los hay). El cuerpo del método
contiene el código que define lo que hace el método.

Sintaxis:

```java
returnType methodName(parameterType parameterName) {
    // Cuerpo del Método
    // Código a ejecutar
    return value; // Solo si el método no es void
}
```

Ejemplo:

```java
// Definir un método que devuelve un mensaje de saludo
String sayHello(String name) {
    return "Hello, " + name + "!";
}

public static void main(String[] args) {
    // Llamar al método sayHello y mostrar el resultado
    String greeting = sayHello("Alice");
    System.out.println(greeting);
}
```

### Parámetros de Método y Valores de Retorno

Los métodos pueden aceptar parámetros, que son valores que pasas al método al llamarlo. El método luego puede usar estos
parámetros para realizar operaciones. Los métodos también pueden devolver un valor, que es el resultado de las
operaciones del método.

#### Método con Parámetros

Un método puede tomar múltiples parámetros, que se especifican en la definición del método.

Sintaxis:

```java
returnType methodName(parameterType1 parameterName1, parameterType2 parameterName2) {
    // Cuerpo del Método
    return value; // Solo si el método no es void
}
```

Ejemplo:

```java
// Método que suma dos números
int add(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
    // Llamar al método add con parámetros
    int sum = add(5, 3);
    System.out.println("Sum: " + sum);
}
```

#### Método con Valores de Retorno

Un método puede devolver un valor, que debe coincidir con el tipo de retorno declarado del método.

Sintaxis:

```java
returnType methodName() {
    // Cuerpo del Método
    return value; // El valor debe coincidir con el tipo de retorno
}
```

Ejemplo:

```java
// Método que calcula el cuadrado de un número
int square(int number) {
    return number * number;
}

public static void main(String[] args) {
    // Llamar al método square y almacenar el resultado
    int result = square(4);
    System.out.println("Square: " + result);
}
```

### Métodos Void

Los métodos void no devuelven ningún valor. Simplemente realizan una acción, como imprimir en la consola.

Sintaxis:

```java
void methodName() {
    // Cuerpo del Método
    // No se necesita una declaración return
}
```

Ejemplo:

```java
// Método void que imprime un mensaje
void printMessage(String message) {
    System.out.println(message);
}

public static void main(String[] args) {
    // Llamar al método printMessage
    printMessage("Hello, World!");
}
```

### Sobrecarga de Métodos

La sobrecarga de métodos es una característica en Java donde puedes tener múltiples métodos con el mismo nombre pero
diferentes listas de parámetros. El compilador determina qué método llamar en función del número y tipo de parámetros
pasados.

Sintaxis:

```java
// Método con un parámetro
int multiply(int a) {
    return a * a;
}

// Método sobrecargado con dos parámetros
int multiply(int a, int b) {
    return a * b;
}

public static void main(String[] args) {
    // Llamar al método multiply con diferentes listas de parámetros
    System.out.println("Multiplying one number: " + multiply(5));
    System.out.println("Multiplying two numbers: " + multiply(5, 4));
}
```

### Notas Importantes sobre los Métodos en Java

- **Nombres de Métodos:** Elige nombres de métodos que describan claramente lo que hace el método.
- **Parámetros:** Asegúrate de que los parámetros sean significativos y proporcionen la información necesaria para que
  el método realice su tarea.
- **Reutilización de Métodos:** Intenta que los métodos sean reutilizables limitando su alcance a una única tarea bien
  definida.
- **Longitud del Método:** Mantén los métodos concisos. Si un método es demasiado largo, considera dividirlo en métodos
  más pequeños.

### Ejercicio Práctico: Calculadora Simple (15 minutos)

Crea un programa de calculadora simple con métodos para sumar, restar, multiplicar y dividir.

#### Descripción de la Tarea:

1. Define cuatro métodos: `add`, `subtract`, `multiply`, y `divide`.
2. Cada método debe aceptar dos parámetros enteros y devolver el resultado.
3. En el método `main`, demuestra el uso de cada método de la calculadora llamándolos con entradas de muestra.

#### Desafíos Adicionales (si el tiempo lo permite):

1. **Validación de Entradas:** Modifica los métodos para validar las entradas (por ejemplo, verifica que no sean números
   negativos).
2. **Operaciones con Punto Flotante:** Sobrecarga los métodos para manejar operaciones de punto flotante aceptando
   parámetros `double`.

Recuerda probar tus métodos exhaustivamente para asegurarte de que manejen todas las entradas esperadas e inesperadas de
manera adecuada. ¡Buena suerte!

# Clases en Java

## Introducción a las Clases en Java

Las clases en Java son la base de la programación orientada a objetos en este lenguaje. Sirven como planos para crear
objetos, que son instancias de una clase. Las clases encapsulan datos para el objeto y métodos para manipular esos
datos, proporcionando una forma poderosa de estructurar y organizar el código.

## ¿Por qué usar Clases en Java?

El uso de clases en Java te ayuda a:

- Organizar el código en unidades lógicas y reutilizables.
- Implementar encapsulación, ocultando detalles internos y exponiendo solo lo necesario.
- Crear código modular y mantenible.
- Modelar objetos y conceptos del mundo real en tus programas.
- Implementar herencia y polimorfismo para un código más flexible y extensible.

## Conceptos Básicos de Clases en Java

Una clase en Java típicamente consiste en:

- Campos (también llamados atributos o propiedades).
- Métodos (funciones que operan sobre los datos).
- Constructores (métodos especiales para inicializar objetos).
- Modificadores de acceso (para controlar la visibilidad y accesibilidad).

## Modificadores de Acceso

Los modificadores de acceso en Java controlan la visibilidad y accesibilidad de clases, métodos y variables. Los cuatro
principales modificadores de acceso son:

1. **public**: Accesible desde cualquier otra clase.
2. **protected**: Accesible dentro del mismo paquete y por las subclases.
3. **default** (sin modificador): Accesible solo dentro del mismo paquete.
4. **private**: Accesible solo dentro de la misma clase.

Ejemplo:

```java
public class MyClass {
    public int publicVar;
    protected int protectedVar;
    int defaultVar;
    private int privateVar;

    public void publicMethod() { /* ... */ }

    protected void protectedMethod() { /* ... */ }

    void defaultMethod() { /* ... */ }

    private void privateMethod() { /* ... */ }
}
```

## Palabra Clave Final

La palabra clave `final` en Java se utiliza para crear constantes y evitar la herencia, la sobrescritura de métodos y la
reasignación de variables.

1. **Final Variables**: No se pueden reasignar después de la inicialización.
2. **Final Methods**: No se pueden sobrescribir por las subclases.
3. **Final Classes**: No se pueden heredar.

Ejemplo:

```java
public final class Constants {
    public static final double PI = 3.14159;

    public final void printMessage() {
        System.out.println("This method cannot be overridden.");
    }
}
```

## Palabra Clave Static

La palabra clave `static` se utiliza para crear miembros a nivel de clase (variables y métodos) que pertenecen a la
clase en lugar de a instancias de la clase.

1. **Static Variables**: Compartidas entre todas las instancias de una clase.
2. **Static Methods**: Pueden ser llamados sin crear una instancia de la clase.

Ejemplo:

```java
public class Counter {
    private static int count = 0;

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
```

## Clases y Objetos

Una clase es un plano para crear objetos. Los objetos son instancias de una clase.

Ejemplo:

```java
public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

// Creación de un objeto
Car myCar = new Car("Toyota Camry", 2022);
myCar.

displayInfo();
```

## Herencia

La herencia permite que una clase herede propiedades y métodos de otra clase. La palabra clave `extends` se utiliza para
crear una subclase.

Ejemplo:

```java
public class Vehicle {
    protected String brand;

    public void honk() {
        System.out.println("Honk honk!");
    }
}

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
    }
}
```

## Constructores

Los constructores son métodos especiales utilizados para inicializar objetos. Tienen el mismo nombre que la clase y no
tienen tipo de retorno.

Ejemplo:

```java
public class Person {
    private String name;
    private int age;

    // Constructor por defecto
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Constructor con parámetros
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

## Polimorfismo

El polimorfismo permite que los objetos de diferentes clases sean tratados como objetos de una superclase común. Puede
lograrse mediante la sobrescritura de métodos y la sobrecarga de métodos.

1. **Method Overriding**: La subclase proporciona una implementación específica para un método definido en su
   superclase.
2. **Method Overloading**: Múltiples métodos en la misma clase con el mismo nombre pero con diferentes parámetros.

Ejemplo:

```java
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    // Sobrecarga de métodos
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Woof!");
        }
    }
}

// Polimorfismo en acción
Animal myAnimal = new Dog();
myAnimal.

makeSound(); // Salida: The dog barks
```

## Notas Importantes sobre las Clases en Java

- Siempre usa nombres significativos para las clases, siguiendo la convención CamelCase (por ejemplo, `CarFactory`,
  no `carfactory`).
- Mantén las clases enfocadas en una única responsabilidad para mejorar la mantenibilidad.
- Usa los modificadores de acceso con prudencia para implementar encapsulación.
- Considera usar interfaces y clases abstractas para diseños más flexibles.
- Sé cauteloso con la herencia; favorece la composición sobre la herencia cuando sea apropiado.
- Proporciona siempre constructores apropiados para tus clases.

## Ejercicio Práctico: Sistema de Gestión de Biblioteca (20 minutos)

Crea un sistema simple de gestión de biblioteca utilizando clases en Java.

### Descripción de la Tarea:

1. Crea una clase Book con propiedades como title, author y ISBN.
2. Crea una clase Library que pueda manejar un solo libro a la vez, permitiendo agregar un libro, eliminarlo y mostrar
   la información del libro.
3. Usa modificadores de acceso, constructores y métodos adecuados.
4. En el método main, demuestra el uso de tus clases agregando un libro a la biblioteca, eliminando el libro y mostrando
   la información del libro.

### Desafíos Adicionales (si el tiempo lo permite):

1. Agrega un método borrowBook que marque el libro como prestado y evite que se preste nuevamente hasta que sea
   devuelto.
2. Agrega un método returnBook para devolver el libro a la biblioteca.

Recuerda aplicar los conceptos de encapsulación, constructores y diseño de métodos que hemos discutido. ¡Buena suerte!
