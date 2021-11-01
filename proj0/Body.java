public class Body {

    private static final double GRAVITATIONAL_VAL = 6.67E-11;

    public double xxPos;

    public double yyPos;

    public double xxVel;

    public double yyVel;

    public double mass;

    public String imgFileName;

    public Body(double xP, double yP, double xV, double yV, double m, String img) {
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    public Body(Body b) {
        this(b.xxPos, b.yyPos, b.xxVel, b.yyVel, b.mass, b.imgFileName);
    }

    public double calcDistance(Body rocinante) {
        double distanceX = Math.pow(calcDistanceX(rocinante), 2); 
        double distanceY = Math.pow(calcDistanceY(rocinante), 2); 
        double distance = distanceX + distanceY;
        return Math.sqrt(distance);
    }

    public double calcForceExertedBy(Body rocinante) {
        double r = Math.pow(calcDistance(rocinante), 2);
        return (GRAVITATIONAL_VAL * this.mass * rocinante.mass) / r;
    }

    private double calcDistanceX(Body rocinante) {
        return rocinante.xxPos - this.xxPos;
    }

    private double calcDistanceY(Body rocinante) {
        return rocinante.yyPos - this.yyPos;
    }

    public double calcForceExertedByX(Body rocinante) {
        double f = calcForceExertedBy(rocinante);
        double distanceX = calcDistanceX(rocinante);
        double r = calcDistance(rocinante);
        return (f * distanceX) / r;
    }

    public double calcForceExertedByY(Body rocinante) {
        double f = calcForceExertedBy(rocinante);
        double dinstanceY = calcDistanceY(rocinante);
        double r = calcDistance(rocinante);
        return (f * dinstanceY) / r;
    }

    public double calcNetForceExertedByX(Body[] bodies) {
        double sum = 0.0;
        for(Body body: bodies) {
            if(this.equals(body)) {
                continue;
            }

            sum += calcForceExertedByX(body);
        }
        
        return sum;
    }

    public double calcNetForceExertedByY(Body[] bodies) {
        double sum = 0.0;
        for(Body body: bodies) {
            if(this.equals(body)) {
                continue;
            }

            sum += calcForceExertedByY(body);
        }

        return sum;
    }

    public void update(double dt, double fX, double fY) {
        double accelerationX = fX / this.mass;
        double accelerationY = fY / this.mass;

        this.xxVel = this.xxVel + dt * accelerationX;
        this.yyVel = this.yyVel + dt * accelerationY;

        this.xxPos = this.xxPos + dt * this.xxVel;
        this.yyPos = this.yyPos + dt * this.yyVel;
    }

    public void draw() {
        StdDraw.picture(this.xxPos, this.yyPos, this.imgFileName);
        StdDraw.show();
    }

}