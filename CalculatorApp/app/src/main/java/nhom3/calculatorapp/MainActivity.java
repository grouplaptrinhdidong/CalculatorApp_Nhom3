package nhom3.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    //double value1 = 0;
    //double value2 = 0;
    public Double value1 = 0.0;
    public Double value2 = 0.0;
    public Character sign = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvrs = (TextView) findViewById(R.id.tvResult);


        //tạo sự kiện click cho các button số từ 0 đến 9
        Button btnNum0 = (Button) findViewById(R.id.btnNum0);
        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"0");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText().toString());
                }
                else {
                    //value2 = Double.parseDouble(tvrs.getText() + "");
                    value2 = Double.parseDouble(tvrs.getText().toString());
                }
            }
        });
        Button btnNum1 = (Button) findViewById(R.id.btnNum1);
        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"1");
                if(sign == null){
                    //value1 = Double.parseDouble(tvrs.getText() + "");
                    value1 = Double.parseDouble(tvrs.getText().toString());
                }
                else {
                    //value2 = Double.parseDouble(tvrs.getText() + "");
                    value2 = Double.parseDouble(tvrs.getText().toString());
                }
            }
        });
        Button btnNum2 = (Button) findViewById(R.id.btnNum2);
        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"2");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText() + "");
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText() + "");
                }
            }
        });
        Button btnNum3 = (Button) findViewById(R.id.btnNum3);
        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"3");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText() + "");
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText() + "");
                }
            }
        });
        Button btnNum4 = (Button) findViewById(R.id.btnNum4);
        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"4");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText() + "");
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText() + "");
                }
            }
        });
        Button btnNum5 = (Button) findViewById(R.id.btnNum5);
        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"5");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText() + "");
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText() + "");
                }
            }
        });
        Button btnNum6 = (Button) findViewById(R.id.btnNum6);
        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"6");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText() + "");
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText() + "");
                }
            }
        });
        Button btnNum7 = (Button) findViewById(R.id.btnNum7);
        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"7");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText() + "");
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText() + "");
                }
            }
        });
        Button btnNum8 = (Button) findViewById(R.id.btnNum8);
        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"8");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText() + "");
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText() + "");
                }
            }
        });
        Button btnNum9 = (Button) findViewById(R.id.btnNum9);
        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+"9");
                if(sign == null){
                    value1 = Double.parseDouble(tvrs.getText() + "");
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText() + "");
                }
            }
        });


        //Đặt dấu cho button trừ '-'
        Button btnSub = (Button) findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText("");
                sign = '-';
            }
        });

        //Đặt dấu cho button chia '/'
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText("");
                sign = '/';
            }
        });

        //Đặt dấu cho button cộng '+'
        Button btnAdd =(Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = '+';
                tvrs.setText("");
            }
        });

        //Đặt dấu cho button nhân '*'
        Button btnMul=(Button) findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign ='*';
                tvrs.setText("");
            }
        });

        //Xử lý dấu '.' trong số thực
        Button btnDot=(Button) findViewById(R.id.btnDot);
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrs.setText(tvrs.getText().toString()+".");
                if(sign==null){
                    value1 = Double.parseDouble(tvrs.getText().toString());
                }
                else {
                    value2 = Double.parseDouble(tvrs.getText().toString());
                }
            }
        });


        //Xử lý phép toán cộng, trừ, nhân, chia trong click button bằng '='
        Button btnEq = (Button) findViewById(R.id.btnEqual);
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //double rs;

                if(sign != null){
                    Double rs = 0.0;
                    //switch (sign)
//                    {
//                        case '+': rs = value1 + value2;break;
//                        case '*': rs = value1 + value2;break;
//                        case '-': rs = value1 - value2;break;
//                        case '/': rs = value1/value2;break;
//
//                    }
                    if(sign=='+'){
                        rs= value1+value2;
                    }
                    else if(sign=='-'){
                        rs=value1-value2;
                    }
                    else if (sign=='*'){
                        rs=value1*value2;
                    }
                    else if (sign=='/'){
                        rs=value1/value2;
                    }

                    tvrs.setText(rs +"");
                    tvrs.setText(rs.toString());
                    value1 = rs;
                    sign = null;
                }

            }
        });

        //Xử lý xóa (button AC)
        Button btnAC = (Button) findViewById(R.id.btnAC);
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = 0.0;
                value2 = 0.0;
                sign = null;
                tvrs.setText("");
            }
        });


    }
}
