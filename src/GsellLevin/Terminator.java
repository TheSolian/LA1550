package GsellLevin;
import robocode.*;

import java.util.Random;

public class Terminator extends JuniorRobot
{
    private int position;
    private Random random = new Random();

    public void run() {
        setColors(blue, blue, black, yellow, black);

        if(robotX > fieldWidth / 2) {
            turnTo(90);
            position = 1;
        } else {
            turnTo(-90);
            position = 3;
        }

        int scanStart = -1;
        while(true) {
            ahead(100);

            if (scanStart == -1) {
                turnGunLeft(360);
            } else {
                turnGunTo(scanStart);
                turnGunLeft(90);
            }

            switch (position) {
                case 1 -> scanStart = -90;
                case 2 -> scanStart = 0;
                case 3 -> scanStart = 180;
                case 4 -> scanStart = 90;
            }
        }
    }

    public void onScannedRobot() {
        turnGunTo(scannedAngle);
        if (scannedDistance < 50) {
            fire(3);
        } else if (scannedDistance < 100) {
            fire(2);
        } else {
            fire(1);
        }
    }

    public void onHitByBullet() {
        turnBackRight(50, 45);
    }

    public void onHitWall() {
        turnRight(random.nextInt(75, 150));
        ahead(200);
    }
}
