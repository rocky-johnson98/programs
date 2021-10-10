package DDA_Algorithm;
import java.awt.*;
import java.applet.*;
public class DDA extends Applet{
    public void paint(Graphics g){
        double dx,dy,x,y,step; 
        double ix,iy;
        double x0=10,y0=12,x1=120,y1=140;
        
        dx = x1-x0;
        dy = y1-y0;
        
        if(Math.abs(dx)>Math.abs(dy)){
            step = Math.abs(dx);
        }else{
            step = Math.abs(dy);
        }
        
        ix = dx/step;
        iy = dy/step;
        
        x=x0;
        y=y0;
        
        g.setColor(Color.red);
        g.fillOval((int)x,(int)y,2,2);
        
        for(int i=0;i<step;i++){
            x=x+ix;
            y=y+iy;
            g.fillOval((int)x,(int)y,2,2);
            System.out.println((int)x);
        }
    }
}
