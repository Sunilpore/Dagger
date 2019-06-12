package dieg.com.daggereg.model;

import javax.inject.Inject;

import dieg.com.daggereg.utils.LogHelper;

public class Car {

    private static final String CarTag = "car_tag";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car (Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        LogHelper.showLogData("drive the car...");
        engine.start();
    }

}
