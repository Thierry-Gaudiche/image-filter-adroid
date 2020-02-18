package com.example.modifieruneimage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                ImageView imgView = findViewById(R.id.imgv);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onclickred(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);

        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btp);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=0 ; x<bt.getWidth() ; x++) {
            for (int y=0 ; y<bt.getHeight() ; y++) {
                bm.setPixel(x, y, Color.rgb(255, 0, 0));
            }}

        im2.setImageBitmap(bm);
    }

    public void onclicknega(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);

        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btp);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=0 ; x<bt.getWidth() ; x++) {
            for (int y=0 ; y<bt.getHeight() ; y++) {
                int xyred = Color.red(bt.getPixel(x, y));
                int xygreen = Color.green(bt.getPixel(x, y));
                int xyblue = Color.blue(bt.getPixel(x, y));
                bm.setPixel(x, y, Color.rgb(255-xyred, 255-xygreen, 255 -xyblue));
            }}

        im2.setImageBitmap(bm);
    }

    public void onclicknmono(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);

        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btp);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=0 ; x<bt.getWidth() ; x++) {
            for (int y=0 ; y<bt.getHeight() ; y++) {
                int xygreen = Color.green(bt.getPixel(x, y));
                bm.setPixel(x, y, Color.rgb(255, xygreen, 255));
            }}

        im2.setImageBitmap(bm);
    }

    public void onclickmiroirhori(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);


        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btp);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=0 ; x<bt.getWidth() ; x++) {
            for (int y=0 ; y<bt.getHeight() ; y++) {
                int xyred = Color.red(bt.getPixel((bt.getWidth()-1-x),(y)));
                int xygreen = Color.green(bt.getPixel((bt.getWidth()-1-x),(y)));
                int xyblue = Color.blue(bt.getPixel((bt.getWidth()-1-x),(y)));
                bm.setPixel(x, y, Color.rgb(xyred, xygreen, xyblue));
            }}

        im2.setImageBitmap(bm);
    }


    public void onclickmiroirvert(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);


        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btp);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=0 ; x<bt.getWidth() ; x++) {
            for (int y=0 ; y<bt.getHeight() ; y++) {
                int xyred = Color.red(bt.getPixel(x,((bt.getHeight()-1)-y)));
                int xygreen = Color.green(bt.getPixel(x,((bt.getHeight()-1)-y)));
                int xyblue = Color.blue(bt.getPixel(x,((bt.getHeight()-1)-y)));
                bm.setPixel(x, y, Color.rgb(xyred, xygreen, xyblue));
            }}

        im2.setImageBitmap(bm);
    }


    public void onclickgris(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);


        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btp);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=0 ; x<bt.getWidth() ; x++) {
            for (int y=0 ; y<bt.getHeight() ; y++) {
                int xyred = Color.red(bt.getPixel(x,y));
                int xygreen = Color.green(bt.getPixel(x,y));
                int xyblue = Color.blue(bt.getPixel(x,y));
                int moyrgb = (xyred + xygreen + xyblue)/3;
                bm.setPixel(x, y, Color.rgb(moyrgb, moyrgb, moyrgb));
            }}

        im2.setImageBitmap(bm);
    }

    public void onclickflou(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);


        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btp);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=1 ; x<(bt.getWidth()-1) ; x++) {
            for (int y=1 ; y<bt.getHeight()-1 ; y++) {
                int xyred = (Color.red(bt.getPixel(x,y)) + Color.red(bt.getPixel(x-1,y)) + Color.red(bt.getPixel(x+1,y)) + Color.red(bt.getPixel(x,y+1)) + Color.red(bt.getPixel(x,y-1)))/5 ;
                int xygreen = (Color.green(bt.getPixel(x,y)) + Color.green(bt.getPixel(x-1,y)) + Color.green(bt.getPixel(x+1,y)) + Color.green(bt.getPixel(x,y+1)) + Color.green(bt.getPixel(x,y-1)))/5;
                int xyblue = (Color.blue(bt.getPixel(x,y)) + Color.blue(bt.getPixel(x-1,y)) + Color.blue(bt.getPixel(x+1,y)) + Color.blue(bt.getPixel(x,y+1)) + Color.blue(bt.getPixel(x,y-1)))/5;
                bm.setPixel(x, y, Color.rgb(xyred, xygreen, xyblue));
            }}

        im2.setImageBitmap(bm);
    }

    public void onclickfaceswap(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        ImageView imface = findViewById(R.id.imgface);
        ImageView immasque = findViewById(R.id.imgmasque);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap btmasque = ((BitmapDrawable)immasque.getDrawable()).getBitmap();
        Bitmap btface = ((BitmapDrawable)imface.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);


        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btmasque);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=1 ; x<(bt.getWidth()-1) ; x++) {
            for (int y=1 ; y<bt.getHeight()-1 ; y++) {
                int masquered = Color.red(bt.getPixel(x,y));
                int masquegreen = Color.green(bt.getPixel(x,y));
                int masqueblue = Color.blue(bt.getPixel(x,y));
                int red = Color.red(btface.getPixel(x,y));
                int green = Color.green(btface.getPixel(x,y));
                int blue = Color.blue(btface.getPixel(x,y));
                int redini = Color.red(btp.getPixel(x,y));
                int greenini = Color.green(btp.getPixel(x,y));
                int blueini = Color.blue(btp.getPixel(x,y));
                if (Color.rgb(0,0,0) == Color.rgb(masquered,masquegreen,masqueblue)) {
                    bm.setPixel(x, y, Color.rgb(red, green, blue));
                }
                else {
                    bm.setPixel(x, y, Color.rgb(redini, greenini, blueini));
                }
            }
        }

        im2.setImageBitmap(bm);
    }

    public void onclickzoom(View v){
        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        Bitmap btp = ((BitmapDrawable)im.getDrawable()).getBitmap();
        Bitmap bm = btp.copy(btp.getConfig(), true);


        // modifier l'image
        Bitmap bt = Bitmap.createBitmap(btp);
        int [] tabp = new int[bt.getWidth()*bt.getHeight()];
        bt.getPixels(tabp,0,bt.getWidth(),0,0,bt.getWidth(),bt.getHeight());
        for (int x=5 ; x<(bt.getWidth()/2) ; x++) {
            for (int y=5 ; y<(bt.getHeight()/2) ; y++) {
                int xyred = Color.red(bt.getPixel(x-5,y-5));
                int xygreen = Color.green(bt.getPixel(x-5,y-5));
                int xyblue = Color.blue(bt.getPixel(x-5,y-5));
                bm.setPixel(x, y, Color.rgb(xyred, xygreen, xyblue));
            }
        }
        for (int x=(bt.getWidth()/2) ; x<bt.getWidth()-5 ; x++) {
            for (int y=(bt.getHeight()/2) ; y<bt.getHeight()-5 ; y++) {
                int xyred = Color.red(bt.getPixel(x+5,y+5));
                int xygreen = Color.green(bt.getPixel(x+5,y+5));
                int xyblue = Color.blue(bt.getPixel(x+5,y+5));
                bm.setPixel(x, y, Color.rgb(xyred, xygreen, xyblue));
            }
        }
        for (int x=5 ; x<(bt.getWidth()/2) ; x++) {
            for (int y=(bt.getHeight()/2) ; y<bt.getHeight()-5 ; y++) {
                int xyred = Color.red(bt.getPixel(x-5,y+5));
                int xygreen = Color.green(bt.getPixel(x-5,y+5));
                int xyblue = Color.blue(bt.getPixel(x-5,y+5));
                bm.setPixel(x, y, Color.rgb(xyred, xygreen, xyblue));
            }
        }
        for (int x=(bt.getWidth()/2) ; x<bt.getWidth()-5 ; x++) {
            for (int y=5 ; y<(bt.getHeight()/2) ; y++) {
                int xyred = Color.red(bt.getPixel(x+5,y-5));
                int xygreen = Color.green(bt.getPixel(x+5,y-5));
                int xyblue = Color.blue(bt.getPixel(x+5,y-5));
                bm.setPixel(x, y, Color.rgb(xyred, xygreen, xyblue));
            }
        }

        im2.setImageBitmap(bm);
    }

    public void onclickreset(View v) {

        ImageView im = findViewById(R.id.imgv);
        ImageView im2 = findViewById(R.id.imgv2);
        int A, R, G, B;

        Bitmap btpt = ((BitmapDrawable) im.getDrawable()).getBitmap();

        Bitmap bm = btpt.copy(btpt.getConfig(), true);

        int[][] rgbValues = new int[bm.getWidth()][bm.getHeight()];

        for (int i = 0; i < bm.getWidth(); i++) {
            for (int j = 0; j < bm.getHeight(); j++) {
                rgbValues[i][j] = bm.getPixel(i, j);

                A = Color.alpha(rgbValues[i][j]);

                R = Color.red(rgbValues[i][j]);
                G = Color.green(rgbValues[i][j]);
                B = Color.blue(rgbValues[i][j]);

                bm.setPixel(i, j, Color.argb(A, R, G, B));
            }
        }
        im2.setImageBitmap(bm);
    }

}
