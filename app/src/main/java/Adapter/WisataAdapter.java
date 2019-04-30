package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.lampq.R;
import com.example.lampq.Wisata;
import com.example.lampq.WisataFragment;

import java.util.ArrayList;

/**
 * Created by Dimas Maulana on 5/26/17.
 * Email : araymaulana66@gmail.com
 */

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {


    private ArrayList<Wisata> dataList;
    private WisataFragment mCtx;

    public WisataAdapter(WisataFragment mCtx, ArrayList<Wisata> dataList) {
        this.mCtx = mCtx;
        this.dataList = dataList;
    }



    @Override
    public WisataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_wisata, parent, false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WisataViewHolder holder, int position) {
        Wisata wisata = dataList.get(position);

        holder.txtNama.setText(wisata.getNama());
        holder.txtAlamat.setText(wisata.getAlamat());
        holder.txtJarak.setText(wisata.getJarak());
        holder.imgThumbnail.setImageDrawable(mCtx.getResources().getDrawable(wisata.getThumbnail()));
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtAlamat, txtJarak;
        private ImageView imgThumbnail;

        public WisataViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_tempat);
            txtAlamat = (TextView) itemView.findViewById(R.id.txt_alamat);
            txtJarak = (TextView) itemView.findViewById(R.id.txt_jarak);
            imgThumbnail =(ImageView) itemView.findViewById(R.id.img_thumbnail);
        }
    }
}