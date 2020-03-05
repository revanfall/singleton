package logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Logger {
  static   int counter=0;


    void  log(String message){
//        final String methodName=Thread.currentThread().getStackTrace()[2].getMethodName();
//        String dateStr=new SimpleDateFormat("HH:MM:ss:SSS").format(new Date());
//        System.out.println(" %s [%s]: %s ",dateStr,methodName,message);
    }
}
