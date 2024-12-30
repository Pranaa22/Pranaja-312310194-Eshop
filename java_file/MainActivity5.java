package id.co.eshop;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    private LinearLayout back_ic;
    private ImageView rightbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        rightbutton1 = findViewById(R.id.rightbutton1);


        rightbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveButton("Back");

                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }

    private void setActiveButton(String buttonName) {
        if (buttonName.equals("Back")) {
            rightbutton1.setColorFilter(Color.RED);
        }
    }
}
