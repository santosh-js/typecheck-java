package in.santoshjs.main;

import  static  java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        out.println(CheckType.typeOf("false"));
        out.println(CheckType.typeOf(false));
    }
}

class CheckType{

    public static String typeOf(byte in){
        return "BYTE";
    }
    public static String typeOf(short in){
        return "SHORT";
    }
    public static String typeOf(int in){
        return "INTEGER";
    }
    public static String typeOf(long in){
        return "LONG";
    }
    public static String typeOf(float in){
        return "FLOAT";
    }
    public static String typeOf(double in){
        return "DOUBLE";
    }
    public static String typeOf(char in){
        return "CHARACTER";
    }
    public static String typeOf(boolean in){
        return "BOOLEAN";
    }
    public static String typeOf(Object in){
        return "OBJECT";
    }
}

