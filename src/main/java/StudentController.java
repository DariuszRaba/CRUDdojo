import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/students")
public class StudentController extends HttpServlet {

//    public void handle(HttpRequest request, HttpResponse response) {
//
//    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    private void index() {

    }

    private void add() {

    }

    private void edit(int id) {

    }

    private void delete(int id) {

    }
}
//
//    index()
//    add(???)
//    edit(int id)
//    delete(int id)