package mg.ghostcorp.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton connexion_btn,registration_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Full screen window
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connexion_btn = findViewById(R.id.home_connexion);
        registration_btn =  findViewById(R.id.home_registration);


        connexion_btn.setOnClickListener(v -> {
            startActivity(new Intent(this,Fingerprint_logginActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        });

        registration_btn.setOnClickListener(v -> {
            startActivity(new Intent(this,RegistrationActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        });

    }
}