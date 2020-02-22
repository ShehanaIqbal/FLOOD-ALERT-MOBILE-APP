package com.example.welcome;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class ResultAdaptor extends RecyclerView.Adapter<ResultAdaptor.ResultViewHolder> {
    private List<result> resultList;
    private Context context;

    public ResultAdaptor(List<result> resultList,Context context){
        this.context=context;
        this.resultList=resultList;
    }


    @NonNull
    @Override
    public ResultAdaptor.ResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new ResultViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultAdaptor.ResultViewHolder holder, int position) {
        result product = resultList.get(position);

        //binding the data with the viewholder views
        holder.water_level.setText(product.getWaterLevel());
        holder.description.setText(product.getDescription());
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    class ResultViewHolder extends RecyclerView.ViewHolder {

        TextView water_level,description;

        public ResultViewHolder(View itemView) {
            super(itemView);

            description = itemView.findViewById(R.id.description);
            water_level = itemView.findViewById(R.id.water_level);
        }
    }
}

