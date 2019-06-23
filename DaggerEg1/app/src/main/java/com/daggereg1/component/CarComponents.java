package com.daggereg1.component;

import com.daggereg1.MainActivity;
import com.daggereg1.model.Car;
import com.daggereg1.module.DiselEngineModule;
import com.daggereg1.module.PetrolEngineModule;
import com.daggereg1.module.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;


//Here we cannot put PetrolEngineModule and DiselEngineModule inside Component module
// else dagger will throw duplicate error

@Singleton
@Component(modules ={WheelsModule.class, PetrolEngineModule.class/*, DiselEngineModule.class*/})
public interface CarComponents {

    Car getCar();

    void inject(MainActivity mainActivity);



    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponents build();
    }

 }
