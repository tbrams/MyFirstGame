package dk.brams.android.myfirstgame;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by tbrams on 24/11/15.
 */
public class Background {
    private Bitmap image;
    private int x, y, dx;

    public Background(Bitmap res) {
        image = res;
    }


    public void update() {
        x+=dx;
        if(x<-GamePanel.WIDTH){
            x=0;
        }
    }


    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y,null);
        if(x<0)
        {
            canvas.drawBitmap(image, x+GamePanel.WIDTH, y, null);
        }
    }


    public void setVector(int dx) {
        this.dx = dx;
    }
}
