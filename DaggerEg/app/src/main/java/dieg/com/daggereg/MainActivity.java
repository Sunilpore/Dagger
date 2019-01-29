package dieg.com.daggereg;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import dieg.com.daggereg.constructor_injection.ConstructorInjectActivity;
import dieg.com.daggereg.modules_provider_method.ModuleProviderActivity;
import dieg.com.daggereg.singleton_module.PreferenceHelper;
import dieg.com.daggereg.utils.LogHelper;

public class MainActivity extends BaseActivity {

    @Inject @Named("outdoor")
    String outdoorGame;

    @Inject @Named("indoor")
    String indoorGame;

    @Inject
    int msgCode;

/*    @Inject
    SharedPreferences mSP;*/

/*    @Inject
    PreferenceHelper pref;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((SportsApplication) getApplication())
                .getMyComponent()
                .inject(MainActivity.this);

        LogHelper.showLogData("Game:\n outdoor: "+outdoorGame+" \n indoor: "+indoorGame+" \nCode:"+msgCode);

        LogHelper.showLogData(pref.returnPreferenceValue());

        pref.setUserName("Sam");pref.setUserAge("18");pref.setCheck(true);

        LogHelper.showLogData("UserName: "+pref.getUserName()+" \tAge: "+pref.getUserAge()+" \tstatus: "+pref.getCheck());

        /*//to write in sharedpref
        SharedPreferences.Editor prefEditor = mSP.edit();
        prefEditor.putString("UserName", "John Doe");
        prefEditor.putInt("UserAge", 22);
        prefEditor.apply();*/

        /*//to read from sharedPref
        String name = mSP.getString("UserName", "DEFAULT");
        int age = mSP.getInt("UserAge", 0);

        LogHelper.showLogData("name: "+name+" \t age: "+age);*/

        //Intent i = new Intent(this,ConstructorInjectActivity.class);
       // Intent i = new Intent(this,ModuleProviderActivity.class);
       // startActivity(i);

    }


}
