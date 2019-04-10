package hoa.nguyenminh.dagger2android.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hoa.nguyenminh.dagger2android.car.Driver;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
@Module
public class DriverModule {

    @Singleton
    @Provides
    Driver provideDriver() {
        return new Driver();
    }
}
