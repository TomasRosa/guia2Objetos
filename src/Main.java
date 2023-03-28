
import java.util.Scanner;
import java.util.UUID;
import java.time.LocalDate;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ver. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1();
                break;
            }
            case 2:
            {
                ejercicio2();
                break;
            }
            case 3:
            {
                ejercicio3();
                break;
            }
        }
    }
    public static void ejercicio1()
    {
        ///a
        Autor autorcito = new Autor("Joshua","Bloch","joshua@email.com",'M');
        Autor autorcito2 = new Autor ("Tomas","Rosa","tomas@hotmail.com",'M');
        Autor autorcito3 = new Autor ("Rosalia","Gimenez","rosalia@live.com",'M');
        ///b
        autorcito.mostrarAutor();
        System.out.println("--------------IMPRIMIENDO LIBRO COMPLETO---------------");
        ///c
        ///Creo un libro le mando el autor por parametro para que lo agregue, luego en las siguientes lineas
        ///Agrego dos autores mas al arreglo.
        Libro librito = new Libro("Effective Java",450,150,autorcito);
        librito.recibirAutorAgregaArray(autorcito2);
        librito.recibirAutorAgregaArray(autorcito3);
        ///d,e,f
        ///Muestro el libro con sus autores accediendo desde el libro.
        librito.mostrarLibro();

        librito.setPrecio(500);
        librito.setStock(librito.getStock()+50);
        System.out.println("Libro con nuevos atributos: ");
        ///imprimiendo el autor desde el libro, me imprime varios autores ya que los agregue contemplando el punto H.
        librito.mostrarLibro();

        ///librito.mostrarAlgunosAtributos();
        ///G, muestro algunos atributos con varios autores.
        librito.mostrarAlgunosAtributosArreglo();
    }
    public static void ejercicio2()
    {
        //a y b
        UUID id = UUID.randomUUID();

        Cliente clientecito = new Cliente(id,"Tomas Rosa","tomilautialdosivi@gmail.com",15);

        clientecito.mostrarCliente();
        ///c
        UUID idFactura  =UUID.randomUUID();
        LocalDate fecha = LocalDate.now();

        Factura facturita = new Factura(idFactura,1500,fecha,clientecito);
        System.out.println("Monto total de la factura: " + facturita.getMonto());
        System.out.println("Monto total de la factura con 15% de descuento: " + facturita.montoTotalConDescuento(clientecito.getDescuento()));
        ///d
        facturita.mostrarFactura(facturita.montoTotalConDescuento(clientecito.getDescuento()));
        ///e
        UUID idItem1 = UUID.randomUUID();
        UUID idItem2 = UUID.randomUUID();
        UUID idItem3 = UUID.randomUUID();
        ///Una factura con varios items, en un arrayList
        Factura factura1 = new Factura();
        ItemVenta nuevoItem = new ItemVenta(idItem1,"Tomas Rosa","Jabon",1500);
        ItemVenta nuevoItem2 = new ItemVenta(idItem2,"Jorge Lopez","Carbon",2000);
        ItemVenta nuevoItem3 = new ItemVenta(idItem3,"Carla Bobina","Detergente",1000);

        factura1.agregarItemVenta(nuevoItem);
        factura1.agregarItemVenta(nuevoItem2);
        factura1.agregarItemVenta(nuevoItem3);

        factura1.mostrarArregloItems();

        nuevoItem.montoTotal();
        double nuevoItemDesc = nuevoItem.calcularMontoConDescuentoItem(15);
        System.out.println("El monto total del item con 15% de descuento es: " + nuevoItemDesc + " " + nuevoItem.getNombre());

        nuevoItem2.montoTotal();
        double nuevoItemDesc2 = nuevoItem2.calcularMontoConDescuentoItem(15);
        System.out.println("El monto total del item con 15% de descuento es: " + nuevoItemDesc2 + " " + nuevoItem2.getNombre());

        nuevoItem3.montoTotal();
        double nuevoItemDesc3 = nuevoItem3.calcularMontoConDescuentoItem(15);
        System.out.println("El monto total del item con 15% de descuento es: " + nuevoItemDesc3 + " " + nuevoItem3.getNombre());
    }
    public static void ejercicio3()
    {
        ///a
        Scanner scan = new Scanner(System.in);
        UUID idCliente = UUID.randomUUID();
        ClienteBanco cliente = new ClienteBanco(idCliente,"Tomas Rosa",'M');
        cliente.mostrarClienteBanco();
        ///b
        UUID idCuentaCliente = UUID.randomUUID();
        Cuenta cuentaCliente = new Cuenta(idCuentaCliente,10000,cliente);
        System.out.println("Saldo actual: " + cuentaCliente.getBalance());
        System.out.println("Cuanto dinero deseas depositar en la cuenta? \n");
        double deposito = scan.nextDouble();
        cuentaCliente.deposito(deposito);
        System.out.println("El dinero de tu cuenta con el deposito es de: " + cuentaCliente.getBalance());
        ///c y d
        System.out.println("Cuanto dinero deseas retirar de tu cuenta? \n");
        double extraccion = scan.nextDouble();
        cuentaCliente.extraccion(extraccion);
        System.out.println("El dinero de tu cuenta con la extraccion es de: " + cuentaCliente.getBalance());
        ///Declarar arreglos, inicializar arreglos en constructores
    }
}