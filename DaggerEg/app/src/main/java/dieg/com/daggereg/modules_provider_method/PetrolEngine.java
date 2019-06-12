package dieg.com.daggereg.modules_provider_method;


import javax.inject.Inject;

import dieg.com.daggereg.model.Engine;
import dieg.com.daggereg.utils.LogHelper;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {}

    @Override
    public void start() {
        LogHelper.showLogData("Petrol Engine started");
    }
}
