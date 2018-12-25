package in.hotels4you.www.hotels4you;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtpActivity extends AppCompatActivity {

    Button sendOtp;
    EditText PhoneNumber;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        sendOtp = findViewById(R.id.otp_button);
        PhoneNumber = findViewById(R.id.phone_number_id);

        sendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = PhoneNumber.getText().toString();

                if(number.isEmpty() || number.length()<10)
                {
                    PhoneNumber.setError("Enter a valid number");
                    PhoneNumber.requestFocus();
                    return;

                }


                Intent intent1 = getIntent();
                String id = intent1.getStringExtra("id");

                Intent intent = new Intent(getApplicationContext(),VerifyActivity.class);
                intent.putExtra("number",number);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });


    }
}
