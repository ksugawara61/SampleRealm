package net.kokohadoko.instil.samplerealm;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by katsuya on 2017/07/16.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
