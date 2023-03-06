/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_arreglos;

/**
 *
 * @author Marisol G
 */
public class EVA1_8_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO
        int [] arregloDatos = new int [50];
        int arregloDatos2 [] = new int [50];
        // tipoDato[]todas los identificadores son arreglos 
        int [] a,b,c,d;
        //tipoDato identificador [], solo el identidicador es arreglo
        int w,x[],y,z;
        //---------------------------
        System.out.println(arregloDatos);
        String []arregloCade = new String [50];
        System.out.println(arregloCade);
        // length: es la cantidad de elementos del arreglo
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int)(Math.random() * 100);
        }
       for (int i = 0; i < arregloDatos.length; i++) {
            System.out.print("["+ arregloDatos[i]+"]");
        }
      // arregloDatos[50]=100;// posicion incorrecta
       
    }
    
}
