package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int cant20 = 0;
        int cant50 = 0;
        int cant100 = 0;
        int cant200 = 0;
        int cant500 = 0;
        int cantidad = 0;
        int total = 0;
        int totalDenominacion = 0;
        boolean salir = true; //Salir del menu
        boolean salir2 = true;
        int opcion = 0; //Opcion del switch
        int opcion2 = 0;
        do{
        System.out.println("Bienvenido a la alcancia");
        System.out.println("Elija una opcion del 1 al 5");
        System.out.println("1. Agregar una moneda de una de las denominaciones indicadas");
        System.out.println("2. Contar cuantas monedas hay de cada denominacion");
        System.out.println("3. Calcular el total de dinero ahorrado");
        System.out.println("4. Romper la alcancia");
        System.out.println("5. Salir");
        opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    do{
                    System.out.println("\tElija un numero segun la denominacion que desea ingresar \n" +
                            "1:20 \t2:50 \t3:100 \t4:200 \t5:500 \n6:Salir al menu anterior");
                    opcion2 = teclado.nextInt();
                    if(opcion2 != 6){
                        System.out.println("Ingrese la cantidad de monedas");
                        cantidad = teclado.nextInt();
                    }
                        switch (opcion2){
                            case 1:
                                cant20 += cantidad;
                                totalDenominacion = cantidad * 20;
                                total += totalDenominacion;
                                break;
                            case 2:
                                cant50 += cantidad;
                                totalDenominacion = cantidad * 50;
                                total += totalDenominacion;
                                break;
                            case 3:
                                cant100 += cantidad;
                                totalDenominacion = cantidad * 100;
                                total += totalDenominacion;
                                break;
                            case 4:
                                cant200 += cantidad;
                                totalDenominacion = cantidad * 200;
                                total += totalDenominacion;
                                break;
                            case 5:
                                cant500 += cantidad;
                                totalDenominacion = cantidad * 500;
                                total += totalDenominacion;
                                break;
                            case 6:
                                salir2 = false;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }while(salir2);
                    break;

                case 2:
                    System.out.println("\tTotal de monedas por cada denominacion\n" +
                            "Monedas de 20:" + cant20 +
                            "\nMonedas de 50:" + cant50 +
                            "\nMonedas de 100:" + cant100 +
                            "\nMonedas de 200:" + cant200 +
                            "\nMonedas de 500:" + cant500);
                    break;
                case 3:
                    System.out.println("Total de dinero ahorrado: " + total);
                    break;
                case 4:
                    System.out.println("Alcancia Rota!");
                    cant20 = 0;
                    cant50 = 0;
                    cant100 = 0;
                    cant200 = 0;
                    cant500 = 0;
                    cantidad = 0;
                    total = 0;
                    break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(salir);
    }
}