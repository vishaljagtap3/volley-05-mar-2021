package in.bitcode.volleydemo;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MyRequestQueueSingleton {
    private static RequestQueue requestQueue = null;

    private MyRequestQueueSingleton() {
    }

    public static RequestQueue getRequestQueue(Context context) {
        if(requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context);
        }
        return requestQueue;
    }
}
