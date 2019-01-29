package dieg.com.daggereg.field_injection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dieg.com.daggereg.R;
import dieg.com.daggereg.common_interfaces.CarComponents;
import dieg.com.daggereg.common_interfaces.DaggerCarComponents;
import dieg.com.daggereg.method_injection.MethodInjectActivity;
import dieg.com.daggereg.model.Car;

public class FieldInjectActivity extends AppCompatActivity {

    //Field injection is used mainly in Activity,fragment framework where we not able to crate new instance Like activity instance

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_inject);

        CarComponents carComponents = DaggerCarComponents.create();

        carComponents.inject(this);
        car.drive();

        Intent i = new Intent(this,MethodInjectActivity.class);
        startActivity(i);

    }


}
