package hoa.nguyenminh.dagger2android.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "DieselEngine started. horsePower: " + horsePower);
    }
}
