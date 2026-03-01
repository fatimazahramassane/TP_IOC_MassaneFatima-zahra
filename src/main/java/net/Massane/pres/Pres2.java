package net.Massane.pres;
import net.Massane.dao.IDao;
import net.Massane.metier.IMetier;

import java.io.File;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args)throws Exception{
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao d =(IDao) cDao.newInstance();

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            //IMetier metier =(IMetier) cDao.getConstructor(IDao.class).newInstance(d);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

            Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(metier,d);
            System.out.println("RES="+metier.calcul());



        }
    }

