package com.zhihuishu.innovationcourse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cong.wang on 2017/3/1.
 */

public class TeacherAdapter extends ArrayAdapter<Teacher>{
    public TeacherAdapter(Context context, int resource, List<Teacher> object){
        super(context, resource, object);
    }

    @Override
    public View getView(int positon, View convertView, ViewGroup parent){
        //获取老师数据
        Teacher teacher = getItem(positon);
        //创建布局
        View oneTeacherView = LayoutInflater.from(getContext()).inflate(R.layout.teacher_item, parent, false);

        //获取mageView和TextView
        ImageView imageView = (ImageView) oneTeacherView.findViewById(R.id.teacher_small_imageView);
        TextView textView = (TextView) oneTeacherView.findViewById(R.id.teacher_name_textView);

        //根据老师数据设置ImageVew和TextView的展现
        imageView.setImageResource(teacher.getImageId());
        textView.setText(teacher.getName());


        return oneTeacherView;
    }
}
