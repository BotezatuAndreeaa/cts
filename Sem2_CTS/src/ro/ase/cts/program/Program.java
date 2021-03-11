package ro.ase.cts.program;


import java.io.FileNotFoundException;
import java.util.List;

import readers.AngajatReader;
import readers.AplicantReader;
import readers.StudentReader;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class Program {
	
	//diferenta intre functii si metode: metoda apartine unui ob ->ptr this
	//pt metode si functii ->verbe
	
	public static List<Aplicant> readAplicant(String fisier, StudentReader studentReader) throws NumberFormatException,FileNotFoundException {
		//principiul liskov: implemnetarea astfel incat daca inlocuim cu orice ob al clasei fiu sa avem aceasi implementare
	return studentReader.readAplicants();
	
	}

	public static void main(String[] args) {
		//nu trebuie sa depindem in implementari de clasele concrete, ci de cele abstracte 
		//clasa aplicand este abstracta
		
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti=readAplicants(new StudentReader("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
