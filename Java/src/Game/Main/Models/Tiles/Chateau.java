package Game.Main.Models.Tiles;

import java.awt.Image;
import java.io.File;

public class Chateau extends Tile {

  private static Image sprite = null;

  static {
    File file = new File("src/Resource/Images/Map/chateau.png");
    sprite = new javax.swing.ImageIcon(file.getAbsolutePath()).getImage();
  }

  public Chateau(int x, int y) {
    super(x, y, true, false, sprite);
  }
}
