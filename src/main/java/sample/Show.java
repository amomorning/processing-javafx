package sample;

import processing.core.PApplet;

/**
 * @classname: testProcessingFX
 * @description:
 * @author: amomorning
 * @date: 2020/09/25
 */
public class Show extends PApplet {

    public void settings() {
        size(1000, 1000, P2D);

    }

    public void setup() {
        background(255, 122, 0);
        mouseX = -0x3f;
        mouseY = -0x3f;
    }


    public void draw(){
        // Draw the box
        if(mouseX != -0x3f && mouseY != -0x3f) {
            rect(mouseX, mouseY, 200, 100);
        }
    }
}