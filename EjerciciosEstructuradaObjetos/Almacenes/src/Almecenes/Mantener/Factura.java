package Almecenes.Mantener;
import java.util.ArrayList;
import java.util.Iterator;

public class Factura extends Comprobante {
    private ArrayList<Producto> producto = new ArrayList<>();  
    private float total;
    private Cliente cliente;
    
    public Factura(){}

    public Factura(String tipo, int numero, Fecha fecha, float total, Cliente cliente, ArrayList<Producto> producto) {
        super(tipo, numero, fecha);
        this.total = total;
        this.producto = producto;
        this.cliente = cliente;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void Agregar(Producto productoP) {
        producto.add(productoP);
        setTotal(getTotal() + productoP.getPrecio());
    }

    public void mostrarProducto() {
        Iterator<Producto> iter = producto.iterator();
        while (iter.hasNext()) {
            Producto productoP = iter.next();
            System.out.println("Codigo: " + productoP.getCodigo() + " Descripcion: " + productoP.getDescripcion() + " precio: " + productoP.getPrecio());
        }
    }

    public void mostrar() {
        System.out.println("Tipo: " + getTipo());  
        System.out.println("Cliente:\n");
        System.out.printf("Codigo %d razon social: %s \n", cliente.getCodigo(), cliente.getRazonSocial());
        System.out.println("Producto:\n");
        mostrarProducto();
        System.out.printf("Total: %6.2f \n", getTotal()); 
    }
}
