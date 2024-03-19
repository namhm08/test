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
public class ConvertToVnDate extends SimpleTagSupport {

    private String value;

    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();

        try {
        
            String[] s = value.split("-");
            out.print(String.format("Ngay %s, thang %s, nam %s", s[0], s[1], s[2]));
            
            JspFragment f = getJspBody();
            if (f != null) f.invoke(out);
            

        } catch (java.io.IOException ex) {
            throw new JspException("Error in ConvertToVnDate tag", ex);
        }
    }

    public void setValue(String value) {
        this.value = value;
    }

}
