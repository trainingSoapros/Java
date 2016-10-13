package mx.edu.uam.practica3.electrodomestico;

/**
 *
 * @author AlfonsoLomas
 */
public class Television {
    public String marca;
    public int tamanio;
    public boolean encendido;
    public int canalActual;
    public int canalMaximo;
    public int volumenActual;
    public int volumenMaximo;

    public Television(String marca, int tamanio, boolean encendido, int canalActual, int canalMaximo, int volumenActual, int volumenMaximo) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.encendido = encendido;
        this.canalActual = canalActual;
        this.canalMaximo = canalMaximo;
        this.volumenActual = volumenActual;
        this.volumenMaximo = volumenMaximo;
    }
    
    //contrucor por default
    //cuando tu tienes mas de un metodo que se llama igual pero 
    //tiene diferentes parametros en su firma:
    // se dice que el metodo esta SOBRECARGADO
    public Television(){
    	//aqui hemos sobrecargado el constructor de la clase
    	System.out.println("Constructor sin parámetros (Default)");
    	
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

	public int getCanalActual() {
		return canalActual;
	}

	public void setCanalActual(int canalActual) {
		this.canalActual = canalActual;
	}

	public int getCanalMaximo() {
		return canalMaximo;
	}

	public void setCanalMaximo(int canalMaximo) {
		this.canalMaximo = canalMaximo;
	}

	public int getVolumenActual() {
		return volumenActual;
	}

	public void setVolumenActual(int volumenActual) {
		this.volumenActual = volumenActual;
	}

	public int getVolumenMaximo() {
		return volumenMaximo;
	}

	public void setVolumenMaximo(int volumenMaximo) {
		this.volumenMaximo = volumenMaximo;
	}
    
    


}