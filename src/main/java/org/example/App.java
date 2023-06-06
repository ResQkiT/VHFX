package org.example;

import org.ila.module.DataBase;
import org.ila.module.Personality;
import org.ila.module.Saver;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnsupportedEncodingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {


        Personality p1 = new Personality();
        p1.setName("Ilya");
        Personality p2 = new Personality();
        p2.setName("Maria");
        Personality p3 = new Personality();
        p3.setName("Olga");
        Personality p4 = new Personality();
        p4.setName("Grisha");


        DataBase db = DataBase.getInstance();
    }
}
