package dieg.com.daggereg.modules_provider_method;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dieg.com.daggereg.R;
import dieg.com.daggereg.common_interfaces.CarComponents;
import dieg.com.daggereg.common_interfaces.DaggerCarComponents;
import dieg.com.daggereg.method_injection.MethCar;

public class ModuleProviderActivity extends AppCompatActivity {

    @Inject
    MethCar car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_provider);

        CarComponents carComponents = DaggerCarComponents.create();

        carComponents.inject(this);
        car.drive();

    }


}
