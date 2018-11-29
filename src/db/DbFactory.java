package db;

import com.mysql.cj.jdbc.MysqlDataSource;
import dao.CarDao;
import dao.LampDao;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;


public class DbFactory {
    private static final String CONNECTIONURL="jdbc:mysql://120.79.226.226:3306/YDHL";
    private static MysqlDataSource dataSource=null;
    private  static CarDao carDao=null;
    private static LampDao lampDao=null;


    private static DataSource getDataSource(){
        if (dataSource==null){
            dataSource=new MysqlDataSource();
            dataSource.setURL(CONNECTIONURL);
            dataSource.setUser("root");
            dataSource.setPassword("ASDasd123.");
        }
        return dataSource;
    }

    public static CarDao getCarDao(){
        if(carDao==null){
            QueryRunner runner=new QueryRunner(getDataSource());
            carDao=new CarDao(runner);
        }
        return carDao;
    }

    public static LampDao getLampDap(){
        if(lampDao==null){
            QueryRunner runner=new QueryRunner(getDataSource());
            lampDao=new LampDao(runner);
        }
        return lampDao;
    }


}
