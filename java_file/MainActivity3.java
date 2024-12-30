package id.co.eshop;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private LinearLayout homeButton, searchButton;
    private ImageView iconHome, iconSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        homeButton = findViewById(R.id.homeButton);
        searchButton = findViewById(R.id.searchButton);

        iconHome = findViewById(R.id.icon_home);
        iconSearch = findViewById(R.id.icon_search);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveButton("home");
                Intent intent = new Intent(MainActivity3.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveButton("search");
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class); // Pastikan MainActivity5 ada.
                startActivity(intent);
            }
        });
    }

    private void setActiveButton(String active) {
        if ("home".equals(active)) {
            iconHome.setColorFilter(Color.RED);
            iconSearch.setColorFilter(Color.GRAY);
        } else if ("search".equals(active)) {
            iconHome.setColorFilter(Color.GRAY);
            iconSearch.setColorFilter(Color.RED);
        }
    }
}
