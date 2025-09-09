package com.mddt.components.material.kit.widget.framelayout.design;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import com.mddt.components.material.kit.application.MaterialContext;
import com.mddt.components.material.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.kit.widget.viewgroup.design.MaterialViewGroup;

public class MaterialFrameLayout extends MaterialViewGroup {
	public MaterialFrameLayout(MaterialContext materialContext) {
		super(materialContext);
	}

	public MaterialFrameLayout(
			MaterialContext materialContext,
			MaterialFrameLayout$Binding listener
	) {
		super(materialContext, listener);
		listener._mViewGroup = this;
		listener.onInflate();
	}

	@Override
	protected void onMeasure(
			int widthMeasureSpec,
			int heightMeasureSpec
	) {

	}

	@Override
	protected void onDraw(@NonNull Canvas canvas) {

	}

	@Override
	protected void onLayout(
			boolean changed,
			int left,
			int top,
			int right,
			int bottom
	) {

	}

	@Override
	public MaterialFrameLayout$Binding getMaterialBinding() {
		return (MaterialFrameLayout$Binding) super.getMaterialBinding();
	}

	public abstract static class MaterialFrameLayout$Binding extends MaterialViewGroup$Binding {
		private MaterialFrameLayout _mViewGroup;

		public MaterialFrameLayout$Binding(MaterialContext context) {
			super(context);
			this._mViewGroup = new MaterialFrameLayout(context);
		}

		@Override
		public MaterialFrameLayout$Binding addChild(MaterialBinding child) {
			this._mViewGroup.addChildView(child.getRoot());
			return this;
		}

		@Override
		public MaterialFrameLayout$Binding addChild(
				MaterialBinding child,
				int index
		) {
			this._mViewGroup.addChildView(child.getRoot(), index);
			return this;
		}

		@Override
		public MaterialFrameLayout$Binding removeChild(MaterialBinding child) {
			this._mViewGroup.removeChildView(child.getRoot());
			return this;
		}

		@Override
		public MaterialFrameLayout$Binding removeChildAt(int index) {
			this._mViewGroup.removeChildViewAt(index);
			return this;
		}

		@Override
		public MaterialBinding getChildViewAt(int index) {
			return this._mViewGroup.getChildViewAt(index).getMaterialBinding();
		}

		@Override
		public MaterialFrameLayout$Binding onStateChildrenChanged(OnStateChildrenChangedListener listener) {
			this._mViewGroup.setOnStateChildrenChangedListener(listener);
			return this;
		}

		@Override public MaterialFrameLayout$Binding width(int width) { return (MaterialFrameLayout$Binding) super.width(width); }

		@Override public MaterialFrameLayout$Binding height(int height) { return (MaterialFrameLayout$Binding) super.height(height); }

		@Override public MaterialFrameLayout$Binding enabled(boolean enabled) { return (MaterialFrameLayout$Binding) super.enabled(enabled); }

		@Override public MaterialFrameLayout$Binding visibility(@Visibility int visibility) { return (MaterialFrameLayout$Binding) super.visibility(visibility); }

		@Override public MaterialFrameLayout$Binding id(int id) { return (MaterialFrameLayout$Binding) super.id(id); }

		@Override public MaterialFrameLayout$Binding background(Drawable drawable) { return (MaterialFrameLayout$Binding) super.background(drawable); }

		@Override public MaterialFrameLayout$Binding backgroundColor(int color) { return (MaterialFrameLayout$Binding) super.backgroundColor(color); }

		@Override public MaterialFrameLayout$Binding alpha(float alpha) { return (MaterialFrameLayout$Binding) super.alpha(alpha); }

		@Override public MaterialFrameLayout$Binding elevation(float elevation) { return (MaterialFrameLayout$Binding) super.elevation(elevation); }

		@Override public MaterialFrameLayout$Binding rotation(float rotation) { return (MaterialFrameLayout$Binding) super.rotation(rotation); }

		@Override public MaterialFrameLayout$Binding rotationX(float rotationX) { return (MaterialFrameLayout$Binding) super.rotationX(rotationX); }

		@Override public MaterialFrameLayout$Binding rotationY(float rotationY) { return (MaterialFrameLayout$Binding) super.rotationY(rotationY); }

		@Override public MaterialFrameLayout$Binding translationX(float translationX) { return (MaterialFrameLayout$Binding) super.translationX(translationX); }

		@Override public MaterialFrameLayout$Binding translationY(float translationY) { return (MaterialFrameLayout$Binding) super.translationY(translationY); }

		@Override public MaterialFrameLayout$Binding translationZ(float translationZ) { return (MaterialFrameLayout$Binding) super.translationZ(translationZ); }

		@Override public MaterialFrameLayout$Binding scaleX(float scaleX) { return (MaterialFrameLayout$Binding) super.scaleX(scaleX); }

		@Override public MaterialFrameLayout$Binding scaleY(float scaleY) { return (MaterialFrameLayout$Binding) super.scaleY(scaleY); }

		@Override public MaterialFrameLayout$Binding pivotX(float pivotX) { return (MaterialFrameLayout$Binding) super.pivotX(pivotX); }

		@Override public MaterialFrameLayout$Binding pivotY(float pivotY) { return (MaterialFrameLayout$Binding) super.pivotY(pivotY); }

		@Override public MaterialFrameLayout$Binding z(float z) { return (MaterialFrameLayout$Binding) super.z(z); }

		@Override public MaterialFrameLayout$Binding y(float y) { return (MaterialFrameLayout$Binding) super.y(y); }

		@Override public MaterialFrameLayout$Binding x(float x) { return (MaterialFrameLayout$Binding) super.x(x); }

		@Override public MaterialFrameLayout$Binding onPress(OnPressedListener listener) { return (MaterialFrameLayout$Binding) super.onPress(listener); }

		@Override public MaterialFrameLayout$Binding onRelease(OnReleasedListener listener) { return (MaterialFrameLayout$Binding) super.onRelease(listener); }

		@Override public MaterialFrameLayout$Binding onHoldClick(OnHoldClickListener listener) { return (MaterialFrameLayout$Binding) super.onHoldClick(listener); }

		@Override public MaterialFrameLayout$Binding onMoveClick(OnMoveClickListener listener) { return (MaterialFrameLayout$Binding) super.onMoveClick(listener); }

		@Override public MaterialFrameLayout$Binding onFocusChange(OnFocusChangeListener listener) { return (MaterialFrameLayout$Binding) super.onFocusChange(listener); }

		@Override public MaterialFrameLayout$Binding onLayoutChange(OnLayoutChangeListener listener) { return (MaterialFrameLayout$Binding) super.onLayoutChange(listener); }

		@Override public MaterialFrameLayout$Binding onAttachStateChange(OnAttachStateChangeListener listener) { return (MaterialFrameLayout$Binding) super.onAttachStateChange(listener); }

		@Override public MaterialFrameLayout$Binding onMarginChange(OnMarginChangeListener listener) { return (MaterialFrameLayout$Binding) super.onMarginChange(listener); }

		@Override public MaterialFrameLayout$Binding onPaddingChange(OnPaddingChangeListener listener) { return (MaterialFrameLayout$Binding) super.onPaddingChange(listener); }
	}
}
