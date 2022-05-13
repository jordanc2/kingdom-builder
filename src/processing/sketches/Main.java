package processing.sketches;

import org.checkerframework.checker.units.qual.C;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
    public static PApplet sketch;
    public PImage castleImage;
    public PImage starImage;
    public PImage mapImage;

    private final int starSize = 15;
    private final int detailFontSize = 14;

    private Castle castle1, castle2, castle3;

    public void settings() {
        castleImage = loadImage("castle.png");
        starImage = loadImage("CapitolStar.png");
        mapImage = loadImage("map.png");
        size(600, 600);
//        imageMode(CENTER);
//        textAlign(CENTER);
        sketch = this;
    }

    public void setup() {
        background(0);
        imageMode(CENTER);
        textAlign(CENTER);

        castle1 = new Castle(
                "Bob",
                684684,
                "684684",
                5000,
                "The Sphere",
                true,
                314,
                105
        );

        castle2 = new Castle(
                "Bob2",
                328,
                "58395",
                2000,
                "The Cube",
                false,
                365,
                3
        );

        castle3 = new Castle(
                "Bob3",
                50000,
                "58372",
                4000,
                "Event Horizon",
                false,
                400,
                372
        );

    }

    public void draw() {
        image(mapImage, width/2,height/2, width, height);

        //call drawCastle for each castle here
        drawCastle(castle1);
        drawCastle(castle2);
        drawCastle(castle3);
    }


    public void drawCastle(Castle castle) {
        float squareBase = sqrt(castle.getArea());

        image(castleImage, castle.getLatitude(), castle.getLongitude(), squareBase, squareBase);

        if (castle.isCapitol()) {
            image(starImage, castle.getLatitude() + squareBase/2, castle.getLongitude() - squareBase/2, starSize, starSize);
        }

        if (dist(castle.getLatitude(), castle.getLongitude(), mouseX, mouseY) < squareBase/2) {
            textSize(detailFontSize);
            fill(0);

            //text commands go here...
            text(castle.getName(), castle.getLatitude(), castle.getLongitude() + squareBase/2 + detailFontSize);
            text(castle.getPopulation(), castle.getLatitude(), castle.getLongitude() + squareBase/2 + detailFontSize * 2);
            text(castle.getLandmark(), castle.getLatitude(), castle.getLongitude() + squareBase/2 + detailFontSize * 3);
        }

    }

    public static void main(String... args) {
        PApplet.main("processing.sketches.Main");
    }
}
