package TimeServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/time")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        String timeZone = req.getParameter("timezone");
        String currentTime=ParseTimeZone.getCurrentTimeInTimeZone(timeZone);

        resp.getWriter().write(currentTime);
        resp.getWriter().close();
    }
}
