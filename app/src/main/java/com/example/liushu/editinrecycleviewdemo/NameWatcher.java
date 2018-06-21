package com.example.liushu.editinrecycleviewdemo;

import android.text.Editable;
import android.text.TextWatcher;

public class NameWatcher implements TextWatcher {


    private DataBean mData;

    public NameWatcher(DataBean data) {
        mData = data;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        String s = charSequence.toString();
        mData.setStudentName(s);
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}