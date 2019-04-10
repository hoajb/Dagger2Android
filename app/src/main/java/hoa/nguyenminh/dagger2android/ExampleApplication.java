package hoa.nguyenminh.dagger2android;

import android.app.Application;

import hoa.nguyenminh.dagger2android.dagger.AppComponent;
import hoa.nguyenminh.dagger2android.dagger.DaggerAppComponent;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
public class ExampleApplication extends Application {
    private AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerAppComponent.create();

    }

    public AppComponent getAppComponent() {
        return mComponent;
    }
}
