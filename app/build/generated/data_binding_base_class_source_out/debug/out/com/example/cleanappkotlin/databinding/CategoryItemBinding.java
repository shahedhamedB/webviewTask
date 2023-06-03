// Generated by view binder compiler. Do not edit!
package com.example.cleanappkotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cleanappkotlin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CategoryItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final AppCompatTextView categoryDesTv;

  @NonNull
  public final AppCompatImageView categoryIv;

  @NonNull
  public final AppCompatTextView categoryNameTv;

  @NonNull
  public final ConstraintLayout layout;

  private CategoryItemBinding(@NonNull CardView rootView, @NonNull AppCompatTextView categoryDesTv,
      @NonNull AppCompatImageView categoryIv, @NonNull AppCompatTextView categoryNameTv,
      @NonNull ConstraintLayout layout) {
    this.rootView = rootView;
    this.categoryDesTv = categoryDesTv;
    this.categoryIv = categoryIv;
    this.categoryNameTv = categoryNameTv;
    this.layout = layout;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CategoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CategoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.category_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CategoryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_des_tv;
      AppCompatTextView categoryDesTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryDesTv == null) {
        break missingId;
      }

      id = R.id.category_iv;
      AppCompatImageView categoryIv = ViewBindings.findChildViewById(rootView, id);
      if (categoryIv == null) {
        break missingId;
      }

      id = R.id.category_name_tv;
      AppCompatTextView categoryNameTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryNameTv == null) {
        break missingId;
      }

      id = R.id.layout;
      ConstraintLayout layout = ViewBindings.findChildViewById(rootView, id);
      if (layout == null) {
        break missingId;
      }

      return new CategoryItemBinding((CardView) rootView, categoryDesTv, categoryIv, categoryNameTv,
          layout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}