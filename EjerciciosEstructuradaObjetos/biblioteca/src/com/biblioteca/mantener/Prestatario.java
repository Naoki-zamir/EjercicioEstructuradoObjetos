package com.biblioteca.mantener;

public class Prestatario extends General{
    private String direccion;
    private String telefono;
    private String rut;
    private Ciudad ciudad;

    public Prestatario(){
        
    }

    public Prestatario( String direccion, String telefono, String rut, Ciudad ciudad, int codigo, String nombre){
        super(codigo, nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.rut = rut;
        this.ciudad = ciudad; 
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return telefono;
    }

    public void setRut(String rut){
        this.rut= rut;
    }
    
    public String getRut(){
        return rut;
    }


    public void setCiudad(Ciudad ciudad){
        this.ciudad = ciudad;
    }
    
    public Ciudad getCiudad(){
        return ciudad;
    }

    public String tuString(){
        return " prestatario{ "+super.toString()+ " Direccion "+ direccion+ " telefono "+telefono+" rut "+rut+" ciudad " +ciudad+'}'; 
    }

}
