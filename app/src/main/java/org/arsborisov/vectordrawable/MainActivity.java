package org.arsborisov.vectordrawable;

import android.annotation.SuppressLint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.wnafee.vector.compat.ResourcesCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView robot = (ImageView) findViewById(R.id.main_vector_robot);
        Drawable avd = ResourcesCompat.getDrawable(this, R.drawable.ic_robot_avd);
        robot.setBackground(avd);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Animatable) robot.getBackground()).start();
            }
        });
    }
}
