/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal1eva;

import java.util.Scanner;

/**
 *
 * @author DAM116
 */
public class ExamenFinal1Eva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int opc=0;
        do{
            do{
                System.out.println("1.- Conversion de horas a segundos.\n" +
                                   "2.- Conversion de kilometros a metros.\n" +
                                   "3.-Salir.");
                opc = teclado.nextInt();
            }while((opc>3)||(opc<1));
            switch(opc){
                case 1:
                    System.out.println("Introduzca el numero de horas a convertir en segundos");
                    int horas=teclado.nextInt();
                    int segundos=horas*3600;
                    System.out.println(horas+" horas equivale a "+segundos+" segundos.");
                break;
                case 2:
                    System.out.println("Introduzca el numero de kilometros a convertir en metros");
                    int km=teclado.nextInt();
                    int m=km*1000;
                    System.out.println(km+" kilometros equivale a "+m+" metros.");
                break;
                case 3:
                    System.out.println("Saliendo del programa.");
                break;
                default:
                    System.out.println("Error");
                break;
            }
        }while(opc!=3);
    }
    
}
