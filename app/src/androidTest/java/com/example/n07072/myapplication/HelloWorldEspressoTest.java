package com.example.n07072.myapplication;

import android.support.test.espresso.assertion.ViewAssertions;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by n07072 on 28.01.15.
 */

@LargeTest
public class HelloWorldEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public HelloWorldEspressoTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testListGoesOverTheFold() {
        onView(withText("Hello world")).check(ViewAssertions.matches(isDisplayed()));
    }
}
