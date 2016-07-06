package com.udacity.gradle.builditbigger;

/**
 * Created by Natarajan on 7/6/2016.
 */
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.jokedisplay.JokeDisplay;
import com.example.natarajan.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

public class MyAsyncTask extends AsyncTask<Context, Void, String> {

    private static MyApi myApiService = null;
    private Context context;

    @Override
    protected String doInBackground(Context... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://resonant-tract-136423.appspot.com/_ah/api/");

            myApiService = builder.build();
        }

        context = params[0];
        try {
            return myApiService.sayHi().execute().getData();

        } catch (IOException e) {
            return e.getLocalizedMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        Intent intent = new Intent(context, JokeDisplay.class);
        intent.putExtra("Joke",result);
        context.startActivity(intent);
    }
}