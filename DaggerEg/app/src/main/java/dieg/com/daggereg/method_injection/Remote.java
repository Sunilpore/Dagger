package dieg.com.daggereg.method_injection;

import javax.inject.Inject;

import dieg.com.daggereg.model.Car;
import dieg.com.daggereg.utils.LogHelper;

class Remote {

     @Inject
     public Remote() {
     }

     public void setListener(MethCar car){
         LogHelper.showLogData("Remote connected...");
     }

 }
