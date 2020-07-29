package edu.cnm.deepdive.imgurbrowser2;

import android.app.Application;
import com.squareup.picasso.Picasso;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImgurApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    ExecutorService service = Executors.newFixedThreadPool(4);
    Picasso.setSingletonInstance(
        new Picasso.Builder(this)
            .executor(service)
            .loggingEnabled(true)
            .build()
    );
  }
}
