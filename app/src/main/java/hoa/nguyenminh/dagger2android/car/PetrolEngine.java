package hoa.nguyenminh.dagger2android.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower,@Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void start() {
        Log.d(TAG, "PetrolEngine started. horsePower: " + horsePower);
    }
}
