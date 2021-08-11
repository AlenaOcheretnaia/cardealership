public class Seller {

    private Dealer dealer;

    public Seller(Dealer dealer) {
        this.dealer = dealer;
    }


    public synchronized Car sellCar() {
        try{
            System.out.println("Seller: Selling car");
            while (dealer.getCars().size() == 0) {
                System.out.println("Seller: Can't sell car - have no car");
                wait();
            }
            Thread.sleep(1000);
            System.out.println("Seller: Sold car");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dealer.getCars().remove(0);
    }

    public synchronized void recieveCar() {
        try {
            System.out.println("Seller: Receiving a car");
            Thread.sleep(3000);
            dealer.getCars().add(new Car());
            System.out.println("Seller: Car is received");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

