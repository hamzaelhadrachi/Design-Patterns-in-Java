package com.hamza.z2h.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args){
//        String sql = "select * from movies where title = ?";
//
//        List<String> parameters = new ArrayList<>();
//        parameters.add("Star wars");
//
//        Record record = new Record();
//        Statement firstStatement = new Statement(sql, parameters, record);
//
//        System.out.println(firstStatement.getSql());
//        System.out.println(firstStatement.getParameters());
//        System.out.println(firstStatement.getRecord());
//
//        Statement secondStatement = firstStatement.clone();
//        System.out.println(secondStatement.getSql());
//        System.out.println(secondStatement.getParameters());
//        System.out.println(secondStatement.getRecord());


        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Design Pattern in JAVA !");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());










    }
}
