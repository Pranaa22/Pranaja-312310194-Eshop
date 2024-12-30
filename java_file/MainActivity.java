package id.co.eshop;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Pindah ke HomeActivity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish(); // Mengakhiri aktivitas ini agar tidak kembali ke loading screen
            }
        }, 1000); // 3000 ms = 3 detik
    }
}