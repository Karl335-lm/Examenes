# Examenes
Conversion de base decimal a una base distinta
## Descripción
Este proyecto tiene la finalidad de convertir numeros enteros ya sean positivos o negativos de la base decimal a una base distinta
El proyecto binario contiene dos clases, y el proyecto Conversioness contiene el JFrame, esto es debido a que se utiliza el .jar del proyecto
## Instrucciones para importar el .jar
El IDE que utilizamos es Neatbeans, sobre el proyecto binario, doble click derecho
y puede observar el apartado de clean en build para que se cree una carpeta llama dist.
en el proyecto Conversioness, en la carpeta de librerias insertamos el .jar que creamos
previamente.
## Explicacion del código

Este proyecto está enfocado en el desarrollo de una librería Java personalizada para la conversión de números decimales a diferentes bases numéricas, como binario, octal y vigesimal. La aplicación principal es un JFrame que permite al usuario ingresar un número decimal y ver su equivalencia en diversas bases de manera visual e interactiva.
Para mantener el código ordenado, reutilizable y extensible, se ha construido una arquitectura que incluye:
Clases con métodos estáticos para conversiones simples.
Una clase abstracta que puede ser extendida para implementar conversiones más complejas o personalizadas.
Una interfaz gráfica que actúa como el puente entre el usuario y la lógica de la librería.
A continuación, se explican en detalle las clases y métodos utilizados, incluyendo cómo funcionan, cómo se relacionan entre sí y ejemplos clave del código.

 `Explicación de la CLASE DECIMAL`
La clase Decimal es una clase abstracta que actúa como base para realizar conversiones de números decimales a distintas bases numéricas, incluyendo binario, octal y vigesimal. La estructura está pensada para que otros programadores puedan extender la funcionalidad implementando el método abstracto.

`Estructura general`
```java
Copiar
Editar
public abstract class Decimal {
    public abstract String convertirABase(int numero, int base);
    ...
}
```
convertirABase: es un método abstracto, lo que significa que debe ser implementado por cualquier subclase que herede de Decimal.
Este enfoque permite que el programa pueda incluir otras bases personalizadas sin modificar la lógica principal.


`Métodos implementados en la clase Decimal`
1. `BinarioConvertir(int Numero)`
Convierte un número decimal a su representación en binario (base 2).
 Componentes importantes del método:
static: El método se puede invocar sin necesidad de crear un objeto de la clase.
String: Devuelve una cadena de texto con el número en base binaria.
Integer.toBinaryString(Numero): Método nativo de Java que realiza la conversión de decimal a binario.

```java

public static String BinarioConvertir(int Numero) {
    return Integer.toBinaryString(Numero);
}
```
`Ejemplo de uso:`

```java

String resultado = Decimal.BinarioConvertir(25); // Devuelve "11001"
```
2. `DecimalAOcatal(int Numero)`
Convierte un número decimal a su representación en octal (base 8).
 Componentes importantes del método:
static: Puede usarse directamente sin crear un objeto.
Integer.toOctalString(Numero): Método de Java que convierte a base 8.

```java

public static String DecimalAOcatal(int Numero) {
    return Integer.toOctalString(Numero);
}
```
` Ejemplo de uso:`

```java

String resultado = Decimal.DecimalAOcatal(25); // Devuelve "31"
```








`CLASE CLASEHIJA`

La clase Clasehija es una implementación concreta que hereda de la clase abstracta Decimal. Su propósito es dar funcionalidad al método abstracto convertirABase(), permitiendo convertir números decimales a cualquier base numérica válida que acepte Java (por ejemplo, base 2 a base 36).

`Estructura general`


```java

public class Clasehija extends Decimal {
    @Override
    public String convertirABase(int numero, int base) {
        return Integer.toString(numero, base);
    }
}
```


`¿Qué componentes contiene?`
extends Decimal: Establece una relación de herencia. Clasehija hereda de la clase Decimal, lo que significa que debe implementar todos los métodos abstractos definidos allí.
@Override: Esta anotación indica que estamos reescribiendo el método abstracto convertirABase(int numero, int base) que fue definido en Decimal.
Integer.toString(numero, base): Método estándar de Java que convierte un número entero a su representación en cualquier base entre 2 y 36.



