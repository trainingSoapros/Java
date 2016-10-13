package mx.edu.uam.practica3.electrodomestico;

/**
 *
 * @author AlfonsoLomas
 */
public class Ventilador {
    public String marca;
    public int tamanio;
    public boolean encendido;
    public int velocidadActual;
    public int velocidadMaxima;

    public Ventilador(String marca, int tamanio, boolean encendido, int velocidadActual, int velocidadMaxima) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.encendido = encendido;
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


}