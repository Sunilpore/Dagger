package dieg.com.daggereg;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dieg.com.daggereg.singleton_module.PreferenceHelper;

public class BaseActivity extends AppCompatActivity {

    @Inject
    protected Context mContext;

    @Inject
    protected PreferenceHelper pref;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((SportsApplication) getApplication())
                .getMyComponent()
                .inject(BaseActivity.this);

    }


}
