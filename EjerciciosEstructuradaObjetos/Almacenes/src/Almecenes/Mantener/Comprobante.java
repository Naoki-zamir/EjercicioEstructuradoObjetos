package Almecenes.Mantener;

public class Comprobante {
    private String tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante(){}

    public Comprobante( String tipo, int numero, Fecha fecha){
        this.tipo=tipo;
        this.numero=numero;
        this.fecha=fecha;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setFecha(Fecha fecha){
        this.fecha=fecha;
    }

    public Fecha getFecha(){
        return fecha;
    }

}
