class Marvellous implements Runnable
{
    public void run()
    {
       Display();
    }
    synchronized public void Display()
    {
        for(int)
    }

}

class MultiT7
{
    public static void main(String Arg[])
    {
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous();

        Thread t1 = new Thread(mobj1);
        Thread t2 = new Thread(mobj2);

        t1.start();
        t2.start();
    }
}