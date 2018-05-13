public class Engine {
  private int horses;
  private int mass;
  private Colour colour;
  
  public Engine() {
    colour = Colour.STEEL;
  }

  public int getHorses() {
    return horses;
  }

  public void setHorses(int horses) {
    this.horses = horses;
  }

  public int getMass() {
    return mass;
  }

  public void setMass(int mass) {
    this.mass = mass;
  }

  public Colour getColour() {
    return colour;
  }

  public void setColour(Colour colour) {
    this.colour = colour;
  }
}
