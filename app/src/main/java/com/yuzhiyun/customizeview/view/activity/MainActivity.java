package com.yuzhiyun.customizeview.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.yuzhiyun.customizeview.R;
import com.yuzhiyun.customizeview.view.base.BaseActivity;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener{
    ListView lvView;
    String[] viewName = {"初级自定义", "粒子雨效果","学习自定义ViewGroup","自定义FlowLayoutActivity"};
//    在 startActivity(new Intent(context,classArrayList.get(position)));被用到
    ArrayList<Class> classArrayList=new ArrayList();
    @Override
    protected void setLayoutView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void findView() {
        lvView = (ListView) findViewById(R.id.lvView);
    }

    @Override
    protected void initOther() {



        classArrayList.add(TitleViewActivity.class);
        classArrayList.add(RainActivity.class);
        classArrayList.add(LearnGroupViewctivity.class);
        classArrayList.add(FlowLayoutActivity.class);
        lvView.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, viewName));
    }

    @Override
    protected void setListener() {
        lvView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(context,classArrayList.get(position)));
    }
}
