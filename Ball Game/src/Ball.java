public class Ball {
private double rx, ry;
private double vx, vy;
private final double radius;
//instance variables

public Ball() {
	rx = 0.0;
	ry = 0.0;
	vx = 0.015 - Math.random()* 0.03;
	vy = 0.015 - Math.random() * 0.03;
	radius = 0.05 + Math.random() * 0.05;
}

// vertical wall bounce x velocity
private void bounceOffVerticalWall(){
	vx = -vx;
}

//horizontal wall bounce y velocity
private void bounceOffHorizontalWall(){
	vy = -vy;
}

 void move() {
	if (Math.abs(rx+vx) + radius > 1.0){
		bounceOffVerticalWall();
		create();}
	if (Math.abs(ry + vy) + radius > 1.0){
		bounceOffHorizontalWall();
		create();}
	rx = rx + vx;
	ry = ry + vy;
	}
 
public boolean create(){
	return true;
}

//draw ball
public void draw() {
	StdDraw.filledCircle(rx,ry,radius);
}

public static void main(String[] args) {

    Ball[] balls = new Ball[100];
	int ballcount = 3;
	boolean create=false;
	balls[0]= new Ball();
	   StdDraw.setXscale(-1.0, +1.0);
	   StdDraw.setYscale(-1.0, +1.0);
    while (true) {
    	
        StdDraw.clear(StdDraw.GREEN);
        StdDraw.setPenColor(StdDraw.ORANGE);
        
        if(create==true);
        {ballcount++;
        create= false;
        }
        	
       // for(int i=0;i<=ballcount;i++){
        
        balls[0].move();
        balls[0].draw();
       // }
        StdDraw.show(20);
        
        }
    }
}


