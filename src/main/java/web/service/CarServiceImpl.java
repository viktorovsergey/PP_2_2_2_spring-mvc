package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    private final CarDao carDao;



    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllUsers(int countCars) {
        return carDao.outputCarsList(countCars);
    }
}
