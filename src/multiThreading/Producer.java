package multiThreading;

public class Producer extends Thread {

    Company c;

    public Producer( Company c){
this.c=c;

    }
    public void run(){
int i=1;
while(true){

    try {
        this.c.producer(i);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    i++;
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}




    }
}
