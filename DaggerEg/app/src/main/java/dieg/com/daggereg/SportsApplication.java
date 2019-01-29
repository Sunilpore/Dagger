package dieg.com.daggereg;

import android.app.Application;

import dieg.com.daggereg.singleton_module.AppModule;
import dieg.com.daggereg.singleton_module.SharedPreferenceModule;

public class SportsApplication extends Application {

    //AppComponent -> Interface
    private AppComponent mMyComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mMyComponent = createMyComponent();
    }


    private AppComponent createMyComponent() {

        //return DaggerAppComponent.create();
        return DaggerAppComponent.builder()
                .sportsModule(new SportsModule())
                .appModule(new AppModule(this))
                .build();


    }

    AppComponent getMyComponent() {
        return mMyComponent;
    }
}