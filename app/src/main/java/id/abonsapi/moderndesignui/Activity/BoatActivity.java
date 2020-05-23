package id.abonsapi.moderndesignui.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import id.abonsapi.moderndesignui.R;

public class BoatActivity extends AppCompatActivity {
    private ImageButton ibBack;
    private TextView tvBrand, tvSlogan;
    private ImageView ivLogo;
    private Animation logoAnimation, textAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat);

        ibBack = findViewById(R.id.ib_back);
        tvBrand = findViewById(R.id.tv_brand);
        tvSlogan = findViewById(R.id.tv_slogan);
        ivLogo = findViewById(R.id.iv_logo);
        logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_content_animation);
        textAnimation = AnimationUtils.loadAnimation(this, R.anim.text_content_animation);
        ivLogo.setAnimation(logoAnimation);
        tvBrand.setAnimation(textAnimation);
        tvSlogan.setAnimation(textAnimation);

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BoatActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
