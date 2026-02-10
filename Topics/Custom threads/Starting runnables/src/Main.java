class Starter {

    public static void startRunnables(Runnable[] runnables) {
        for(Runnable runnable:runnables){
            Thread t1=new Thread(runnable);
            t1.start();
        }
    }
}