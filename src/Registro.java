public class Registro
{
    private double monto;
    private int tipoRegistro; ///True-depositos-1 ///False-extraccion-0
    private String nombreCliente;

    private Cuenta sacarBalance;

    public Registro()
    {

    }
    public Registro(double monto, int tipoRegistro, String nombreCliente)
    {
        this.monto = monto;
        this.tipoRegistro = tipoRegistro;
        this.nombreCliente = nombreCliente;
    }

    public Cuenta getSacarBalance()
    {
        return sacarBalance;
    }

    public void setSacarBalance(Cuenta sacarBalance)
    {
        this.sacarBalance = sacarBalance;
    }

    public double getMonto()
    {
        return monto;
    }

    public void setMonto(double monto)
    {
        this.monto = monto;
    }

    public int getTipoRegistro()
    {
        return tipoRegistro;
    }

    public void setTipoRegistro(int tipoRegistro)
    {
        this.tipoRegistro = tipoRegistro;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }


}
