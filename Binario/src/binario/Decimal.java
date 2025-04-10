/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binario;


/**
 *
 * @author crack
 */
public abstract class Decimal{

    
    public abstract String convertirABase(int numero, int base); // método común para varias bases
    
    
    public static String BinarioConvertir(int Numero){
        
     return Integer.toBinaryString(Numero);
           
}
    
    
    public static String DecimalAOcatal(int Numero){
     return Integer.toOctalString(Numero);
    } 
    
    
    
            

       public static String DecimalaVigesimal(int Numero){
        
        StringBuilder vigesimal = new StringBuilder();
        String datos = "0123456789ABCDEFGHIJ";
        boolean  esNegativo = Numero <0;
       Numero = Math.abs(Numero);
        while (Numero > 0){
            int resultado = Numero %20;
            vigesimal.insert(0,datos.charAt(resultado));
            Numero /=20;
        }if (esNegativo){
           vigesimal.insert(0, "-");
        }
        return vigesimal.toString();
       }
    
}
