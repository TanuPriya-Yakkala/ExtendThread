
class NewThread extends Thread {

    NewThread() {
        start(); // Start the thread
    }
}

class ExtendThread {

    public static void main(String[] args) {

        new NewThread(); // create a new thread
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello All" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
