package co.edu.unbosque.Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvWriter;
import com.opencsv.CSVWriter;

public class csv {

	
	public  void  exportCsv (List<case_information> save) {
		String Namecsv = "Datacases.csv"; // name of csv archive
		boolean existcsv = new File(Namecsv).exists();
		boolean colum = true;
		try {
			CsvWriter outCSV = new CsvWriter(new FileWriter(Namecsv, true), ';');
		if(!existcsv) {
			
			
			File archiveCase = new File(Namecsv);
			archiveCase.delete();
			
			//datos para identificar las columnas 
            outCSV.write("Tipo de caso");
            outCSV.write("especie");
            outCSV.write("Tamaño");
            outCSV.write("Localidad");
            outCSV.write("Diereccion");
            outCSV.write("Nombre completo del dueño");
            outCSV.write("Telefono");
            outCSV.write("Correo");
            outCSV.write("Comentario");
            outCSV.write("Fecha");
            
            outCSV.endRecord();
            colum = false;
		}
		
			
		
			
              
             //recorremos el arraylist y insertamos los datos
              
              for(case_information cases : save) {
            	  
            	  outCSV.write(cases.getTypology());
            	  outCSV.write(cases.getSpecies());
            	  outCSV.write(cases.getSize());
            	  outCSV.write(cases.getLocality());
            	  outCSV.write(cases.getAddress());
            	  outCSV.write(cases.getFull_Name_Owner());
            	  outCSV.write(cases.getTelephone());
            	  outCSV.write(cases.getEmail());
            	  outCSV.write(cases.getComments());
            	  outCSV.write(cases.getFecha());
            	  
            	  outCSV.endRecord();
            	  
              }
              
              outCSV.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
	