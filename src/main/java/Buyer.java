public class Buyer {
//
//    private Dealer dealer;
//
//    public Buyer(Dealer dealer) {
//        this.dealer = dealer;
//    }
//
//    public synchronized void buyCar() {
//        try{
//            System.out.println("Buyer: I want to by a car");
//            while (dealer.getCars().size() == 0) {
//                wait();
//            }
//            Thread.sleep(1000);
//            System.out.println("Buyer: Hooray! I have a new car");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public synchronized void goHome() {
//        try {
//            System.out.println("Buyer: Waiting a car");
//            Thread.sleep(3000);
//            //dealer.getCars().add(new Car());
//            System.out.println("Buyer: Car is received");
//            notify();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}