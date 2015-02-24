package com.rickgoldman.drawingapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Jason Shepherd on 2/23/2015.
 */

public class DrawingView extends View {

    public DrawingView(Context context, AttributeSet attrs){
        super(context, attrs);
        setupDrawing();
    }

    private void setupDrawing(){
        //get drawing area setup for interaction
    }
}
