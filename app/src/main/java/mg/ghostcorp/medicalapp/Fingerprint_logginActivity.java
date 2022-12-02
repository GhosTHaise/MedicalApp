package mg.ghostcorp.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class Fingerprint_logginActivity extends AppCompatActivity {

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
}