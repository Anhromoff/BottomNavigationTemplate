package agolubeff.bottomnavigationtemplate.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import agolubeff.bottomnavigationtemplate.Fragment.Fragment1;
import agolubeff.bottomnavigationtemplate.Fragment.Fragment2;
import agolubeff.bottomnavigationtemplate.Fragment.Fragment3;
import agolubeff.bottomnavigationtemplate.Fragment.Fragment4;
import agolubeff.bottomnavigationtemplate.Fragment.Fragment5;
import agolubeff.bottomnavigationtemplate.R;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        InitBottomNavigation();
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.action_settings)
        {
            //startActivity(new Intent());
        }
        return true;
    }*/

    private void InitBottomNavigation()
    {
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                Fragment frag = null;

                switch (item.getItemId())
                {
                    case R.id.navigation_item_1:
                        frag = new Fragment1();
                        break;
                    case R.id.navigation_item_2:
                        frag = new Fragment2();
                        break;
                    case R.id.navigation_item_3:
                        frag = new Fragment3();
                        break;
                    case R.id.navigation_item_4:
                        frag = new Fragment4();
                        break;
                    case R.id.navigation_item_5:
                        frag = new Fragment5();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container, frag).commit();
                return true;
            }
        });

        navigation.setSelectedItemId(R.id.navigation_item_1);
    }

}
