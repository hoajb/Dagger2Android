package hoa.nguyenminh.dagger2android.car;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */
public class Wheels {
    private Rims mRims;
    private Tires mTires;

    public Wheels(Rims rims, Tires tires) {
        mRims = rims;
        mTires = tires;
    }
}
