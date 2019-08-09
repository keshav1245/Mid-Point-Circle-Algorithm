package computerGraphicsLab;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class midpointCircle extends java.awt.Component{
	public midpointCircle() {}
	
	public static void main(String[] args) {
		int i =1000,j=1000;
		JFrame jframe = new JFrame();
		jframe.setSize(i, j);
		jframe.setVisible(true);
		jframe.getContentPane().add(new midpointCircle());
	}
	public void paint(Graphics graphs) {
		java.awt.Graphics2D g2D = (java.awt.Graphics2D) graphs;

		int xCenter = 500,yCenter=500,radius = 250,decisionParam;
		int p =0, q = radius; // inital point to be plotted
		
		decisionParam = 5/4 - radius;
		drawCircle(xCenter,yCenter,p,q,graphs);
		
		while(q>=p){
			p++;
			if(decisionParam >= 0){
				q--;
				decisionParam = decisionParam +2*p - 2*q + 1;
			}else{
				decisionParam = decisionParam + 2*p + 1;
			}
		
			drawCircle(xCenter,yCenter,p,q,graphs);
			
		}

	
	}
	

	public void drawCircle(int X,int Y,int P,int Q,Graphics graphs) {
		graphs.drawLine(X+P,Y+Q,X+P,Y+Q);
		graphs.drawLine(X-P,Y+Q,X-P,Y+Q);
		graphs.drawLine(X+P,Y-Q,X+P,Y-Q);
		graphs.drawLine(X-P,Y-Q,X-P,Y-Q);
		graphs.drawLine(X+Q,Y+P,X+Q,Y+P);
		graphs.drawLine(X-Q,Y+P,X-Q,Y+P);
		graphs.drawLine(X+Q,Y-P,X+Q,Y-P);
		graphs.drawLine(X-Q,Y-P,X-Q,Y-P);
	}
}


