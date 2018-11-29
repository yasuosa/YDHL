package bean;

public class Car {

    String carId;
    String carMoney;

    public Car(){}
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarMoney() {
        return carMoney;
    }

    public void setCarMoney(String carMoney) {
        this.carMoney = carMoney;
    }

    public Car(String carId, String carMoney) {
        this.carId = carId;
        this.carMoney = carMoney;
    }
}
