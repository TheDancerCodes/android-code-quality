package com.thedancercodes.android_code_quality;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * This is the Main Activity.
 */
public class MainActivity extends AppCompatActivity {

    TextView mTextMessage;

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*
           BONUS: Strict Mode

           StrictMode is a developer tool that helps prevent developers of your project doing any
           accidental flash I/O or network I/O on the main thread, because this can lead to the app
           being sluggish or unresponsive.

           It also helps in preventing ANR (App Not Responding) dialogs from showing up.
           With StrictMode issues corrected, your app will become more responsive and the user will
           enjoy a smoother experience.

         */

//        if (BuildConfig.DEBUG) {
//            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy().Builder()
//                    .detectDiskReads()
//                    .detectDiskWrites()
//                    .detectNetwork()  // or .detectAll() for all detectable problems
//                    .penaltyLog()  // Log detected violations to the system log.
//                    .build());
//            StrictMode.setVmPolicy(new StrictMode.VmPolicy().Builder()
//                    .detectLeakedSqlLiteObjects()
//                    .detectLeakedClosableObjects()
//                    .penaltyLog()
//                    .penaltyDeath()  // Crashes the whole process on violation.
//                    .build());
//
//        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
