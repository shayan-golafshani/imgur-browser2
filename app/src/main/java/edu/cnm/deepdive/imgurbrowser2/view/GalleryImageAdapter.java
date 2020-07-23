package edu.cnm.deepdive.imgurbrowser2.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import edu.cnm.deepdive.imgurbrowser2.R;
import edu.cnm.deepdive.imgurbrowser2.model.Image;
import java.util.List;

public class GalleryImageAdapter extends ArrayAdapter<Image> {

  public GalleryImageAdapter(@NonNull Context context,
      List<Image> imageList) {
    super(context, 0, imageList);
  }

  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    return initView(position, convertView, parent);
  }

  @Override
  public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    return initView(position, convertView, parent);
  }

  private View initView(int position, View convertView, ViewGroup parent) {

    if (convertView == null) {
      convertView = LayoutInflater.from(getContext()).inflate(
          R.layout.custom_gallery_search_spinner_item, parent, false
      );
    }
    ImageView imageView = convertView.findViewById(R.id.custom_spinner_image);
    TextView title = convertView.findViewById(R.id.custom_spinner_title);
    TextView description = convertView.findViewById(R.id.custom_spinner_description);
    TextView url = convertView.findViewById(R.id.custom_spinner_url);

    Image currentItem = getItem(position);

    if (currentItem != null) {
      Picasso.get().load(currentItem.getUrl()).into(imageView);
      title.setText(currentItem.getTitle());
      description.setText(currentItem.getDescription());
      url.setText(currentItem.getUrl());
    }

    return convertView;
  }
}
