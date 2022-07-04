package JavaLearn;

import java.util.Scanner;

public class SOBSyn {
    Object object = new Object();
    public void method1(){
        synchronized(object){

        }
        method2();
    }

    public static void method2(){

    }


}
