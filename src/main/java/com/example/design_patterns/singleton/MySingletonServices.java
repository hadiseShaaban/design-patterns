package com.example.design_patterns.singleton;

//threadSafe with perfect performance
public class MySingletonServices {
    private static volatile MySingletonServices instance;

    private MySingletonServices() {
    }

    public static MySingletonServices getInstance() {
        if (instance == null) {
            synchronized (MySingletonServices.class) {
                if (instance == null) {
                    instance = new MySingletonServices();
                }
            }
        }
        return instance;
    }
}
