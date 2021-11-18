import java.io.*;

public class Main {
    public static void main(String[] args) {

        Concesionario presta = new Concesionario("presta","23456785");
        Auto auto1 = new Auto("Blanco","Corola","Toyota","DC 456 CD",true,1234567890, 5);
        Auto auto2 = new Auto("Negro","Civic","Honda","DC 457 CD",false,1234567890, 3);
        presta.agregarAuto(auto1);//agrega el auto nuevo
        presta.agregarAuto(auto2);

        Empleado empleado1 = new Empleado("fede", "lezcano", "Obligado1246","12001231231", "jefe",50000);
        presta.agregarEmpleado(empleado1);
        Cliente cliente1 = new Cliente("jose","jose","calle falsa 123","1234564648");
        presta.agregarCliente(cliente1);

        //System.out.println(presta.toString());

//        LecturaArchivo accesoExternos = new LecturaArchivo();
//        accesoExternos.leeDatos();
//        EscrituraArchivo escribeElArchivo = new EscrituraArchivo();
//        escribeElArchivo.escribir(presta.toString());
//        accesoExternos.paraArchivo(presta);
//        System.out.println("-------------------------");
//        System.out.println(presta.toString());

        //Escribe el archivo con los datos de la concesionaria.
        try {
            FileOutputStream fos = new FileOutputStream("concesionaria.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(presta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // Lee el archivo con los datos de la concesiionaria
        Concesionario concesionario = null;
        try {
            FileInputStream fis = new FileInputStream("concesionaria.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            concesionario = (Concesionario) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (concesionario != null) {
            System.out.println("La informacion de la concesionaria es: " + concesionario.toString());
        }

    }
}
