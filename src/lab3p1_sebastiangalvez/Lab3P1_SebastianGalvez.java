/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_sebastiangalvez;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Lab3P1_SebastianGalvez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Opcion 1: La puerta misteriosa");
        System.out.println("Opcion 2: Sumatoria");
        System.out.println("Opcion 3: arco y frecha");
        int opcion= leer.nextInt();
        while (opcion !=4){
            switch(opcion){
                case 1:  System.out.println("Ingrese la cantidad de terminos (N > 0) :");
                int cantidad = leer.nextInt();
                if (cantidad < 0) {
                    System.out.println("Ingrese un numero mayor que 0: ");
                    cantidad = leer.nextInt();
                }else {
                System.out.println("Resultado de la sucesion: ");   
                int n1 = 3;
                int n2 = 0;
                int n3 = 2;
                int suma;
                for (int i = 0; i < cantidad; i=i+1) {
                    if (i == 1) {
                        System.out.println(n1);
                    } else if (i == 2) {
                        System.out.println(n2);
                    } else if (i == 3) {
                        System.out.println(n3);
                    } else {
                        suma = n1 + n2;
                        System.out.println(suma);
                        n1 = n2;
                        n2 = n3;
                        n3 = suma;
                    }
                } 
                }
            
            break;
                
                case 2:{System.out.println("Ingrese el limite:(n)");
                int limite = leer.nextInt();
                double acum = 0;
                double factorial;
                if (limite > 0){
                    for(int i=1; i<=limite; i=i+1){
                        factorial = 1;
                        for(int n=1; n<= 2*i+1; n=n+1){
                            factorial = factorial*n;
                        }
                        double n1 =(i*i + 3*i + 1);
                        double n2 = (i+2); 
                        double resultado = (n1*n2)/factorial;
                        acum = acum + resultado;
                        System.out.printf("n=%d, suma = %f%n",i,acum);
                    }   

                }
             }
               break;
                
                case 3:{  System.out.println("Arco y flecha");
                           System.out.println("Ingrese un numero");
                           int numero= leer.nextInt();
                           if( numero >= 7){
                               for (int i=1 ; i < numero ;i++){ 
                             for(int j=1 ; j < numero ; j++){                                 
                                if(i==numero -1 || j==1 || i == j || i + j==numero  ){
                                    System.out.print("*");    
                                }
                                else{
                                System.out.print(" ");  
                                }
                            }
                            System.out.println();                        
                            }
                           }
                           System.out.println("Ingrese un numero mayor que 7");
                    break;
                }
                default:
                    
                
                }//Fin del 
            }//Fin del 
            
        }//Fin del 
        
    }//Fin del 

    

