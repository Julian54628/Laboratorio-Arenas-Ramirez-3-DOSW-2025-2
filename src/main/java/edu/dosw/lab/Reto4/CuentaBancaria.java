package edu.dosw.lab.Reto4;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente usuario;

    public CuentaBancaria(String numeroCuenta, Cliente usuario) {
        this.numeroCuenta = numeroCuenta;
        this.usuario = usuario;
        this.saldo = 0.0;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getUsuario() {
        return usuario;
    }
    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }
}
