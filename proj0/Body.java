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
        double distanceX = Math.pow(rocinante.xxPos - this.xxPos, 2); 
        double distanceY = Math.pow(rocinante.yyPos - this.yyPos, 2); 
        double distance = distanceX + distanceY;
        return Math.sqrt(distance);
    }

    public double calcForceExertedBy(Body rocinante) {
        double r = Math.pow(calcDistance(rocinante), 2);
        return (GRAVITATIONAL_VAL * this.mass * rocinante.mass) / r;
    }

}