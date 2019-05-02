package khoapham.ptp.phamtanphat.databinding1903;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class User extends BaseObservable {
    private String email;
    private String password;
    private Integer hinhanh;

    // alt + insert
    public User(String email, String password, Integer hinhanh) {
        this.email = email;
        this.password = password;
        this.hinhanh = hinhanh;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    // lay du lieu da duoc dong bo
    @Bindable
    public Integer getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(Integer hinhanh) {
        this.hinhanh = hinhanh;
        notifyPropertyChanged(BR.hinhanh);
    }
}
