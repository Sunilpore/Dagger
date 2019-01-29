package dieg.com.daggereg;

import javax.inject.Singleton;

import dagger.Component;
import dieg.com.daggereg.singleton_module.AppModule;

@Singleton
@Component(modules = {SportsModule.class, AppModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);

    void inject(BaseActivity baseActivity);

}
