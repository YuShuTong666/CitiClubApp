package com.example.citiclubapp.data;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.citiclubapp.R;
import com.example.citiclubapp.data.model.InfoItem;
import com.example.citiclubapp.data.model.info_box_adapter;

import java.util.ArrayList;
import java.util.List;

public class LegalPersomCertificateActivity extends AppCompatActivity {
    private List<InfoItem> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal_persom_certificate);
        Button button = findViewById(R.id.back);
//        button.setBackground();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
//        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.certificate_title);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.certificate_title);
            actionBar.hide();
        }
        initList();
        RecyclerView recyclerView = findViewById(R.id.info_box_holder);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        info_box_adapter adapter = new info_box_adapter(list);
        recyclerView.setAdapter(adapter);
    }

    void initList(){
        //点击上传营业执照照片
        InfoItem item_title = new InfoItem("企业信息认证",3);
        list.add(item_title);
        InfoItem item0 = new InfoItem("营业执照","点击上传营业执照照片",2);
        list.add(item0);
        InfoItem item1 = new InfoItem("统一社会信用代码/注册号/组织机构代码","统一社会信用代码",1);
        list.add(item1);
        InfoItem item2 = new InfoItem("公司名称","公司名称",1);
        list.add(item2);
        InfoItem item3 = new InfoItem("工商注册号","工商注册号",1);
        list.add(item3);
        InfoItem item4 = new InfoItem("工商登记机关","工商登记机关",1);
        list.add(item4);
        InfoItem item5 = new InfoItem("登记状态","登记状态",1);
        list.add(item5);
        InfoItem item6 = new InfoItem("税务登记证号","税务登记证号",1);
        list.add(item6);
        InfoItem item7 = new InfoItem("公司地址","公司地址",1);
        list.add(item7);
        InfoItem item8 = new InfoItem("公司电话","公司电话",1);
        list.add(item8);
        InfoItem item9 = new InfoItem("法人身份证","点击上传身份证照（正面）",2);
        list.add(item9);
        //点击上传身份证照（正面）
        InfoItem item13 = new InfoItem("","点击上传身份证照片（反面）",2);
        list.add(item13);
        //点击上传身份证照片（反面）
        InfoItem item10 = new InfoItem("法人姓名","法人姓名",1);
        list.add(item10);
        InfoItem item11 = new InfoItem("法人证字号","法人证字号",1);
        list.add(item11);
        InfoItem item12 = new InfoItem("法人联系电话","法人联系电话",1);
        list.add(item12);
        InfoItem submit_button = new InfoItem("提交",4);
        list.add(submit_button);
    }

}
