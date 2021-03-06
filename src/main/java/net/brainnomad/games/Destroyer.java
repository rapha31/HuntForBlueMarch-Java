package net.brainnomad.games;

class Destroyer {
    private int xPos, yPos;
    private final int BOMBRANGE = 4;
    private final int SONARRANGE = 8;


    public Destroyer(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public int getSonarRange() {
        return SONARRANGE;
    }
    
    public int[] getPosition() {
        int[] pos = new int[2];
        pos[0] = xPos;
        pos[1] = yPos;
        return pos;
    }

    public boolean readSonar(Submarine submarine) {
        if (distance(submarine) <= SONARRANGE) {
            return true;
        }
        return false;
    }

    public boolean dropBomb(Submarine submarine) {
        if (distance(submarine) <= BOMBRANGE) {
            return true;
        }
        return false;
    }

    public void moveVessel(int newX, int newY) {
        xPos = newX;
        yPos = newY;
    }

    public int distance(Submarine submarine) {
        int[] subPos = submarine.getPosition();
        int distance = (xPos - subPos[0]) * (xPos - subPos[0]) + (yPos - subPos[1]) * (yPos - subPos[1]);
        return distance;
    }
}