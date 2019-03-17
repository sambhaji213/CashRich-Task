package com.sk.cashrichtask.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sk.cashrichtask.R;
import com.sk.cashrichtask.model.Item;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Item> items;
    private Context mContext;

    public ItemAdapter(Context context, ArrayList<Item> data) {
        this.mContext = context;
        this.items = data;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootCategoryView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MessageViewHolder(rootCategoryView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Item model = items.get(position);
        MessageViewHolder messageViewHolder = (MessageViewHolder) holder;
        messageViewHolder.imageViewIcon.setBackgroundResource(model.getImageUrl());
        messageViewHolder.textViewBankName.setText(model.getBankName());
        messageViewHolder.textViewMutualFundName.setText(model.getMutualFundName());
        messageViewHolder.textViewCurrentValue.setText(mContext.getResources().getString(R.string.hint_rupee_symbol) + " " + String.valueOf(model.getCurrentValue()));
        messageViewHolder.textViewWithdrawalAmount.setText(mContext.getResources().getString(R.string.hint_rupee_symbol) + " " + String.valueOf(model.getCurrentValue()));
    }

    private class MessageViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewIcon;
        private TextView textViewBankName;
        private TextView textViewMutualFundName;
        private TextView textViewCurrentValue;
        private TextView textViewWithdrawalAmount;

        private MessageViewHolder(View itemView) {
            super(itemView);
            imageViewIcon = itemView.findViewById(R.id.imageViewIcon);
            textViewBankName = itemView.findViewById(R.id.textViewBankName);
            textViewMutualFundName = itemView.findViewById(R.id.textViewMutualFundName);
            textViewCurrentValue = itemView.findViewById(R.id.textViewCurrentValue);
            textViewWithdrawalAmount = itemView.findViewById(R.id.textViewWithdrawalAmount);
        }
    }
}
