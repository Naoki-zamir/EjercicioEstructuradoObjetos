package Almecenes.Mantener;

public class Cliente {
    private int codigo;
    private String razonSocial;

    public Cliente(){}

    public Cliente(int codigo, String razonSocial){
        this.codigo=codigo;
        this.razonSocial=razonSocial;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setRazonSocial(String razonSocial){
        this.razonSocial=razonSocial;
    }

    public String getRazonSocial(){
        return razonSocial;
    }

}
