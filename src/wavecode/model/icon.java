package wavecode.model;

import java.awt.Graphics2D;
import java.awt.*;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class icon {

    public icon() {
    }

    public void setHighQualityImage(JLabel label, String imagePath) {
        try {
            ImageIcon icon = new ImageIcon(imagePath);
            Image originalImage = icon.getImage();

            int width = label.getWidth();
            int height = label.getHeight();

            BufferedImage scaledImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = scaledImage.createGraphics();

            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.drawImage(originalImage, 0, 0, width, height, null);
            g2d.dispose();

            label.setIcon(new ImageIcon(scaledImage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    public void SetImagenLabel(JLabel label, String imagePath) {
        if (label == null) {
            System.err.println(" JLabel es null para: " + imagePath);
            return;
        }

        int width = label.getWidth();
        int height = label.getHeight();

        if (width <= 0 || height <= 0) {
            // Esperar al renderizado usando invokeLater
            SwingUtilities.invokeLater(() -> SetImagenLabel(label, imagePath));
            return;
        }

        ImageIcon icon = new ImageIcon(imagePath);
        Image scaled = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaled));
    }

}