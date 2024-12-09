package com.biblioteca.mantener;

public class Autor extends General{
    private String observacion;
    private int libroPublicados;
    private Pais pais;

    public Autor(){

    }

    public  Autor(int codigo, String nombre, String observacion, int libroPublicados, Pais pais ){
        super(codigo, nombre);
        this.observacion=observacion;
        this.libroPublicados=libroPublicados;
        this.pais=pais;
    }

    public void setObservacion(String observacion){
        this.observacion=observacion;
    }

    public String getObservacion(){
        return observacion;
    }

    public void setLibrosPublicados(int libroPublicados){
        this.libroPublicados=libroPublicados;
    }

    public int getLibrosPublicados(){
        return libroPublicados;
    }

    public void setPais(Pais pais){
        this.pais=pais;
    }

    public Pais getPais(){
        return pais;
    }

    public String toString(){
        return " Libro{ " +super.toString()+" Observacion "+observacion+" Libro publicados " + libroPublicados + " Pais " + pais + '}';
    }

}
