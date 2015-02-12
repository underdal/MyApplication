package com.example.n07072.myapplication;

import android.support.test.espresso.assertion.ViewAssertions;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by n07072 on 28.01.15.
 */
@LargeTest
public class ButtonTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public ButtonTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }


    public void testInsertText() {
        onView(withId(R.id.edit_message)).perform(typeText("Hei"));
        closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
      //  onView(withText("Jens")).check(matches(isDisplayed()));
        onView(withId(R.id.custLabel1)).check(matches(withText("Jens Hei")));
    }


//    public void testButton1(){
//        onView(withId(R.id.button)).perform(click());
//
//    }
}
