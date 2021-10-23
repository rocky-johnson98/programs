Procedure fill (x, y, color, color1: integer)  
int c;  
c=getpixel (x, y);  
if (c!=color) (c!=color1)  
{  
    setpixel (x, y, color)  
    fill (x+1, y, color, color 1);  
     fill (x-1, y, color, color 1);  
    fill (x, y+1, color, color 1);  
    fill (x, y-1, color, color 1);  
}  
