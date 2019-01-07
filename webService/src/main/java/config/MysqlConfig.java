package config;

import org.aeonbits.owner.Config;

@org.aeonbits.owner.Config.Sources("classpath:base.properties")
public interface MysqlConfig extends Config {

    @Key("server.base.name")
    String getBaseName();

    @Key("server.base.host")
    String getBaseHost();

    @Key("server.base.user")
    String getUserName();

    @Key("server.base.password")
    String getUserPassword();



}
