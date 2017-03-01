package com.zhihuishu.innovationcourse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化一个Adapter
        //ArrayAdapter<Teacher> teacherAdapter = new ArrayAdapter<Teacher>(this,android.R.layout.simple_list_item_1,Teacher.getAllTeachers());
        TeacherAdapter teacherAdapter = new TeacherAdapter(this, R.layout.teacher_item,Teacher.getAllTeachers());
        //通过Id获取listVIew
        ListView listView = (ListView)findViewById(R.id.teacher_listView);

    //设置listVew的Adapter
        listView.setAdapter(teacherAdapter);
    }
}
