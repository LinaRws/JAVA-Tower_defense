package Game.Main;

import Game.Entities.Towers.Tower;
import Game.Entities.Towers.TowerType.Pise;
import Game.Entities.Towers.TowerType.Eiffel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BottomTowersPanel extends JPanel {

  public static Tower.Type selectedType;

  public BottomTowersPanel(Game game, PlayPage playPage) {
    setBackground(Color.GRAY);
    setPreferredSize(new Dimension(300, 100));
    setLayout(new FlowLayout());

    ImageIcon basicImage = new ImageIcon(Eiffel.getImage());
    JButton range = new JButton(basicImage);
    range.addActionListener(e -> selectedType = Tower.Type.RANGE);
    ImageIcon canonImage = new ImageIcon(Pise.getImage());
    JButton melee = new JButton(canonImage);
    melee.addActionListener(e -> selectedType = Tower.Type.MELEE);

    add(range);
    add(melee);
  }
}
