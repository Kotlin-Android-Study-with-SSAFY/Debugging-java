package com.ssafy.collection;

import java.util.PriorityQueue;

public class SortComparatorDebug {
    private PriorityQueue<Car> cars;

    public SortComparatorDebug() {
        PriorityQueue<Car> cars = new PriorityQueue<>();

        cars.add(new Car("Tesla", 200, 50000));
        cars.add(new Car("BMW", 220, 60000));
        cars.add(new Car("Audi", 210, 55000));
        cars.add(new Car("Hyundai", 190, 30000));
        cars.add(new Car("Mercedes", 215, 65000));
        cars.add(new Car("Ford", 180, 28000));
        cars.add(new Car("Porsche", 230, 90000));
        cars.add(new Car("Lamborghini", 240, 150000));
        cars.add(new Car("Ferrari", 235, 200000));
        cars.add(new Car("Kia", 185, 27000));
        cars.add(new Car("Nissan", 195, 32000));
        cars.add(new Car("Honda", 200, 45000));
        cars.add(new Car("Mazda", 210, 54000));
        cars.add(new Car("Chevrolet", 280, 50000));
        cars.add(new Car("Volkswagen", 190, 32000));
        cars.add(new Car("BMW", 250, 80000));
        cars.add(new Car("Audi", 220, 60000));
        this.cars = cars;
    }

    public Car getCarFromQueue() {
        return this.cars.poll();
    }
}
