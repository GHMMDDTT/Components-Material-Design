package com.mddt.components.material.design.kit.widget.view.design;

import static com.mddt.components.material.design.kit.widget.view.design.MaterialView.LayoutParameters.WRAP_CONTENT;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

import com.mddt.components.material.design.kit.application.MaterialContext;
import com.mddt.components.material.design.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.design.kit.resource.layouts.MaterialLayoutBinding;

public class MaterialView
		extends View {
	private LayoutParameters mLayoutParameters;
	private PaddingParameters mPaddingParameters;
	private OnCountClickListener mOnCountClickListener;
	private int count;

	public static abstract class OnPaddingChangedListener {
		public abstract void onPaddingChanged(int left, int top, int right, int bottom);
	}

	public MaterialView(MaterialContext context) { super(context.getContext()); }

	public MaterialView(
			MaterialContext context,
			MaterialLayoutBinding<MaterialView$Binding> listener
	) {
		super(context.getContext());
		listener.onInflate();
	}

	@Override public final void setLayoutParams(ViewGroup.LayoutParams params) { super.setLayoutParams(params); }


	public void setLayoutParameters(LayoutParameters params) {
		this.mLayoutParameters = params;
		invalidate();
	}

	public LayoutParameters getLayoutParameters() {
		return mLayoutParameters;
	}

	@Override
	public void setPadding(
			int left,
			int top,
			int right,
			int bottom
	) { }

	@Override
	public void setPaddingRelative(
			int start,
			int top,
			int end,
			int bottom
	) { }

	public void setPaddingParameter(
			PaddingParameters padding
	) {
		this.mPaddingParameters = padding;
		this.mPaddingParameters.context = this.getContext();
		invalidate();
	}

	public PaddingParameters getPaddingParameters() {
		return mPaddingParameters;
	}

	@Override
	public void invalidate() {
		super.invalidate();
		if (mLayoutParameters != null) {
			super.setLayoutParams(new ViewGroup.LayoutParams(mLayoutParameters.mWidth, mLayoutParameters.mHeight));
		}
		if (mPaddingParameters != null) {
			super.setPadding(mPaddingParameters.mLeft, mPaddingParameters.mTop, mPaddingParameters.mRight, mPaddingParameters.mBottom);
		}

		if (mOnCountClickListener != null) {
			this.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View view) {
					mOnCountClickListener.onClickCount(MaterialView.this, count++);
				}
			});
		}
	}

	public void setOnCountClickListener(OnCountClickListener mOnCountClickListener) {
		this.mOnCountClickListener = mOnCountClickListener;
		invalidate();
	}

	public OnCountClickListener getOnCountClickListener() {
		return mOnCountClickListener;
	}

	public static class MaterialView$Binding
			extends MaterialBinding {
		private final MaterialView view;
		private final LayoutParameters layoutParams = new LayoutParameters(WRAP_CONTENT, WRAP_CONTENT);

		public MaterialView$Binding(
				MaterialContext context
		) {
			super(context);
			this.view = new MaterialView(context);
		}

		public MaterialView$Binding onClickListener(
				View.OnClickListener listener
		) {
			this.view.setOnClickListener(listener);
			return this;
		}

		public MaterialView$Binding onLongClickListener(
				View.OnLongClickListener listener
		) {
			this.view.setOnLongClickListener(listener);
			return this;
		}

		public MaterialView$Binding onCountClickListener(
				OnCountClickListener listener
		) {
			this.view.setOnCountClickListener(listener);
			return this;
		}

		public MaterialView$Binding id(
				int id
		) {
			this.view.setId(id);
			return this;
		}

		public MaterialView$Binding visibility(
				int visibility
		) {
			this.view.setVisibility(visibility);
			return this;
		}

		public MaterialView$Binding enabled(
				boolean enabled
		) {
			this.view.setEnabled(enabled);
			return this;
		}

		public MaterialView$Binding backgroundDrawable(
				Drawable drawable
		) {
			this.view.setBackgroundDrawable(drawable);
			return this;
		}

		public MaterialView$Binding backgroundColor(
				int color
		) {
			this.view.setBackgroundColor(color);
			return this;
		}

		public MaterialView$Binding width(
				int width
		) {
			this.layoutParams.mWidth = width;
			this.view.setLayoutParameters(layoutParams);
			return this;
		}

		public MaterialView$Binding height(
				int height
		) {
			this.layoutParams.mHeight = height;
			this.view.setLayoutParameters(layoutParams);
			return this;
		}

		public MaterialView$Binding paddingParameters(
				PaddingParameters padding
		) {
			this.view.setPaddingParameter(padding);
			return this;
		}

		@Override
		public MaterialView getRoot() { return this.view; }
	}

	public static class LayoutParameters {
		public static final int WRAP_CONTENT = -2;
		public static final int MATCH_PARENT = -1;

		int mWidth;
		int mHeight;

		public LayoutParameters(
				int width,
				int height
		) {
			this.mWidth = width;
			this.mHeight = height;
		}

		public LayoutParameters(
				LayoutParameters layoutParameters
		) {
			this.mWidth = layoutParameters.mWidth;
			this.mHeight = layoutParameters.mHeight;
		}

		public void setHeight(int _mHeight) { this.mHeight = _mHeight; }

		public void setWidth(int _mWidth) { this.mWidth = _mWidth; }

		public int getHeight() { return mHeight; }

		public int getWidth() { return mWidth; }
	}

	public static class PaddingParameters {
		int mLeft;
		int mTop;
		int mRight;
		int mBottom;
		Context context;

		private PaddingParameters(
				Context context,
				int left,
				int top,
				int right,
				int bottom
		) {
			this.context = context;
			this.mLeft = left;
			this.mTop = top;
			this.mRight = right;
			this.mBottom = bottom;
		}

		public PaddingParameters(
				int left,
				int top,
				int right,
				int bottom
		) {
			this.mLeft = left;
			this.mTop = top;
			this.mRight = right;
			this.mBottom = bottom;
		}

		private PaddingParameters(
				Context context,
				int vertical,
				int horizontal
		) {
			this.context = context;
			this.mLeft = horizontal;
			this.mTop = vertical;
			this.mRight = horizontal;
			this.mBottom = vertical;
		}

		public PaddingParameters(
				int vertical,
				int horizontal
		) {
			this.mLeft = horizontal;
			this.mTop = vertical;
			this.mRight = horizontal;
			this.mBottom = vertical;
		}

		private PaddingParameters(
				Context context,
				int padding
		) {
			this.context = context;
			this.mLeft = padding;
			this.mTop = padding;
			this.mRight = padding;
			this.mBottom = padding;
		}

		public PaddingParameters(
				int padding
		) {
			this.mLeft = padding;
			this.mTop = padding;
			this.mRight = padding;
			this.mBottom = padding;
		}

		public PaddingParameters(
				PaddingParameters paddingParameters
		) {
			this.mLeft = paddingParameters.mLeft;
			this.mTop = paddingParameters.mTop;
			this.mRight = paddingParameters.mRight;
			this.mBottom = paddingParameters.mBottom;
		}

		public PaddingParameters() {}

		public void setBottom(int _mBottom) { this.mBottom = _mBottom; }

		public void setLeft(int _mLeft) { this.mLeft = _mLeft; }

		public void setRight(int _mRight) { this.mRight = _mRight; }

		public void setTop(int _mTop) { this.mTop = _mTop; }

		public int getBottom() { return mBottom; }

		public int getLeft() { return mLeft; }

		public int getRight() { return mRight; }

		public int getTop() { return mTop; }

		public void setHorizontal(
				int horizontal
		) {
			this.mLeft = horizontal;
			this.mRight = horizontal;
		}

		public void setVertical(
				int vertical
		) {
			this.mTop = vertical;
			this.mBottom = vertical;
		}

		public int getPaddingHorizontal() { return mLeft == mRight ? (mLeft + mRight) / 2 : -1; }

		public int getPaddingVertical() { return mTop == mBottom ? (mTop + mBottom) / 2 : -1; }

		public void setPaddings(
				int left,
				int top,
				int right,
				int bottom
		) {
			this.mLeft = left;
			this.mTop = top;
			this.mRight = right;
			this.mBottom = bottom;
		}

		public int[] getPaddings() { return new int[] { mLeft, mTop, mRight, mBottom }; }

		public void setPadding(int padding) {
			this.mLeft = padding;
			this.mTop = padding;
			this.mRight = padding;
			this.mBottom = padding;
		}

		public void setStartPadding(int start) {
			boolean isRTL = context.getResources().getConfiguration().getLayoutDirection()
					== View.LAYOUT_DIRECTION_RTL;
			this.mLeft = isRTL ? start : 0;
			this.mRight = isRTL ? 0 : start;
		}

		public int getStartPadding() {
			boolean isRTL = context.getResources().getConfiguration().getLayoutDirection()
					== View.LAYOUT_DIRECTION_RTL;
			return isRTL ? mRight : mLeft;
		}

		public void setEndPadding() {
			boolean isRTL = context.getResources().getConfiguration().getLayoutDirection()
					== View.LAYOUT_DIRECTION_RTL;
			this.mLeft = isRTL ? 0 : mRight;
			this.mRight = isRTL ? mLeft : 0;
		}

		public int getEndPadding() {
			boolean isRTL = context.getResources().getConfiguration().getLayoutDirection()
					== View.LAYOUT_DIRECTION_RTL;
			return isRTL ? mLeft : mRight;
		}
	}

	public static abstract class OnCountClickListener {
		public abstract void onClickCount(MaterialView view, int count);
	}
}
