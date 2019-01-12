package servlets;

import utils.HibernateSessionFactoryUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/servlet")
public class WebServletImpl extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {

        try {
            httpServletRequest.getRequestDispatcher("registration.html").forward(httpServletRequest,httpServletResponse);
        } catch (ServletException e) {
            e.printStackTrace();
        }


//        httpServletResponse.getWriter().print("Hello from servlet");
    }


}
