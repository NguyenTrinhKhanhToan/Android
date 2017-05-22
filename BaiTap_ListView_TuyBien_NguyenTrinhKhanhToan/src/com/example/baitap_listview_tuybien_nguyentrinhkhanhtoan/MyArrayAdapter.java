package com.example.baitap_listview_tuybien_nguyentrinhkhanhtoan;
import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class MyArrayAdapter extends ArrayAdapter<Song>{
    
    Activity context = null;
    int layoutId;
    ArrayList<Song> arr = null;
    //Contructor này dùng để lấy v�? những giá trị được truy�?n vào từ MainActivity
    public MyArrayAdapter(Activity context, int layoutId, ArrayList<Song> list){
        super(context, layoutId, list);
        this.context = context;
        this.layoutId = layoutId;
        this.arr = list;
    }
     
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        /*
         position: là vị trí của bàu hát trong list
         convertView: dùng để lấy v�? các control của mỗi item
         parent: chính là datasource được truy�?n vào từ MainActivity 
         */
        if(convertView==null){
            LayoutInflater inflater = context.getLayoutInflater();
            convertView = inflater.inflate(layoutId, null);
        }
            //Lấy v�? bài hát ở vị trí được yêu cầu
            Song song = arr.get(position);
            //Lấy ra những control được định nghĩa trong cấu trúc của mỗi item
            ImageView icon = (ImageView)convertView.findViewById(R.id.list_image);
            TextView title = (TextView)convertView.findViewById(R.id.title);
            TextView singer = (TextView)convertView.findViewById(R.id.singer);
            TextView duration = (TextView)convertView.findViewById(R.id.duration);
             
            //Gán giá trị cho những control đó
            title.setText(song.getTitle());
            singer.setText(song.getSinger());
            duration.setText(song.getDuration());
             
            //Vì icon là ảnh nên ta phải lấy ra đư�?ng dẫn, dùng nó để lấy v�? image trong folder drawable
            String uri_icon = "drawable/" + song.getIcon();
            int ImageResoure = convertView.getContext().getResources().getIdentifier(uri_icon, null, convertView.getContext().getApplicationContext().getPackageName());
            Drawable image = convertView.getContext().getResources().getDrawable(ImageResoure);
            icon.setImageDrawable(image);
            return convertView;
    }
}
