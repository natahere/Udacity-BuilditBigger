package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;
import org.junit.Test;
import java.util.concurrent.ExecutionException;


/**
 * Created by Natarajan on 7/6/2016.
 */


public class AsyncSuccessTest extends ApplicationTestCase<Application> {

    public AsyncSuccessTest() {
        super(Application.class);
    }

    @Test
    public void testonPostExecute() throws ExecutionException, InterruptedException {
        assertNotNull(new MyAsyncTask().execute(getContext()).get());

    }
}

/*

Test Verified

Testing started at 6:54 PM ...

07/06 18:54:22: Launching AsyncSuccessTest
No apk changes detected since last installation, skipping installation of G:\Patterns\NanoDegree\FinalProject\app\build\outputs\apk\app-paid-debug.apk
$ adb shell am force-stop com.udacity.gradle.builditbigger.paid
No apk changes detected since last installation, skipping installation of G:\Patterns\NanoDegree\FinalProject\app\build\outputs\apk\app-paid-debug-androidTest-unaligned.apk
$ adb shell am force-stop com.udacity.gradle.builditbigger.paid.test
Running tests

$ adb shell am instrument -w -r   -e debug false -e class com.udacity.gradle.builditbigger.AsyncSuccessTest com.udacity.gradle.builditbigger.paid.test/com.android.test.runner.MultiDexTestRunner
Client not ready yet..Test running started
Tests ran to completion.


 */