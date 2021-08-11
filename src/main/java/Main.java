public class Main {

    public static void main(String[] args) {
        final Dealer dealer = new Dealer();

        //Buyer
       new Thread(null, dealer::sellCar,"B1").start();

        //Manufacture
        new Thread(null, dealer::acceptCar, "Manufacture").start();
    }
}
