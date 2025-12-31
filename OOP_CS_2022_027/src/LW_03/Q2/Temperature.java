package LW_03.Q2;

public class Temperature {

    private double celsius;

    public Temperature() {
        celsius = 0.0;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }
}
