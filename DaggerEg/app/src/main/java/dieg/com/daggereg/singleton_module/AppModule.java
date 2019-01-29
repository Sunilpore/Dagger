package dieg.com.daggereg.singleton_module;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private static final String MyprefK = "Prefkey";

    Application mApplication;
    Activity mActivity;
    Context mContext;

    public AppModule(Application application) {
        mApplication = application;
    }


    @Provides
    @Singleton
    Application providesApplication(){
        return mApplication;
    }


    @Provides
    @Singleton
    Context providesContext(){
        return mApplication.getApplicationContext();
    }


    /*//Here we can also initialize Preference class by using below provide method
    @Singleton
    @Provides
    public PreferenceHelper provideContextRefrence(){
        return new PreferenceHelper(mApplication);
    }*/

    @Singleton
    @Provides
    SharedPreferences provideContextRefrence(){
        return mApplication.getSharedPreferences(MyprefK, Context.MODE_PRIVATE);
    }

}
