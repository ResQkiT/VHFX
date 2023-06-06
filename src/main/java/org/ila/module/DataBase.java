package org.ila.module;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DataBase{
    private static volatile DataBase instance;
    private DataBase(){
        if(instance != null){
            throw new IllegalStateException("Already Initialazed");
        }
        loadData();
    }
    public static DataBase getInstance(){
        var res = instance;
        if (res == null){
            synchronized (DataBase.class){
                res = instance;
                if (res == null){
                    instance = new DataBase();
                }
            }
        }
        return res;
    }
    private void loadData(){
        File dir = new File("D:\\ilya\\java\\MODULLES\\way");
        File[] arrFile = dir.listFiles();
        List<File> lst = Arrays.asList(arrFile);
        System.out.println(lst.toString());
    }

    public static void save(String s, String fileName){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\ilya\\java\\MODULLES\\way\\" + fileName+ ".txt");

            fos.write(s.getBytes());
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //перенаправляет на класс Reader, который вернет обЬект Personality
    public Personality get(){return null;}
    //перенаправит на класс Saver, который йсохранит новыый обьект
    public void add(Personality p){}
    //удалит обьект из базы
    public void delete(Personality p){}
    //обновит обьетк
    public void update(Personality what_to_update, Personality new_one){}

}
