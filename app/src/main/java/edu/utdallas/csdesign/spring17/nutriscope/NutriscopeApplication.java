
package edu.utdallas.csdesign.spring17.nutriscope;

import android.app.Application;


import com.jakewharton.threetenabp.AndroidThreeTen;


import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.log.LogLevel;
import io.realm.log.RealmLog;

/**
 * Created by john on 3/5/17.
 */

public class NutriscopeApplication extends Application {

    private static NutriscopeApplication INSTANCE;


    public static NutriscopeApplication getInstance() {
        return INSTANCE;

    }


    @Override
    public void onCreate() {
        super.onCreate();

        AndroidThreeTen.init(this);
        Realm.init(this);

        RealmLog.setLevel(LogLevel.TRACE);


    }
}
