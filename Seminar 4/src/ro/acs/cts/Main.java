package ro.acs.cts;

import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;
import ro.ase.cts.clase.Manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartamentFinanciarEager primulDepartamentFinanciar = DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamentFinanciar =  DepartamentFinanciarEager.getInstance();

		primulDepartamentFinanciar.setDirector("Gigel");
		alDoileaDepartamentFinanciar.setNrAngajati(30);
		
		System.out.println(primulDepartamentFinanciar.toString());
		System.out.println(alDoileaDepartamentFinanciar.toString());
		
		
		DepartamentFinanciar primulDepartamentFinanciarLazzy =DepartamentFinanciar.getInstance(10, "Popescu", 4000);
		DepartamentFinanciar alDoileaDepartamentFinanciarLazzy =DepartamentFinanciar.getInstance(20, "Marcel", 2800);
	
		System.out.println(primulDepartamentFinanciarLazzy.toString());
		System.out.println(alDoileaDepartamentFinanciarLazzy.toString());
		
		Manager primulManager= Manager.getInstance("Matei", 34, 3700);
		Manager alDoileaManager= Manager.getInstance("Cristian", 42, 3800);
		
		System.out.println(primulManager.toString());
		System.out.println(alDoileaManager.toString());
	}
	

}
