package readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {

	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;
}
