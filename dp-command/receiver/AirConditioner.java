package receiver;

public class AirConditioner {
  int temperature;
  boolean isOn;

  public void turnOnAc() {
    isOn = true;
    System.out.println("AC is on!");
  }

  public void turnOffAc() {
    isOn = false;
    System.out.println("AC is off!");
  }

  public void setTemperature(int temp) {
    this.temperature = temp;
    System.out.println("Temperature is set at " + temp);
  }
}