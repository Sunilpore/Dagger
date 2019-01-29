package dieg.com.daggereg.modules_provider_method;

public class MWheels {
    //We don't own this class so we can't annotate it with @Inject
    //Lets say, here we can't initialize Rims and Tires as it comes from third party manufacturer
    //Means MWheels is an external library.So we can't make changes in it,can't annotate constructor @Inject
    // Instead we have to take as it is.


    /**
     * rims,tires are also 3rd party libraries.
     */
    private Rims rims;
    private Tires tires;

    public MWheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }

}
