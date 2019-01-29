package dieg.com.daggereg.constructor_injection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dieg.com.daggereg.R;
import dieg.com.daggereg.common_interfaces.CarComponents;
import dieg.com.daggereg.common_interfaces.DaggerCarComponents;
import dieg.com.daggereg.field_injection.FieldInjectActivity;
import dieg.com.daggereg.model.Car;

public class ConstructorInjectActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructor_inject);

        CarComponents carComponents = DaggerCarComponents.create();

        car = carComponents.getCar();
        car.drive();

        Intent i = new Intent(this,FieldInjectActivity.class);
        startActivity(i);

    }


}
