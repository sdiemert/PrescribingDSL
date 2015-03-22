package main.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JTextArea;

import main.Driver;

public class RxActionListener implements ActionListener {
	
	Driver d = new Driver(); 
	RxDocument doc = null; 
	JTextArea out = null; 

	public RxActionListener(RxDocument doc, JTextArea out) {
		this.doc = doc; 
		this.out = out; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			this.out.setText("Attempting to parse: "+this.doc.getText(0, this.doc.getLength())+"\n");
			d.operateOnStringInput(doc.getText(0, doc.getLength()));
			this.out.append("Success!\n"); 
		} catch (Exception e1) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e1.printStackTrace(pw);
			this.out.append(sw.toString()); // stack trace as a string
		}
	}

}
