public class Registros
{
    private double monto;
    private Boolean tipoRegistro; ///True-depositos-1 ///False-extraccion-0
    private String nombreCliente;

    public Registros ()
    {

    }
    public Registros (double monto, Boolean tipoRegistro, String nombreCliente)
    {
        this.monto = monto;
        this.tipoRegistro = tipoRegistro;
        this.nombreCliente = nombreCliente;
    }
}
