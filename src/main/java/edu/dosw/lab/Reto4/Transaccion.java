package edu.dosw.lab.Reto4;

import java.time.LocalDate;
import java.util.Locale;

/**
 * Modela una transacción bancaria.
 * Contiene información sobre el tipo de operación, monto, fecha y la cuenta asociada.
 */
public class Transaccion {

    private int id;
    private LocalDate fecha;
    private int tipo;
    private double monto;
    private CuentaBancaria cuenta;

    /**
     * Constructor para crear una nueva transacción.
     * @param id El identificador único de la transacción.
     * @param fecha La fecha en que se realizó la transacción.
     * @param tipo El tipo de transacción (1 para depósito, 2 para retiro).
     * @param monto El monto de la transacción.
     * @param cuenta La cuenta bancaria sobre la que se realiza la transacción.
     */
    public Transaccion(int id, LocalDate fecha, int tipo, double monto, CuentaBancaria cuenta) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }
    /**
     * Obtiene el ID de la transacción.
     * @return El ID de la transacción.
     */
    public int getId() {
        return id;
    }
    /**
     * Obtiene la fecha de la transacción.
     * @return La fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    public int getTipo() {
        return tipo;
    }
    public double getMonto() {
        return monto;
    }
    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void deposito() {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }

    public void retiro() {
        if (monto > cuenta.getSaldo()) throw new IllegalArgumentException("Saldo insuficiente.");
        cuenta.setSaldo(cuenta.getSaldo() - monto);
    }

    public String detalles() {
        String tipoStr = (tipo == 1) ? "Depósito" : "Retiro";
        return String.format(Locale.US, "Transacción #%d - %s - Monto: %.2f - Fecha: %s - Cuenta: %s",
                id, tipoStr, monto, fecha, cuenta.getNumeroCuenta());
    }
}
