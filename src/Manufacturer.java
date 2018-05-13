
public enum Manufacturer {
  SAAB("Saab", "Sweden"),
  FORD("Ford", "United States of America"),
  SEGA("SEGA", "Japan"),
  TOYOTA("Toyota", "Japan"),
  MITSUBISHI("Mitsubishi", "Japan"),
  BMW("BMW", "Germany");

  private String name;
  private String country;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  private Manufacturer(String name, String country) {
    this.name = name;
    this.country = country;
  }
}
