package org.ila.module;


import java.io.*;

public class Saver {
        public static volatile Saver instance;
        private Saver(){
            if(instance != null){
                throw new IllegalStateException("Already Initialazed");
            }
        }
        public static Saver getInstance(){
            var res = instance;
            if (res == null){
                synchronized (Saver.class){
                    res = instance;
                    if (res == null){
                        instance = new Saver();
                    }
                }
            }
            return res;
        }



}
