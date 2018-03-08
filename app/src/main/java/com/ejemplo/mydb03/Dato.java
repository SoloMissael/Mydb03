package com.ejemplo.mydb03;

/**
 * Created by missa on 07/03/2018.
 */

public class Dato {

    private String id,nombre,sueldo;

    public Dato(String id, String nombre, String sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo=sueldo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSueldo() {
        return sueldo;
    }
}
