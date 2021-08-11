import java.util.ArrayList;
import java.util.List;

public class Dealer {

    Seller seller = new Seller(this);
    Buyer buyer = new Buyer(this);
    List<Car> cars = new ArrayList<>(10);

    public Car sellCar() {
        return seller.sellCar();
    }

    public void acceptCar() {
        seller.recieveCar();
    }

    List<Car> getCars() {
        return cars;
    }


}
