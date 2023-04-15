/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ariel
 */
import java.util.Scanner;
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* crea un array de caracteres que contenga de la A, Z solo mayusculas, despues se pedira las
        pociciones del array por teclado, y si la posicion del array es correcta, se añadira un string
        al final y el programa terminara cuando se ingrese un -1*/
        
        Scanner lector=new Scanner(System.in);
        char alfabeto[]=new char[26];
        for(int i=65,j=0;i<=90;i++,j++){
           alfabeto[j]=(char)i;
        }
        int posicion=0;
        System.out.println(alfabeto.length);
        do{
           
          System.out.println("eliga un indice entre 0 y "+(alfabeto.length-1));
          posicion=lector.nextInt();
         
          
          if(posicion>=0 && posicion<26){
            System.out.println("la letra que se encuentra en esa posicion es: "+alfabeto[posicion]); 
          }else{
           System.out.println("el numero ingresado no corresponde a una posicion del alfabeto");   
          }  
          
            
        }while(posicion!=-1);
    }
    
}
