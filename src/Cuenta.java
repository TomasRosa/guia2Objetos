import java.util.UUID;

public class Cuenta
{
    private UUID id;
    private double balance;
    private ClienteBanco cliente;
    private Registro[] registros;
    private int validosRegistros;

    public Cuenta ()
    {
        this.registros = new Registro[10];
        this.validosRegistros = 0;
    }
    public Cuenta (UUID id, double balance, ClienteBanco cliente)
    {
        this.id = id;
        this.balance = balance;
        this.cliente = cliente;
        this.registros = new Registro[10];
        this.validosRegistros = 0;
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
        Registro nuevo = new Registro(dineroADepositar,1,this.cliente.getNombre());///Creo un registro con los datos.
        this.registros[validosRegistros] = nuevo; ///Ingreso el registro creado en la posicion valida.
        this.validosRegistros++; ///Aumento la posicion valida.
        this.setBalance(this.balance + dineroADepositar);
    }
    public void extraccion (double dineroAExtraer)
    {
        if((this.balance-dineroAExtraer) < -2000)
        {
            System.out.println("Solo se puede tener $2000 de balance negativo.");
        }
        else
        {
            this.balance = this.balance - dineroAExtraer;

            Registro nuevo = new Registro (dineroAExtraer,0,this.cliente.getNombre());
            this.registros[validosRegistros] = nuevo;
            this.validosRegistros++;
        }
    }
    /*
    public void mostrarArrayRegistros ()
    {
        for (int i = 0; i < validosRegistros; i++)
        {
            registros[i].mostrarRegistro();
        }
    }
     */
    public void mostrarRegistro ()
    {
        for(Registro historial: registros)
        {
            if (historial != null)
            {
                if (historial.getTipoRegistro() == 1)
                {
                    System.out.println(cliente.getNombre() + "," + "Deposito: " + historial.getMonto());
                    System.out.println("Su nuevo balance es de: " + this.getBalance());

                } else if (historial.getTipoRegistro() == 0)
                {
                    System.out.println(cliente.getNombre() + "," + "Extraccion: " + historial.getMonto());
                    System.out.println("Su nuevo balance es de: " + this.getBalance());

                }
            }
        }

    }


}
