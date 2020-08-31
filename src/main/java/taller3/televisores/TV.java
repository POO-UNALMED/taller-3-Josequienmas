package taller3.televisores;
public class TV {
	
	private static int numTv;
	private Marca Marca;
	private Control Control;
	private int canal = 1, precio = 500, volumen = 1;
	private boolean estado;
	
	TV(Marca marca, boolean estado){
		this.Marca = marca;
		this.estado = estado;
	}
	Marca getMarca() {
		return (this.Marca);
	}
	void setMarca(Marca Marca) {
		this.Marca = Marca;
	}
	Control getControl() {
		return (this.Control);
	}
	void setControl(Control Control) {
		this.Control = Control;
	}
	int getPrecio() {
		return (this.precio);
	}
	void setPrecio(int precioNuevo) {
		this.precio = precioNuevo;
	}
	int getVolumen() {
		return (this.volumen);
	}
	void setVolumen(int volumenNuevo) {
		if(volumenNuevo >= 0 && volumenNuevo <= 7 && this.estado == true) {
			this.volumen = volumenNuevo;
		}
	}
	int getCanal() {
		return (this.canal);
	}
	void setCanal(int canalNuevo) {
		if (canalNuevo >= 1 && canalNuevo <= 120 && this.estado == true) {
			this.canal = canalNuevo;
		}	
	}
	int getNumTv() {
		return (this.numTv);
	}
	boolean turnOn() {
		this.estado = true;
		return(this.estado);
	}
	boolean turnOff() {
		this.estado = false;
		return(this.estado);
	}
	boolean getEstado() {
		return (this.estado);
	}
	void canalUp() {
		if (this.canal != 120 && this.estado == true) {
			this.canal ++;
		}
	}
	void canalDown() {
		if(this.canal != 1 && this.estado == true) {
			this.canal --;
		}
	}
	void volumenUp() {
		if(this.volumen != 7 && this.estado == true ) {
			this.volumen ++;
		}
		
	}
	void volumenDown() {
		if(this.volumen != 0 && this.estado == true ) {
			this.volumen --;
		}
	}
	
}