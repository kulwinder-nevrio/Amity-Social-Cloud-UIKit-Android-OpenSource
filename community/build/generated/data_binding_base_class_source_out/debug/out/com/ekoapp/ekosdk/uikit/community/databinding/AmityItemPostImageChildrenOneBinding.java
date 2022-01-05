// Generated by view binder compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AmityItemPostImageChildrenOneBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout imageContainerLayout;

  @NonNull
  public final ShapeableImageView imageViewPreviewImageOne;

  private AmityItemPostImageChildrenOneBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout imageContainerLayout,
      @NonNull ShapeableImageView imageViewPreviewImageOne) {
    this.rootView = rootView;
    this.imageContainerLayout = imageContainerLayout;
    this.imageViewPreviewImageOne = imageViewPreviewImageOne;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AmityItemPostImageChildrenOneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AmityItemPostImageChildrenOneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.amity_item_post_image_children_one, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AmityItemPostImageChildrenOneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout imageContainerLayout = (RelativeLayout) rootView;

      id = R.id.imageViewPreviewImageOne;
      ShapeableImageView imageViewPreviewImageOne = rootView.findViewById(id);
      if (imageViewPreviewImageOne == null) {
        break missingId;
      }

      return new AmityItemPostImageChildrenOneBinding((RelativeLayout) rootView,
          imageContainerLayout, imageViewPreviewImageOne);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}