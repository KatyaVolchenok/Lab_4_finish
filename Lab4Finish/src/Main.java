/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public class Main {
    public static void main(String[] args) {
        Base base = new Base();
        BaseBit baseBit = new BaseBit();
       base.set(5);
        base.set(6);
         base.set(7);
          base.set(46);
       
        System.out.println(base.count());
        System.out.println(base.toString());
        
        base.drop(8);
        base.set(9, true);
        
        System.out.println(base.count());
        System.out.println(base.toString());
        System.out.println(base.get(6));
        System.out.println(base.get(7));
        System.out.println("____________________________________________________");
        
        
        baseBit.set(5);
        baseBit.set(6);
         baseBit.set(7);
          baseBit.set(46);
       
        System.out.println(baseBit.count());
        System.out.println(baseBit.toString());
        
        baseBit.drop(8);
        baseBit.set(9, true);
        
        System.out.println(baseBit.count());
        System.out.println(baseBit.toString());
        System.out.println(baseBit.get(6));
        System.out.println(baseBit.get(7));
    }
    
}
