package dieg.com.daggereg.modules_provider_method;

import javax.inject.Inject;

import dieg.com.daggereg.model.Engine;
import dieg.com.daggereg.utils.LogHelper;


public class DiselEngine implements Engine {

    @Inject
    public DiselEngine() {}

    @Override
    public void start() {
        LogHelper.showLogData("Disel Engine started");
    }

}
