package ro.ase.cts.clase;

public class Manager {
	private String nume;
	private int varsta;
	private double salariu;
	
	
	private static Manager manager=null;
	
	private Manager(String nume, int varsta, double salariu) {
		this.nume=nume;
		this.varsta=varsta;
		this.salariu=salariu;
		
	}
	
	public static synchronized Manager getInstance(String nume, int varsta, double salariu) {
		if(manager ==null) {
			manager=new Manager( nume, varsta, salariu);
				
		}
		return manager;
	}

	
	@Override
	public String toString() {
		return "Manager [nume=" + nume + ", varsta=" + varsta + ", salariu=" + salariu + "]";
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}

	
}
