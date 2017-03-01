package com.zhihuishu.innovationcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cong.wang on 2017/3/1.
 */

public class Teacher {

    private String name;
    private String desc;
    private int imageId;

    //构造函数
    public Teacher(String name, String desc, int imageId) {
        this.name = name;
        this.desc = desc;
        this.imageId = imageId;
    }

    public static List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("阿笠博士", "博士老头，经常研发奇怪工具", R.drawable.albs));
        teachers.add(new Teacher("柯南", "名侦探，破获多起大案", R.drawable.kn));
        teachers.add(new Teacher("小兰", "柯南女朋友", R.drawable.xl));
        return teachers;
    }

    //setter、getter方法，获取属性
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }

    public int getImageId(){
        return imageId;
    }
    public void setImageId(int imageId){
        this.imageId = imageId;
    }

}
