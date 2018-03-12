import java.util.*;
import java.Servlet.HTTPServlet;
import java.Servlet.*;
public class test extends HTTPServlet
{
public void doGet(HttpRequest req,HttpResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
Printwriter p = getWriter();
String name = req.getParameter("Name");
String phone = req.getParameter("Phone");
p.println("<html><body><h1>YOU ARE DONE WITH BOOKING PLEASE"+Name+"   "+Phone+" TAKE A SCREEN SHOT OF THIS MESSAGE</h1></body><html>");
p.close();
}
}
