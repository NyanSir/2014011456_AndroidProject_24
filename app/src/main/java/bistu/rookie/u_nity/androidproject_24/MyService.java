package bistu.rookie.u_nity.androidproject_24;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

        private static final String TAG = "ServiceLog";

        public MyService() {
        }

        @Override
        public void onCreate() {
            Log.i(TAG, "Execute onCreate()");
            super.onCreate();
        }

        @Override
        public int onStartCommand(Intent intent, int flags, int startId) {
            Log.i(TAG, "Execute onStartCommand()");
            int n = intent.getIntExtra("num", 0);
            Log.i(TAG, "Gets integer: " + n);
            return super.onStartCommand(intent, flags, startId);
        }

        @Override
        public void onDestroy() {
            Log.i(TAG, "Execute onDestroy()");
            super.onDestroy();
        }

        @Override
        public IBinder onBind(Intent intent) {
            Log.i(TAG, "Execute onBind()");
            return null;
        }

        @Override
        public boolean onUnbind(Intent intent) {
            Log.i(TAG, "Execute onUnbind()");
            return super.onUnbind(intent);
        }

}
