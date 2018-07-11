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
        
        one.setName("A");
        two.setName("B");
        three.setName("C"); 
        four.setName("D");
        
        one.start();
        two.start();
        three.start();
        four.start();
        
        
    }
}
