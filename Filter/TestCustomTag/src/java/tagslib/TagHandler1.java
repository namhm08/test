/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package tagslib;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.JspFragment;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author hoang
 */
public class TagHandler1 extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            out.println("<h3>");
            out.println("Hello word! How are you today?");
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
            
            out.print("</h3>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in TagHandler1 tag", ex);
        }
    }
    
    
    
}
