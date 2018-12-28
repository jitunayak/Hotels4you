package in.hotels4you.www.hotels4you;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.bottomnavigation.LabelVisibilityMode;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import in.hotels4you.www.hotels4you.fragments.Cars;
import in.hotels4you.www.hotels4you.fragments.HelpLine;
import in.hotels4you.www.hotels4you.fragments.Hotels;
import in.hotels4you.www.hotels4you.fragments.Profile;
import in.hotels4you.www.hotels4you.fragments.Food;

public class HomeActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Hotels hotels = new Hotels();
            Cars cars = new Cars();
            HelpLine helpLine = new HelpLine();
            Profile profile = new Profile();
            Food food = new Food();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            FrameLayout fl = (FrameLayout) findViewById(R.id.hotel_fragment);

            switch (item.getItemId()) {
                case R.id.navigation_hotels:
                    fl.removeAllViews();
                    transaction.replace(R.id.hotel_fragment, hotels);
                    transaction.commit();
                    return true;

                case R.id.navigation_cars:
                    fl.removeAllViews();
                    transaction.replace(R.id.hotel_fragment, cars);
                    transaction.commit();
                    return true;

                case R.id.navigation_food:
                    fl.removeAllViews();
                    transaction.replace(R.id.hotel_fragment, food );
                    transaction.commit();
                    return true;

                case R.id.navigation_helpline:
                    fl.removeAllViews();
                    transaction.replace(R.id.hotel_fragment, helpLine);
                    transaction.commit();
                    return true;

                case R.id.navigation_profile:
                    fl.removeAllViews();
                    transaction.replace(R.id.hotel_fragment, profile );
                    transaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Hotels hotels = new Hotels();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.hotel_fragment, hotels);
        transaction.commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
