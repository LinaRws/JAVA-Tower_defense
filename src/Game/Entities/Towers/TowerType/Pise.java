package Game.Entities.Towers.TowerType;

import Game.Entities.Towers.Tower;
import java.awt.Image;
import java.io.File;

public class Pise extends Tower {

  private static Image sprite = null;

  static {
    File file = new File("src/Resource/Images/Towers/tour-de-pise.png");
    sprite = new javax.swing.ImageIcon(file.getAbsolutePath()).getImage();
  }

  public Pise(double x, double y) {
    super(4, 2, 2, false, 10, sprite, x, y, Type.PISE);
  }

  public static Image getImage() {
    return sprite;
  }
}
