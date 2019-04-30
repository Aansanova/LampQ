package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lampq.Tempat;
import com.example.lampq.R;
import com.example.lampq.TempatFragment;

import java.util.ArrayList;

/**
 * Created by Dimas Maulana on 5/26/17.
 * Email : araymaulana66@gmail.com
 */

public class TempatAdapter extends RecyclerView.Adapter<TempatAdapter.TempatViewHolder> {


    private ArrayList<Tempat> dataList;
    private TempatFragment mCtx;

    public TempatAdapter(TempatFragment mCtx, ArrayList<Tempat> dataList) {
        this.mCtx = mCtx;
        this.dataList = dataList;
    }



    @Override
    public TempatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_tempat, parent, false);
        return new TempatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TempatViewHolder holder, int position) {
        Tempat tempat = dataList.get(position);

        holder.txtNama.setText(tempat.getNama());
        holder.txtAlamat.setText(tempat.getAlamat());
        holder.txtJarak.setText(tempat.getJarak());
        holder.imgThumbnail.setImageDrawable(mCtx.getResources().getDrawable(tempat.getThumbnail()));
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class TempatViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtAlamat, txtJarak;
        private ImageView imgThumbnail;

        public TempatViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_tempat);
            txtAlamat = (TextView) itemView.findViewById(R.id.txt_alamat);
            txtJarak = (TextView) itemView.findViewById(R.id.txt_jarak);
            imgThumbnail =(ImageView) itemView.findViewById(R.id.img_thumbnail);
        }
    }
}