package com.daggereg1.module;

import com.daggereg1.model.Engine;
import com.daggereg1.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

/*    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }*/

    //It is do same work as above method

    /**
     * Here dagger never create implementation for this class, Hence never call this method too.
     * It creates PertolEngine instance directly
     * @param engine
     * @return
     *
     * So whenever we want to bind implementation to an interface then we should use @bind instead of @provide
     * @Binds -> takes only single parameter and use single implemented class inside @component at a time
     */

    //At here you can give @Singleton annotation inside method for PetrolEngine
    //i.e. bindEngine(@Singleton ) as dagger will not create method , it will directly instantiated object directly
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
