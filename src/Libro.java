import java.sql.SQLOutput;
import java.util.ArrayList;

public class Libro
{
    ///Atributos
    private String titulo;
    private int precio;
    private int stock;
    //private Autor autorcito;
    private ArrayList <Autor> autorArreglo;

    public ArrayList<Autor> getAutorArreglo()
    {
        return autorArreglo;
    }

    public void setAutorArreglo(ArrayList<Autor> autorArreglo)
    {
        this.autorArreglo = autorArreglo;
    }

    ///Getters y Setters
    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getPrecio()
    {
        return precio;
    }

    public void setPrecio(int precio)
    {
        this.precio = precio;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }
    /*
    public Autor getAutorcito()
    {
        return autorcito;
    }

    public void setAutorcito(Autor autorcito)
    {
        this.autorcito = autorcito;
    }
    */
    ///Constructores
    public Libro ()
    {
        setAutorArreglo(new ArrayList<>()); ///Inicializo el arreglo
    }
    public Libro (String titulo, int precio, int stock, Autor autorcito)
    {
        /*
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autorcito = autorcito;
         */
        setTitulo(titulo);
        setPrecio(precio);
        setStock(stock);
        setAutorArreglo(new ArrayList<>()); ///Inicializo el arreglo.
        getAutorArreglo().add(autorcito); ///Inicializo el arreglo y le agrego el autor al arreglo.
    }
    ///metodos
    public void mostrarLibro ()
    {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
        ///autorcito.mostrarAutor();
        for (int i = 0; i < getAutorArreglo().size(); i++)
        {
            getAutorArreglo().get(i).mostrarAutor();
        }
    }
    /*
    public void mostrarAlgunosAtributos()
    {
        System.out.println("El libro, " + this.titulo + " de " + this.autorcito.getNombre() + " se vende a " + this.precio + " pesos");
    }
    */
    public void mostrarAlgunosAtributosArreglo ()
    {
        System.out.println("El libro, " + getTitulo() + " se vende a: " + getPrecio() + " pesos. De los siguientes autores: ");
        for(int i = 0; i < getAutorArreglo().size(); i++)
        {
            System.out.println("El autor es: " + getAutorArreglo().get(i).getNombre() + " " + getAutorArreglo().get(i).getApellido());
        }
    }
    public void recibirAutorAgregaArray (Autor autorcito)
    {
        getAutorArreglo().add(autorcito); ///funcion que utilizo para agregar autores al arreglo de autores.
    }

}
