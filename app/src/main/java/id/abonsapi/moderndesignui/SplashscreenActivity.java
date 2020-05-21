package id.abonsapi.moderndesignui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashscreenActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIMEOUT = 5000;

    // Hooks
    private ImageView ivTravelLogo;
    private TextView tvTravelText, tvTravelDev;

    // Animations
    Animation logoAnimation, textAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        // init animation
        logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        textAnimation = AnimationUtils.loadAnimation(this, R.anim.text_animation);

        ivTravelLogo = findViewById(R.id.travel_logo);
        tvTravelText = findViewById(R.id.travel_text);
        tvTravelDev = findViewById(R.id.travel_dev);

        // set animation
        ivTravelLogo.setAnimation(logoAnimation);
        tvTravelText.setAnimation(textAnimation);
        tvTravelDev.setAnimation(textAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashscreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIMEOUT);
    }
}
