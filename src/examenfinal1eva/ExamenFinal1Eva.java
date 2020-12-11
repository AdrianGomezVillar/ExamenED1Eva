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
                System.out.println("Software de conversión y modificación de datos(SCMD\u2122) desarrollado por TPM Studios\u00AE\n" +
                                   "¿Que operación desea realizar?\n" +
                                   "1.- Conversion de horas a segundos.\n" +
                                   "2.- Conversion de kilometros a metros.\n" +
                                   "3.- Conversion de kilometros/hora a metros/segundo.\n" +
                                   "4.-Salir.");
                opc = teclado.nextInt();
            }while((opc>4)||(opc<1));
            switch(opc){
                case 1:
                    System.out.println("Introduzca el numero de horas a convertir en segundos.");
                    int horas=teclado.nextInt();
                    int segundos=horas*3600;
                    System.out.println(horas+" horas equivale a "+segundos+" segundos.");
                break;
                case 2:
                    System.out.println("Introduzca el numero de kilometros a convertir en metros.");
                    int km=teclado.nextInt();
                    int m=km*1000;
                    System.out.println(km+" kilometros equivale a "+m+" metros.");
                break;
                case 3:
                    System.out.println("Introduzca la velocidad en kilometros/hora a convertir en metros/segundo.");
                    int kmh=teclado.nextInt();
                    double ms=kmh/3.6;
                    System.out.println(kmh+" kilometros/hora equivale a "+ms+" metros/segundo.");
                break;
                case 4:
                    System.out.println("Saliendo del programa.\n"+
                                       "Muchas gracias por confiar en TPM Studios\u00AE");
                break;
                default:
                    System.out.println("Inserte una opcion valida");//Esto nunca deberia aparecer ya que el do while de arriba solo permite elegir opciones validas.
                break;
            }
        }while(opc!=4);
    }
    
}
