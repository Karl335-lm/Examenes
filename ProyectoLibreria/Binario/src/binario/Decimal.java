/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binario;


/**
 *
 * @author Karla y Emanuel
 */
/**
 * Clase utilitaria final para realizar conversiones de números decimales 
 * a distintas bases numéricas (desde base 2 hasta base 20).
 * Todos los métodos son estáticos.
 */
public final class Decimal {

    /**
     * Convierte un número decimal a binario (base 2).
     * 
     * @param numero el número decimal a convertir
     * @return representación binaria del número
     */
    public static String DecimalaBinario(int numero) {
        return Integer.toBinaryString(numero);      
    }

    /**
     * Convierte un número decimal a base 3.
     * 
     * @param numero el número decimal a convertir
     * @param base debe ser 3
     * @return representación en base 3 del número
     */
    public static String DecimalATres(int numero, int base) {
        return Integer.toString(numero, base);
    }

    /**
     * Convierte un número decimal a base 4.
     * 
     * @param numero el número decimal a convertir
     * @param base debe ser 4
     * @return representación en base 4 del número
     */
    public static String DecimalACuatro(int numero, int base) {
        return Integer.toString(numero, base);
    }

    /**
     * Convierte un número decimal a base 5.
     * 
     * @param numero el número decimal a convertir
     * @param base debe ser 5
     * @return representación en base 5 del número
     */
    public static String DecimalACinco(int numero, int base) {
        return Integer.toString(numero, base);
    }

    /**
     * Convierte un número decimal a base 6.
     * 
     * @param numero el número decimal a convertir
     * @param base debe ser 6
     * @return representación en base 6 del número
     */
    public static String DecimalASeis(int numero, int base) {
        return Integer.toString(numero, base);
    }

    /**
     * Convierte un número decimal a base 7.
     * 
     * @param numero el número decimal a convertir
     * @param base debe ser 7
     * @return representación en base 7 del número
     */
    public static String DecimalASiete(int numero, int base) {
        return Integer.toString(numero, base);
    }

    /**
     * Convierte un número decimal a octal (base 8).
     * 
     * @param Numero el número decimal a convertir
     * @return representación octal del número
     */
    public static String DecimalAOctal(int Numero) {
        return Integer.toOctalString(Numero);
    }

    /**
     * Convierte un número decimal a base 9.
     * 
     * @param numero el número decimal a convertir
     * @param base debe ser 9
     * @return representación en base 9 del número
     */
    public static String DecimalANueve(int numero, int base) {
        return Integer.toString(numero, base);
    }

    /**
     * Convierte un número decimal a base 10.
     * 
     * @param numero el número decimal a convertir
     * @param base debe ser 10
     * @return representación en base 10 del número
     */
    public static String DecimalADiez(int numero, int base) {
        return Integer.toString(numero, base);
    }

    /**
     * Convierte un número decimal a unidecimal (base 11).
     * Usa letras 'A' para representar el valor 10.
     * 
     * @param Numero el número decimal a convertir
     * @return representación en base 11 del número
     */
    public static String DecimalaUnidecimal(int Numero) {
        StringBuilder unidecimal = new StringBuilder();
        boolean esNegativo = Numero < 0;
        Numero = Math.abs(Numero);
        String datos = "0123456789A";
        while (Numero > 0) {
            int resultado = Numero % 11;
            unidecimal.insert(0, datos.charAt(resultado));
            Numero /= 11;
        }
        if (esNegativo) {
            unidecimal.insert(0, "-");
        }
        return unidecimal.toString();
    }

    /**
     * Convierte un número decimal a duodecimal (base 12).
     * Usa letras 'A' y 'B' para representar los valores 10 y 11.
     * 
     * @param Numero el número decimal a convertir
     * @return representación en base 12 del número
     */
    public static String DecimalaDuodecimal(int Numero) {
        StringBuilder duodecimal = new StringBuilder();
        String datos = "0123456789AB";
        boolean esNegativo = Numero < 0;
        Numero = Math.abs(Numero);
        while (Numero != 0) {
            int resultado = Numero % 12;
            duodecimal.insert(0, datos.charAt(resultado));
            Numero /= 12;
        }
        if (esNegativo) {
            duodecimal.insert(0, "-");
        }
        return duodecimal.toString();
    }

