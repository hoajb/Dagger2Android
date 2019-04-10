package hoa.nguyenminh.dagger2android.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.d(TAG, "Remote connected");
    }
}
