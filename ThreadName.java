package testthread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestThread 
{
    public static void main(String[] args) 
    {
        System.out.println("Il nome di questo processo è: " + Thread.currentThread().getName() );
        Thread th = new Thread( new Mythread() , "second thread");
        th.start();
    }
}

class Mythread implements Runnable
{
    public void run() 
    {
       System.out.println("Il nome di questo processo è: " + Thread.currentThread().getName() );
    }
}

