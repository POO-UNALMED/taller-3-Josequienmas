package taller3.televisores;
public class Control {
	
	private TV televisor;
	
	void enlazar(TV televisor) {
		this.televisor = televisor;
		this.televisor.setControl(this);
	}
	void turnOn() {
		this.televisor.turnOn();
	}
	void turnOff() {
		this.televisor.turnOff();
	}
	void canalUp() {
		this.televisor.canalUp();
	}
	void canalDown() {
		this.televisor.canalDown();
	}
	void volumenUp() {
		this.televisor.volumenUp();
	}
	void volumenDown() {
		this.televisor.volumenDown();
	}
	void setCanal(int canalNuevo) {
		this.televisor.setCanal(canalNuevo);
	}
	
}
