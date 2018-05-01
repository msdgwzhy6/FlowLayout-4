package com.cxz.flowlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.cxz.flowlayoutlib.FlowAdapter;
import com.cxz.flowlayoutlib.FlowLayout;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private FlowLayout flow_layout;

    private LayoutInflater mLayoutInflater;

    private String[] mData = {"Java", "C++", "Python", "JavaScript", "Hello", "Android", "Weclome Hi ", "Button", "TextView", "Hello",
            "Android", "Welcome", "Button ImageView", "TextView", "Helloworld", "Android", "Welcome Hello", "Button Text"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flow_layout = findViewById(R.id.flow_layout);
        mLayoutInflater = LayoutInflater.from(this);

        flow_layout.setAdapter(new FlowAdapter(Arrays.asList(mData)) {
            @Override
            public View getView(int position) {
                View item = mLayoutInflater.inflate(R.layout.item, null);
                TextView tvAttrTag = item.findViewById(R.id.tv_attr_tag);
                tvAttrTag.setText(mData[position]);
                return item;
            }
        });


    }
}
