package ge.edu.btu.badri.kavteladze.animalReg;

import ge.edu.btu.badri.kavteladze.animalReg.models.Animal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AnimalServlet", value = "/animal-register")
public class AnimalServlet extends HttpServlet {

    public static final String VIEW = "/animalRegForm.jsp";
    private final Animal animal = new Animal();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher(VIEW);
        dispatcher.forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        animal.setName(req.getParameter("name"));
        animal.setGender(req.getParameter("gender"));
        animal.setBreed(req.getParameter("breed"));
        animal.setAge(Integer.parseInt(req.getParameter("age")));

        System.out.println(animal.getName());
        System.out.println(animal.getBreed());
        System.out.println(animal.getGender());
        System.out.println(animal.getAge());
    }
}
