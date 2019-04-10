package hoa.nguyenminh.dagger2android.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
public class Car {
    private static final String TAG = "Car";

    private Engine mEngine;
    private Wheels mWheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        mEngine = engine;
        mWheels = wheels;

    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive() {
        mEngine.start();
        Log.d(TAG, "driving...");
    }
}
