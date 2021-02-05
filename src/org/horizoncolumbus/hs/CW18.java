package org.horizoncolumbus.hs;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CW18 {
    public static void main(String[] args) throws URISyntaxException, IOException{
        String[] pog = new String[3];
        pog[0] = "https://classroom.google.com/u/0/h";
        pog[1] = "https://zoom.us/signin";
        pog[2] = "https://www.youtube.com/watch?v=s49CT4DTAkw";

        for(int i = 0; i < pog.length; i++){
            Desktop.getDesktop().browse(new URI(pog[i]));
        }

    }
    }
