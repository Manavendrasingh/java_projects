import jakarta.servlet.*;
import java.io.*;

public class myfirstservlet extends GenericServlet
{
public void service(ServletRequest req , ServletResponse resp) throws IOException , ServletException
{

PrintWriter out = resp.getWriter();
out.print(" hello this is my first servlet progrm");
} 
}