package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables
        boolean salir = true;
        int opcion = 0;
        int deposito = 0;
        int retiro = 0;
        String numCuenta = "";
        String nombreTemp = "";
        int saldoTemp = 0;
        String numeroCuentaTemp = "";

        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", 0, "0001");
        CuentaBancaria cuenta2 = new CuentaBancaria("Chami", 0, "0002");
        CuentaBancaria cuenta3 = new CuentaBancaria("Ramiro", 0, "0003");

        List<CuentaBancaria> listCuentas = new ArrayList<>();

        listCuentas.add(cuenta1);
        listCuentas.add(cuenta2);
        listCuentas.add(cuenta3);

        do{
            boolean cuentaExiste = false;
            System.out.println("------------------------------");
            System.out.println("\tBienvenido a Falabella");
            System.out.println("1. Depositar dinero" +
                    "\n2. Retirar dinero" +
                    "\n3. Ver datos de la cuenta" +
                    "\n4. Crear cuenta" +
                    "\n5. Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el numero de cuenta");
                    numCuenta = sc.next();
                    for (int i = 0; i < listCuentas.size(); i++) {
                        if (numCuenta.equals(listCuentas.get(i).getNumeroCuenta())){
                            System.out.println("Ingrese el valor del deposito");
                            deposito = sc.nextInt();
                            listCuentas.get(i).depositarDinero(deposito);
                            System.out.println("Deposito de " + deposito + " exitoso");
                            cuentaExiste = true;
                            break;
                        }
                    }
                    if(cuentaExiste == false) {
                        System.out.println("Numero de cuenta no encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el numero de cuenta");
                    numCuenta = sc.next();
                    for (int i = 0; i < listCuentas.size(); i++) {
                        if (numCuenta.equals(listCuentas.get(i).getNumeroCuenta())){
                            System.out.println("Ingrese el valor del retiro");
                            retiro = sc.nextInt();
                            listCuentas.get(i).retirarDinero(retiro);
                            cuentaExiste = true;
                            break;
                        }
                    }
                    if(cuentaExiste == false) {
                        System.out.println("Numero de cuenta no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el numero de cuenta");
                    numCuenta = sc.next();
                    for (int i = 0; i < listCuentas.size(); i++) {
                        if (numCuenta.equals(listCuentas.get(i).getNumeroCuenta())){
                            System.out.println(listCuentas.get(i).toString());
                            cuentaExiste = true;
                            break;
                        }
                    }
                    if(cuentaExiste == false) {
                        System.out.println("Numero de cuenta no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el nombre del titular");
                    sc.nextLine();
                    nombreTemp = sc.nextLine();
                    System.out.println("Ingrese el saldo del titular");
                    saldoTemp = sc.nextInt();
                    System.out.println("Ingrese el numero de cuenta");
                    numeroCuentaTemp = sc.next();

                    for (int i = 0; i < listCuentas.size(); i++) {
                        if (numeroCuentaTemp.equals(listCuentas.get(i).getNumeroCuenta())){
                            System.out.println("Numero de cuenta " + numeroCuentaTemp + " ya existe");
                            cuentaExiste = true; // vuelve la variable verdadera para saber si la cuenta ya existe
                        }
                    }
                    if(cuentaExiste == false) { // si la variable es verdadera, no crea la cuenta,
                        CuentaBancaria cuentaTemporal = new CuentaBancaria(nombreTemp, saldoTemp, numeroCuentaTemp);
                        listCuentas.add(cuentaTemporal);
                        System.out.println("Cuenta creada exitosamente");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(salir);

    }
}