package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	
	private static int numTV;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int num) {
		TV.numTV = num;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (this.canal < 120 && estado) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		if (this.canal > 1 && estado) {
			this.canal--;
		}
	}

	public void volumenUp() {
		if (this.volumen < 7 && estado) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if (this.volumen > 0 && estado) {
			this.volumen--;
		}
	}
}
