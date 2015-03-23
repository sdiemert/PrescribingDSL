package main.graphics;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class RxFrame extends JFrame {
	Container container = null; 
	
	public RxFrame() throws HeadlessException {
		this.setUp(); 
	}

	public RxFrame(GraphicsConfiguration gc) {
		super(gc);
		this.setUp(); 
	}

	public RxFrame(String title) throws HeadlessException {
		super(title);
		this.setUp(); 
	}

	public RxFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		this.setUp(); 
	}
	
	/**
	 * Set up the JFrame's content and listeners. 
	 */
	private void setUp(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 800);
	
		Container contentPane = this.getContentPane(); 
		contentPane.setLayout(new GridLayout(2, 0));
		JPanel topPane = new JPanel(new GridBagLayout()); 
		JPanel bottomPane = new JPanel(new GridLayout(1,0)); 
		JPanel leftTopPane = new JPanel(new GridLayout(1, 0)); 
		JPanel rightTopPane = new JPanel(new GridLayout(3, 1)); 

	    JTextArea outputField = new JTextArea(20, 20); 
	    outputField.setText("Output here...");
	    outputField.setEditable(false);
	    JScrollPane outputFieldScroll = new JScrollPane(outputField); 
	    bottomPane.add(outputFieldScroll); 
		 
		//Prescription authoring area (top left)
		JTextPane editor = new JTextPane(); 
		RxDocument doc = new RxDocument(); 
		editor.setDocument(doc); 
		JScrollPane editorScroll = new JScrollPane(editor); 
		editorScroll.setPreferredSize(new Dimension(500, 100));
	    editorScroll.setMinimumSize(new Dimension(1, 10));
	    leftTopPane.add(editorScroll); 
	    
	    //controls and buttons area (top right)
	    JButton rxButton = new JButton("Go"); 
	    rxButton.addActionListener(new RxActionListener(doc, outputField));
	    rightTopPane.add(rxButton); 

	    //Layout the top left and right components together.
	    GridBagConstraints c = new GridBagConstraints(); 
		c.fill = GridBagConstraints.BOTH; 
		c.gridx = 0; 
		c.gridy = 0; 
	    topPane.add(leftTopPane, c); 

		c.fill = GridBagConstraints.BOTH; 
		c.gridx = 1; 
		c.gridy = 0; 
	    topPane.add(rightTopPane); 
	    
	    //add text in the bottom panel.
	    
	    
	    this.add(topPane);
	    this.add(bottomPane);
	}
}