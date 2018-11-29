package bean;

public class Environment {
    String temperature; //温度
    String humidity;  //湿度
    String LightIntensity; //光照
    String co2;   //二氧化碳
    String pm;    //pm2.5
    Road road;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getLightIntensity() {
        return LightIntensity;
    }

    public void setLightIntensity(String lightIntensity) {
        LightIntensity = lightIntensity;
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public Road getRoad() {
        return road;
    }

    public void setRoad(Road road) {
        this.road = road;
    }

    public Environment(String temperature, String humidity, String lightIntensity, String co2, String pm, Road road) {
        this.temperature = temperature;
        this.humidity = humidity;
        LightIntensity = lightIntensity;
        this.co2 = co2;
        this.pm = pm;
        this.road = road;
    }
}
