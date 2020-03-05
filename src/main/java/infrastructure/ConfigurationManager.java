package infrastructure;


import logger.StdLogger;

public class ConfigurationManager {
    StdLogger log=StdLogger.getInstance();
    private static ConfigurationManager instance;
    private ConfigurationManager(){};

    public static ConfigurationManager getInstance(){
        if(instance==null){
            instance=new ConfigurationManager();
        }
        return instance;
    }
    public OS getOs(){
        log.log("OS method");
       return OS.current();
    }
    public Browser getBrowser(){
        log.log("browser method");
        return Browser.FIREFOX;
    }

}