` ¿Cómo se usa este método? `
El método convertirABase() permite convertir un número a bases no implementadas directamente por métodos como BinarioConvertir u OctalConvertir. Esto da mayor flexibilidad al sistema, ya que no necesitas crear un método específico para cada base.

```java

Clasehija convertidor = new Clasehija();
String resultadoBase5 = convertidor.convertirABase(100, 5); // Devuelve "400"
String resultadoBase16 = convertidor.convertirABase(255, 16); // Devuelve "ff"
```
` Relación con otras clases del proyecto `

Clasehija es parte del diseño orientado a objetos de tu sistema de conversión.
Al extender de Decimal, mantiene la estructura base y se alinea con el principio de polimorfismo.
Puede ser usada como alternativa genérica a los métodos estáticos cuando se desean conversiones dinámicas con diferentes bases en tiempo de ejecución.



`JFRAME ENTRADA`

` Constructor y creación del objeto`
Supongamos que tienes una clase abstracta Decimal y una clase concreta que hereda de ella, como ConversorDecimal.

```java

Decimal conversor = new ConversorDecimal(125);
```
Aquí estás creando un objeto llamado conversor.
Este objeto es de tipo Decimal pero usa una clase hija ConversorDecimal para implementarse.
El número 125 se pasa al constructor, que inicializa el número decimal que será convertido.

`¿Qué es btnCalcularActionPerformed(...)?`

Es el método que se ejecuta cuando das clic en el botón "Calcular" de tu interfaz gráfica (JButton). Este método está conectado al botón en el JFrame usando un ActionListener.

`¿Qué hace este método en resumen?`
Lee un número del txtIngresa.
Verifica qué base inicial y base destino están seleccionadas en los combobox (comboBases y combBas).
Según la selección, convierte el número decimal a la base deseada (Binario, Octal, Hexadecimal, etc.).
Muestra el resultado en txtResultado.
Si hay un error al escribir (por ejemplo, letras), lanza un mensaje de error.

`Lectura y validación del número`
```java

int numero = Integer.parseInt(txtIngresa.getText());
```
Esto convierte lo que el usuario escribió en el JTextField (txtIngresa) a un número entero.
 Si escribes letras o caracteres raros, se lanza una excepción, y por eso está en un try-catch.
 
` Uso de métodos según la base destino`
```java

if ("Decimal".equals(comboBases.getSelectedItem()) && "Binario".equals(combBas.getSelectedItem())) {
    String resul = Decimal.BinarioConvertir(numero);
    txtResultado.setText(resul);
}
```
Este bloque es uno de los más importantes. Si el usuario quiere convertir de Decimal a Binario, llama al método BinarioConvertir(...) de la clase Decimal.

`Método importante: conversor.convertirABase(numero, base);`

```java

String resultado = conversor.convertirABase(numero, 3); // ternario
```
Aquí se usa un objeto llamado conversor que probablemente fue creado antes en tu clase como:

```java

ConversorNumerico conversor = new ConversorNumerico();
```
Este objeto accede a un método genérico para convertir a cualquier base entre 2 y 19 usando este método:

```java

public String convertirABase(int numero, int base) {
    // código para convertir
}
```
Este es un método reutilizable , que evita tener que escribir uno distinto para cada base.

`Otro método especial: Decimal.DecimalAOcatal(...)`
```java

String resul = Decimal.DecimalAOcatal(numero);
```
Este método es específico para la base Octal. Igual con Decimal.DecimalaVigesimal(numero) para base 20.


`Manejo de errores`
```java

} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Por favor, ingresa solo numeros enteros del 0-9", "Error de entrada", JOptionPane.ERROR_MESSAGE);
    txtIngresa.setText(""); 
    txtResultado.setText("");
}
```
Esta parte detecta si el usuario ingresó algo incorrecto (como letras), muestra un mensaje, y limpia los campos.




## Instalación 
Para instalar este proyecto, solo necesitas clonar el repositorio y ejecutar el código en tu entorno local
## Link de Youtube y javadoc
[docs.zip](https://github.com/user-attachments/files/19678113/docs.zip)
https://youtu.be/u1QxmP-D1uM
