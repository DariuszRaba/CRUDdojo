import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@WebServlet("/students")
public class StudentController extends HttpServlet {

    public void handle(HttpRequest request, HttpResponse response) {
        
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