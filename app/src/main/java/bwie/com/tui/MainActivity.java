package bwie.com.tui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.igexin.sdk.PushManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushManager.getInstance().initialize(this.getApplicationContext(), DemoPushService.class);
        // com.getui.demo.DemoIntentService 为第三方自定义的推送服务事件接收类
        PushManager.getInstance().registerPushIntentService(this.getApplicationContext(), DemoIntentService.class);

    }
}
