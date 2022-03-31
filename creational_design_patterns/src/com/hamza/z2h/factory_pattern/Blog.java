package com.hamza.z2h.factory_pattern;

public class Blog extends Website{

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }
}
