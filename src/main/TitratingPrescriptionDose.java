package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TitratingPrescriptionDose extends PrescriptionDose implements PrescriptionElement {
	private Dose startDose = null; 
	private Dose stopDose = null;
	private int amountChange = 0;  

	public TitratingPrescriptionDose(int amount, DoseUnit unit) {
		super(amount, unit);
		// TODO Auto-generated constructor stub
	}

	public TitratingPrescriptionDose() {
		// TODO Auto-generated constructor stub
	}

	public TitratingPrescriptionDose(int change) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sanityCheck() {
		// TODO Auto-generated method stub
		return null;
	}

}
