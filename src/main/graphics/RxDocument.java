/*
 * Used to style the text editor input for the
 * prescription writing environment. 
 * 
 * Reference: http://stackoverflow.com/questions/14400946/how-to-change-the-color-of-specific-words-in-a-jtextpane
 */

package main.graphics;

import java.awt.Color;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.color.*;

public class RxDocument extends DefaultStyledDocument {

	final StyleContext cont = StyleContext.getDefaultStyleContext();
	
	//highlight text for keywords.
    final AttributeSet blueAttr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLUE);
    final AttributeSet boldBlueAttr = cont.addAttribute(blueAttr, StyleConstants.Bold, true);

    //normal text
    final AttributeSet blackAttr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);

	public RxDocument() {
	}

	public RxDocument(StyleContext styles) {
		super(styles);
	}

	public RxDocument(Content c, StyleContext styles) {
		super(c, styles);
	}
	
	@Override
	public void insertString(int offset, String str, AttributeSet a) throws BadLocationException{
		super.insertString(offset, str, a);
		styleText();
	}
	
	@Override
	public void remove(int offset, int len) throws BadLocationException{
		super.remove(offset, len);
		styleText(); 
	}

	private void styleText() throws BadLocationException {
		int wordStart = -1; 
		int i = 0; 
		String text = this.getText(0, this.getLength()); 
		String currentWord = null; 
		
		for(i=0; i < this.getLength(); i++){
			if(currentWord == null && wordStart == -1){
				currentWord = text.substring(i, i+1); 
				wordStart = i; 
			}else if(text.substring(i,i+1).matches("\\W")){
				if(currentWord.matches("REPEAT|FOR|TITRATE|BY|TO|FROM")){
					this.setCharacterAttributes(wordStart, i-wordStart, boldBlueAttr, true);
				}else{
					this.setCharacterAttributes(wordStart, i-wordStart, blackAttr, true);
				}
				wordStart = -1; 
				currentWord = null; 
			}else{
				currentWord += text.substring(i, i+1); 
			}
		}
	}

}
