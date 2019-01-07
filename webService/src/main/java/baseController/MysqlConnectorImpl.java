package baseController;

import config.MysqlConfig;
import org.aeonbits.owner.ConfigFactory;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.DB;


public class MysqlConnectorImpl {
    protected static  final MysqlConfig conf = ConfigFactory.create(MysqlConfig.class);
    private static DB STR;


    public static void connect(){
    STR = Base.open("com.mysql.jdbc.Driver",
            conf.getBaseHost(),
            conf.getUserName(),
            conf.getUserPassword()
            );
    }

    public static void closeConect(){
        STR.close();
    }

}
