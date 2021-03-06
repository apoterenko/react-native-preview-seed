package com.reactnativepreviewseed;

import android.app.Application;

import com.facebook.react.ReactApplication;
import br.com.classapp.RNSensitiveInfo.RNSensitiveInfoPackage;
import com.hieuvp.fingerprint.ReactNativeFingerprintScannerPackage;
import com.RNTextInputMask.RNTextInputMaskPackage;
import com.wix.reactnativenotifications.RNNotificationsPackage;
import org.reactnative.camera.RNCameraPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new RNSensitiveInfoPackage(),
          new ReactNativeFingerprintScannerPackage(),
          new RNTextInputMaskPackage(),
          new RNNotificationsPackage(MainApplication.this),
          new RNCameraPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}