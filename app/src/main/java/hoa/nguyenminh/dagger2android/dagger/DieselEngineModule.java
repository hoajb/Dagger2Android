package hoa.nguyenminh.dagger2android.dagger;

import dagger.Module;
import dagger.Provides;
import hoa.nguyenminh.dagger2android.car.DieselEngine;
import hoa.nguyenminh.dagger2android.car.Engine;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
@Module
public class DieselEngineModule { //by own create module
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {// can optimize by "Binds" and abstract class. look PetrolEngineModule
        return engine;
    }
}
