package vn.edu.ntu.tunglam.nguyentunglam_59131156_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.nguyentunglam_59131156_simplewidget.R;

public class MainActivity extends AppCompatActivity {
    EditText edtTen,edtNs,edtStk;
    RadioGroup grb;
    RadioButton grb1,grb2;
    Button btn;
    CheckBox cb1,cb2,cb3,cb4,cb5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }

    private void addView()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNs = findViewById(R.id.edtNs);
        edtStk = findViewById(R.id.edtStk);
        grb = findViewById(R.id.grb);
        btn = findViewById(R.id.btn);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        grb1 = findViewById(R.id.grb1);
        grb2 = findViewById(R.id.grb2);



    }
    private void addEvents()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                String text = "";

                text +="Tên : "+edtTen.getText().toString();
                text +="\nNgày Sinh : "+edtNs.getText().toString();

                switch (grb.getCheckedRadioButtonId())
                {
                    case R.id.grb1 :  text+="\nGiới Tính : Nam"; break;
                    case R.id.grb2 :  text+="\nGiới Tính : Nữ"; break;
                }
                text +="\nSở thích : ";
                if(cb1.isChecked()) text +=cb1.getText().toString()+"; ";
                if(cb2.isChecked()) text +=cb2.getText().toString()+"; ";
                if(cb3.isChecked()) text +=cb3.getText().toString()+"; ";
                if(cb4.isChecked()) text +=cb4.getText().toString()+"; ";
                if(cb5.isChecked()) text +=cb5.getText().toString()+"; ";
                text+= edtStk.getText().toString();


                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });
    }

}
