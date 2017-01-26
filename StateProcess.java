package testthread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestThread 
{
    public static void main(String[] args) 
    {
        System.out.println("Il nome di questo processo è: " + Thread.currentThread().getName() );
        Thread th = new Thread( new Mythread() , "second thread");
        System.out.println("Lo stato del processo è " + th.getState() );
        th.start();
        System.out.println("Lo stato del processo è " + th.getState() );
        try{th.wait(1000000);} catch(Exception e){}
        Thread th1 = new Thread( new Mythread() , "second thread");
        th1.start();
        System.out.println("Lo stato del processo è " + th.getState() );
    }
}

class Mythread implements Runnable
{
    public void run() 
    {
      // System.out.println("Il nome di questo processo è: " + Thread.currentThread().getName() );
    }
}

