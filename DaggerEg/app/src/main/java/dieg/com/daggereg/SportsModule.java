package dieg.com.daggereg;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
class SportsModule {

    SportsModule() {}

    @Provides @Named("outdoor")
    String getOutDoorSportName(){
        return "Football";
    }

    @Provides @Named("indoor")
    String getIndoorSportName(){
        return "Chess";
    }

    @Provides
    int getFoodName(){
        return 100;
    }

}
