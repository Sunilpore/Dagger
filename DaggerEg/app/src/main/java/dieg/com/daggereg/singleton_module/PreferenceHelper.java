package dieg.com.daggereg.singleton_module;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.logging.SocketHandler;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
public class PreferenceHelper {

    private static final String MyprefK = "Prefkey";
    private static final String CheckK = "check_key";
    private static final String UserNameK = "user_name_key";
    private static final String UserAgeK = "user_age_key";

    Context mContext;
    private SharedPreferences mSP;
    private SharedPreferences.Editor ed;


    /*PreferenceHelper(Context context) {
        mSP = context.getSharedPreferences(MyprefK, mContext.MODE_PRIVATE);
        ed = mSP.edit();
    }*/

    @Inject
    PreferenceHelper(SharedPreferences sharedPreferences){
        mSP = sharedPreferences;
    }


    public String returnPreferenceValue(){
        return "It is as preference class";
    }


    //UserName
    public String getUserName(){
        return mSP.getString(UserNameK,"no_name");
    }

    public void setUserName(String value){
        mSP.edit().putString(UserNameK, value).commit();
        //ed.putString(CheckK, value);
        //ed.commit();
    }

    //UserAge
    public String getUserAge(){
        return mSP.getString(UserAgeK,"undefined");
    }

    public void setUserAge(String value){
        mSP.edit().putString(UserAgeK, value).commit();
        //ed.putString(UserAgeK, value);
        //ed.commit();
    }


    //Check Status
    public boolean getCheck() {
        return  mSP.getBoolean(CheckK, false);
    }

    public void setCheck(boolean value) {
        mSP.edit().putBoolean(CheckK, value).commit();
        //ed.putBoolean(CheckK, value);
        //ed.commit();
    }

}
