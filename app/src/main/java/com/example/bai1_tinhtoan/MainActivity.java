package com.example.bai1_tinhtoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText a, b;
        TextView kq_tong,kq_hieu,kq_tich,kq_thuong;
        Button tinh;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            AddControl();
            AddEvent();
        }
        public void AddEvent(){
            tinh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    XuLy_PhepToan();
                }
            });
        }
        public void AddControl(){
            a= (EditText) findViewById(R.id.nhap_a);
            b= (EditText) findViewById(R.id.nhap_b);
            kq_tong=(TextView) findViewById(R.id.tong);
            kq_hieu=(TextView) findViewById(R.id.hieu);
            kq_tich=(TextView)  findViewById(R.id.tich);
            kq_thuong=(TextView) findViewById(R.id.thuong);
            tinh=(Button) findViewById(R.id.button_tinh);

        }
        public void XuLy_PhepToan(){
            int a1=Integer.parseInt(a.getText().toString());
            int a2=Integer.parseInt(b.getText().toString());
            int tong = a1 + a2;
            int hieu = a1 - a2;
            int tich = a1 * a2;
            double thuong = a1 * 1.0/a2;
            kq_tong.setText("Tổng của a+b là:   "+String.valueOf(tong));
            kq_hieu.setText("Hiệu của a-b là:   "+String.valueOf(hieu));
            kq_tich.setText("Tích của a*b là:   "+String.valueOf(tich));
            kq_thuong.setText("Thương của a/b là:   "+String.valueOf(thuong));
        }
}