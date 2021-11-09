/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public interface DataBase {
    int LINE = 1024;
    
    
    boolean get(int index);
    void set(int index);
    void set(int index, boolean data);
    void drop(int index);
    void invert(int index);
    int count();
    String toString();
   
}
