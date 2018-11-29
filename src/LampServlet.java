import bean.Lamp;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import db.DbFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@WebServlet("/LampServlet.do")
public class LampServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out =  response.getWriter();
        String roadName = request.getParameter("roadName");
        String redTime = request.getParameter("redTime");
        String greenTime = request.getParameter("greenTime");
        String yellowTime = request.getParameter("yellowTime");
        Lamp lamp=new Lamp(roadName,Integer.parseInt(redTime),Integer.parseInt(greenTime),Integer.parseInt(yellowTime));
        try {
            int update = DbFactory.getLampDap().Update(lamp);
            if(update==1){
                response.sendRedirect("./lamp_select.jsp");
            }else{

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Lamp> lamps = DbFactory.getLampDap().select_LampMsg();
            JSONArray array= (JSONArray) JSON.toJSON(lamps);
            PrintWriter out =  response.getWriter();
            out.println(array.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
