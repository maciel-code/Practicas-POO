package Banco;
//clase basica de cuentas bancaria//
public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuenta cuentaPesos = new Cuenta ("Brandon",4000);
		Cuenta cuentaDolares = new Cuenta ("Maciel",300);
			
		//Ingreso de dinero en cuenta//
		cuentaPesos.ingresar (1000);
		cuentaDolares.ingresar (400);
		
		//Retirar Dinero//
		
		cuentaPesos.retirar (50);
		cuentaDolares.retirar (100);
		
		//Mostrar info de las cuentas//
		System.out.println(cuentaPesos);
		System.out.println(cuentaDolares);

	
		
	}

}
