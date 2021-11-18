public class Motocicleta extends Vehiculo{

    private int cilindrado;
    private String tipo;

    public Motocicleta(String color, String modelo, String marca, String matricula, boolean disponibilidad, int cilindrado, String tipo) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.disponibilidad = disponibilidad;
        this.cilindrado = cilindrado;
        this.tipo = tipo;
    }

    public int getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(int cilindrado) {
        this.cilindrado = cilindrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindrado=" + cilindrado +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
