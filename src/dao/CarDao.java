package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class CarDao {
    private QueryRunner runner;
    private static final  String FINDBYID_MONEY="select carMoney from CarMsg where carId=?";
    private static final  String UPDATE_MONEY="update CarMsg set carMoney=? where carId=?";

    public CarDao(QueryRunner runner) {
        this.runner = runner;
    }

    public String findById_Money(int id) throws SQLException {
        ResultSetHandler<String> resultSetHandler=new ScalarHandler<>();
        String money = runner.query(FINDBYID_MONEY, resultSetHandler,id);
        return money;
    }

    public int updateMoney(String money,int carId) throws SQLException {
        int update = runner.update(UPDATE_MONEY, money, carId);
        return update;
    }


}
