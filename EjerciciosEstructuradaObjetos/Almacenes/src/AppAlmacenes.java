import Almecenes.Mantener.Cliente;
import Almecenes.Mantener.Factura;
import Almecenes.Mantener.Fecha;
import Almecenes.Mantener.Producto;
import java.util.ArrayList;

public class AppAlmacenes {
    public static void main(String[] args) throws Exception {
        Fecha hoy= new Fecha(20, 11, 2024);
        Producto producto1= new Producto(1, "Cafe",(float)8.500);
        Producto producto2= new Producto(2, "Media luna",(float)8.500);
        Cliente cliente = new Cliente(1,"Juana");
        Factura F1  =  new Factura("Factura", 1,hoy ,0, cliente, new ArrayList<>());  
        F1.Agregar(producto1);
        F1.Agregar(producto2);
        F1.mostrar();

    }
}
