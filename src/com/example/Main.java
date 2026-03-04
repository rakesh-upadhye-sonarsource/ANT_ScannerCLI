package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure(); // Setup simple logging

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String[] data = {"Ant", "Ivy", "Java"};

        logger.info("Hello from Ant! Here is your JSON:");
        System.out.println(gson.toJson(data));
    }

    public void helloWorld(){
        System.out.println("Hello World!");
    }

    public void multiply(int a, int b){
        System.out.println("Product of two nos is : " + a * b);
    }
}
