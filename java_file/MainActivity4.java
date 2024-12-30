package id.co.eshop;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private LinearLayout homeButton, searchButton, products, ic_back;
    private ImageView iconHome, iconSearch, product1, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        homeButton = findViewById(R.id.homeButton);
        searchButton = findViewById(R.id.searchButton);
        iconHome = findViewById(R.id.icon_home);
        iconSearch = findViewById(R.id.icon_search);
        product1 = findViewById(R.id.product1);
        back_btn = findViewById(R.id.back_btn);



            homeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setActiveButton("home");
                    Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                    startActivity(intent);
                }
            });



            searchButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setActiveButton("search");
                    // Disesuaikan jika MainActivity4 adalah target yang tepat
                    Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
                    startActivity(intent);
                }
            });


            product1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setActiveButton("product1");
                    Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                    startActivity(intent);
                }
            });

            back_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setActiveButton("BackBTN");
                    Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
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
