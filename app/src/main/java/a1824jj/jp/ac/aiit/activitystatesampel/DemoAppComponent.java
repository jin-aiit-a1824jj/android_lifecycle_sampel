package a1824jj.jp.ac.aiit.activitystatesampel;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class DemoAppComponent implements LifecycleObserver {

    private final String activityName;
    private static final String TAG = "LifeCycle";

    public DemoAppComponent(String activityName) {
        this.activityName = activityName;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected void onCreate(){
        Log.w("TAG", "**************** DemoAppComponent onCreate() invoked for" + activityName);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    protected void onStart(){
        Log.w("TAG", "**************** DemoAppComponent onStart() invoked for" + activityName);

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    protected void onResume(){
        Log.w("TAG", "**************** DemoAppComponent onResume() invoked for" + activityName);

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    protected void onPause(){
        Log.w("TAG", "**************** DemoAppComponent onPause() invoked for" + activityName);

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    protected void onStop(){
        Log.w("TAG", "**************** DemoAppComponent onStop() invoked for" + activityName);

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected void onDestroy(){
        Log.w("TAG", "**************** DemoAppComponent onDestroy() invoked for" + activityName);

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    protected void onAny(){
        Log.w("TAG", "**************** DemoAppComponent onAny() invoked for" + activityName);

    }
}
