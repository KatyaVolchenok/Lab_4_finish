/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Arrays;
import static java.util.Arrays.toString;

/**
 *
 * @author Shwartskopff
 */
public class BaseBit implements DataBase{
    
    private final byte[] bits = new byte[LINE];
    
    public void checkBit(int index) {
        if(index < 0 || index >= LINE)
            throw new IllegalArgumentException("Индекс указан неверно!");
    }

    @Override
    public boolean get(int index) {
        checkBit(index);
        return bits[index] == 1 ? true : false;
    }

    @Override
    public void set(int index) {
        checkBit(index);
        bits[index] = 1 ;
    }

    @Override
    public void set(int index, boolean data) {
       checkBit(index);
        bits[index] = data ? (byte)1 : (byte)0;
    }

    @Override
    public void drop(int index) {
        bits[index] = bits[index] == 1 ? (byte)1 : (byte)0;
    }

    @Override
    public void invert(int index) {
        checkBit(index);
        bits[index] = bits[index] == 1 ? (byte)0 : (byte)1;
    }

    @Override
    public int count() {
        int count = 0;
        for (int i = 0; i < bits.length; i++)
            if (bits[i] == 1) count++;
        return count;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(bits);
    }
    
    
}
