public class Vehicle implements Comparable<SpeedCalculatable>, SpeedCalculatable {
  private String registration;
  private Colour colour;
  private Engine engine;
  private Manufacturer manufacturer;
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private int length;
  private int width;
  private int height;
  private int mass;

  public Vehicle() {
    this.engine = new Engine();
    this.colour = Colour.STEEL;
  }

  public int getMass() {
    int mass = 0;

    if (this.mass > 0)
      mass += this.mass;
    if (this.getEngine() != null)
      mass += this.getEngine().getMass();

    return mass;
  }

  public void setMass(int mass) {
    this.mass = mass;
  }

  public Manufacturer getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(Manufacturer manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getRegistration() {
    return this.registration;
  }

  public Engine getEngine() {
    return this.engine;
  }

  public Colour getColour() {
    return this.colour;
  }

  public int getLength() {
    return this.length;
  }

  public int getWidth() {
    return this.width;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return this.height;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void setColour(Colour colour) {
    this.colour = colour;
  }

  public void print() {
    int printLength = this.getLength() / 100;
    String[] carBody = new String[5];

    for (int i = 0; i < carBody.length; i++) {
      carBody[i] = "";
    }

    for (int i = 0; i < carBody.length; i++) {
      for (int j = 0; j < printLength; j++) {
        if (i == 0) {
          carBody[i] += "¯";
        } else if (i == 1 && (j % 2) == 0) {
          carBody[i] += "|";
        } else if (i == 3) {
          carBody[i] += "_";
        } else {
          carBody[i] += " ";
        }
      }
    }

    System.out.println(this.getName() + " by " + this.getManufacturer().getName() + ", developed in "
        + this.getManufacturer().getCountry() + "\n" + "\n" + "          "
        + this.getColour().colourText("/" + carBody[0] + "\\") + "\n" + "         "
        + this.getColour().colourText("/ " + carBody[1] + " \\") + "\n" + "  "
        + this.getColour().colourText("|¯¯¯¯¯¯  " + carBody[2] + "  ¯¯|") + "\n" + " \u001B[5m▀\u001B[0m"
        + this.getColour().colourText("|________" + carBody[3] + "____|") + "\n" + "    \\_/    " + carBody[4]
        + " \\_/\n");
  }

  public float calculateSpeed() {
    return this.getEngine().getHorses() / this.getMass();
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

  public static void main(String args[]) {
    // Create a SAAB 9000
    Vehicle saabVehicle = new Vehicle();
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

    // Create a Ford Fiesta
    Vehicle fordVehicle = new Vehicle();
    Engine fordEngine = new Engine();

    fordEngine.setHorses(400);
    fordEngine.setMass(200);

    fordVehicle.setColour(Colour.RED);
    fordVehicle.setEngine(fordEngine);
    fordVehicle.setManufacturer(Manufacturer.FORD);

    fordVehicle.setLength(500);
    fordVehicle.setWidth(176);
    fordVehicle.setHeight(142);
    fordVehicle.setMass(1100);

    fordVehicle.setRegistration("H982 FKL");
    fordVehicle.setName("Ford Fiesta");

    fordVehicle.print();

    if (fordVehicle.compareTo(saabVehicle) < 0) {
      System.out.println("The ford is slower than the saab");
    } else if (fordVehicle.compareTo(saabVehicle) > 0) {
      System.out.println("The ford is faster than the saab");
    } else {
      System.out.println("The ford is just as fast as the saab");
    }
    
    Horse horse = new Horse();
    
    int fordHorseComparison = fordVehicle.compareTo(horse);
    
    if (fordHorseComparison < 0) {
      System.out.println("The ford is slower than the horse");
    } else if (fordHorseComparison > 0) {
      System.out.println("The ford is faster than the horse");
    } else {
      System.out.println("The horse is just as fast as the ford");
    }
  }
}
