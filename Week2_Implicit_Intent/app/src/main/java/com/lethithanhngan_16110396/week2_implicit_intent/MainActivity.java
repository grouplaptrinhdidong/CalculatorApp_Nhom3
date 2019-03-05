package com.lethithanhngan_16110396.week2_implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // The method is called when the user clicks on "Go Google" button.
    public void goGoogle(View view)  {
        String url="http://google.com";

        // An implicit intent, request a URL.
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);
    }

    // The method is called when the user clicks on "Send Email" button.
    public void sendEmail(View view)  {

        // List of recipients
        String[] recipients=new String[]{"friendemail@gmail.com"};


        String subject="Hi, how are you!";


        String content ="This is my test email";

        Intent intentEmail = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        intentEmail.putExtra(Intent.EXTRA_EMAIL, recipients);
        intentEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
        intentEmail.putExtra(Intent.EXTRA_TEXT, content);

        intentEmail.setType("text/plain");

        startActivity(Intent.createChooser(intentEmail, "Choose an email client from..."));
    }



}