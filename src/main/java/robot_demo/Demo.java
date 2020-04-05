package robot_demo;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Demo {

    private String basePath;
    private Screen screen;

    public Demo() {
        URL resourceFolderURL = this.getClass().getClassLoader().getResource("images");
        screen = new Screen();
        try {
            basePath = resourceFolderURL.toURI().getPath() + "/";
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void startPostman() {
        try {
            screen.find(basePath + "im3.png").click();
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void goToConsumerTab() {
        try {
            screen.wait(basePath + "im2.PNG",100);
            screen.find(basePath + "im2.PNG").click();
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    private void pressSendButton() {
        try {
            screen.find(basePath + "sendButton.PNG").click();
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    private void goToHeaders() {
        try {
            screen.find(basePath + "headers.PNG").click();
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    private void fixTest() {
        try {
            screen.find(basePath + "im5.PNG").click();
            screen.find(basePath + "im5.PNG").right(80).click();
            screen.type("Authorization");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    private void ValidateResuts() {
        try {
            screen.find(basePath + "im4.PNG");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.startPostman();
        demo.goToConsumerTab();
        demo.pressSendButton();
        demo.goToHeaders();
        demo.fixTest();
        demo.ValidateResuts();
    }


}
