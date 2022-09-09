package Utils;

import Test.LogClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.security.SecureRandom;
import java.util.Random;

public class Helpers {

    public static final Logger logger = LogManager.getLogger(LogClass.class.getName());

    public String randomStr(int strLenght){
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(strLenght);
        for(int i = 0; i < strLenght; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
    public Logger loging(){
    return logger;
    }
    public  String randomStr2(int strLength2) {
        int length=10;
        boolean userLeters=true;
        boolean userNumbers=false;
        String userpass= RandomStringUtils.random(length,userLeters,userNumbers);
        System.out.println("username="+userpass);
        return userpass;
    }
}
