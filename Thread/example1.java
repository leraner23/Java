// program for using the thread class and runnable interface

class Threadex extends Thread{
@Override
public void run(){
    System.out.println("Thread is extending");
}
}

class runnableEx implements Runnable{
@Override
public void run(){
    System.out.println("Thread is implemented");
}
}



public class example1{

public static void main(String[] args) {
    Threadex thread1 = new Threadex();

    runnableEx r = new runnableEx();
    Thread thread2 = new Thread(r);
    
    thread1.start();
    thread2.start();
}


}