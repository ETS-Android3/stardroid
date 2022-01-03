package com.google.android.stardroid.activities.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import com.google.android.stardroid.R;
import com.google.android.stardroid.util.MiscUtil;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * End User License agreement dialog.
 * Created by johntaylor on 4/3/16.
 */
@AndroidEntryPoint
public class NoSearchResultsDialogFragment extends DialogFragment {
  private static final String TAG = MiscUtil.getTag(NoSearchResultsDialogFragment.class);
  @Inject Activity parentActivity;

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    return new AlertDialog.Builder(parentActivity)
        .setTitle(R.string.no_search_title).setMessage(R.string.no_search_results_text2)
        .setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface dialog1, int whichButton) {
            Log.d(TAG, "No search results Dialog closed");
            dialog1.dismiss();
          }
        }).create();
  }
}
