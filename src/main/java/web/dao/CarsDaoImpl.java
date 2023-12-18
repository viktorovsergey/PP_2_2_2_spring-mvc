package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDaoImpl implements CarDao {
    List<Car> carList = new ArrayList<>();

    public CarsDaoImpl() {
        carList.add(new Car(1, "Toyota", 6876876));
        carList.add(new Car(2, "VAZ", 7872356));
        carList.add(new Car(3, "GAZ", 14223));
        carList.add(new Car(4, "UAZ", 70643564));
        carList.add(new Car(5, "BELAZ", 382068));
    }

    @Override
    public List<Car> outputCarsList(int countCars) {
        return carList.subList(0, Math.min(countCars, carList.size()));
    }
}
