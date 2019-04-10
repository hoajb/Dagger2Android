package hoa.nguyenminh.dagger2android.dagger;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import hoa.nguyenminh.dagger2android.MainActivity;
import hoa.nguyenminh.dagger2android.car.Car;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
@PerActivity
@Component(dependencies = {AppComponent.class}, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity activity);

    @Component.Builder
// own custom, must remove DieselEngineModule constructor
    interface Builder {

        @BindsInstance
// for build instance Module
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int capacity);

        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();
    }
}
