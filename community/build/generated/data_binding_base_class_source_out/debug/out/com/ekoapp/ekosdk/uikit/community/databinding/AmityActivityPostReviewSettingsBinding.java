// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.community.setting.postreview.EkoPostReviewSettingsViewModel;
import com.ekoapp.ekosdk.uikit.components.EkoToolBar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityActivityPostReviewSettingsBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final EkoToolBar postReviewToolbar;

  @NonNull
  public final AmityItemSeparateContentBinding separatorToolbar;

  @Bindable
  protected EkoPostReviewSettingsViewModel mViewModel;

  protected AmityActivityPostReviewSettingsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout fragmentContainer, EkoToolBar postReviewToolbar,
      AmityItemSeparateContentBinding separatorToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentContainer = fragmentContainer;
    this.postReviewToolbar = postReviewToolbar;
    this.separatorToolbar = separatorToolbar;
    setContainedBinding(this.separatorToolbar);
  }

  public abstract void setViewModel(@Nullable EkoPostReviewSettingsViewModel viewModel);

  @Nullable
  public EkoPostReviewSettingsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static AmityActivityPostReviewSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_activity_post_review_settings, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityActivityPostReviewSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityActivityPostReviewSettingsBinding>inflateInternal(inflater, R.layout.amity_activity_post_review_settings, root, attachToRoot, component);
  }

  @NonNull
  public static AmityActivityPostReviewSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_activity_post_review_settings, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityActivityPostReviewSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityActivityPostReviewSettingsBinding>inflateInternal(inflater, R.layout.amity_activity_post_review_settings, null, false, component);
  }

  public static AmityActivityPostReviewSettingsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static AmityActivityPostReviewSettingsBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityActivityPostReviewSettingsBinding)bind(component, view, R.layout.amity_activity_post_review_settings);
  }
}