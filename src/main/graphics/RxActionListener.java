package main.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Driver;

public class RxActionListener implements ActionListener {
	
	Driver d = new Driver(); 
	RxDocument doc = null; 
	public RxActionListener(RxDocument doc) {
		this.doc = doc; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			d.operateOnStringInput(doc.getText(0, doc.getLength()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
