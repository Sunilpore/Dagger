package com.daggereg1;

import android.app.Application;

import com.daggereg1.component.CarComponents;
import com.daggereg1.component.DaggerCarComponents;

public class ExampleApp extends Application {

    private CarComponents component;


    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCarComponents.builder()
                    .horsePower(120)
                    .engineCapacity(1400)
                    .build();
    }


    public CarComponents getAppComponent(){
        return component;
    }
}
