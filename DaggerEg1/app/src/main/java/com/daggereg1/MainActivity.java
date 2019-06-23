package com.daggereg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daggereg1.component.CarComponents;
import com.daggereg1.component.DaggerCarComponents;
import com.daggereg1.model.Car;
import com.daggereg1.module.DiselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**
     * @Singleton - provide same instance of obj car and car2 for same CarComponents class.
     * But if you create new instance of CarComponents then it will generate new instance of car
     */

    @Inject
    Car car, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * create method is prefer when we don't need to pass any argument via constructor
         * else use builder
         */
        /*CarComponents carComponents = DaggerCarComponents.builder()
                .diselEngineModule(new DiselEngineModule(100))
                .build();*/

       /* CarComponents carComponents = DaggerCarComponents.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();*/
       CarComponents carComponents = ( (ExampleApp) getApplication()).getAppComponent();

        //CarComponents carComponents = null;
        carComponents.inject(this);

        car.drive();
        car2.drive();
    }


}
