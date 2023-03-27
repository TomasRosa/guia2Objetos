import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Factura
{
    private UUID id;
    private double monto;
    private LocalDate fecha;
    private Cliente clientecito;
    private ArrayList <ItemVenta> coleccionDeProductos;
    /*
    public ArrayList<ItemVenta> getProducto()
    {
        return coleccionDeProductos;
    }

     */
    ///Mi coleccion de productos no usa getter porque devolveria todo de golpe.
    public ItemVenta getItem(int index) ///No la uso pero es para mostrar un item solo.
    {
        return coleccionDeProductos.get(index);
    }
    public void setProducto(ArrayList<ItemVenta> coleccionDeProductos)
    {
        this.coleccionDeProductos = coleccionDeProductos;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public double getMonto()
    {
        return monto;
    }

    public void setMonto(double monto)
    {
        this.monto = monto;
    }

    public LocalDate getFecha()
    {
        return fecha;
    }

    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }

    public Cliente getClientecito()
    {
        return clientecito;
    }

    public void setClientecito(Cliente clientecito)
    {
        this.clientecito = clientecito;
    }
    public Factura ()
    {
        this.coleccionDeProductos= new ArrayList<>();
    }
    public Factura (UUID id, double monto, LocalDate fecha, Cliente cliente)
    {
       setId(id);
       setMonto(monto);
       setFecha(fecha);
       setClientecito(cliente);
       ///Debo hacer un constructor vacio que inicialize el arraylist como abajo, solo eso necesita el constructor vacio.
       setProducto(new ArrayList<>());///Inicializo el arreglo
    }
    public void montoTotal ()
    {
        System.out.println("El monto total de la factura es: " + getMonto());
    }
    public double montoTotalConDescuento (double porcentaje)
    {
        double descuento = getMonto() * (porcentaje/100);
        double montoTotalConDescuento = getMonto() - descuento;
        return montoTotalConDescuento;
    }
    public void mostrarFactura (double montoConDescuento)
    {
        System.out.println("FACTURA:");
        System.out.println("ID factura: " + getId());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Monto: " + getMonto());
        System.out.println("Monto con descuento: " + montoConDescuento);
        System.out.println("CLIENTE:");
        getClientecito().mostrarCliente();
    }
    public void mostrarArregloItems ()
    {
        for (ItemVenta producto: coleccionDeProductos)
        {
            producto.mostrarItem();
        }
    }
    public void agregarItemVenta(ItemVenta producto)
    {
        this.coleccionDeProductos.add(producto);
    }
}
