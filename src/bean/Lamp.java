package bean;


public class Lamp {

    /**
     * greenTime : 5
     * redTime : 30
     * roadName : 1
     * yellowTime : 40
     */

    public Lamp(){}

    public Lamp(String roadName, int redTime,int greenTime, int yellowTime) {
        this.greenTime = greenTime;
        this.redTime = redTime;
        this.roadName = roadName;
        this.yellowTime = yellowTime;
    }

    private int greenTime;
    private int redTime;
    private String roadName;
    private int yellowTime;

    public int getGreenTime() {
        return greenTime;
    }

    public void setGreenTime(int greenTime) {
        this.greenTime = greenTime;
    }

    public int getRedTime() {
        return redTime;
    }

    public void setRedTime(int redTime) {
        this.redTime = redTime;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public int getYellowTime() {
        return yellowTime;
    }

    public void setYellowTime(int yellowTime) {
        this.yellowTime = yellowTime;
    }
}
