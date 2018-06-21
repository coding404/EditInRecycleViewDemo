package com.example.liushu.editinrecycleviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;

public class EditAdapter extends RecyclerView.Adapter<SuperViewHolder> {
    //列表填充的数据
    private List<DataBean> mDatas;

    public EditAdapter(List<DataBean> datas) {
        mDatas = datas;
    }

    @NonNull
    @Override
    public SuperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_edit, parent, false);
        return new SuperViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SuperViewHolder holder, int position) {
        DataBean dataBean = mDatas.get(position);
        EditText etName = holder.getView(R.id.et_name);
        EditText etGrade = holder.getView(R.id.et_grade);
        EditText etRecord = holder.getView(R.id.et_record);

        if (etName.getTag() != null) {
            etName.removeTextChangedListener((TextWatcher) etName.getTag());
        }
        NameWatcher nameWatcher = new NameWatcher(dataBean);
        etName.addTextChangedListener(nameWatcher);
        etName.setTag(nameWatcher);
        etName.setText(dataBean.getStudentName());

        if (etGrade.getTag() != null) {
            etGrade.removeTextChangedListener((TextWatcher) etGrade.getTag());
        }
        GradeWatcher gradeWatcher = new GradeWatcher(dataBean);
        etGrade.addTextChangedListener(gradeWatcher);
        etGrade.setTag(gradeWatcher);
        etGrade.setText(dataBean.getStudentGrade());

        if (etRecord.getTag() != null) {
            etRecord.removeTextChangedListener((TextWatcher) etRecord.getTag());
        }
        RecordWatcher recordWatcher = new RecordWatcher(dataBean);
        etRecord.addTextChangedListener(recordWatcher);
        etRecord.setTag(recordWatcher);
        etRecord.setText(dataBean.getStudentRecord());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}
