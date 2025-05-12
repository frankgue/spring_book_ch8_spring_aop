package org.example;

import org.springframework.stereotype.Component;

@Component
public class MyOtherBean {
    public void sayHelloDelayed() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Hello...!");
    }
}
