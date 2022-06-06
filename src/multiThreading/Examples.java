package multiThreading;


//Multithreading in java is a process of executing multipke threads simulsly
//A thread is a light weighted  sub -process,the smallest unit of processing

//****CREATING THREADS IN JAVA

//1.USING RUNNABLE
//interface runnable{
// run();
//
// }
//*****************
//2.USING THREAD CLASS EXTEDNS RUNNBLE INTERFACE
//class Thread{
//
// }
//JAVA PROVIDE THIS TWO FACILITY INBUILD

//WE WILL CREATE ONE CLASS THAT IS MyThread
//           MyThread
//      /impliment  \extends
//   interface      class thread
//
//we will provide task to the run method

//************
//Start thred in java


public class Examples implements Runnable {


    @Override
    public void run() {

    for(int i=1;i<=10;i++){

        System.out.println("value of i" + i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

    public static void main(String[] args) throws InterruptedException {
//creating object of example class
        Examples s1=new Examples();
     Thread t1=new Thread(s1);
     t1.start();

//t1.setName(" kajal");
      //  System.out.println(" id" + t1.getId());
//System.out.println("thread t1 name " + t1.getName());

        t1.join();
       int ans= t1.getPriority();
        System.out.println("ans" + ans);
MyAnotherThread s2=new MyAnotherThread();
s2.start();
        System.out.println(s2.getName());
int ans2=s2.getPriority();
        System.out.println("ans 2" + ans2);

    }


}
