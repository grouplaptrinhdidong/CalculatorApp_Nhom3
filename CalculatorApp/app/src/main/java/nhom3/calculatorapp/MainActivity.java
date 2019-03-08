package nhom3.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    // khai báo biến cờ để xác định số nguyên hay số thực
    public int signDot = 0;
    // khai báo biến cờ để xác định đã bấm dấu "=" chưa
    public int signEqual = 0;
    // khai báo số thứ 1
    public String value1 = "0";
    // khai báo số thứ 2
    public String value2 = "0";
    // khai báo biến lưu phép tính
    public Character sign = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        final EditText edtResult = (EditText) findViewById(R.id.edtInput);

        //tạo sự kiện click cho các button số từ 0 đến 9
        Button btnNum0 = (Button) findViewById(R.id.btnNum0);
        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"0");
                edtResult.setText(edtResult.getText().toString()+"0");
                if(sign == null){
                    value1 = tvResult.getText().toString();
                }
                else {
                    //value2 = Double.parseDouble(tvResult.getText() + "");
                    value2 = tvResult.getText().toString();
                }
            }
        });
        Button btnNum1 = (Button) findViewById(R.id.btnNum1);
        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"1");
                edtResult.setText(edtResult.getText().toString()+"1");
                if(sign == null){
                    //value1 = Double.parseDouble(tvResult.getText() + "");
                    value1 = tvResult.getText().toString();
                }
                else {
                    //value2 = Double.parseDouble(tvResult.getText() + "");
                    value2 = tvResult.getText().toString();
                }
            }
        });
        Button btnNum2 = (Button) findViewById(R.id.btnNum2);
        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"2");
                edtResult.setText(edtResult.getText().toString()+"2");
                if(sign == null){
                    value1 = tvResult.getText() + "";
                }
                else {
                    value2 = tvResult.getText() + "";
                }
            }
        });
        Button btnNum3 = (Button) findViewById(R.id.btnNum3);
        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"3");
                edtResult.setText(edtResult.getText().toString()+"3");
                if(sign == null){
                    value1 = tvResult.getText() + "";
                }
                else {
                    value2 = tvResult.getText() + "";
                }
            }
        });
        Button btnNum4 = (Button) findViewById(R.id.btnNum4);
        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"4");
                edtResult.setText(edtResult.getText().toString()+"4");
                if(sign == null){
                    value1 = tvResult.getText() + "";
                }
                else {
                    value2 =tvResult.getText() + "";
                }
            }
        });
        Button btnNum5 = (Button) findViewById(R.id.btnNum5);
        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"5");
                edtResult.setText(edtResult.getText().toString()+"5");
                if(sign == null){
                    value1 = tvResult.getText() + "";
                }
                else {
                    value2 = tvResult.getText() + "";
                }
            }
        });
        Button btnNum6 = (Button) findViewById(R.id.btnNum6);
        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"6");
                edtResult.setText(edtResult.getText().toString()+"6");
                if(sign == null){
                    value1 = tvResult.getText() + "";
                }
                else {
                    value2 = tvResult.getText() + "";
                }
            }
        });
        Button btnNum7 = (Button) findViewById(R.id.btnNum7);
        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"7");
                edtResult.setText(edtResult.getText().toString()+"7");
                if(sign == null){
                    value1 =tvResult.getText() + "";
                }
                else {
                    value2 =tvResult.getText() + "";
                }
            }
        });
        Button btnNum8 = (Button) findViewById(R.id.btnNum8);
        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"8");
                edtResult.setText(edtResult.getText().toString()+"8");
                if(sign == null){
                    value1 = tvResult.getText() + "";
                }
                else {
                    value2 =tvResult.getText() + "";
                }
            }
        });
        Button btnNum9 = (Button) findViewById(R.id.btnNum9);
        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+"9");
                edtResult.setText(edtResult.getText().toString()+"9");
                if(sign == null){
                    value1 = tvResult.getText() + "";
                }
                else {
                    value2 =tvResult.getText() + "";
                }
            }
        });


        //Đặt dấu cho button trừ '-'
        Button btnSub = (Button) findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signEqual!=0){
                    tvResult.setText("");
                    edtResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+ value1 +'-');
                    sign = '-';
                }
                else {
                    tvResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+"-");
                    sign = '-';
                }
            }
        });

        //Đặt dấu cho button chia '/'
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signEqual!=0){
                    tvResult.setText("");
                    edtResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+ value1 +'/');
                    sign = '/';
                }
                else {
                    tvResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+"/");
                    sign = '/';
                }
            }
        });

        //Đặt dấu cho button cộng '+'
        Button btnAdd =(Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signEqual!=0){
                    tvResult.setText("");
                    edtResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+ value1 +'+');
                    sign = '+';
                }
                else {
                    tvResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+"+");
                    sign = '+';
                }
            }
        });

        //Đặt dấu cho button nhân '*'
        Button btnMul=(Button) findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signEqual!=0){
                    tvResult.setText("");
                    edtResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+ value1 +'*');
                    sign = '*';
                }
                else {
                    tvResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+"*");
                    sign = '*';
                }
            }
        });

        //Đặt dấu cho button %
        Button btnPer=(Button) findViewById(R.id.btnPercent);
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signEqual!=0){
                    tvResult.setText("");
                    edtResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+ value1 +'%');
                    sign = '%';
                }
                else {
                    tvResult.setText("");
                    edtResult.setText(edtResult.getText().toString()+"%");
                    sign = '%';
                }
            }
        });

        //Xử lý dấu '.' trong số thực
        Button btnDot=(Button) findViewById(R.id.btnDot);
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText().toString()+".");
                edtResult.setText(edtResult.getText().toString()+".");
                if(sign==null){
                    value1 = tvResult.getText().toString();
                }
                else {
                    value2 = tvResult.getText().toString();
                }
                signDot=1;
            }
        });


        //Xử lý phép toán cộng, trừ, nhân, chia trong click button bằng '='
        Button btnEq = (Button) findViewById(R.id.btnEqual);
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(sign!=null){
                    if(signDot!=0){
                        double num1= Double.parseDouble(value1.toString()+"");
                        double num2= Double.parseDouble(value2.toString()+"");
                        double rs = 0;
                        if(sign=='+'){
                            rs = num1+num2;
                        }
                        else if(sign=='-'){
                            rs = num1-num2 ;
                        }
                        else if (sign=='*'){
                            rs = num1*num2;
                        }
                        else if (sign=='/'){
                            rs = num1/num2;
                        }
                        else {
                            if(sign=='%'){
                                rs=num1/100;
                            }
                        }

                        tvResult.setText(rs +"");
                        DecimalFormat df = new DecimalFormat("###.########");
                        tvResult.setText(df.format(rs));
                        //tvResult.setText(rs.toString());
                        value1 = tvResult.getText().toString();
                        sign = null;

                    }
                    else {
                        int num1= Integer.parseInt(value1.toString()+"");
                        int num2= Integer.parseInt(value2.toString()+"");
                        double divResult=0;
                        int rs = 0;

                        if(sign=='+'){
                            rs = num1+num2;
                        }
                        else if(sign=='-'){
                            rs = num1-num2 ;
                        }
                        else if (sign=='*'){
                            rs = num1*num2;
                        }
                        else if (sign=='/'){
                            divResult = num1/num2;
                        }
                        else {
                            if(sign=='%'){
                                divResult=num1/100;
                            }
                        }

                        if(sign=='/'){
                            tvResult.setText(divResult +"");
                            //tvResult.setText(rs.toString());
                            value1 = tvResult.getText().toString();
                            sign = null;
                        }
                        else{
                            if(sign=='%'){
                                tvResult.setText(divResult +"");
                                //tvResult.setText(rs.toString());
                                value1 = tvResult.getText().toString();
                                sign = null;
                                signDot=1;
                            }
                            else {
                                tvResult.setText(rs +"");
                                //tvResult.setText(rs.toString());
                                value1 = tvResult.getText().toString();
                                sign = null;
                            }
                        }



                    }
                    signEqual = 1;
                }

            }
        });

        //Xử lý xóa (button AC)
        Button btnAC = (Button) findViewById(R.id.btnAC);
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = "";
                value2 = "";
                sign = null;
                edtResult.setText("");
                tvResult.setText("");
            }
        });


    }
}
