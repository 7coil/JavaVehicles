public class Engine {
  private int iHorses;
  private int iMass;
  private Colour colour;
  
  public Engine() {
    colour = Colour.STEEL;
  }
  
  public int getMass() {
    return this.iMass;
  }
  
  public int getHorses() {
    return this.iHorses;
  }
  
  public void setMass(int iMass) {
    this.iMass = iMass;
  }
  
  public void setHorses(int iHorses) {
    this.iHorses = iHorses;
  }
}
