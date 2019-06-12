package dieg.com.daggereg.method_injection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dieg.com.daggereg.R;
import dieg.com.daggereg.common_interfaces.CarComponents;
import dieg.com.daggereg.common_interfaces.DaggerCarComponents;
import dieg.com.daggereg.modules_provider_method.ModuleProviderActivity;

public class MethodInjectActivity extends AppCompatActivity {

    @Inject MethCar car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_inject);


        CarComponents carComponents = DaggerCarComponents.create();
        carComponents.inject(this);
        car.drive();

        Intent i = new Intent(this,ModuleProviderActivity.class);
        startActivity(i);

    }

}
