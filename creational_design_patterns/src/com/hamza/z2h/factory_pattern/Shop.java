package com.hamza.z2h.factory_pattern;

public class Shop extends Website{
    @Override
    public void createWebsite() {
        pages.add(new SearchPage());
        pages.add(new ContactPage());
        pages.add(new ItemPage());
    }
}
