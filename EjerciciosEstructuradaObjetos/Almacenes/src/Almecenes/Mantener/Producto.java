package Almecenes.Mantener;

public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;

    public Producto(){}

    public Producto( int codigo, String descripcion, float precio){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setPrecio(float precio){
        this.precio=precio;
    }

    public float getPrecio(){
        return precio;
    }



}
