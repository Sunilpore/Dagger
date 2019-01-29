package dieg.com.daggereg.common_interfaces;

import dagger.Component;
import dieg.com.daggereg.field_injection.FieldInjectActivity;
import dieg.com.daggereg.method_injection.MethodInjectActivity;
import dieg.com.daggereg.model.Car;
import dieg.com.daggereg.modules_provider_method.ModuleProviderActivity;
import dieg.com.daggereg.modules_provider_method.WheelsModule;

@Component(modules =WheelsModule.class)
public interface CarComponents {

    Car getCar();

    void inject(FieldInjectActivity fieldInjectActivity);

    void inject(MethodInjectActivity methodInjectActivity);

    void inject(ModuleProviderActivity moduleProviderActivity);
}
