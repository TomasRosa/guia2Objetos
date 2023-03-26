public class Autor
{
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    ///Getters y Setters

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public char getGenero()
    {
        return genero;
    }

    public void setGenero(char genero)
    {
        this.genero = genero;
    }
    ///Constructores
    public Autor ()
    {

    }
    public Autor (String nombre, String apellido, String email, char genero)
    {
        setApellido(apellido);
        setNombre(nombre);
        setEmail(email);
        setGenero(genero);
    }
    ///Metodos
    public void mostrarAutor  ()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Genero: " + this.genero);
    }
}
