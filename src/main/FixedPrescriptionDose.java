package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class FixedPrescriptionDose extends PrescriptionDose implements PrescriptionElement {

	public FixedPrescriptionDose(int amount, DoseUnit unit) {
		super(amount, unit);
	}

	public FixedPrescriptionDose() {
		super(); 
	}

	@Override
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber) {
		return null;
	}

	@Override
	public Boolean sanityCheck() {
		return null;
	}
}
