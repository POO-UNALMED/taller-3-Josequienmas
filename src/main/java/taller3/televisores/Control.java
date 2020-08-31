package taller3.televisores;
public class Control {
	
	private TV televisor;
	
	public void enlazar(TV televisor) {
		this.televisor = televisor;
		this.televisor.setControl(this);
	}
	public void turnOn() {
		this.televisor.turnOn();
	}
	public void turnOff() {
		this.televisor.turnOff();
	}
	public void canalUp() {
		this.televisor.canalUp();
	}
	public void canalDown() {
		this.televisor.canalDown();
	}
	public void volumenUp() {
		this.televisor.volumenUp();
	}
	public void volumenDown() {
		this.televisor.volumenDown();
	}
	public void setCanal(int canalNuevo) {
		this.televisor.setCanal(canalNuevo);
	}
	public TV getTv() {
		return(this.televisor);
	}
	
}
