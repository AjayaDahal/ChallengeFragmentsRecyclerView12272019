package com.example.challengefragmentsrecyclerview12272019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class personAdapter extends RecyclerView.Adapter<personAdapter.ViewHolder> {

    private ArrayList<Person> people;
    ItemClicked activity;

    public interface ItemClicked{
        void onItemClicked(int index);

    }
   public personAdapter(Context context, ArrayList<Person> list){
        people = list;
        activity = (ItemClicked)context;
   }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvName;
        TextView tvModelSmall;
        ImageView ivLogoSmall;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvModelSmall = itemView.findViewById(R.id.tvMakeSmall);
            ivLogoSmall = itemView.findViewById(R.id.ivLogoSmall);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(people.indexOf(v.getTag()));
                }
            });
        }
    }


    @NonNull
    @Override
    public personAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull personAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(people.get(position));
        holder.tvName.setText(people.get(position).getName());
        holder.tvModelSmall.setText(people.get(position).getMake());

        if(people.get(position).getModel()=="Nissan"){
            holder.ivLogoSmall.setImageResource(R.drawable.nissan);
        }
        else if (people.get(position).getModel()=="Mercedez"){
            holder.ivLogoSmall.setImageResource(R.drawable.mercedes);
        }
        else{
            holder.ivLogoSmall.setImageResource(R.drawable.volkswagen);
        }

    }

    @Override
    public int getItemCount() {
        return ApplicationClass.people.size();
    }
}
