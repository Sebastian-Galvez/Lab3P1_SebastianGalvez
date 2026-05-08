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
                case 1:{ System.out.println("La puerta misteriosa");
                    System.out.println("Inrgrese la cantidad de terminos: ");
                            int i= leer.nextInt();
                            if(i >= 1){                               
                                for(i =1 ; i <= 1 ; i++){
                                        System.out.println("3");
                                      for(int h =2 ; h<= 2 ; h++){
                                           System.out.println("0");
                                           for(int m=3 ; m <= 3; m++){
                                              System.out.println("2");
                                           }
                                        }
                                }
                            }
                                System.out.println("Ingrese un numero mayor que 0"); 
                                break;
                }//Fin del 
                case 2:{  System.out.println("Sumatoria");
                           System.out.println("Ingrese el limite: ");
                           int n= leer.nextInt();
                           float mult1=0;
                           float mult2=0;
                           float mult3=0;
                           float combinados=0;
                           if (n < 0){
                              System.out.println("Ingrese un numero mayor que 0");
                           }
                              else {
                                      for(int i =1 ; i <= n ; i++){
                                          mult1= (i * i + 3 * i + 1);
                                          mult2= (i + 2);
                                          mult3= (2 * i + 1);
                                          combinados= (mult1 + mult2)/mult3;
                                          
                                          System.out.println("es:"+ combinados);
                                      }
                                      }  
                           break;
                }
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
                
                }//Fin del 
            }//Fin del 
            
        }//Fin del 
        
    }//Fin del 

    

