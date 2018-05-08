package com.example.lovkimlinh.testing;

import android.widget.TextView;

public class GiveData {
  private String text_name;
  private String text_desc;
  private String img_profile;

    public GiveData(String text_name, String text_desc,String img_profile) {
        this.text_name = text_name;
        this.text_desc = text_desc;
        this.img_profile=img_profile;
    }

    public String getName() {
        return text_name;
    }

    public void setName(String name) {
        this.text_name = text_name;
    }
    public String getProfile(){return img_profile; }
    public String getDesc() {
        return text_desc;
    }

    public void setDesc(String desc) {
        this.text_desc = text_desc;
    }
}
