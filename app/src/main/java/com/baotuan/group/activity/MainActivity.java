package com.baotuan.group.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.baotuan.group.R;
import com.baotuan.group.adapter.DrawerListAdapter;


public class MainActivity extends ActionBarActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private RecyclerView mDrawerList;
    private DrawerListAdapter mDrawerListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initViews();


//        SDKInitializer.initialize(getApplicationContext());
//
//        Intent intent = getIntent();
//        if (intent.hasExtra("x") && intent.hasExtra("y")) {
//            // 当用intent参数时，设置中心点为指定点
//            Bundle b = intent.getExtras();
//            LatLng p = new LatLng(b.getDouble("y"), b.getDouble("x"));
//            mMapView = new MapView(this,
//                    new BaiduMapOptions().mapStatus(new MapStatus.Builder()
//                            .target(p).build()));
//        } else {
//            mMapView = new MapView(this, new BaiduMapOptions());
//        }
//        setContentView(mMapView);
//        mBaiduMap = mMapView.getMap();
    }

    private void initViews() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, mDrawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mDrawerList = (RecyclerView) findViewById(R.id.drawer_list);
        mDrawerList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mDrawerList.setHasFixedSize(true);
        mDrawerListAdapter = new DrawerListAdapter(getResources().getStringArray(R.array.drawer_item));
        mDrawerList.setAdapter(mDrawerListAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.:
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

}
