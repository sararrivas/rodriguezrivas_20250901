/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguezrivas_20250901;

/**
 *
 * @author UFG
 */
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        matriz();
        
    }
    
    
    public static void matriz(){
        
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int suma = 0;
        int total_elementos = 0;
        double promedio = 0d;
        
        System.out.println("Ingrese los valores para una matriz 3 x 3");
        
        for(int i=0; i<matriz.length; i++){
            
            total_elementos += matriz[i].length;
            for(int j=0; j<matriz[i].length; j++){
                
                System.out.println("Elemento [ "+i+"]["+j+"]");
                matriz[i][j] = scanner.nextInt();
                
           
            }
            
        }
        
        System.out.println("Matriz Ingresada: ");
        
        for(int x=0; x< matriz.length; x++){
            
            for(int y=0; y <matriz.length; y++){
                
                System.out.print(matriz[x][y]+" ");
                
                suma +=matriz[x][y];
            }
            
            System.out.println();
            
        }
        
        promedio = (double) suma/total_elementos;
        
        System.out.println(suma+" es la sumatioria total de elementos, la cantidad de elementos digitados es de: "+total_elementos);
        System.out.println("El promedio de edad es: "+promedio);
        
        scanner.close();
    }
    
    
}
