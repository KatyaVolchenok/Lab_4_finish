/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;

/**
 *
 * @author Shwartskopff
 */
public class Base implements DataBase {
    
private final boolean[] datas = new boolean[LINE];



public void check(int index) {
        if(index < 0 || index >= LINE)
            throw new IllegalArgumentException("Индекс указан неверно!");
    }

@Override
    public boolean get(int index) {
        check(index);
        return datas[index];
    }

    @Override
    public void set(int index) {
       check(index);
       datas[index] = true;
    }

    @Override
    public void set(int index, boolean data) {
       check(index);
       datas[index] = data;
    }

    @Override
    public void drop(int index) {
        check(index);
        datas[index] = false;
    }

    @Override
    public void invert(int index) {
       check(index);
       datas[index] = !datas[index];
    }

    @Override
    public int count() {
       int count = 0;
       for(int i = 0; i<datas.length; i++) {
           if(datas[i] == true) {
               count++;
           }
       } return count;
    }
    
@Override
    public String toString() {
       boolean [] l = new boolean[LINE];
       for(int i = 0; i<datas.length; i++) {
           if(datas[i] == true) {
               l[i] = false;
           }else {
               l[i] = true;
           }
       } return Arrays.toString(l);
    }

    
    

}
