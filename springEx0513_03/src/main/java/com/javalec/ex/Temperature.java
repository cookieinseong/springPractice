package com.javalec.ex;

public class Temperature {

	String nav;
	double temp;
	Calculator cal;
	
	public String getNav() {
		return nav;
	}
	public void setNav(String nav) {
		this.nav = nav;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	
	public Calculator getCal() {
		return cal;
	}
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	public void temperature() {
		cal.nav_temp(nav, temp);
	}
	
	
}
