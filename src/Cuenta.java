import java.util.UUID;

public class Cuenta
{
    private UUID id;
    private double balance;
    private ClienteBanco cliente;
    private Registros[] depositos;
    private int validosDepositos;
    private Registros[] extracciones;
    private int validosExtracciones;

    public Cuenta ()
    {
        this.depositos = new Registros[10];
        this.validosDepositos = 0;
        this.extracciones = new Registros[10];
        this.validosExtracciones = 0;
    }
    public Cuenta (UUID id, double balance, ClienteBanco cliente)
    {
        this.id = id;
        this.balance = balance;
        this.cliente = cliente;
        this.depositos = new Registros[10];
        this.validosDepositos = 0;
        this.extracciones = new Registros[10];
        this.validosExtracciones = 0;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public ClienteBanco getCliente()
    {
        return cliente;
    }

    public void setCliente(ClienteBanco cliente)
    {
        this.cliente = cliente;
    }
    public void deposito (double dineroADepositar)
    {
        setBalance(getBalance()+dineroADepositar);
    }
    public void extraccion (double dineroAExtraer)
    {
        if((getBalance()-dineroAExtraer) < -2000)
        {
            System.out.println("Solo se puede tener $2000 de balance negativo.");
        }
        else
        {
            setBalance(getBalance()-dineroAExtraer);
        }
    }
}
