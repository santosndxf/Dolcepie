package com.example.signupdolcepie.home.data;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.signupdolcepie.R;

import java.util.List;

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.ProdutosViewHolder> {

    List<Produtos> produtos;
    public ProdutosAdapter(Context context, List<Produtos> produtos) {
        this.produtos= produtos;
    }

    @NonNull
    @Override
    public ProdutosAdapter.ProdutosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.tela_item,parent,false);

        return new ProdutosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutosAdapter.ProdutosViewHolder holder, int position) {
        holder.produtosTitleLb.setText("Produto");
        holder.produtosDescriptionLb.setText("pavlova cake");
        holder.buyBtn.setText("comprar");
    }

    @Override
    public int getItemCount() {

        return produtos.size();
    }

    public static class ProdutosViewHolder extends RecyclerView.ViewHolder
    {
        ImageView produtosImg ;
        TextView produtosTitleLb;
        TextView produtosDescriptionLb;
        Button buyBtn;
        public ProdutosViewHolder(@NonNull View itemView) {
            super(itemView);
            produtosImg = itemView.findViewById(R.id.produtos_img);
            produtosTitleLb = itemView.findViewById(R.id.produtosTitle_lb);
            produtosDescriptionLb = itemView.findViewById(R.id.produtosDescription_lb);
            buyBtn = itemView.findViewById(R.id.buy_button);
        }
        
    }


}
