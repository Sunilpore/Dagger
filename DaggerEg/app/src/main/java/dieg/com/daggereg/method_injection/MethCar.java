package dieg.com.daggereg.method_injection;

import javax.inject.Inject;

import dieg.com.daggereg.model.Engine;
import dieg.com.daggereg.model.Wheels;
import dieg.com.daggereg.utils.LogHelper;

public class MethCar {

    private static final String CarTag = "car_tag";

    @Inject Engine engine;
    private Wheels wheels;


/*    @Inject
    public MethCar(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }*/

    /**
     *
     * @param wheels Dagger will automatically execute/inject after the constructor finished.
     */
    @Inject
    public MethCar(Wheels wheels) {
        this.wheels = wheels;
    }

    /**
     *
     * @param remote Here we pass the instance of the object itself to the dependency hence no need to invoke MethCar instance separately.
     */
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        LogHelper.showLogData("drive the car...");
    }

}


/*Note:
    Here constructor call first-> then field (@Inject Engine engine) -> then method (enableRemote() )
    So this sequence  constructor->field->method


    Here we pass 'this' to remote.setListener() inside the enableRemote() as it will call after constructor get finished.
    If we call inside constructor it will throw an error beacuse we refrence the object which is not intializewd yet
* */
