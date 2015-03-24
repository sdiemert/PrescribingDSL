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

public class RxDocument extends DefaultStyledDocument {

	final StyleContext cont = StyleContext.getDefaultStyleContext();
	
	//highlight text for keywords.
    final AttributeSet blueAttr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLUE);
    final AttributeSet redAttr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.RED);
    final AttributeSet boldBlueAttr = cont.addAttribute(blueAttr, StyleConstants.Bold, true);
    final AttributeSet boldRedAttr = cont.addAttribute(redAttr, StyleConstants.Bold, true);

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
	
	/**
	 * Called everytime a chacter is entered into the text field. 
	 * 
	 * Must called super.insertString(...) or else it won't work.
	 */
	@Override
	public void insertString(int offset, String str, AttributeSet a) throws BadLocationException{
		super.insertString(offset, str, a);
		styleText();
	}
	
	/**
	 * Called every time a character(s) is/are deleted from the text field
	 * Must call super.remove(...) or else it wont't work. 
	 */
	@Override
	public void remove(int offset, int len) throws BadLocationException{
		super.remove(offset, len);
		styleText(); 
	}

	/**
	 * This loops through the text and changes the attributes of words
	 * depending on whether they match the keywords.
	 * 
	 * The words to match on are hardcoded in, they should be pulled
	 * from the grammar, but are not. 
	 * 
	 * @throws BadLocationException
	 */
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
				}else if(currentWord.matches("THEN|AND")){
					this.setCharacterAttributes(wordStart, i-wordStart, boldRedAttr, true);
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
