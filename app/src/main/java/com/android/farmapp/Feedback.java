package com.android.farmapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by PRIYA on 6/6/2017.
 */

public class Feedback extends AppCompatActivity {

    private Button submit;
    private EditText emailId;
    private EditText phoneNumber;
    private EditText feedback;
    private EditText name;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        submit= (Button) findViewById(R.id.submit);
        emailId=(EditText) findViewById(R.id.emailId);
        phoneNumber=(EditText) findViewById(R.id.phoneNumber);
        feedback = (EditText) findViewById(R.id.feedback);
        name = (EditText) findViewById(R.id.name);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String userName = name.getText().toString();
                String userEmailId = emailId.getText().toString();
                String userNumber = phoneNumber.getText().toString();
                String userFeedback = feedback.getText().toString();

                if (!isValidEmail(emailId.getText().toString())) {
                    Toast.makeText(Feedback.this, "Enter Valid Email Id", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(name.getText())) {
                    Toast.makeText(Feedback.this, "Enter your name", Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(userEmailId)) {
                    Toast.makeText(Feedback.this, "Please enter Your Email Id", Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(userNumber)) {
                    Toast.makeText(Feedback.this, "Please enter Your Email Id", Toast.LENGTH_LONG).show();
                    return;
                }
                if (userNumber.length() != 10) {
                    Toast.makeText(Feedback.this, "Please enter valid Mobile Number", Toast.LENGTH_LONG).show();
                    return;
                }
                if(TextUtils.isEmpty(userFeedback)){
                    Toast.makeText(Feedback.this, "Please enter your feedback", Toast.LENGTH_LONG).show();
                    return;
                }
                if (!userName.equals(null) && !userEmailId.equals(null) && !userFeedback.equals(null) && !userNumber.equals(null)) {

                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{"chethanacsp@gmail.com"});
                    email.putExtra(Intent.EXTRA_SUBJECT, "feedback");
                    email.putExtra(Intent.EXTRA_TEXT, userFeedback + "\n " + "\n" + userName + "\n" + userEmailId + "\n" + userNumber);

                    //need this to prompts email client only
                    email.setType("message/rfc822");

                    startActivity(Intent.createChooser(email, "Choose an Email client :"));
                } else {
                    Toast.makeText(Feedback.this, "Please write your feedback", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public final static boolean isValidEmail(CharSequence target) {

            return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();

    }
    private boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();
    }
}
