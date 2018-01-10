package forfun.good.a2018011003;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Log.d("訊息","取得一個測試功能");
            Bundle b = msg.getData();
            String str = b.getString("data");
            Log.d("d=訊息","data"+str);
        }
    };
    public void CL1 (View v)
    {
        Message msg = new Message();
        //handler.sendMessage(msg);
        Bundle b = new Bundle();
        b.putString("data","MyData");//加入字串
        msg.setData(b);
        handler.sendMessageDelayed(msg,2000);//延遲發送
    }

}
