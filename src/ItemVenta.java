import java.util.UUID;

public class ItemVenta
{
    private UUID id;
    private String nombre;
    private String descripcion;
    private int precioUnitario;
    ///Getters y Setters
    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public int getPrecioUnitario()
    {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    ///Constructores
    public ItemVenta ()
    {

    }
    public ItemVenta (UUID id, String nombre, String descripcion, int precioUnitario)
    {
        setId(id);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecioUnitario(precioUnitario);
    }
    public void montoTotal ()
    {
        System.out.println("El monto total del item sin descuento es: " + getPrecioUnitario());
    }
    public double calcularMontoConDescuentoItem (double porcentaje)
    {
        double descuento = getPrecioUnitario() * (porcentaje/100);
        double montoTotalConDescuento = getPrecioUnitario() - descuento;
        return montoTotalConDescuento;
    }
    public void mostrarItem()
    {
        System.out.println("ID: " + getId());
        System.out.println("Precio unitario: " + getPrecioUnitario());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripcion: " + getDescripcion());
    }



}
