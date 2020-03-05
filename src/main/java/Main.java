import infrastructure.ConfigurationManager;
import infrastructure.OS;
import logger.Logger;
import logger.StdLogger;

public class Main {
    public static void main(String[] args) {

        System.out.println(System.getProperty("os.name").toLowerCase());
        ConfigurationManager configurationManager=ConfigurationManager.getInstance();
        System.out.println(configurationManager.getOs());
        System.out.println(configurationManager.getBrowser());


    }
}
