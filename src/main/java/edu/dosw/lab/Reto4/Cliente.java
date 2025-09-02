package edu.dosw.lab.Reto4;

public class Cliente {

    private String nombre;
    private int cuentaId;
    private String id;

    public Cliente() {
    }

    public Cliente(String nombre, int cuentaId, String id) {
        this.nombre = nombre;
        this.cuentaId = cuentaId;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int obtenerCuenta() {
        return cuentaId;
    }

    public void agregarCuenta(int nuevaCuentaId) {
        this.cuentaId = nuevaCuentaId;
    }

}
