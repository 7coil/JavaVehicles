
public class Horse implements Comparable<SpeedCalculatable>, SpeedCalculatable {
  private int HORSE = 1;
  private int mass = 500;
  
  public float calculateSpeed() {
    return (float) HORSE / (float) mass;
  }

  public int compareTo(SpeedCalculatable vehicle) {
    if (this.calculateSpeed() < vehicle.calculateSpeed()) {
      return -1;
    } else if (this.calculateSpeed() > vehicle.calculateSpeed()) {
      return 1;
    } else {
      return 0;
    }
  }
}
