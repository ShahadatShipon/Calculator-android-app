package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btp,bteq,btmul,btsub,btadd,btdev,btc,btac,btm,btdel;
    TextView res,tdis;

    double var1,var2;
    boolean add,sub,mul,dev,perc;
    String sr,sd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0= (Button) findViewById(R.id.b0);
        bt1= (Button) findViewById(R.id.b1);
        bt2= (Button) findViewById(R.id.b2);
        bt3= (Button) findViewById(R.id.b3);
        bt4= (Button) findViewById(R.id.b4);
        bt5= (Button) findViewById(R.id.b5);
        bt6= (Button) findViewById(R.id.b6);
        bt7= (Button) findViewById(R.id.b7);
        bt8= (Button) findViewById(R.id.b8);
        bt9= (Button) findViewById(R.id.b9);
        bteq= (Button) findViewById(R.id.beq);
        btp= (Button) findViewById(R.id.bp);
        btadd= (Button) findViewById(R.id.badd);
        btsub= (Button) findViewById(R.id.bsub);
        btdev= (Button) findViewById(R.id.bdev);
        btmul= (Button) findViewById(R.id.bmul);
        btc= (Button) findViewById(R.id.bc);
        btac= (Button) findViewById(R.id.bac);
        btdel=(Button)findViewById(R.id.bdel);
        btm=(Button)findViewById(R.id.bm);

        res = (TextView) findViewById(R.id.result);
        tdis = (TextView) findViewById(R.id.display);


            bt0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        res.setText(res.getText() + "0");
                }
            });
            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "1");
                }
            });
            bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "2");
                }
            });
            bt3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "3");
                }
            });
            bt4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "4");
                }
            });
            bt5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "5");
                }
            });
            bt6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "6");
                }
            });
            bt7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "7");
                }
            });
            bt8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "8");
                }
            });
            bt9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + "9");
                }
            });
            btadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        if (res.getText().toString().isEmpty()) {
                            res.setText("");
                            tdis.setText("0");
                        } else {
                            sr=res.getText().toString();
                            var1 = Double.parseDouble(res.getText() + "");
                            add = true;
                            tdis.setText(res.getText() + "+");
                            res.setText(null);
                        }
                }
            });
            btsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (res.getText().toString().isEmpty()) {
                        res.setText("");
                        tdis.setText("0");
                    } else {
                        var1 = Double.parseDouble(res.getText() + "");
                        sub = true;
                        tdis.setText(res.getText() + "-");
                        res.setText(null);
                    }
                }
            });
            btmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        if (res.getText().toString().isEmpty()) {
                            res.setText("");
                            tdis.setText("0");
                        } else {
                            var1 = Double.parseDouble(res.getText() + "");
                            mul = true;
                            tdis.setText(res.getText() + "*");
                            res.setText(null);
                        }

                }
            });
            btdev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        if (res.getText().toString().isEmpty()) {
                            res.setText("");
                            tdis.setText("0");
                        } else {
                            var1 = Double.parseDouble(res.getText() + "");
                            dev = true;
                            tdis.setText(res.getText() + "/");
                            res.setText(null);
                        }
                }
            });
        btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText().toString().isEmpty()) {
                    res.setText("");
                    tdis.setText("0");
                } else {
                    var1 = Double.parseDouble(res.getText() + "");
                    perc = true;
                    tdis.setText(res.getText() + "%");
                    res.setText(null);
                }
            }
        });
            btp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        res.setText(res.getText() + ".");
                }
            });
            btc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res.setText(null);
                    tdis.setText("0");
                }
            });

            bteq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (res.getText().toString().isEmpty()) {
                        res.setText(null);
                        tdis.setText("0");
                    } else {
                        var2 = Double.parseDouble(res.getText() + "");
                        if (add == true) {
                            tdis.setText(tdis.getText() + "" + res.getText());
                            int a;
                            Double d = var1 + var2;
                            a = (int) var1 + (int) var2;
                            Double f = d - a;
                            if (f == 0) {
                                res.setText(a + "");
                            } else {
                                res.setText(d + "");
                            }

                            add = false;
                        }
                        if (perc == true) {
                            tdis.setText(tdis.getText() + "" + res.getText());
                            int a;
                            Double d = (var1 * var2)/100;
                            a = ((int) var1 * (int) var2)/100;
                            Double f = d - a;
                            if (f == 0) {
                                res.setText(a + "");
                            } else {
                                res.setText(d + "");
                            }

                            add = false;
                        }
                        if (sub == true) {
                            tdis.setText(tdis.getText() + "" + res.getText());
                            int a;
                            Double d = var1 - var2;
                            a = (int) var1 - (int) var2;
                            Double f = d - a;
                            if (f == 0) {
                                res.setText(a + "");
                            } else {
                                res.setText(d + "");
                            }
                            sub = false;
                        }
                        if (mul == true) {
                            tdis.setText(tdis.getText() + "" + res.getText());
                            int a;
                            Double d = var1 * var2;
                            a = (int) var1 * (int) var2;
                            Double f = d - a;
                            if (f == 0) {
                                res.setText(a + "");
                            } else {
                                res.setText(d + "");
                            }
                            mul = false;
                        }
                        if (dev == true) {
                            tdis.setText(tdis.getText() + "" + res.getText());
                            int a;
                            Double d = var1 / var2;
                            a = (int) var1 / (int) var2;
                            Double f = d - a;
                            if (f == 0) {
                                res.setText(a + "");
                            } else {
                                res.setText(d + "");
                            }
                            dev = false;
                        }

                    }
                }
            });

        btac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res.getText().toString().isEmpty()) {
                    res.setText(null);
                    tdis.setText("0");
                }else{
                    res.setText(res.getText() + "3.1416");
                }
            }
        });
        btdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(res.getText().toString().isEmpty()) {
                    res.setText(" ");
                    tdis.setText("0");
                }else{
                    String del = res.getText().toString();
                    res.setText(del.substring(0, del.length() - 1));
                }
            }
        });
    }
}
