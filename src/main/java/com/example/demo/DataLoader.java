package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car ("Honda", "Civic", 1999);
        repository.save(car);

        car = new Car ("Nissan","Pathfinder",2000);
        repository.save(car);

        car = new Car("Hyundai","Elantra",2008);
        repository.save(car);
    }
}
