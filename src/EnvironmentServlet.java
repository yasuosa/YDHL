import bean.Environment;
import bean.Road;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/Environment.do")
public class EnvironmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a= 40-(new Random().nextInt(80));
        int b= new Random().nextInt(1000);
        int c= new Random().nextInt(5000);
        int d= new Random().nextInt(2000);
        int e= new Random().nextInt(1000);
        int f= new Random().nextInt(6)+1;
        Road road=new Road(1,f);
        Environment environment=new Environment(a+"",b+"",c+"",d+"",e+"",road);
        PrintWriter out =  response.getWriter();
        out.println(JSON.toJSON(environment).toString());
    }
}
