public class l9j4 extends Thread{

    public void run()
    {
        System.out.println("executed finely");
    }
    public static void main(String[] args) {
        l9j4 ob = new l9j4();
        ob.start();
        System.out.println("Running thread class.....");
    }
}
