package org.example;

public class CuentaBancaria {

    private String titular;
    private int saldo;
    private String numeroCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, int saldo, String numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }

    public void depositarDinero(int dinero){
        this.saldo += dinero;
    }

    public void retirarDinero(int dinero){
        if (this.saldo >= dinero) {
            this.saldo -= dinero;
            System.out.println("Retiro exitoso por valor de " + dinero);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

}
