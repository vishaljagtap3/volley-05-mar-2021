package in.bitcode.volleydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);


        Picasso.get()
                .load("https://bitcode.in/images/gallery/bitcode_galary_iphone_app_development_1.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .rotate(20)
                .into(img);


        //RequestQueue requestQueue = Volley.newRequestQueue(this);
        /*MyRequestQueueSingleton.getRequestQueue(this);


        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                "url",
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                    }
                },
                new ErrorListener()
        );
        //requestQueue.add(jsonArrayRequest);
        MyRequestQueueSingleton.getRequestQueue(this)
                .add(jsonArrayRequest);
*/
        /*
        JSONObject inputJson = new JSONObject();


        JsonObjectRequest jsonObjectRequest =
                new JsonObjectRequest(
                        Request.Method.GET,
                        "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=2500&type=restaurant&keyword=cruise&key=AIzaSyAkFMmA6Qr2tGmZhTYtFxsUq0XeXcVJemE",
                        null,
                        new JSONObjectResponseListener(),
                        new ErrorListener()
                );
        requestQueue.add(jsonObjectRequest);
        */

        /*
        StringRequest stringRequest =
                new StringRequest(
                        Request.Method.GET,
                        "https://bitcode.in",
                        new StringResponseListener(),
                        new ErrorListener()
                );

        requestQueue.add(stringRequest);*/
    }

    class JSONObjectResponseListener implements Response.Listener<JSONObject> {
        @Override
        public void onResponse(JSONObject response) {
            mt(response.toString());
        }
    }

    class StringResponseListener implements Response.Listener<String> {
        @Override
        public void onResponse(String response) {
            mt(response);
        }
    }

    class ErrorListener implements Response.ErrorListener {
        @Override
        public void onErrorResponse(VolleyError error) {

        }
    }

    private void mt(String text) {
        Log.e("tag", text);
    }
}