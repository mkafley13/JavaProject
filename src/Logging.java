import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {

    public static final Logger gLogger = Logger.getGlobal();

    public static final Logger localLog = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) {

        gLogger.setLevel(Level.OFF); //Turn off Global logger without deleting its code
        //Level.info prints info log and its higher level log. Same goes for others
        // info will print all 3 but warning will only print 2 and server will only print itself

        int cost = 500;

        gLogger.severe(String.valueOf(cost));
        gLogger.warning("This is warning message");
        gLogger.info("This is info message");

        localLog.severe("This is sever message");
        localLog.warning("This is warning message");
        localLog.info("This is info message");

        String password = "test";
        password = "";
        System.gc();

        char[] pass = {'t', 'e', 's', 't'};
        pass[0] = 'e';
        pass[1] = 'e';
        pass[2] = 'e';
        pass[3] = 'e';

    }
}
