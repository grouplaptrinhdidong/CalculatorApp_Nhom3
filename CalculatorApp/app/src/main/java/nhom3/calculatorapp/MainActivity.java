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
    TextView tvResult;
    EditText edtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        //final EditText edtResult = (EditText) findViewById(R.id.edtInput);
        tvResult = (TextView) findViewById(R.id.tvResult);
        edtResult = (EditText) findViewById(R.id.edtInput);

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

    }

    //Xử lý xóa tất cả(button AC)
    public void allClearCommand(View view){

        init();
        value1 = "";
        value2 = "";
        sign = null;
        edtResult.setText("");
        tvResult.setText("");
        signDot=0;
        signEqual=0;
    }

    //Đặt TextView tvResult, EditText edtResult trùng với tvResult,edtInput trong activity_main
    //Đưa vào mỗi hàm dấu làm giá trị đầu vào
    public void init(){
        tvResult = (TextView) findViewById(R.id.tvResult);
        edtResult = (EditText) findViewById(R.id.edtInput);
    }

    //Đặt dấu cho button cộng '+'
    public void addCommand(View view){
        init();
        if(signEqual!=0){
            tvResult.setText("");
            edtResult.setText("");
            edtResult.setText(edtResult.getText().toString()+ value1 +'+');
            sign = '+';
            value2="";
        }
        else {
            tvResult.setText("");
            edtResult.setText(edtResult.getText().toString()+"+");
            sign = '+';
        }
    }

    //Đặt dấu cho button trừ '-'
    public void subCommand(View view){
        init();
        if(signEqual!=0){
            tvResult.setText("");
            edtResult.setText("");
            edtResult.setText(edtResult.getText().toString()+ value1 +'-');
            sign = '-';
            value2="";
        }
        else {
            tvResult.setText("");
            edtResult.setText(edtResult.getText().toString()+"-");
            sign = '-';
        }
    }

    //Đặt dấu cho button nhân '*'
    public void mulCommand(View view){
        init();
        if(signEqual!=0){
            tvResult.setText("");
            edtResult.setText("");
            edtResult.setText(edtResult.getText().toString()+ value1 +'*');
            sign = '*';
            value2="";
        }
        else {
            tvResult.setText("");
            edtResult.setText(edtResult.getText().toString()+"*");
            sign = '*';
        }
    }

    //Đặt dấu cho button chia '/'
    public void divCommand(View view){
        init();
        if(signEqual!=0){
            tvResult.setText("");
            edtResult.setText("");
            edtResult.setText(edtResult.getText().toString()+ value1 +'/');
            sign = '/';
            value2="";
        }
        else {
            tvResult.setText("");
            edtResult.setText(edtResult.getText().toString()+"/");
            sign = '/';
        }
    }

    //Đặt dấu cho button %
    public void percentCommand(View view){
        init();
        if(signEqual!=0){
            tvResult.setText("");
            edtResult.setText("");
            edtResult.setText(edtResult.getText().toString()+ value1 +'%');
            sign = '%';
            value2="";
        }
        else {
            tvResult.setText("");
            edtResult.setText(edtResult.getText().toString()+"%");
            sign = '%';
        }
    }

    //Xử lý dấu '.' trong số thực
    public void dotCommand(View view){
        init();
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

    //Xử lý phép toán cộng, trừ, nhân, chia trong click button bằng '='
    public void equalCommand(View view){
        init();
        if(sign!=null){
            if(signDot!=0){
                double num1= Double.parseDouble(value1.toString()+"");
                double num2;
                if(value2.length()==0){
                    num2=100;
                }
                else {
                    num2= Double.parseDouble(value2.toString()+"");
                }
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
                    if(num2 == 0){
                        rs = num1;
                    }
                    else {
                        rs = num1 / num2;
                    }
                }
                else {
                    if(sign=='%'){
                        value2="100";
                        double num2New=Double.parseDouble(value2.toString()+"");
                        rs=num1/num2New;
                    }
                }
                if(num2 == 0 && sign == '/'){
                    tvResult.setText("Sao ngu quá vậy ahihi");
                    value1 = value1;
                }
                else{
                    tvResult.setText(rs +"");
                    //định dạng phần số thập  phân chỉ tối đa 8 chữ số
                    DecimalFormat df = new DecimalFormat("###.########");
                    //chuyển dấu "," thành dấu "." do định dạng Decimal là dấu ","
                    tvResult.setText(df.format(rs).replace(",","."));
                    //tvResult.setText(rs.toString());
                    value1 = tvResult.getText().toString();
                }
                sign = null;

            }
            else {
                int num1= Integer.parseInt(value1.toString()+"");
                int num2;
                if(value2.length()==0){
                    num2=100;
                }
                else {
                    num2= Integer.parseInt(value2.toString()+"");
                }

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
                    if((double)num2 == 0){
                        rs = num1;
                    }
                    else {
                        divResult = (double) num1 / (double) num2;
                    }
                }
                else {
                    if(sign=='%'){
                        num2=100;
                        divResult= (double)num1/(double)num2;
                    }
                }

                if(sign=='/'){
                    if((double)num2 == 0 && sign == '/'){
                        tvResult.setText("Lỗi");
                        value1 = value1;
                    }
                    else{
                        tvResult.setText(divResult +"");
                        //định dạng phần số thập  phân chỉ tối đa 8 chữ số
                        DecimalFormat df = new DecimalFormat("###.########");
                        //chuyển dấu "," thành dấu "." do định dạng Decimal là dấu ","
                        tvResult.setText(df.format(divResult).replace(",","."));
                        //tvResult.setText(rs.toString());\\
                        value1 = tvResult.getText().toString();
                    }

                    //set biến dấu về null để thực hiện phép tính tiếp theo
                    sign = null;
                    // set cờ dấu "." về 1 vì đang xử lí số thực
                    signDot=1;
                }
                else{
                    if(sign=='%'){
                        tvResult.setText(divResult +"");
                        //định dạng phần số thập  phân chỉ tối đa 8 chữ số
                        DecimalFormat df = new DecimalFormat("###.########");
                        //chuyển dấu "," thành dấu "." do định dạng Decimal là dấu ","
                        tvResult.setText(df.format(divResult).replace(",","."));
                        //tvResult.setText(rs.toString());
                        //lưu kết quả vào giá trị thứ nhất để thực hiện tiếp các phép tính sau đó
                        value1 = tvResult.getText().toString();
                        //set biến dấu về null để thực hiện phép tính tiếp theo
                        sign = null;
                        // set cờ dấu "." về 1 vì đang xử lí số thực
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

    //Xử lý xóa 1 kí tự (button C)
    public void clearCommand(View view){
        init();
        if(sign==null && value1.length()==0){
            edtResult.setText("");
            tvResult.setText("");
        }
        else if(sign==null && value1.length()!=0){

            edtResult.setText("");
            value1=value1.substring(0,value1.length()-1);
            edtResult.setText(edtResult.getText().toString()+ value1);
            tvResult.setText("");

            tvResult.setText(value1);
        }
        else if(sign!=null && value2.length()==0){
            sign=null;
            edtResult.setText("");
            edtResult.setText(value1);
            tvResult.setText("");
        }
        else if(sign!=null && value2.length()!=0){
            value2=value2.substring(0,value2.length()-1);
            edtResult.setText("");
            edtResult.setText(edtResult.getText().toString()+ value1 + sign+ value2);
            tvResult.setText("");
            tvResult.setText(value2);
        }
    }


}
