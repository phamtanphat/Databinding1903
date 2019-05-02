package khoapham.ptp.phamtanphat.databinding1903;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import khoapham.ptp.phamtanphat.databinding1903.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        User user = new User("abc@gnail.com","123",R.drawable.ic_launcher_background);
        mainBinding.setUser(user);
        mainBinding.executePendingBindings();
    }
}