    /**
     * Convierte un número decimal a tridecimal (base 13).
     * Usa letras 'A' a 'C' para representar valores del 10 al 12.
     * 
     * @param Numero el número decimal a convertir
     * @return representación en base 13 del número
     */
    public static String DecimalaTridecimal(int Numero) {
        StringBuilder tridecimal = new StringBuilder();
        String datos = "0123456789ABC";
        boolean esNegativo = Numero < 0;
        Numero = Math.abs(Numero);
        while (Numero > 0) {
            int resultado = Numero % 13;
            tridecimal.insert(0, datos.charAt(resultado));
            Numero /= 13;
        }
        if (esNegativo) {
            tridecimal.insert(0, "-");
        }
        return tridecimal.toString();
    }

    /**
     * Convierte un número decimal a tetradecimal (base 14).
     * Usa letras 'A' a 'D' para representar valores del 10 al 13.
     * 
     * @param Numero el número decimal a convertir
     * @return representación en base 14 del número
     */
    public static String DecimalaTetradecimal(int Numero) {
        StringBuilder tetradecimal = new StringBuilder();
        String datos = "0123456789ABCD";
        boolean esNegativo = Numero < 0;
        Numero = Math.abs(Numero);
        while (Numero > 0) {
            int resultado = Numero % 14;
            tetradecimal.insert(0, datos.charAt(resultado));
            Numero /= 14;
        }
        if (esNegativo) {
            tetradecimal.insert(0, "-");
        }
        return tetradecimal.toString();
    }

    /**
     * Convierte un número decimal a pentadecimal (base 15).
     * Usa letras 'A' a 'E' para representar valores del 10 al 14.
     * 
     * @param Numero el número decimal a convertir
     * @return representación en base 15 del número
     */
    public static String DecimalaPentadecimal(int Numero) {
        StringBuilder pentadecimal = new StringBuilder();
        String datos = "0123456789ABCDE";
        boolean esNegativo = Numero < 0;
        Numero = Math.abs(Numero);
        while (Numero > 0) {
            int resultado = Numero % 15;
            pentadecimal.insert(0, datos.charAt(resultado));
            Numero /= 15;
        }
        if (esNegativo) {
            pentadecimal.insert(0, "-");
        }
        return pentadecimal.toString();
    }

    /**
     * Convierte un número decimal a hexadecimal (base 16).
     * Usa letras 'A' a 'F' para representar valores del 10 al 15.
     * 
     * @param Numero el número decimal a convertir
     * @return representación hexadecimal del número
     */
    public static String DecimalaHexadecimal(int Numero) {
        StringBuilder hexadecimal = new StringBuilder();
        String datos = "0123456789ABCDEF";
        boolean esNegativo = Numero < 0;
        Numero = Math.abs(Numero);
        while (Numero > 0) {
            int resultado = Numero % 16;
            hexadecimal.insert(0, datos.charAt(resultado));
            Numero /= 16;
        }
        if (esNegativo) {
            hexadecimal.insert(0, "-");
        }
        return hexadecimal.toString();
    }

    /**
     * Convierte un número decimal a vigesimal (base 20).
     * Usa letras 'A' a 'J' para representar valores del 10 al 19.
     * 
     * @param Numero el número decimal a convertir
     * @return representación en base 20 del número
     */
    public static String DecimalaVigesimal(int Numero) {
        StringBuilder vigesimal = new StringBuilder();
        String datos = "0123456789ABCDEFGHIJ";
        boolean esNegativo = Numero < 0;
        Numero = Math.abs(Numero);
        while (Numero > 0) {
            int resultado = Numero % 20;
            vigesimal.insert(0, datos.charAt(resultado));
            Numero /= 20;
        }
        if (esNegativo) {
            vigesimal.insert(0, "-");
        }
        return vigesimal.toString();
    }

    /**
     * Método principal para pruebas.
     * 
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
