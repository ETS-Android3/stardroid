package com.google.android.stardroid.activities.dialogs;

import android.app.Dialog;
import android.os.Bundle;

import com.google.android.stardroid.activities.DynamicStarMapActivity;
import com.google.android.stardroid.util.MiscUtil;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * Time travel dialog fragment.
 * Created by johntaylor on 4/3/16.
 */
// TODO(jontayler): see if this crashes when backgrounded on older devices and use
// the fragment in this package if so.
@AndroidEntryPoint
public class TimeTravelDialogFragment extends android.app.DialogFragment {
  private static final String TAG = MiscUtil.getTag(TimeTravelDialogFragment.class);
  @Inject DynamicStarMapActivity parentActivity;

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    return new TimeTravelDialog(parentActivity,
        parentActivity.getModel());
  }
}
