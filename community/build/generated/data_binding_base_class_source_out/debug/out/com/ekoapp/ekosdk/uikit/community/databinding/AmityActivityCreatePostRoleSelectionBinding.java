// Generated by view binder compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AmityActivityCreatePostRoleSelectionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout fragmentContainer;

  private AmityActivityCreatePostRoleSelectionBinding(@NonNull ConstraintLayout rootView,
      @NonNull FrameLayout fragmentContainer) {
    this.rootView = rootView;
    this.fragmentContainer = fragmentContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AmityActivityCreatePostRoleSelectionBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AmityActivityCreatePostRoleSelectionBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.amity_activity_create_post_role_selection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AmityActivityCreatePostRoleSelectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fragmentContainer;
      FrameLayout fragmentContainer = rootView.findViewById(id);
      if (fragmentContainer == null) {
        break missingId;
      }

      return new AmityActivityCreatePostRoleSelectionBinding((ConstraintLayout) rootView,
          fragmentContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}