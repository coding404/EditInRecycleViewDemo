package com.example.liushu.editinrecycleviewdemo;

import android.text.Editable;
import android.text.TextWatcher;

public class GradeWatcher implements TextWatcher {

    private DataBean mData;

    public GradeWatcher(DataBean data) {
        mData = data;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        String s = charSequence.toString();
        mData.setStudentGrade(s);
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
