package khoapham.ptp.phamtanphat.databinding1903;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import khoapham.ptp.phamtanphat.databinding1903.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Dinh nghia lai giao dien se duoc hien thi len
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        final User user = new User("","",R.drawable.ic_launcher_background);
        mainBinding.setUser(user);

        mainBinding.executePendingBindings();
//        mainBinding.imageview.setImageResource(user.getHinhanh());

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("BBB",user.getEmail());
                handler.postDelayed(this,500);
            }
        },500);
    }
}
