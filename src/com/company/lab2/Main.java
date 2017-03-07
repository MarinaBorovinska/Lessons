package com.company.lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        if(isWindows()){
            System.out.println("This is Windows");
            System.out.println("It's version is: " + getOSVersion());
            System.out.println("The format of the path is: [drive letter:]/ or [drive letter:]\\");
            System.out.println("For example, C:\\user\\docs\\Letter.txt");
        }else if(isMac()){
            System.out.println("This is Macintosh");
            System.out.println("It's version is: " + getOSVersion());
            System.out.println("The format of the path is: [volume or drive name]:");
            System.out.println("For example, HD:Documents:Letter");
        }else if(isUnix ()){
            System.out.println("This is Unix or Linux OS");
            System.out.println("It's version is: " + getOSVersion());
            System.out.println("The format of the path is: /");
            System.out.println("For example, /home/user/docs/Letter.txt");
        }else{
            System.out.println("This is unknown OS");
        }
        System.out.println("Version: " + getOSVersion());
    }

    public static boolean isWindows(){

        String os = System.getProperty("os.name").toLowerCase();
        //windows
        return (os.indexOf( "win" ) >= 0);

    }

    public static boolean isMac(){

        String os = System.getProperty("os.name").toLowerCase();
        //Mac
        return (os.indexOf( "mac" ) >= 0);

    }

    public static boolean isUnix (){

        String os = System.getProperty("os.name").toLowerCase();
        //linux or unix
        return (os.indexOf( "nix") >=0 || os.indexOf( "nux") >=0);

    }
    public static String getOSVersion() {
        String os = System.getProperty("os.version");
        return os;
    }
}
