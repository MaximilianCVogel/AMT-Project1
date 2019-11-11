package amt.project1.presentation;

import amt.project1.business.DAO.PeopleManagerLocal;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DisplayServlet extends HttpServlet {
    @EJB
    private PeopleManagerLocal peopleManager;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("people", peopleManager.findAllPeople());
        request.getRequestDispatcher("/WEB-INF/pages/people.jsp").forward(request, response);
    }
}
