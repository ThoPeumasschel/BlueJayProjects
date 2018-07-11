package faden;



public class Test
{
    public static void main(String[] args) 
    {
        MeinFaden mf = new MeinFaden();
        Thread one = new Thread(mf);
        Thread two = new Thread(mf);
        Thread three = new Thread(mf);
        Thread four = new Thread(mf);
        
        one.setName("Fred");
        two.setName("Lisa");
        three.setName("Manfred");
        four.setName("Hilde");
        
        one.start();
        two.start();
        three.start();
        four.start();
        
        
    }
}
