package threading;

public class NewThreads extends Thread{
    boolean suspendFlag;

    NewThreads(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getName() + "завершается. ");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}


class ThreadDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Группа A");
        ThreadGroup groupB = new ThreadGroup("Группа B");

        NewThreads obj1 = new NewThreads("Один", groupA);
        NewThreads obj2 = new NewThreads("Two", groupA);
        NewThreads obj3 = new NewThreads("Three",groupB);
        NewThreads obj4 = new NewThreads("Four", groupB);

        System.out.println("Выход из list");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается Группа A");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);
        for (int i = 0; i < tga.length; i++) {
            ((NewThreads)tga[i]).mysuspend();
        }


        try {
            Thread.sleep(100);
        }catch (InterruptedException e) {
            System.out.println("Главный поток исполнения");
        }

        for (int i = 0; i < tga.length; i++) {
            ((NewThreads)tga[i]).myresume();
        }

        try {
            System.out.println("Ожидания потока");
            obj1.join();
            obj2.join();
            obj3.join();
            obj4.join();
        }catch (Exception e) {
            System.out.println("Исключение");
        }
        System.out.println("Главный поток завершен.");
    }
}
