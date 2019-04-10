package hoa.nguyenminh.dagger2android.dagger;

import dagger.Binds;
import dagger.Module;
import hoa.nguyenminh.dagger2android.car.Engine;
import hoa.nguyenminh.dagger2android.car.PetrolEngine;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
