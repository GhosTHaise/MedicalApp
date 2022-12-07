package mg.ghostcorp.medicalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class Fingerprint_logginActivity extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fingerprint_loggin);

        LottieAnimationView fingerprint = findViewById(R.id.finger_btn);

        fingerprint.setOnClickListener(v -> {
            fingerprint.playAnimation();
        });
    }

    public boolean onTouchEvent(@NonNull MotionEvent touchEvent){
        switch (touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 > x2){
                    startActivity(new Intent(this,RegistrationActivity.class));
                    finish();
                }
                break;
        }
        return false;
    }
}