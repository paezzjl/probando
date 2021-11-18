public class Auto extends Vehiculo{

    private int puertas;
    private int butacas;

    public Auto(String color, String modelo, String marca, String matricula, boolean disponibilidad, int butacas, int puertas) {
        this.butacas = butacas;
        this.puertas = puertas;
        this.color = color;
        this.modelo = modelo;
        this. matricula = matricula;
        this.marca = marca;
        this.disponibilidad = disponibilidad;
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

    @Override
    public String toString() {
        return "Auto{" +
                "puertas=" + puertas +
                ", butacas=" + butacas +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
