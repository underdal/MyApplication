package com.example.n07072.myapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by n07072 on 28.01.15.
 */
@LargeTest
public class ButtonTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public ButtonTest() {
        super("com.example.n07072.myapplication", MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }


    public void testInsertText() {
        onView(withId(R.id.edit_message)).perform(typeText("Hei"));
        onView(withId(R.id.button)).perform(click());
    }

//    public void testButton1(){
//        onView(withId(R.id.button)).perform(click());
//
//    }
}
