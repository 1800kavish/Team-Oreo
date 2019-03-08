package com.example.android.availgovernmentschemes;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper view_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });
        int images[] = {R.drawable.govt1,R.drawable.govt2,R.drawable.govt3};
        view_flipper = findViewById(R.id.v_flipper);

        for (int image:images){
            imageFlipper(image);
        }
    }
    public void imageFlipper(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        view_flipper.addView(imageView);
        view_flipper.setFlipInterval(4000);
        view_flipper.setAutoStart(true);
        view_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        view_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
