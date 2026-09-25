/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
public class SmartBulb implements SmartDevice {
    private boolean isOn = false;
    private int brightness = 0;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return "Bulb is " + (isOn ? "ON" : "OFF") + ", brightness: " + brightness + "%";
    }

    public void setBrightness(int level) {
        this.brightness = level;
    }
}
