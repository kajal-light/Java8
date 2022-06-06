package multiThreading;

public class Company {
int n;
boolean f=false;
//f=false  chance: Producer
//f=true chance: Consumer

   synchronized public void producer(int n) throws InterruptedException {
     if(f)  {
         wait();
     }

this.n=n;
        System.out.println("produce" + this.n);
        f=true;
        notify();
    }

   synchronized public int consume() throws InterruptedException {

       if(!f){

           wait(); }
        System.out.println("consumned" + this.n);
       f=false;
       notify();
return this.n;




   }
}
