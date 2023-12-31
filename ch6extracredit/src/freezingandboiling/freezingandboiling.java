package freezingandboiling;
public class freezingandboiling {

    private double temperature;

    public void FreezeAndBoiling(double t) {
        temperature = t;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isEthylFreezing() {

        if (temperature <= -173.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEthylBoiling() {

        if (temperature >= 172.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOxygenFreezing() {

        if (temperature <= -362.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOxygenBoiling() {

        if (temperature >= -306.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWaterFreezing() {

        if (temperature <= 32.0) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isWaterBoiling() {

        if (temperature >= 212.0) {
            return true;
        } else {
            return false;
        }
    }
}