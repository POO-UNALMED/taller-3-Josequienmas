package taller3.televisores;
public class TV {
	
	private static int numTv;
	private Marca Marca;
	private Control Control;
	private int canal = 1, precio = 500, volumen = 1;
	private boolean estado;
	
	public TV(Marca marca, boolean estado){
		this.Marca = marca;
		this.estado = estado;
	}
	public Marca getMarca() {
		return (this.Marca);
	}
	public void setMarca(Marca Marca) {
		this.Marca = Marca;
	}
	public Control getControl() {
		return (this.Control);
	}
	public void setControl(Control Control) {
		this.Control = Control;
	}
	public int getPrecio() {
		return (this.precio);
	}
	public void setPrecio(int precioNuevo) {
		this.precio = precioNuevo;
	}
	public int getVolumen() {
		return (this.volumen);
	}
	public void setVolumen(int volumenNuevo) {
		if(volumenNuevo >= 0 && volumenNuevo <= 7 && this.estado == true) {
			this.volumen = volumenNuevo;
		}
	}
	public int getCanal() {
		return (this.canal);
	}
	public void setCanal(int canalNuevo) {
		if (canalNuevo >= 1 && canalNuevo <= 120 && this.estado == true) {
			this.canal = canalNuevo;
		}	
	}
	public int getNumTv() {
		return (this.numTv);
	}
	public boolean turnOn() {
		this.estado = true;
		return(this.estado);
	}
	public boolean turnOff() {
		this.estado = false;
		return(this.estado);
	}
	public boolean getEstado() {
		return (this.estado);
	}
	public void canalUp() {
		if (this.canal != 120 && this.estado == true) {
			this.canal ++;
		}
	}
	public void canalDown() {
		if(this.canal != 1 && this.estado == true) {
			this.canal --;
		}
	}
	public void volumenUp() {
		if(this.volumen != 7 && this.estado == true ) {
			this.volumen ++;
		}
		
	}
	public void volumenDown() {
		if(this.volumen != 0 && this.estado == true ) {
			this.volumen --;
		}
	}
	
}
