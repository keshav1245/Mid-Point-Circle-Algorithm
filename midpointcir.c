#include<stdio.h>
#include<graphics.h>

void drawCircle(int X,int Y,int P,int Q){
	putpixel(X+P,Y+Q,RED);
	putpixel(X-P,Y+Q,RED);
	putpixel(X+P,Y-Q,RED);
	putpixel(X-P,Y-Q,RED);
	putpixel(X+Q,Y+P,RED);
	putpixel(X-Q,Y+P,RED);
	putpixel(X+Q,Y-P,RED);
	putpixel(X-Q,Y-P,RED);
}

int main(){

	int gd = DETECT,gm;

	initgraph(&gd,&gm,"");
	
	int xCenter = 300,yCenter=300,radius = 100,decisionParam;
	int p =0, q = radius; // inital point to be plotted
	
	decisionParam = 5/4 - radius;
	drawCircle(xCenter,yCenter,p,q);
	
	while(q>=p){
		p++;
		if(decisionParam >= 0){
			q--;
			decisionParam = decisionParam +2*p - 2*q + 1;
		}else{
			decisionParam = decisionParam + 2*p + 1;
		}

		drawCircle(xCenter,yCenter,p,q);
		delay(50);
	}

	delay(5000);

return 0;

}
