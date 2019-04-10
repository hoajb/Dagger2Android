package hoa.nguyenminh.dagger2android.dagger;

import dagger.Module;
import dagger.Provides;
import hoa.nguyenminh.dagger2android.car.Rims;
import hoa.nguyenminh.dagger2android.car.Tires;
import hoa.nguyenminh.dagger2android.car.Wheels;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
@Module
public abstract class WheelsModule {// once "static", class must be "abstract"

    @Provides
    static Rims provideRims() { // the name of method doesn't matter
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
