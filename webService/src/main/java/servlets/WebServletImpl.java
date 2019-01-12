package servlets;

import models.Users;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Timestamp;

import static utils.HibernateSessionFactoryUtil.getSessionFactory;


@WebServlet("/servlet")
public class WebServletImpl extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {

        try {
            String name = httpServletRequest.getParameter("name");
            String password = httpServletRequest.getParameter("password");
            httpServletRequest.getRequestDispatcher("registration.html").forward(httpServletRequest,httpServletResponse);
        } catch (ServletException e) {
            e.printStackTrace();
        }


//        httpServletResponse.getWriter().print("Hello from servlet");
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {

        Session session =getSessionFactory().openSession();

        Users user = new Users();
        user.setEmail(httpServletRequest.getParameter("name"));
        user.setPassword(httpServletRequest.getParameter("password"));
        user.setEmail(httpServletRequest.getParameter("mail"));
        user.setCreated_on(new Timestamp(System.currentTimeMillis()));

        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();


    }


}
