// Generated by view binder compiler. Do not edit!
package com.android.architecture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.android.architecture.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBaseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout clContainer;

  @NonNull
  public final FrameLayout flContainer;

  @NonNull
  public final LinearLayout layoutProgress;

  @NonNull
  public final ProgressBar pbProgress;

  @NonNull
  public final AppCompatTextView tvProgress;

  private ActivityBaseBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout clContainer, @NonNull FrameLayout flContainer,
      @NonNull LinearLayout layoutProgress, @NonNull ProgressBar pbProgress,
      @NonNull AppCompatTextView tvProgress) {
    this.rootView = rootView;
    this.clContainer = clContainer;
    this.flContainer = flContainer;
    this.layoutProgress = layoutProgress;
    this.pbProgress = pbProgress;
    this.tvProgress = tvProgress;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_base, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBaseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout clContainer = (ConstraintLayout) rootView;

      id = R.id.fl_container;
      FrameLayout flContainer = rootView.findViewById(id);
      if (flContainer == null) {
        break missingId;
      }

      id = R.id.layoutProgress;
      LinearLayout layoutProgress = rootView.findViewById(id);
      if (layoutProgress == null) {
        break missingId;
      }

      id = R.id.pbProgress;
      ProgressBar pbProgress = rootView.findViewById(id);
      if (pbProgress == null) {
        break missingId;
      }

      id = R.id.tvProgress;
      AppCompatTextView tvProgress = rootView.findViewById(id);
      if (tvProgress == null) {
        break missingId;
      }

      return new ActivityBaseBinding((ConstraintLayout) rootView, clContainer, flContainer,
          layoutProgress, pbProgress, tvProgress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
