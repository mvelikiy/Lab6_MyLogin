package com.example.mylogin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ViewAnimationActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        setupListView();
    }

    private void setupListView() {
        String[] listItems = new String[] {
                "EditText Shake Animation", "ListView control", "Options Menu",
                "Marquee TextView", "Intents", "This is just the beginning....",
        };

        ArrayAdapter<String> listItemAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        ListView lv = (ListView)this.findViewById(R.id.list_view_id);
        lv.setAdapter(listItemAdapter);

        animateListView();
    }

    private void animateListView() {
        Log.d("h","animate list view");
        ListView lv = (ListView)this.findViewById(R.id.list_view_id);
        float cx = (float)(lv.getWidth()/2.0);
        float cy = (float)(lv.getHeight()/2.0);
//        lv.startAnimation(new ViewAnimation(cx, cy));
//        lv.startAnimation(new ViewAnimation1(cx, cy));
        lv.startAnimation(new ViewAnimation2());
//        lv.startAnimation(new ViewAnimation3());
    }
}
