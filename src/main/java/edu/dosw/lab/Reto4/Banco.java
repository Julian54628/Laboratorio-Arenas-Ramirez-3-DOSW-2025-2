package edu.dosw.lab.Reto4;

public enum Banco {
    BANCOLOMBIA("01"),
    DAVIVIENDA("02");

    private final String codigo;

    Banco(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
