package com.example.mylogin;

//import com.example.askmeshowme.About;
//import com.example.askmeshowme2.Prefs;
//import com.example.askmeshowme2.Video;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MyLogin extends Activity implements OnClickListener {

    private static final String TAG = "My Login";
    //private String selection = "";
    private Menu myMenu = null;
    //private MyLogin askme = new MyLogin();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG," onCreate() ...");
        setContentView(R.layout.main);

        TextView watch1 = (TextView)findViewById(R.id.txt1);
        //TextView watch2 = (TextView)findViewById(R.id.txt2);
        watch1.setSelected(true);
        watch1.setEnabled(true);
        watch1.setFocusable(true);
        //watch2.setSelected(true);
        //watch2.setEnabled(true);
        //watch2.setFocusable(true);

        View submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(this);

    }

    public void onClick(View v) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.greetingsRadioGroup);
        int checkedRadioButton = radioGroup.getCheckedRadioButtonId();

        //EditText usern = (EditText) findViewById(R.id.username);
        EditText passw = (EditText) findViewById(R.id.password);
//      EditText lname = (EditText) findViewById(R.id.lastname);
//      EditText add = (EditText) findViewById(R.id.address);
//      EditText prov = (EditText) findViewById(R.id.province);
//      EditText count = (EditText) findViewById(R.id.country);
//      EditText pcode = (EditText) findViewById(R.id.postalcode);
        String spassw = passw.getText().toString();
//      String slname = lname.getText().toString();
//      String sadd = add.getText().toString();
//      String sprov = prov.getText().toString();
//      String scount = count.getText().toString();
//      String spcode = pcode.getText().toString();

//      switch (checkedRadioButton) {
//        case R.id.mrButton : 
//                selection = "M";
//            break;
//        case R.id.msButton : 
//                selection = "Ms";
//                break;
//        case R.id.mrsButton : 
//                selection = "Mrs";
//                break;
//        case R.id.drButton : 
//                selection = "Dr";
//                break;
//      }

        switch(v.getId()){
            case R.id.submit_button:
                Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
                findViewById(R.id.password).startAnimation(shake);
                //findViewById(askme).startAnimation(shake);

                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Log.i(TAG,"MyLogin onCreateOptionsMenu from XML file");

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        myMenu = menu;

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_list_animation:
                startActivity(new Intent(this, ViewAnimationActivity.class));
                break;
        }

        return true;
    }
}
