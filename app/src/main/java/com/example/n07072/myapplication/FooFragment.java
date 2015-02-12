package com.example.n07072.myapplication;

import android.app.Fragment;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by n07072 on 09.02.15.
 */
public class FooFragment extends Fragment {
    private View rootView;
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.foo_fragment, container, false);

        View button = rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });

        return rootView;
    }

    //Called when user press the send button
    public void sendMessage() {
        new LongOperation().execute();

    }

    private class LongOperation extends AsyncTask<String, Void, String> {

        @Override //må registrere idlingResource så den venter (galleryView er async)
        protected String doInBackground(String... params) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Do something in response to button
            Intent intent = new Intent(getActivity(), DisplayMessageActivity.class);
            EditText editText = (EditText) rootView.findViewById(R.id.edit_message);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);

            return null;
        }
    }
}
