package fight_covid19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Card extends JPanel implements MouseListener {

    private Image img;
    private String id;

    public Card(Image img) {
        setSize(64, 90);
        this.img = img;
        addMouseListener(this);
    }

    public void setID(String id) {
        this.id = id;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // when sunflower is clicked
        if (id.equals("sunflower")) {
            if (Core.sun >= 50) {
                State.setCurrentOption(State.PlantType.Sunflower);
            } else {
                return;
            }
        }

        // when wallnut is clicked
        if (id.equals("wallnut")) {
            if (Core.sun >= 50) {
                State.setCurrentOption(State.PlantType.WallNut);
            } else {
                return;
            }
        }

        // when peashooter is clicked
        if (id.equals("peashooter")) {
            if (Core.sun >= 100) {
                State.setCurrentOption(State.PlantType.Peashooter);
            } else {
                return;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setSize(60, 80);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setSize(64, 90);
    }
}
