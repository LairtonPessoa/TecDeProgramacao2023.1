package com.ilhadejava2.view;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Icon extends ImageIcon {

    private int width;
    private int height;

    public Icon(String string, int width, int height) {
        super(string);
        this.width = width;
        this.height = height;
        resizeImage();
    }

    private void resizeImage() {
        Image originalImage = getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        setImage(resizedImage);
    }
}
