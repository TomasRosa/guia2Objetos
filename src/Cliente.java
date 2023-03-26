import java.util.UUID;

public class Cliente
{
    private UUID id;
    private String nombre;
    private String email;
    private int descuento;

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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getDescuento()
    {
        return descuento;
    }

    public void setDescuento(int descuento)
    {
        this.descuento = descuento;
    }
    public Cliente ()
    {

    }
    public Cliente (UUID id, String nombre, String email, int descuento)
    {
        setDescuento(descuento);
        setNombre(nombre);
        setEmail(email);
        setId(id);
    }
    public void mostrarCliente ()
    {
        System.out.println("ID del cliente: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Descuento: " + getDescuento() + "%");
    }
}

