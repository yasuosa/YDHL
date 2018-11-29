package dao;

import bean.Lamp;
import com.mysql.cj.protocol.ResultListener;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class LampDao {
    private QueryRunner runner;
    private static  final String SELECT="select * from LampMsg";
    private static  final String UPDATE="update LampMsg set redTime=? ,greenTime=? ,yellowTime=? where roadName=?";

    public LampDao(QueryRunner runner) {
        this.runner = runner;
    }


    public List<Lamp> select_LampMsg() throws SQLException {
        ResultSetHandler<List<Lamp>> resultSetHandler=new BeanListHandler<>(Lamp.class);
        return  runner.query(SELECT,resultSetHandler);
    }

    public int Update(Lamp lamp) throws SQLException {
        return  runner.update(UPDATE,lamp.getRedTime(),lamp.getGreenTime(),lamp.getYellowTime(),lamp.getRoadName());
    }
}
