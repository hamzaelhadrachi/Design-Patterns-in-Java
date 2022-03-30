package com.hamza.z2h.singleton_pattern.lazyLoading;

public class DbSingletonDemo {

    public static void main (String[] args){
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton instance_2 = DbSingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance_2);
    }
}
