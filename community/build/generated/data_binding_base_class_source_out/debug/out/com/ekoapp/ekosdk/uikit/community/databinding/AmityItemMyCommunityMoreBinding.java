// Generated by view binder compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AmityItemMyCommunityMoreBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ShapeableImageView ivAvatar;

  @NonNull
  public final LinearLayout layoutViewMore;

  @NonNull
  public final TextView tvName;

  private AmityItemMyCommunityMoreBinding(@NonNull LinearLayout rootView,
      @NonNull ShapeableImageView ivAvatar, @NonNull LinearLayout layoutViewMore,
      @NonNull TextView tvName) {
    this.rootView = rootView;
    this.ivAvatar = ivAvatar;
    this.layoutViewMore = layoutViewMore;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AmityItemMyCommunityMoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AmityItemMyCommunityMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.amity_item_my_community_more, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AmityItemMyCommunityMoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivAvatar;
      ShapeableImageView ivAvatar = rootView.findViewById(id);
      if (ivAvatar == null) {
        break missingId;
      }

      LinearLayout layoutViewMore = (LinearLayout) rootView;

      id = R.id.tvName;
      TextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      return new AmityItemMyCommunityMoreBinding((LinearLayout) rootView, ivAvatar, layoutViewMore,
          tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}