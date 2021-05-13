package Banco;

public class Cuenta {
	//ATRIBUTOS//
	private String titular;
	private double importe;
	
	
	//Metodo Constructor//
	public Cuenta (String Titular,double Importe) {
		this.titular =Titular;
		this.importe=Importe;}



public void ingresar (double Importe) {
	if(Importe>0) {this.importe += Importe;}
		
	}


public void retirar (double Importe) {
	if (this.importe-Importe < 0 ) {this.importe = 0;}
	else {this.importe -= Importe;
	} }

public String toString() {
	return "El titular : " + titular + " tiene un saldo de : " + importe;
}



	}