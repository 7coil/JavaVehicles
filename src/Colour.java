
public enum Colour {
  RED(255, 0, 0, "Pure Red"),
  GREEN(0, 255, 0, "Pure Green"),
  BLUE(0, 0, 255, "Pure Blue"),
  LTT(219, 65, 5, "LinusMediaGroup Orange"),
  BLACK(0, 0, 0, "Pitch Black"),
  STEEL(224, 223, 219, "Default Car Colour");

  private int r;
  private int g;
  private int b;
  private String szName;

  /**
   * 
   */
  private Colour(int r, int g, int b) {
    this(r, g, b, "Untitled Colour");
  }

  /**
   * A thing that turns enums into colours. Magic
   * 
   * @param r
   * @param g
   * @param b
   * @param szName
   */
  private Colour(int r, int g, int b, String szName) {
    this.r = r;
    this.g = g;
    this.b = b;
    this.szName = szName;

    return;
  }

  public String getHex() {
    return String.format("#%02x%02x%02x", this.r, this.g, this.b);
  }

  public String getName() {
    return this.szName;
  }

  public void printColour() {
    println(this.getName());
  }

  public String colourText(String szText) {
    return String.format("\u001B[48;2;%d;%d;%dm%s\u001B[0m", this.r, this.g, this.b, szText);
  }

  public void println(String szText) {
    print(szText + "\n");
  }

  public void print(String szText) {
    System.out.print(colourText(szText));
  }

  public static void main(String args[]) {
    for (Colour colour : Colour.values()) {
      colour.printColour();
    }
  }
}
