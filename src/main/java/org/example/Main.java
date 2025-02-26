package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        boolean salir = true;
        boolean salir2 = true;
        int desicion = 0;
        int desicion2 = 0;
        int votosCand1 = 0;
        int votosCand2 = 0;
        int votosCand3 = 0;
        int totalVotos = 0;
        int opcionVoto = 0;

        // Valor de la campaña

        int valorCampCand1 = 0;
        int valorCampCand2 = 0;
        int valorCampCand3 = 0;


        //Menu
        do {
            System.out.println("\n\tBienvenido a la urna de votacion virtual");
            System.out.println("Elija una de las siguientes opciones del menu" +
                "\n1. Votar por un candidato" +
                "\n2. Calcular el costo de la campaña de un candidato" +
                "\n3. Vaciar las urnas de votacion" +
                "\n4. Conocer el numero total de votos" +
                "\n5. Conocer el porcentaje de votos de cada candidato" +
                "\n6. Costo promedio de campaña en las elecciones" +
                "\n7. Salir");
            desicion = sc.nextInt();
            switch (desicion) {
                case 1:
                    do{
                        System.out.println("\n\tSeleccione el numero acorde para votar por un candidato" +
                                "\n1. Gustavo Petro" +
                                "\n2. Juan Manuel Santos" +
                                "\n3. Barack Obama" +
                                "\n4. Salir");
                        opcionVoto = sc.nextInt();
                        switch (opcionVoto) {
                            case 1:
                                votosCand1++;     //Suma 1 voto para el candidato 1
                                totalVotos++;     //Suma 1 voto para la cantidad total de votos
                                System.out.println("Por cual medio publicitario conocio al candidato?" +
                                        "\n1. Internet" +
                                        "\n2. Radio" +
                                        "\n3. Television");
                                desicion2 = sc.nextInt();
                                if (desicion2 == 1) {
                                    valorCampCand1 += 700000;
                                }else if (desicion2 == 2) {
                                    valorCampCand1 += 200000;
                                }else if (desicion2 == 3) {
                                    valorCampCand1 += 600000;
                                }else {
                                    System.out.println("Opcion no valida" +
                                            "\nVoto no registrado!");
                                    votosCand1--;
                                    totalVotos--;
                                }
                                break;

                            case 2:
                                votosCand2++;
                                totalVotos++;    //Suma 1 voto para la cantidad total de votos
                                System.out.println("Por cual medio publicitario conocio al candidato?" +
                                        "\n1. Internet" +
                                        "\n2. Radio" +
                                        "\n3. Television");
                                desicion2 = sc.nextInt();
                                if (desicion2 == 1) {
                                    valorCampCand2 += 700000;
                                }else if (desicion2 == 2) {
                                    valorCampCand2 += 200000;
                                }else if (desicion2 == 3) {
                                    valorCampCand2 += 600000;
                                }else {
                                    System.out.println("Opcion no valida" +
                                            "\nVoto no registrado!");
                                    votosCand2--;
                                    totalVotos--;
                                }
                                break;

                            case 3:
                                votosCand3++;
                                totalVotos++;
                                System.out.println("Por cual medio publicitario conocio al candidato?" +
                                        "\n1. Internet" +
                                        "\n2. Radio" +
                                        "\n3. Television");
                                desicion2 = sc.nextInt();
                                if (desicion2 == 1) {
                                    valorCampCand3 += 700000;
                                }else if (desicion2 == 2) {
                                    valorCampCand3 += 200000;
                                }else if (desicion2 == 3) {
                                    valorCampCand3 += 600000;
                                }else {
                                    System.out.println("Opcion no valida" +
                                            "\nVoto no registrado!");
                                    votosCand3--;
                                    totalVotos--;
                                }
                                break;

                            case 4:
                                salir2 = false;
                                break;

                            default:
                                System.out.println("Opcion no valida");
                        }
                    }while(salir2);
                    break;

                case 2:
                    System.out.println("Costo total en publicidad de cada campaña" +
                            "\n1. Gustavo Petro: " + valorCampCand1 +
                            "\n2. Juan Manuel Santos: " + valorCampCand2 +
                            "\n3. Barack Obama: " + valorCampCand3);
                    break;

                case 3:
                    System.out.println("Vaciando Urnas...");
                    votosCand1 = 0;
                    votosCand2 = 0;
                    votosCand3 = 0;
                    totalVotos = 0;
                    valorCampCand1 = 0;
                    valorCampCand2 = 0;
                    valorCampCand3 = 0;
                    System.out.println("Finalizado.");
                    break;

                case 4:
                    System.out.println("Numero total de votos: " + totalVotos);
                    break;

                case 5:
                    try {
                            System.out.println("Porcentaje de votos por cada candidato" +
                                    "\n1. Gustavo petro: " + (100 * votosCand1) / totalVotos + "%" +
                                    "\n2. Juan Manuel Santos: " + (100 * votosCand2) / totalVotos + "%" +
                                    "\n3. Barack Obama: " + (100 * votosCand3) / totalVotos + "%");
                        }catch (ArithmeticException e){
                            System.out.println("No hay votos registrados!");
                        }
                        break;

                case 6:
                    System.out.println("Costo promedio de cada campaña" +
                            "\n1. Gustavo Petro: " + valorCampCand1/votosCand1 +
                            "\n2. Juan Manuel Santos: " + valorCampCand2/votosCand2 +
                            "\n3. Barack Obama: " + valorCampCand3/votosCand3);
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(salir);

    }
}