package hoa.nguyenminh.dagger2android.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Hoa Nguyen on Apr 10 2019.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
