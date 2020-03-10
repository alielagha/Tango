package com.example.tango.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.tango.Models.Slide;
import com.example.tango.R;
import com.example.tango.Adapters.SliderPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class AppTourActivity extends AppCompatActivity {

    private List<Slide> lstSlides;
    private ViewPager sliderpager;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_tour);

        sliderpager = findViewById(R.id.slider_pager);
        TabLayout indicator = findViewById(R.id.indicator);
        floatingActionButton = findViewById(R.id.floatingActionButton4);

        // prepare a list of slides ..
        lstSlides = new ArrayList<>();
        lstSlides.add(new Slide(R.drawable.tour_image_1, "Send Free Message", "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu consequat vitae."));
        lstSlides.add(new Slide(R.drawable.tour_image_2, "Connect Your Friend", "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu consequat vitae."));
        lstSlides.add(new Slide(R.drawable.tour_image_3, "Make Group Chat", "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu consequat vitae."));
        SliderPagerAdapter adapter = new SliderPagerAdapter(this, lstSlides);
        sliderpager.setAdapter(adapter);
        indicator.setupWithViewPager(sliderpager, true);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sliderpager.getCurrentItem() < lstSlides.size() - 1) {
                    sliderpager.setCurrentItem(sliderpager.getCurrentItem() + 1);
                } else {
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                }
            }
        });



    }


}
