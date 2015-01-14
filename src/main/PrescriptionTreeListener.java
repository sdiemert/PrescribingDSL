package main;

import antlr.prescription.PrescriptionBaseListener;
import antlr.prescription.PrescriptionParser;

public class PrescriptionTreeListener extends PrescriptionBaseListener{

	public PrescriptionTreeListener(PrescriptionParser parser){
		
	}
	
	@Override
	public void enterMedication(PrescriptionParser.MedicationContext ctx){
		System.out.println("enterMedication() -> "+ctx.getTokens(5).toString());
	}
	
}
