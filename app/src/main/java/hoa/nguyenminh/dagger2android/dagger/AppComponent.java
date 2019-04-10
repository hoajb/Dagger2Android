package hoa.nguyenminh.dagger2android.dagger;

import javax.inject.Singleton;

import dagger.Component;
import hoa.nguyenminh.dagger2android.car.Driver;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */

@Singleton
@Component(modules = {DriverModule.class})
public interface AppComponent {
    Driver getDriver();
}
