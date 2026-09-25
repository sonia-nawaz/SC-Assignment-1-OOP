/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
public class SmartThermostat implements SmartDevice {
    private boolean isOn = false;
    private double temperature = 20.0;

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
        return "Thermostat is " + (isOn ? "ON" : "OFF") + ", temp: " + temperature + "°C";
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }
}