package id.abonsapi.moderndesignui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CardView cvWalking, cvBoat, cvPlane, cvTrain, cvBike, cvBus;
    private TextView tvBrand, tvSlogan;
    private ImageView ivLogo;

    // Animations
    Animation logoAnimation, textAnimation;

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
                Toast.makeText(MainActivity.this, "Walking on Click!", Toast.LENGTH_SHORT).show();
            }
        });

        cvBoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boat on Click!", Toast.LENGTH_SHORT).show();
            }
        });

        cvPlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Plane on Click!", Toast.LENGTH_SHORT).show();
            }
        });

        cvTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Train on Click!", Toast.LENGTH_SHORT).show();
            }
        });

        cvBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Bike on Click!", Toast.LENGTH_SHORT).show();
            }
        });

        cvBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Bus on Click!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
