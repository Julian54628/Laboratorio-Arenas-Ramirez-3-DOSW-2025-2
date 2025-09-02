package edu.dosw.lab.Reto4;

public class ValidadorCuenta {

    private final GestionCuentas gestion;

    public ValidadorCuenta(GestionCuentas gestion) {
        this.gestion = gestion;
    }

    public boolean validarExistencia(String cuenta) {
        try {
            gestion.buscarCuenta(cuenta);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
