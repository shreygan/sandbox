package model;

public class Vector2D  {

    private double vx;
    private double vy;

    // EFFECTS: creates vector with given vx and vy
    public Vector2D(double vx, double vy) {
        this.vx = vx;
        this.vy = vy;
    }

    // EFFECTS: creates copy of given vector
    public Vector2D(Vector2D v) {
        this.vx = v.vx;
        this.vy = v.vy;
    }

    // MODIFIES: this
    // EFFECTS: applies clockwise rotation on vector by given angle
    public void rotateClockwise(double angle) {
        double tempv1 = this.vx * Math.cos(angle) + this.vy * Math.sin(angle);
        double tempv2 = this.vx * - Math.sin(angle) + this.vy * Math.cos(angle);

        this.vx = tempv1;
        this.vy = tempv2;
    }

    // MODIFIES: this
    // EFFECTS: applies counterclockwise rotation on vector by given angle
    public void rotateCounterClockwise(double angle) {
        double tempv1 = this.vx * Math.cos(angle) - this.vy * Math.sin(angle);
        double tempv2 = this.vx * Math.sin(angle) + this.vy * Math.cos(angle);

        this.vx = tempv1;
        this.vy = tempv2;
    }

    // MODIFIES: this
    // EFFECTS: multiplies vx and vy by given number
    public void multiplyBy(double x) {
        this.vx *= x;
        this.vy *= x;
    }

    // EFFECTS: returns absolute sum of vx and vy
    public double getSum() {
        return Math.abs(vx) + Math.abs(vy);
    }

    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }
}
