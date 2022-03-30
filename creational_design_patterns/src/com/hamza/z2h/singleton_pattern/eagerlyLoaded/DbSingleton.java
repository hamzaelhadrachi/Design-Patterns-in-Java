package com.hamza.z2h.singleton_pattern.eagerlyLoaded;

public class DbSingleton {

    private static DbSingleton instance = new DbSingleton();

    private DbSingleton() {
    }

    public static DbSingleton getInstance(){
        return instance;
    }
}
