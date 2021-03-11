package ro.ase.cts.program;



import java.io.FileNotFoundException;
import java.util.List;


import readers.AplicantReader;
import readers.StudentReader;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class Program {
	
	//diferenta intre functii si metode: metoda apartine unui ob ->ptr this
	//pt metode si functii ->verbe
	
	public static List<Aplicant> readAplicant( AplicantReader reader) throws NumberFormatException,FileNotFoundException {
		//principiul liskov: implemnetarea astfel incat daca inlocuim cu orice ob al clasei fiu sa avem aceasi implementare
	return reader.readAplicants();
	
	}

	public static void main(String[] args) {
		//nu trebuie sa depindem in implementari de clasele concrete, ci de cele abstracte 
		//clasa aplicand este abstracta
		System.out.println("Suma finantata student: "+Student.getSumaFinantata());
		System.out.println("Suma finantata ngajat:" +Angajat.getSumaFinantata());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti=readAplicant(new StudentReader("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afiseazaSumaFinantata();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}
