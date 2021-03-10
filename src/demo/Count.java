package demo;

public class Count extends Thread{
    Count(){
        super("My extending thread");
        System.out.println("My thread created "+this);
        start();
    }
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count." + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {

            System.out.println("My thread interrupted.");
        }
        System.out.println("My thread run is over.");
    }

}
class ExtendingExample{
    public static void main(String[] args) {
        Count cn=new Count();
        try {
            while (cn.isAlive()){
                System.out.println("Main thread will be alive till the child thread is alive.");
                Thread.sleep(1500);
            }

        }
        catch (InterruptedException e){
            System.out.println("Main interrupted.");
        }
        System.out.println("Main thread run is over.");
    }
}
