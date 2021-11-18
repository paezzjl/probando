import java.io.Serializable;
import java.util.LinkedList;

public class Concesionario implements Serializable {
    String nombre;
    String cuil;
    LinkedList<Vehiculo> coleccionVehiculos;
    LinkedList<Empleado> coleccionEmpleado;
    LinkedList<Cliente> coleccionCliente;

    @Override
    public String toString() {
        return "Concesionario{" +
                "nombre='" + nombre + '\'' +
                ", cuil=" + cuil +
                "\nColeccion de vehiculos=\n"+ coleccionVehiculos +
                "\n Empleados=\n"+ coleccionEmpleado +
                "\n Clientes=\n" + coleccionCliente +
                '}'+"\n";
    }

    public Concesionario(String nombre, String cuil) {
        this.nombre= nombre;
        this.cuil=cuil;
        this.coleccionVehiculos = new LinkedList<>();//crea una coleccion vacia
        this.coleccionCliente = new LinkedList<>();//crea una coleccion vacia
        this.coleccionEmpleado = new LinkedList<>();//crea una coleccion vacia

    }

    public void agregarAuto(Auto auto){
        coleccionVehiculos.add(auto);
    }
    public void agregarEmpleado(Empleado empleado){
        coleccionEmpleado.add(empleado);
    }
    public void agregarCliente(Cliente cliente){
        coleccionCliente.add(cliente);
    }

    public void eliminarVehiculo(String matriculaAuto) {
        boolean encontrado = false;
        for (Vehiculo vehiculo : coleccionVehiculos) {
            if (vehiculo.getMatricula().equals(matriculaAuto)) {
                coleccionVehiculos.remove(vehiculo);
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            System.out.println("Se encontró el vehiculo a eliminar");
        }else{System.out.println("No se encontró el vehiculo a eliminar");}
    }

    public void encontrarVehiculo(String matriculaAuto) {
        Vehiculo vehiculoEcontrado = null;
        for (Vehiculo vehiculo : coleccionVehiculos) {
            if (vehiculo.getMatricula().equals(matriculaAuto)) {
                vehiculoEcontrado = vehiculo;
                break;
            }
        }
        if (vehiculoEcontrado != null){
            System.out.println("Se encontró el auto: " + vehiculoEcontrado.toString());
        } else {
            System.out.println("No se encontró el auto");
        }
    }

    public Concesionario(String nombre, String cuil, LinkedList<Vehiculo> coleccionVehiculos, LinkedList<Empleado> coleccionEmpleado, LinkedList<Cliente> coleccionCliente) {
        this.nombre = nombre;
        this.cuil = cuil;
        this.coleccionVehiculos = coleccionVehiculos;
        this.coleccionEmpleado = coleccionEmpleado;
        this.coleccionCliente = coleccionCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public LinkedList<Vehiculo> getColeccionVehiculos() {
        return coleccionVehiculos;
    }

    public void setColeccionVehiculos(LinkedList<Vehiculo> coleccionVehiculos) {
        this.coleccionVehiculos = coleccionVehiculos;
    }

    public LinkedList<Empleado> getColeccionEmpleado() {
        return coleccionEmpleado;
    }

    public void setColeccionEmpleado(LinkedList<Empleado> coleccionEmpleado) {
        this.coleccionEmpleado = coleccionEmpleado;
    }

    public LinkedList<Cliente> getColeccionCliente() {
        return coleccionCliente;
    }

    public void setColeccionCliente(LinkedList<Cliente> coleccionCliente) {
        this.coleccionCliente = coleccionCliente;
    }
}
