package hoa.nguyenminh.dagger2android.car;

import android.util.Log;

import javax.inject.Inject;

import hoa.nguyenminh.dagger2android.dagger.PerActivity;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver mDriver;
    private Engine mEngine;
    private Wheels mWheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        mDriver = driver;
        mEngine = engine;
        mWheels = wheels;

    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        mEngine.start();
        Log.d(TAG, "Driver " + mDriver + " drives " + this);
    }
}
