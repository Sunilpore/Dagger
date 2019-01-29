package dieg.com.daggereg.modules_provider_method;


import dagger.Module;
import dagger.Provides;
import dieg.com.daggereg.model.Wheels;

@Module
public class WheelsModule {

    //When @Provides methods don't depend on any instance state of the module then we can make this methods static which add better performance
    //Beacuse then dagger not need to instantiate this class and call this methods directly

    @Provides
    static Rims provideRims(){
       return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    /**
     * Here daggers knows how to create all below objects which are our own classes, but come from external library
     * But we can't use inject annotation
     * In real apps instead of calling constructor we have to call builder method like retrofit builder
     * @param rims
     * @param tires
     * @return
     */
    @Provides
    static MWheels provideWheels(Rims rims, Tires tires){
        return new MWheels(rims,tires);
    }

}
