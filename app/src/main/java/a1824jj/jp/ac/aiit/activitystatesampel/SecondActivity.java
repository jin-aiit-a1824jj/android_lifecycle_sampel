package a1824jj.jp.ac.aiit.activitystatesampel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycle~";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.e("TAG", "**************** SecondActivity onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "**************** SecondActivity onStart()");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e("TAG", "**************** SecondActivity onPostCreate()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e("TAG", "**************** SecondActivity onPostResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "**************** SecondActivity onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "**************** SecondActivity onDestroy()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "**************** SecondActivity onPause()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG", "**************** SecondActivity onResume()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG", "**************** SecondActivity onRestart()");

    }
}
