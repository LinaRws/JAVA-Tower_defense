package Game.Entities.Towers.TowerType;

import Game.Entities.Towers.Tower;
import java.awt.Image;
import java.io.File;

public class Eiffel extends Tower {

  private static Image sprite = null;

  static {
    File file = new File("src/Resource/Images/Towers/tour-eiffel.png");
    sprite = new javax.swing.ImageIcon(file.getAbsolutePath()).getImage();
  }

  public Eiffel(double x, double y) {
    super(2, 3, 5, false, 5, sprite, x, y, Type.RANGE);
  }

  public static Image getImage() {
    return sprite;
  }
}
