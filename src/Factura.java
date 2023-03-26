import java.time.LocalDate;
import java.util.UUID;

public class Factura
{
    private UUID id;
    private double monto;
    private LocalDate fecha;
    private Cliente clientecito;

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

    }
    public Factura(UUID id, double monto, LocalDate fecha,Cliente clientecito)
    {
        setFecha(fecha);
        setId(id);
        setMonto(monto);
        setClientecito(clientecito);
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
}
