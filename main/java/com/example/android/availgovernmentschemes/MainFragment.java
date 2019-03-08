package com.example.android.availgovernmentschemes;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    ViewFlipper view_flipper;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);
        android.support.v4.view.PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) rootView.findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        TextView numbers = (TextView)rootView.findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                startActivity(intent);
            }
        });
        int images[] = {R.drawable.govt1,R.drawable.govt2,R.drawable.govt3};
        view_flipper = rootView.findViewById(R.id.v_flipper);

        for (int image:images){
            imageFlipper(image);
        }
        return rootView;
    }
    public void imageFlipper(int image){
        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(image);
        view_flipper.addView(imageView);
        view_flipper.setFlipInterval(4000);
        view_flipper.setAutoStart(true);
        view_flipper.setInAnimation(getActivity(),android.R.anim.slide_in_left);
        view_flipper.setOutAnimation(getActivity(),android.R.anim.slide_out_right);
    }

    }

}
