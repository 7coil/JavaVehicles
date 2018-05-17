
public class CaravanAndVehicle extends Vehicle {
  private int caravanMass;
  public CaravanAndVehicle() {
    super();
  }
  
  public int getMass() {
    int mass = super.getMass();
    mass += caravanMass;
    return mass;
  }
  
  public void print() {
    super.print();
    System.out.println(String.format("Caravan Mass: %s", this.getCaravanMass()));
  }

  public int getCaravanMass() {
    return caravanMass;
  }

  public void setCaravanMass(int caravanMass) {
    this.caravanMass = caravanMass;
  }
  
  public static void main(String yarrrgs[]) {
    // Whoops did someone use "var" instead of "Vehicle"?
    // Download Java 10 here: http://jdk.java.net/10/
    var saabVehicle = new Vehicle();
    Engine saabEngine = new Engine();

    saabEngine.setHorses(200);
    saabEngine.setMass(200);

    saabVehicle.setColour(Colour.LTT);
    saabVehicle.setEngine(saabEngine);
    saabVehicle.setManufacturer(Manufacturer.SAAB);

    saabVehicle.setLength(400);
    saabVehicle.setWidth(176);
    saabVehicle.setHeight(142);
    saabVehicle.setMass(1200);

    saabVehicle.setRegistration("H982 FKL");
    saabVehicle.setName("Saab 9000");

    saabVehicle.print();

    // Create a SEGA car with a trailer.
    CaravanAndVehicle segaTrailerVehicle = new CaravanAndVehicle();
    Engine segaTrailerEngine = new Engine();

    segaTrailerEngine.setHorses(300);
    segaTrailerEngine.setMass(200);

    segaTrailerVehicle.setColour(Colour.RED);
    segaTrailerVehicle.setEngine(segaTrailerEngine);
    segaTrailerVehicle.setManufacturer(Manufacturer.SEGA);

    segaTrailerVehicle.setLength(500);
    segaTrailerVehicle.setWidth(176);
    segaTrailerVehicle.setHeight(142);
    segaTrailerVehicle.setMass(1100);
    segaTrailerVehicle.setCaravanMass(1000);

    segaTrailerVehicle.setRegistration("H982 FKL");
    segaTrailerVehicle.setName("Mega Drive");

    segaTrailerVehicle.print();

    if (segaTrailerVehicle.compareTo(saabVehicle) < 0) {
      System.out.println("The Mega Drive is slower than the saab");
    } else if (segaTrailerVehicle.compareTo(saabVehicle) > 0) {
      System.out.println("The Mega Drive is faster than the saab");
    } else {
      System.out.println("The Mega Drive is just as fast as the saab");
    }
  }
}
