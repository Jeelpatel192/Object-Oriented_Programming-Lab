public class ThreadCrea {
    public static void main(String args[]) {
      printnum p1 = new printnum();
      Thread t1 = new Thread(p1);
      printalpha t2 = new printalpha();
      t1.setPriority(10);
      t1.start();
      t2.start();
    }
}

class printalpha extends Thread {
    public void run() {
        System.out.println("a\nb\nc\nd\ne");
    }
}

class printnum implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}