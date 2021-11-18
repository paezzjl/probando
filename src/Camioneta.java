public class Camioneta extends Vehiculo{

    private int puertas;
    private int butacas;
    private String tipo;

    public Camioneta(String color, String modelo, String marca, String matricula, boolean disponibilidad, int butacas, int puertas, String tipo) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.disponibilidad = disponibilidad;
        this.butacas = butacas;
        this.puertas = puertas;
        this.tipo = tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getButacas() {
        return butacas;
    }

    public void setButacas(int butacas) {
        this.butacas = butacas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "puertas=" + puertas +
                ", butacas=" + butacas +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
