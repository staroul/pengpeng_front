package com.greenarrow.staroul.chat_front;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;

//注册Activity
public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        final ImageView imageView_profile=(ImageView) findViewById(R.id.registration_profile);
        final EditText editText_mail=(EditText)findViewById(R.id.registration_mail);
        final EditText editText_password=(EditText)findViewById(R.id.registration_password);
        final EditText editText_password_again=(EditText)findViewById(R.id.registration_password_again);
        final EditText editText_nickname=(EditText)findViewById(R.id.registration_nickname);
        final EditText editText_gender=(EditText)findViewById(R.id.registration_gender);
        final RadioGroup radioGroup_gender=(RadioGroup)findViewById(R.id.registration_gender_radio);
        final EditText editText_birth=(EditText)findViewById(R.id.registration_birth);
        final EditText editText_introduction=(EditText)findViewById(R.id.registration_introduction);

        imageView_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_profile.setImageResource(R.drawable.profile);
            }
        });

        final Calendar calendar = Calendar.getInstance();
        editText_birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(RegistrationActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        calendar.set(year, monthOfYear, dayOfMonth);
                        editText_birth.setText(DateFormat.format("yyyy-MM-dd", calendar));
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
                dialog.show();
            }
        });

        editText_gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText_gender.setVisibility(View.GONE);
                radioGroup_gender.setVisibility(View.VISIBLE);
            }
        });



        final Button button=(Button)findViewById(R.id.registration_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(RegistrationActivity.this);
                alertDialog.setCancelable(true);
                alertDialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                if(editText_mail.getText().toString().isEmpty()||editText_password.getText().toString().isEmpty()
                        ||editText_password_again.getText().toString().isEmpty()||editText_nickname.getText().toString().isEmpty()
                        ||editText_birth.getText().toString().isEmpty()
                        ||editText_introduction.getText().toString().isEmpty()||radioGroup_gender.getCheckedRadioButtonId()<=0){
                    alertDialog.setTitle("请确认注册信息");
                    alertDialog.setMessage("请确认所有信息已经输入完成");
                    alertDialog.show();
                    return;
                }
                if(!editText_password.getText().toString().equals(editText_password_again.getText().toString())){
                    alertDialog.setTitle("请确认注册信息");
                    alertDialog.setMessage("两次输入的密码不相同，请确认后重新输入");
                    alertDialog.show();
                    return;
                }
                //判断邮箱是否输入正确

                String main=editText_mail.getText().toString();
                String password=editText_password.getText().toString();
                String nickname=editText_nickname.getText().toString();
                String birth=editText_birth.getText().toString();
                String introduce=editText_introduction.getText().toString();
                String gender;
                if((radioGroup_gender.getCheckedRadioButtonId())%2==0){
                    gender="女";
                }else{
                    gender="男";
                }

                Toast.makeText(RegistrationActivity.this,"注册成功，请登录",Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });

    }

}
