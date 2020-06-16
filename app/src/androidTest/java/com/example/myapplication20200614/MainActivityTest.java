package com.example.myapplication20200614;

import androidx.test.rule.ActivityTestRule;
//import androidx.test.filters.LargeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

//
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

//@RunWith(AndroidJUnit4.class)
//@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

//    @Test
//    public ActivityTestRule<MainActivity> getmActivityRule() {
//        return mActivityRule;
//    }

    @Test
    public void onClickToSecond(){
//        mActivityRule.getActivity().finish();

        //firstFragment editText へ入力 → secondFragment へ遷移
        onView(withId(R.id.edit_number)).perform(click()); //click editText
        //onView(withText(R.id.edit_number)).perform(replaceText(String.valueOf(1))); //←これは落ちる。
        onView(withHint("数値入力")).perform(replaceText(String.valueOf(1))); //←こちらは大丈夫
        onView(withId(R.id.button_to_second)).perform(click());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void onClickToThird(){
//        mActivityRule.getActivity().finish();

        //firstFragment third ボタンクリック
        onView(withId(R.id.button_to_third)).perform(click());
    }

}