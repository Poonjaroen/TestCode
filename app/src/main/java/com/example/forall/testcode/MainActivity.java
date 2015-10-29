package com.example.forall.testcode;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OneFragment.OnFragmentInteractionListener {

    int i = 0;

    String name = "TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
//            FragmentManager fm = getSupportFragmentManager();
//            for (int i = 0; i < 10; i++) {
//                FragmentTransaction ft = fm.beginTransaction();
//                OneFragment oneFragment = OneFragment.newInstance("Param : " + i, "");
//                ft.replace(R.id.fragment_container, oneFragment, oneFragment.getClass().getSimpleName());
//                ft.addToBackStack(null);
//                ft.commit();
//            }
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
    }

    public class PagerAdapter extends FragmentStatePagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return OneFragment.newInstance("OneFragment", "");
                case 1:
                    return TwoFragment.newInstance("TwoFragment", "");
                case 2:
                    return ThreeFragment.newInstance("ThreeFragment", "");
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    @Override
    public void onFragmentInteraction(@NonNull Uri uri) {
        Toast.makeText(this, "TEST", Toast.LENGTH_LONG).show();
    }
}
