package org.ila.module;

public class Singleton {
    public static volatile Singleton instance;
    private Singleton (){
        if(instance != null){
            throw new IllegalStateException("Already Initialazed");
        }
    }
    public static Singleton getInstance(){
        var res = instance;
        if (res == null){
            synchronized (Saver.class){
                res = instance;
                if (res == null){
                    instance = new Singleton();
                }
            }
        }
        return res;
    }
}
