/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

/**
 *
 * @author hoang
 */
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class test implements ServletContextListener, ServletRequestListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Khởi tạo biến viewCount khi ứng dụng được khởi động
        ServletContext context = sce.getServletContext();
        context.setAttribute("viewCount", 0);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // Tăng biến viewCount mỗi khi có request
        ServletContext context = sre.getServletContext();
        Integer viewCount = (Integer) context.getAttribute("viewCount");
        if (viewCount != null) {
            viewCount++;
            context.setAttribute("viewCount", viewCount);
        }
    }

    // Các phương thức khác của interface không cần thiết và có thể bỏ qua

}
