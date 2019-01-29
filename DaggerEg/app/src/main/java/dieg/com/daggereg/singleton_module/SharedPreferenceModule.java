package dieg.com.daggereg.singleton_module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dieg.com.daggereg.utils.LogHelper;

@Module
public class SharedPreferenceModule {

    private static final String MyprefK = "Prefkey";

    private static final String CheckK = "Checkkey";

    Context mContext;

    //@Inject @Singleton PreferenceHelper preferenceHelper;

/*    public SharedPreferenceModule(Context context) {
        mContext = context;
    }

    @Singleton
    @Provides
    public PreferenceHelper provideContextRefrence(){
        //LogHelper.showLogData(preferenceHelper.returnPreferenceValue());;
        return new PreferenceHelper(mContext);
    }*/


/*    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Application application){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }*/

   /* @Singleton
    @Provides
    SharedPreferences providesSharedPreferences(){
        return mContext.getSharedPreferences(MyprefK, mContext.MODE_PRIVATE);
    }*/

    /*@Provides
    PreferenceHelper getPreferenceHelper(){
        //LogHelper.showLogData("Preference....");
        //LogHelper.showLogData(preferenceHelper.returnPreferenceValue());
        return preferenceHelper;
    }*/


}
