package id.abonsapi.moderndesignui.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import id.abonsapi.moderndesignui.R;

public class MainActivity extends AppCompatActivity {
    private CardView cvWalking, cvBoat, cvPlane, cvTrain, cvBike, cvBus;
    private TextView tvBrand, tvSlogan;
    private ImageView ivLogo;

    // Animations
    private Animation logoAnimation, textAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvWalking = findViewById(R.id.cv_walking);
        cvBoat = findViewById(R.id.cv_boat);
        cvPlane = findViewById(R.id.cv_plane);
        cvTrain = findViewById(R.id.cv_train);
        cvBike = findViewById(R.id.cv_bike);
        cvBus = findViewById(R.id.cv_bus);

        // init animation
        logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        textAnimation = AnimationUtils.loadAnimation(this, R.anim.text_animation);
        tvBrand = findViewById(R.id.tv_brand);
        tvSlogan = findViewById(R.id.tv_slogan);
        ivLogo = findViewById(R.id.iv_logo);
        tvBrand.setAnimation(textAnimation);
        tvSlogan.setAnimation(textAnimation);
        ivLogo.setAnimation(logoAnimation);

        cvWalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WalkingActivity.class);
                startActivity(intent);
            }
        });

        cvBoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BoatActivity.class);
                startActivity(intent);
            }
        });

        cvPlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlaneActivity.class);
                startActivity(intent);
            }
        });

        cvTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainActivity.class);
                startActivity(intent);
            }
        });

        cvBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BikeActivity.class);
                startActivity(intent);
            }
        });

        cvBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BusActivity.class);
                startActivity(intent);
            }
        });
    }
}
