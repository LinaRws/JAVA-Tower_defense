package Game.Main.Models.Tiles;

import java.awt.Image;
import java.io.File;

public class Fond extends Tile {

  private static Image sprite = null;

  static {
    File file = new File("src/Resource/Images/Map/fond.png");
    sprite = new javax.swing.ImageIcon(file.getAbsolutePath()).getImage();
  }

  public Fond(int x, int y) {
    super(x, y, false, true, sprite);
  }
}
