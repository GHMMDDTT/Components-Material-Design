package com.mddt.components.material.design.kit.widget.view.design;

import static com.mddt.components.material.design.kit.widget.view.design.MaterialView.LayoutParameters.WRAP_CONTENT;
import static com.mddt.components.material.design.kit.widget.view.design.MaterialView.LayoutParameters.MATCH_PARENT;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.CallSuper;
import androidx.annotation.IntDef;
import androidx.annotation.Nullable;

import com.mddt.components.material.design.kit.application.MaterialContext;
import com.mddt.components.material.design.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.design.kit.resource.layouts.MaterialLayoutBinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MaterialView
		extends View {

	// ---------- Fields : Started ---------- \\

	private final ListenerInformation mListenerInformation = new ListenerInformation();
	private final ParametersInformation mParametersInformation = new ParametersInformation();
	private final MaterialContext materialContext;

	private final View.OnTouchListener _mListenerToucher = new View.OnTouchListener() {
		private Handler holdHandler = new Handler(Looper.getMainLooper()); // Usa Looper.getMainLooper()
		private Runnable holdRunnable;
		private long pressStartTime = 0;

		private static final long HOLD_THRESHOLD_MS = 250;

		@Override
		public boolean onTouch(
				View view,
				MotionEvent motionEvent
		) {
			switch (motionEvent.getAction()) {
				case MotionEvent.ACTION_DOWN: {
					pressStartTime = System.currentTimeMillis();

					if (mListenerInformation.mOnPressedListener != null) {
						mListenerInformation.mOnPressedListener.onPressed(MaterialView.this);
					}

					holdRunnable = new Runnable() {
						@Override
						public void run() {
							if (mListenerInformation.mOnHoldListener != null) {
								long holdDuration = System.currentTimeMillis() - pressStartTime;
								mListenerInformation.mOnHoldListener.onHold(MaterialView.this, holdDuration);
							}
						}
					};
					holdHandler.postDelayed(holdRunnable, HOLD_THRESHOLD_MS);
					return true;
				}
				case MotionEvent.ACTION_MOVE: {
					break;
				}
				case MotionEvent.ACTION_UP: {
					holdHandler.removeCallbacks(holdRunnable);
					if (mListenerInformation.mOnReleasedListener != null) {
						mListenerInformation.mOnReleasedListener.onReleased(MaterialView.this);
					}
					pressStartTime = 0;
					break;
				}
			}
			return true;
		}
	};

	// ---------- Fields : Ended ---------- \\

	// ---------- Constructor : Started ---------- \\


	public MaterialView(MaterialContext materialContext) {
		super(materialContext.getContext());
		this.materialContext = materialContext;
		setBackgroundColor(getMaterialContext().getMaterialTheme().getTheme().getColorSurface());
	}

	public MaterialView(
			MaterialContext materialContext,
			MaterialLayoutBinding<MaterialView$Binding> listener
	) {
		super(materialContext.getContext());
		listener.getRoot()._mView = this;
		listener.onInflate();
		this.materialContext = materialContext;
	}

	// ---------- Constructor : Ended ---------- \\

	// ---------- Method : Started ---------- \\

	@Override public final void setLayoutParams(ViewGroup.LayoutParams params) { super.setLayoutParams(params); }

	public void setLayoutParameters(LayoutParameters params) {
		this.mParametersInformation.mLayoutParameters = params;
		invalidate();
	}

	public LayoutParameters getLayoutParameters() { return this.mParametersInformation.mLayoutParameters; }

	public void setMarginParameters(MarginParameters params) {
		this.mListenerInformation.mMarginParameters = params;
		this.mListenerInformation.mMarginParameters.context = this.getContext();
		invalidate();
	}

	public MarginParameters getMarginParameters() { return this.mListenerInformation.mMarginParameters; }

	public void setOnMarginChangedListener(OnMarginChangeListener listener) {
		this.mParametersInformation.mOnMarginChangeListener = listener;
		this.invalidate();
	}

	public OnMarginChangeListener getOnMarginChangedListener() { return mParametersInformation.mOnMarginChangeListener; }

	public void setPaddingParameter(PaddingParameters padding) {
		this.mParametersInformation.mPaddingParameters = padding;
		this.mParametersInformation.mPaddingParameters.context = this.getContext();
		invalidate();
	}

	public PaddingParameters getPaddingParameters() { return this.mParametersInformation.mPaddingParameters; }

	public void setOnPaddingChangedListener(OnPaddingChangeListener listener) {
		this.mListenerInformation.mOnPaddingChangeListener = listener;
		this.invalidate();
	}

	public OnPaddingChangeListener getOnPaddingChangedListener() { return mListenerInformation.mOnPaddingChangeListener; }

	public void setOnPressedListener(OnPressedListener listener) {
		this.mListenerInformation.mOnPressedListener = listener;
		this.invalidate();
	}

	public OnPressedListener getOnPressedListener() { return mListenerInformation.mOnPressedListener; }

	public void setOnReleasedListener(OnReleasedListener listener) {
		this.mListenerInformation.mOnReleasedListener = listener;
		this.invalidate();
	}

	public OnReleasedListener getOnReleasedListener() { return mListenerInformation.mOnReleasedListener; }

	public void setOnHoldListener(OnHoldListener listener) {
		this.mListenerInformation.mOnHoldListener = listener;
		this.invalidate();
	}

	public OnHoldListener getOnHoldListener() { return mListenerInformation.mOnHoldListener; }

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

	@Override public int getPaddingBottom() { throw new UnsupportedOperationException("Not supported the 'int getPaddingBottom()' method, user the 'getPaddingParameters().getPaddingBottom(): int' method instead"); }

	@Override public int getPaddingLeft() { throw new UnsupportedOperationException("Not supported the 'int getPaddingLeft()' method, user the 'getPaddingParameters().getPaddingLeft(): int' method instead"); }

	@Override public int getPaddingRight() { throw new UnsupportedOperationException("Not supported the 'int getPaddingRight()' method, user the 'getPaddingParameters().getPaddingRight(): int' method instead"); }

	@Override public int getPaddingTop() { throw new UnsupportedOperationException("Not supported the 'int getPaddingTop()' method, user the 'getPaddingParameters().getPaddingTop(): int' method instead"); }

	@Override public int getPaddingStart() { throw new UnsupportedOperationException("Not supported the 'int getPaddingStart()' method, user the 'getPaddingParameters().getPaddingStart(): int' method instead"); }

	@Override public int getPaddingEnd() { throw new UnsupportedOperationException("Not supported the 'int getPaddingEnd()' method, user the 'getPaddingParameters().getPaddingEnd(): int' method instead"); }

	@Override protected int getBottomPaddingOffset() { throw new UnsupportedOperationException("Not supported the 'int getBottomPaddingOffset()' method, user the 'getPaddingParameters().getPaddingBottomOffset(): int' method instead"); }

	@Override protected int getTopPaddingOffset() { throw new UnsupportedOperationException("Not supported the 'int getTopPaddingOffset()' method, user the 'getPaddingParameters().getPaddingTopOffset(): int' method instead"); }

	@Override protected int getRightPaddingOffset() { throw new UnsupportedOperationException("Not supported the 'int getRightPaddingOffset()' method, user the 'getPaddingParameters().getPaddingRightOffset(): int' method instead"); }

	@Override protected int getLeftPaddingOffset() { throw new UnsupportedOperationException("Not supported the 'int getLeftPaddingOffset()' method, user the 'getPaddingParameters().getPaddingLeftOffset(): int' method instead"); }

	@Override public void setOnClickListener(@Nullable OnClickListener listener) { throw new UnsupportedOperationException("Not supported the 'void setOnClickListener(l: @Nullable OnClickListener)' method, user the 'setOnPressedListener(listener: OnPressedListener)' & 'setOnReleasedListener(listener: OnReleasedListener)' method instead"); }

	@Override public void setOnLongClickListener(@Nullable OnLongClickListener listener) { throw new UnsupportedOperationException("Not supported the 'void setOnLongClickListener(l: @Nullable OnLongClickListener)' method"); }

	@Override public void setOnTouchListener(OnTouchListener listener) { throw new UnsupportedOperationException("Not supported the 'void setOnTouchListener(listener: OnTouchListener)' method"); }

	@Override
	public void invalidate() {
		super.invalidate();
		if (this.mParametersInformation.mLayoutParameters != null) {
			super.setLayoutParams(new ViewGroup.MarginLayoutParams(this.mParametersInformation.mLayoutParameters.mWidth, this.mParametersInformation.mLayoutParameters.mHeight) {{
				if (mListenerInformation.mMarginParameters != null) {
					setMargins(mListenerInformation.mMarginParameters.mLeft, mListenerInformation.mMarginParameters.mTop, mListenerInformation.mMarginParameters.mRight, mListenerInformation.mMarginParameters.mBottom);
					if (mParametersInformation.mOnMarginChangeListener != null) {
						mParametersInformation.mOnMarginChangeListener.onMarginChange(mListenerInformation.mMarginParameters.mLeft, mListenerInformation.mMarginParameters.mTop, mListenerInformation.mMarginParameters.mRight, mListenerInformation.mMarginParameters.mBottom);
					}
				}
			}});
		}

		if (this.mParametersInformation.mPaddingParameters != null) {
			super.setPadding(this.mParametersInformation.mPaddingParameters.mLeft, this.mParametersInformation.mPaddingParameters.mTop, this.mParametersInformation.mPaddingParameters.mRight, this.mParametersInformation.mPaddingParameters.mBottom);
			if (this.mListenerInformation.mOnPaddingChangeListener != null) {
				this.mListenerInformation.mOnPaddingChangeListener.onPaddingChange(this.mParametersInformation.mPaddingParameters.mLeft, this.mParametersInformation.mPaddingParameters.mTop, this.mParametersInformation.mPaddingParameters.mRight, this.mParametersInformation.mPaddingParameters.mBottom);
			}
		}

		super.setOnTouchListener(_mListenerToucher);
	}

	public final MaterialContext getMaterialContext() {
		return materialContext;
	}

	// ---------- Method : Ended ---------- \\

	// ---------- Class : Started ---------- \\

	public static class MaterialView$Binding
			extends MaterialBinding {

		// ---------- Field : Started ---------- \\

		private MaterialView _mView;
		private final LayoutParameters _mLayoutParams = new LayoutParameters(WRAP_CONTENT, WRAP_CONTENT);

		// ---------- Field : Ended ---------- \\

		// ---------- Constructor : Started ---------- \\

		public MaterialView$Binding(MaterialContext context) {
			super(context);
			getRoot();
		}

		// ---------- Constructor : Ended ---------- \\

		// ---------- Method : Started ---------- \\

		public MaterialView$Binding width(int width) { this._mLayoutParams.mWidth = width; invalidate(); return this; }

		public MaterialView$Binding height(int height) { this._mLayoutParams.mHeight = height;  invalidate(); return this; }

		public MaterialView$Binding enabled(boolean enabled) { this._mView.setEnabled(enabled); return this; }

		public MaterialView$Binding visibility(@Visibility int visibility) { this._mView.setVisibility(visibility); return this; }

		public MaterialView$Binding id(int id) { this._mView.setId(id); return this; }

		public MaterialView$Binding background(Drawable drawable) { this._mView.setBackground(drawable); return this; }

		public MaterialView$Binding backgroundColor(int color) { this._mView.setBackgroundColor(color); return this; }

		public MaterialView$Binding onPress(OnPressedListener listener) { this._mView.setOnPressedListener(listener); return this; }

		public MaterialView$Binding onRelease(OnReleasedListener listener) { this._mView.setOnReleasedListener(listener); return this; }

		public MaterialView$Binding onHold(OnHoldListener listener) { this._mView.setOnHoldListener(listener); return this; }

		public MaterialView$Binding onMarginChange(OnMarginChangeListener listener) { this._mView.setOnMarginChangedListener(listener); return this; }

		public MaterialView$Binding onPaddingChange(OnPaddingChangeListener listener) { this._mView.setOnPaddingChangedListener(listener); return this; }

		public <T extends MaterialView> T findSubRootByIdAndGet(int id) { return this._mView.findViewById(id); }

		@CallSuper protected void invalidate() { this._mView.setLayoutParameters(this._mLayoutParams); }

		@Override public MaterialView getRoot() { return this._mView == null ? (this._mView = new MaterialView(getMaterialContext())) : this._mView; }

		// ---------- Method : Ended ---------- \\
	}

	public static class LayoutParameters {
		// ---------- Field : Started ---------- \\

		public static final int WRAP_CONTENT = -2;
		public static final int MATCH_PARENT = -1;

		private int mWidth;
		private int mHeight;

		// ---------- Field : Ended ---------- \\

		// ---------- Constructor : Started ---------- \\

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

		// ---------- Constructor : Ended ---------- \\

		// ---------- Method : Started ---------- \\

		public void setHeight(int _mHeight) { this.mHeight = _mHeight; }

		public void setWidth(int _mWidth) { this.mWidth = _mWidth; }

		public int getHeight() { return mHeight; }

		public int getWidth() { return mWidth; }

		// ---------- Method : Ended ---------- \\
	}

	public abstract static class PaddingParameters {
		// ---------- Field : Started ---------- \\

		private int mLeft;
		private int mTop;
		private int mRight;
		private int mBottom;
		private Context context;

		// ---------- Field : Ended ---------- \\

		// ---------- Constructor : Started ---------- \\

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

		public PaddingParameters(
				int vertical,
				int horizontal
		) {
			this.mLeft = horizontal;
			this.mTop = vertical;
			this.mRight = horizontal;
			this.mBottom = vertical;
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

		// ---------- Constructor : Ended ---------- \\

		// ---------- Method : Started ---------- \\

		public void setPaddingBottom(int _mBottom) { this.mBottom = _mBottom; }

		public int getPaddingBottom() { return mBottom; }

		public void setPaddingLeft(int _mLeft) { this.mLeft = _mLeft; }

		public int getPaddingLeft() { return mLeft; }

		public void setPaddingRight(int _mRight) { this.mRight = _mRight; }

		public int getPaddingRight() { return mRight; }

		public void setPaddingTop(int _mTop) { this.mTop = _mTop; }

		public int getPaddingTop() { return mTop; }

		public void setPaddingHorizontal(
				int horizontal
		) {
			this.mLeft = horizontal;
			this.mRight = horizontal;
		}

		public void setPaddingVertical(
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

		public abstract int getPaddingLeftOffset();
		public abstract int getPaddingTopOffset();
		public abstract int getPaddingRightOffset();
		public abstract int getPaddingBottomOffset();

		public abstract int getPaddingHorizontalOffset();
		public abstract int getPaddingVerticalOffset();

		public abstract int getPaddingStartOffset();
		public abstract int getPaddingEndOffset();

		// ---------- Method : Ended ---------- \\
	}

	public abstract static class MarginParameters {
		// ---------- Field : Started ---------- \\

		private int mLeft;
		private int mTop;
		private int mRight;
		private int mBottom;
		private Context context;

		// ---------- Field : Ended ---------- \\

		// ---------- Constructor : Started ---------- \\

		public MarginParameters(
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

		public MarginParameters(
				int vertical,
				int horizontal
		) {
			this.mLeft = horizontal;
			this.mTop = vertical;
			this.mRight = horizontal;
			this.mBottom = vertical;
		}

		public MarginParameters(
				int padding
		) {
			this.mLeft = padding;
			this.mTop = padding;
			this.mRight = padding;
			this.mBottom = padding;
		}

		public MarginParameters(
				MarginParameters paddingParameters
		) {
			this.mLeft = paddingParameters.mLeft;
			this.mTop = paddingParameters.mTop;
			this.mRight = paddingParameters.mRight;
			this.mBottom = paddingParameters.mBottom;
		}

		public MarginParameters() {}

		// ---------- Constructor : Started ---------- \\

		// ---------- Method : Ended ---------- \\

		public void setMarginBottom(int _mBottom) { this.mBottom = _mBottom; }

		public int getMarginBottom() { return mBottom; }

		public void setMarginLeft(int _mLeft) { this.mLeft = _mLeft; }

		public int getMarginLeft() { return mLeft; }

		public void setMarginRight(int _mRight) { this.mRight = _mRight; }

		public int getMarginRight() { return mRight; }

		public void setMarginTop(int _mTop) { this.mTop = _mTop; }

		public int getMarginTop() { return mTop; }

		public void setMarginHorizontal(
				int horizontal
		) {
			this.mLeft = horizontal;
			this.mRight = horizontal;
		}

		public void setMarginVertical(
				int vertical
		) {
			this.mTop = vertical;
			this.mBottom = vertical;
		}

		public int getMarginHorizontal() { return mLeft == mRight ? (mLeft + mRight) / 2 : -1; }

		public int getMarginVertical() { return mTop == mBottom ? (mTop + mBottom) / 2 : -1; }

		public void setMargins(
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

		public int[] getMargins() { return new int[] { mLeft, mTop, mRight, mBottom }; }

		public void setMargin(int padding) {
			this.mLeft = padding;
			this.mTop = padding;
			this.mRight = padding;
			this.mBottom = padding;
		}

		public void setStartMargin(int start) {
			boolean isRTL = context.getResources().getConfiguration().getLayoutDirection()
					== View.LAYOUT_DIRECTION_RTL;
			this.mLeft = isRTL ? start : 0;
			this.mRight = isRTL ? 0 : start;
		}

		public int getStartMargin() {
			boolean isRTL = context.getResources().getConfiguration().getLayoutDirection()
					== View.LAYOUT_DIRECTION_RTL;
			return isRTL ? mRight : mLeft;
		}

		public void setEndMargin() {
			boolean isRTL = context.getResources().getConfiguration().getLayoutDirection()
					== View.LAYOUT_DIRECTION_RTL;
			this.mLeft = isRTL ? 0 : mRight;
			this.mRight = isRTL ? mLeft : 0;
		}

		public int getEndMargin() {
			boolean isRTL = context.getResources().getConfiguration().getLayoutDirection()
					== View.LAYOUT_DIRECTION_RTL;
			return isRTL ? mLeft : mRight;
		}

		public abstract int getMarginLeftOffset();
		public abstract int getMarginTopOffset();
		public abstract int getMarginRightOffset();
		public abstract int getMarginBottomOffset();

		public abstract int getMarginHorizontalOffset();
		public abstract int getMarginVerticalOffset();

		public abstract int getMarginStartOffset();
		public abstract int getMarginEndOffset();

		// ---------- Method : Ended ---------- \\
	}

	public static abstract class OnPressedListener { public abstract void onPressed(MaterialView view);}

	public static abstract class OnReleasedListener { public abstract void onReleased(MaterialView view); }

	public static abstract class OnHoldListener { public abstract void onHold(MaterialView view, long holdTime); }

	public static abstract class OnPaddingChangeListener { public abstract void onPaddingChange(int left, int top, int right, int bottom); }

	public static abstract class OnMarginChangeListener { public abstract void onMarginChange(int left, int top, int right, int bottom); }

	private static class ParametersInformation {
		private LayoutParameters mLayoutParameters;

		private PaddingParameters mPaddingParameters;

		private OnMarginChangeListener mOnMarginChangeListener;
	}

	private static class ListenerInformation {
		private OnPaddingChangeListener mOnPaddingChangeListener;

		private MarginParameters mMarginParameters;

		private OnPressedListener mOnPressedListener;

		private OnReleasedListener mOnReleasedListener;

		private OnHoldListener mOnHoldListener;
	}

	// ---------- Class : Ended ---------- \\

	// ---------- Annotation : Started ---------- \\

	@Retention(RetentionPolicy.SOURCE)
	@Target({ ElementType.PARAMETER, ElementType.TYPE_PARAMETER })
	@IntDef( { VISIBLE, INVISIBLE, GONE } )
	public @interface Visibility { }

	// ---------- Annotation : Ended ---------- \\
}
