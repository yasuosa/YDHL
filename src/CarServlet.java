import bean.CarResult;
import com.alibaba.fastjson.JSON;
import db.DbFactory;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/carAccount.do")
public class CarServlet extends javax.servlet.http.HttpServlet {

    private String money=null;

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        CarResult result=new CarResult("Err");
        String carId = request.getParameter("carId");
        String addMoney = request.getParameter("money");
        PrintWriter out = response.getWriter();
        try {
            money = DbFactory.getCarDao().findById_Money(Integer.parseInt(carId));
        } catch (SQLException e) {
            JSON.toJSON(result).toString();
            out.println(JSON.toJSON(result).toString());
            e.printStackTrace();
        }


        if (addMoney != null && addMoney.length() != 0) {
            if (money.length() != 0 && money != null) {
                money = String.valueOf((Double.valueOf(money) + Double.valueOf(addMoney)));
                    try {
                        DbFactory.getCarDao().updateMoney(money,Integer.parseInt(carId));
                        out.println(JSON.toJSON(result.setResult(money)).toString());
                    } catch (SQLException e) {
                        out.println(JSON.toJSON(result).toString());
                        e.printStackTrace();
                    }
                }
            } else {
                if (money.length() != 0 && money != null) {
                    out.println(JSON.toJSON(result.setResult(money)).toString());
                } else {
                    out.println(JSON.toJSON(result).toString());
                }
            }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }
}
