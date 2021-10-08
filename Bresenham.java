import java.awt.*;
import java.applet.*;
public class Bresenham extends Applet {
    public void paint(Graphics g){
        int x0=100,y0=25,x1=200,y1=170;
        int dx,dy;
        int step,x,y,p;
        
        x=x0;
        y=y0;
        dx=Math.abs(x1-x0);
        dy=Math.abs(y1-y0);
        
        if(dx>dy){
        step=dx;
        p=2*dy-dx;
        g.fillOval((int)x, (int)y, 2, 2);

        for(int i=0;i<step;i++){
           if(p<0){
               x=x+1;
               y=y;
               p=p+2*dy;
           }else{
               x=x+1;
               y=y+1;
               p=p+2*dy-2*dx;
           } 
           g.fillOval((int)x, (int)y, 2, 2);
        }
    }else{
        step=dy;
        p=2*dx-dy;
        g.fillOval((int)x, (int)y, 2, 2);

        for(int i=0;i<step;i++){
           if(p<0){
               x=x;
               y=y+1;
               p=p+2*dx;
           }else{
               x=x+1;
               y=y+1;
               p=p+2*dx-2*dy;
           } 
           g.fillOval((int)x, (int)y, 2, 2);
        }  
        }
    }
}
