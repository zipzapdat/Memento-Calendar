package com.alexstyl.specialdates.addevent.bottomsheet;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexstyl.specialdates.addevent.bottomsheet.BottomSheetPicturesDialog.Listener;

final class ImagePickerOptionViewHolder extends RecyclerView.ViewHolder {

    private final ImageView iconView;
    private final TextView labelView;

    ImagePickerOptionViewHolder(View view, ImageView iconView, TextView labelView) {
        super(view);
        this.iconView = iconView;
        this.labelView = labelView;
    }

    void bind(final IntentOptionViewModel viewModel, final Listener listener) {
        iconView.setImageDrawable(viewModel.getActivityIcon());
        labelView.setText(viewModel.getLabel());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onActivitySelected(viewModel.getIntent());
            }
        });
    }
}
