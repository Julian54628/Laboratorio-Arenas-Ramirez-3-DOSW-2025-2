package edu.dosw.lab.Reto4;

import java.util.ArrayList;
import java.util.List;

public class GestionCuentas {
    private List<CuentaBancaria> cuentas = new ArrayList<>();

    public CuentaBancaria crearCuenta(String numeroCuenta, String nombreCliente) {
        Cliente cliente = new Cliente(nombreCliente, cuentas.size() + 1, "ID" + (cuentas.size() + 1));
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, cliente);
        cuentas.add(cuenta);
        return cuenta;
    }

    public void depositar(CuentaBancaria cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }

    public double consultarSaldo(CuentaBancaria cuenta) {
        return cuenta.getSaldo();
    }

    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        return cuentas.stream()
                .filter(c -> c.getNumeroCuenta().equals(numeroCuenta))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cuenta no encontrada"));
    }
}
