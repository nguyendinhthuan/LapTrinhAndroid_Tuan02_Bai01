package com.example.student.laptrinhandroid_tuan02_bai01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_SoA, et_SoB;
    private TextView tv_KetQua;
    private Button bt_TongHaiSo, bt_HieuHaiSo, bt_TichHaiSo, bt_ThuongHaiSo, bt_UocSoChungLonNhat, bt_Thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        TongHaiSo();
        HieuHaiSo();
        TichHaiSo();
        ThuongHaiSo();
        Thoat();
    }

    public void AnhXa() {
        et_SoA = (EditText) findViewById(R.id.et_SoA);
        et_SoB = (EditText) findViewById(R.id.et_SoB);

        tv_KetQua = (TextView) findViewById(R.id.tv_KetQua);

        bt_TongHaiSo = (Button) findViewById(R.id.bt_TongHaiSo);
        bt_HieuHaiSo = (Button) findViewById(R.id.bt_HieuHaiSo);
        bt_TichHaiSo = (Button) findViewById(R.id.bt_TichHaiSo);
        bt_ThuongHaiSo = (Button) findViewById(R.id.bt_ThuongHaiSo);
        bt_UocSoChungLonNhat = (Button) findViewById(R.id.bt_UocSoChungLonNhat);
        bt_Thoat = (Button) findViewById(R.id.bt_Thoat);
    }

    public void TongHaiSo() {
        bt_TongHaiSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et_SoA.getText().toString());
                int b = Integer.parseInt(et_SoB.getText().toString());

                tv_KetQua.setText("Kết quả: " + (a+b));
            }
        });
    }

    public void HieuHaiSo() {
        bt_HieuHaiSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et_SoA.getText().toString());
                int b = Integer.parseInt(et_SoB.getText().toString());

                tv_KetQua.setText("Kết quả: " + (a-b));
            }
        });
    }

    public void TichHaiSo() {
        bt_TichHaiSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et_SoA.getText().toString());
                int b = Integer.parseInt(et_SoB.getText().toString());

                tv_KetQua.setText("Kết quả: " + (a*b));
            }
        });
    }

    public void ThuongHaiSo() {
        bt_ThuongHaiSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et_SoA.getText().toString());
                int b = Integer.parseInt(et_SoB.getText().toString());

                tv_KetQua.setText("Kết quả: " + (a/b));
            }
        });
    }

    public void Thoat() {
        bt_Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
