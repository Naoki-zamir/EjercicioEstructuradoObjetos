package com.personas.mantener;

public class Estudiante extends Persona {
    private String carrera;
    private int legajo;

    public Estudiante() {}

    public Estudiante(String nombre, String carrera, int legajo) {
        super(nombre, 0);  // Llama al constructor de la clase base Persona
        this.carrera = carrera;
        this.legajo = legajo;   
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }
}
