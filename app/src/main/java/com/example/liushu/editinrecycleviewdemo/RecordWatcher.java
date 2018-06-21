package com.example.liushu.editinrecycleviewdemo;

import android.text.Editable;
import android.text.TextWatcher;

public class RecordWatcher implements TextWatcher {

    private DataBean mData;

    public RecordWatcher(DataBean data) {
        mData = data;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        String s = charSequence.toString();
        mData.setStudentRecord(s);
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
