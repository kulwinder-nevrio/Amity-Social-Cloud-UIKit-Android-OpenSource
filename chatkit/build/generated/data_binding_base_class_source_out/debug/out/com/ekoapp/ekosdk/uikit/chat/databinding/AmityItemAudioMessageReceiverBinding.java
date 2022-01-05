// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.chat.R;
import com.ekoapp.ekosdk.uikit.chat.messages.viewModel.EkoAudioMsgViewModel;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityItemAudioMessageReceiverBinding extends ViewDataBinding {
  @NonNull
  public final AmityViewDateBinding dateHeader;

  @NonNull
  public final ShapeableImageView ivAvatar;

  @NonNull
  public final ImageView ivPlay;

  @NonNull
  public final ConstraintLayout layoutAudio;

  @NonNull
  public final ConstraintLayout layoutAudioReceiver;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvTime;

  @Bindable
  protected EkoAudioMsgViewModel mVmAudioMsg;

  protected AmityItemAudioMessageReceiverBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AmityViewDateBinding dateHeader, ShapeableImageView ivAvatar,
      ImageView ivPlay, ConstraintLayout layoutAudio, ConstraintLayout layoutAudioReceiver,
      TextView tvName, TextView tvTime) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dateHeader = dateHeader;
    setContainedBinding(this.dateHeader);
    this.ivAvatar = ivAvatar;
    this.ivPlay = ivPlay;
    this.layoutAudio = layoutAudio;
    this.layoutAudioReceiver = layoutAudioReceiver;
    this.tvName = tvName;
    this.tvTime = tvTime;
  }

  public abstract void setVmAudioMsg(@Nullable EkoAudioMsgViewModel vmAudioMsg);

  @Nullable
  public EkoAudioMsgViewModel getVmAudioMsg() {
    return mVmAudioMsg;
  }

  @NonNull
  public static AmityItemAudioMessageReceiverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_audio_message_receiver, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemAudioMessageReceiverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityItemAudioMessageReceiverBinding>inflateInternal(inflater, R.layout.amity_item_audio_message_receiver, root, attachToRoot, component);
  }

  @NonNull
  public static AmityItemAudioMessageReceiverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_audio_message_receiver, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemAudioMessageReceiverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityItemAudioMessageReceiverBinding>inflateInternal(inflater, R.layout.amity_item_audio_message_receiver, null, false, component);
  }

  public static AmityItemAudioMessageReceiverBinding bind(@NonNull View view) {
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
  public static AmityItemAudioMessageReceiverBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityItemAudioMessageReceiverBinding)bind(component, view, R.layout.amity_item_audio_message_receiver);
  }
}