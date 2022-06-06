package multiThreading;

public class Consumer extends Thread{

   Company c;

   public Consumer(Company c){
       this.c=c;

   }

    public void run(){

while(true){

    try {
        this.c.consume();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}



    }




}
