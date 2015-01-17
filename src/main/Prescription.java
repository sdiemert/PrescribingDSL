package main;

import org.w3c.dom.Element;
import org.w3c.dom.Document;

public class Prescription implements PrescriptionElement{
	
	private PrescriptionTiming timing; 
	private PrescriptionDose dose;
	private PrescriptionAction action; 
	private String medication;
	
	public Prescription(PrescriptionTiming timing, PrescriptionDose dose, PrescriptionAction action, String medication){
		this.timing = timing;
		this.dose = dose;
		this.action = action;
		this.medication = medication; 
	}
	
	public Prescription(){
		this.timing = null; 
		this.dose = null;
		this.action = null;
		this.medication = null;
	}
	
	public PrescriptionTiming getTiming() {
		return timing;
	}
	public void setTiming(PrescriptionTiming timing) {
		this.timing = timing;
	}
	public PrescriptionDose getDose() {
		return dose;
	}
	public void setDose(PrescriptionDose dose) {
		this.dose = dose;
	}
	public PrescriptionAction getAction() {
		return action;
	}
	public void setAction(PrescriptionAction action) {
		this.action = action;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}

	@Override
	public String toString() {
		return "Prescription [timing=" + timing + ", dose=" + dose
				+ ", action=" + action + ", medication=" + medication + "]";
	} 
	
	/*
	 * <graph role="graph" edgeids="false" edgemode="directed" id="form_2-1">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>385 333 107 144</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>817 337 107 128</string>
            </attr>
        </node>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:ForPMA</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:day = 10</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:dose = &quot;81 MG&quot;</string>
            </attr>
        </edge>
        ....
	 */

	/*
	 * See http://www.mkyong.com/java/how-to-create-xml-file-in-java-dom/ 
	 * for a good example of building XML DOM trees using the w3c interface.
	 */
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber){
		//create new nodes for each attribute
		//create edges between these nodes
		//add attributes to each node as needed. 
		//layout is irrelevant at this point.

		Element prescription = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "prescription"+rxNumber);		
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, prescription, "let:medication=\""+this.medication+"\"");
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, prescription, "let:action=\""+this.action.toString()+"\"");
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, prescription, "type:Prescription");
		
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, prescription.getAttribute("id"), ((Element)this.timing.toGrooveXML(doc, rootNode, rxNumber)).getAttribute("id"), "timing");
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, prescription.getAttribute("id"), ((Element)this.dose.toGrooveXML(doc, rootNode, rxNumber)).getAttribute("id"), "dose");
		return prescription;
		
	}

}
