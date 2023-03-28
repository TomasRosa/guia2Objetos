import java.util.UUID;

public class ClienteBanco
{
    private UUID id;
    private String nombre;
    private char genero;

    public ClienteBanco ()
    {

    }
    public ClienteBanco (UUID id, String nombre, char genero)
    {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }

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

    public char getGenero()
    {
        return genero;
    }

    public void setGenero(char genero)
    {
        this.genero = genero;
    }
    public void mostrarClienteBanco ()
    {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Genero: " + getGenero());
    }
}
