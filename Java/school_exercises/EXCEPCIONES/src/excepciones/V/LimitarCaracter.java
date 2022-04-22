/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.V;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author HP
 */
public class LimitarCaracter extends PlainDocument{
    
    public JTextField editor;
    public int numero;

    public LimitarCaracter(JTextField editor, int numero) {
        this.editor = editor;
        this.numero = numero;
    }
    
    
    @Override
    public void insertString (int arg0,String arg1,AttributeSet arg2) throws BadLocationException{
        
        if ((editor.getText().length()+arg1.length()) > this.numero){
            return;
        }
        super.insertString(arg0, arg1, arg2);
    }
    
    
}
