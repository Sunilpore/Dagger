package dieg.com.daggereg.modules_provider_method;

import dagger.Module;
import dagger.Provides;
import dieg.com.daggereg.model.Engine;

@Module
public class PetrolEngineModule {

    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }
}
