package faden;

public class MeinFaden implements Runnable 
{
    public void run()
    {
        for(int i = 1; i <= 100; i++)
        {
            System.out.println(i);
            System.out.println("Run by "+Thread.currentThread().getName());
            if(i%10==0)
            {    
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex)
                {
                    ex.printStackTrace();

                }
                System.out.println("Hui!");
            }
            try 
            {
                Thread.sleep(1000);

            } catch (InterruptedException ex)
            {
                ex.printStackTrace();

            }

        }
    }
}
