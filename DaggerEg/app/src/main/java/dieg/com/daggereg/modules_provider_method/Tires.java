package dieg.com.daggereg.modules_provider_method;

import javax.inject.Inject;

import dieg.com.daggereg.utils.LogHelper;

public class Tires {

    @Inject
    public Tires() {}

    public void inflate(){
        LogHelper.showLogData("Tires are inflated");
    }

}
