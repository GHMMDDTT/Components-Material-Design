package com.mddt.components.material.kit.widget.viewgroup.design;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

import com.mddt.components.material.kit.application.MaterialContext;
import com.mddt.components.material.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.kit.widget.view.design.MaterialView;

import java.util.ArrayList;

public abstract class MaterialViewGroup extends MaterialView {
	// ---------- Field : Started ---------- \\

	private final ArrayList<MaterialView> views = new ArrayList<>();

	private final ListenerInformation mListenerInformation = new ListenerInformation();

	// ---------- Field : Ended ---------- \\

	// ---------- Constructor : Started ---------- \\

	public MaterialViewGroup(MaterialContext materialContext) {
		super(materialContext);
	}

	public MaterialViewGroup(MaterialContext materialContext, MaterialViewGroup$Binding listener) {
		super(materialContext, listener);
	}

	// ---------- Constructor : Ended ---------- \\

	// ---------- Method : Started ---------- \\

	public void addChildView(MaterialView child) {
		this.views.add(child);
		if (this.mListenerInformation.onStateChildrenChangedListener != null) {
			this.mListenerInformation.onStateChildrenChangedListener.onAttachedChildren(child);
		}
	}

	public void addChildView(MaterialView child, int index) {
		this.views.add(index, child);
		if (this.mListenerInformation.onStateChildrenChangedListener != null) {
			this.mListenerInformation.onStateChildrenChangedListener.onAttachedChildren(child);
		}
	}

	public void removeChildView(MaterialView child) {
		this.views.remove(child);
		if (this.mListenerInformation.onStateChildrenChangedListener != null) {
			this.mListenerInformation.onStateChildrenChangedListener.onDetachedChildren(child);
		}
	}

	public void removeChildViewAt(int index) {
		if (this.mListenerInformation.onStateChildrenChangedListener != null) {
			this.mListenerInformation.onStateChildrenChangedListener.onDetachedChildren(this.getChildViewAt(index));
		}
		this.views.remove(index);
	}

	public MaterialView getChildViewAt(int index) {
		return this.views.get(index);
	}

	public void setOnStateChildrenChangedListener(OnStateChildrenChangedListener listener) {
		this.mListenerInformation.onStateChildrenChangedListener = listener;
	}

	public OnStateChildrenChangedListener getOnStateChildrenChangedListener() {
		return this.mListenerInformation.onStateChildrenChangedListener;
	}

	@Override
	protected abstract void onMeasure(
			int widthMeasureSpec,
			int heightMeasureSpec
	);

	@Override protected abstract void onDraw(@NonNull Canvas canvas);

	@Override
	protected abstract void onLayout(
			boolean changed,
			int left,
			int top,
			int right,
			int bottom
	);

	@CallSuper
	@Override
	public void invalidate() {
		super.invalidate();
		for (MaterialView view : this.views) {
			view.invalidate();
		}
	}

	@CallSuper
	@Override
	public void requestLayout() {
		super.requestLayout();
		for (MaterialView view : this.views) {
			view.requestLayout();
		}
	}

	@Override
	public MaterialViewGroup$Binding getMaterialBinding() {
		return super.getMaterialBinding();
	}

	// ---------- Method : Ended ---------- \\

	// ---------- Class : Started ---------- \\

	public abstract static class MaterialViewGroup$Binding extends MaterialView$Binding {

		// ---------- Constructor : Started ---------- \\

		public MaterialViewGroup$Binding(MaterialContext context) { super(context); }

		// ---------- Constructor : Ended ---------- \\

		// ---------- Method : Started ---------- \\

		public abstract MaterialViewGroup$Binding addChild(MaterialBinding child);

		public abstract MaterialViewGroup$Binding addChild(MaterialBinding child, int index);

		public abstract MaterialViewGroup$Binding removeChild(MaterialBinding child);

		public abstract MaterialViewGroup$Binding removeChildAt(int index);

		public abstract MaterialBinding getChildViewAt(int index);

		@Override public MaterialViewGroup$Binding width(int width) { return (MaterialViewGroup$Binding) super.width(width); }

		@Override public MaterialViewGroup$Binding height(int height) { return (MaterialViewGroup$Binding) super.height(height); }

		@Override public MaterialViewGroup$Binding enabled(boolean enabled) { return (MaterialViewGroup$Binding) super.enabled(enabled); }

		@Override public MaterialViewGroup$Binding visibility(@Visibility int visibility) { return (MaterialViewGroup$Binding) super.visibility(visibility); }

		@Override public MaterialViewGroup$Binding id(int id) { return (MaterialViewGroup$Binding) super.id(id); }

		@Override public MaterialViewGroup$Binding background(Drawable drawable) { return (MaterialViewGroup$Binding) super.background(drawable); }

		@Override public MaterialViewGroup$Binding backgroundColor(int color) { return (MaterialViewGroup$Binding) super.backgroundColor(color); }

		@Override public MaterialViewGroup$Binding alpha(float alpha) { return (MaterialViewGroup$Binding) super.alpha(alpha); }

		@Override public MaterialViewGroup$Binding elevation(float elevation) { return (MaterialViewGroup$Binding) super.elevation(elevation); }

		@Override public MaterialViewGroup$Binding rotation(float rotation) { return (MaterialViewGroup$Binding) super.rotation(rotation); }

		@Override public MaterialViewGroup$Binding rotationX(float rotationX) { return (MaterialViewGroup$Binding) super.rotationX(rotationX); }

		@Override public MaterialViewGroup$Binding rotationY(float rotationY) { return (MaterialViewGroup$Binding) super.rotationY(rotationY); }

		@Override public MaterialViewGroup$Binding translationX(float translationX) { return (MaterialViewGroup$Binding) super.translationX(translationX); }

		@Override public MaterialViewGroup$Binding translationY(float translationY) { return (MaterialViewGroup$Binding) super.translationY(translationY); }

		@Override public MaterialViewGroup$Binding translationZ(float translationZ) { return (MaterialViewGroup$Binding) super.translationZ(translationZ); }

		@Override public MaterialViewGroup$Binding scaleX(float scaleX) { return (MaterialViewGroup$Binding) super.scaleX(scaleX); }

		@Override public MaterialViewGroup$Binding scaleY(float scaleY) { return (MaterialViewGroup$Binding) super.scaleY(scaleY); }

		@Override public MaterialViewGroup$Binding pivotX(float pivotX) { return (MaterialViewGroup$Binding) super.pivotX(pivotX); }

		@Override public MaterialViewGroup$Binding pivotY(float pivotY) { return (MaterialViewGroup$Binding) super.pivotY(pivotY); }

		@Override public MaterialViewGroup$Binding z(float z) { return (MaterialViewGroup$Binding) super.z(z); }

		@Override public MaterialViewGroup$Binding y(float y) { return (MaterialViewGroup$Binding) super.y(y); }

		@Override public MaterialViewGroup$Binding x(float x) { return (MaterialViewGroup$Binding) super.x(x); }

		@Override public MaterialViewGroup$Binding onPress(OnPressedListener listener) { return (MaterialViewGroup$Binding) super.onPress(listener); }

		@Override public MaterialViewGroup$Binding onRelease(OnReleasedListener listener) { return (MaterialViewGroup$Binding) super.onRelease(listener); }

		@Override public MaterialViewGroup$Binding onHoldClick(OnHoldClickListener listener) { return (MaterialViewGroup$Binding) super.onHoldClick(listener); }

		@Override public MaterialViewGroup$Binding onMoveClick(OnMoveClickListener listener) { return (MaterialViewGroup$Binding) super.onMoveClick(listener); }

		@Override public MaterialViewGroup$Binding onFocusChange(OnFocusChangeListener listener) { return (MaterialViewGroup$Binding) super.onFocusChange(listener); }

		@Override public MaterialViewGroup$Binding onLayoutChange(OnLayoutChangeListener listener) { return (MaterialViewGroup$Binding) super.onLayoutChange(listener); }

		@Override public MaterialViewGroup$Binding onAttachStateChange(OnAttachStateChangeListener listener) { return (MaterialViewGroup$Binding) super.onAttachStateChange(listener); }

		@Override public MaterialViewGroup$Binding onMarginChange(OnMarginChangeListener listener) { return (MaterialViewGroup$Binding) super.onMarginChange(listener); }

		@Override public MaterialViewGroup$Binding onPaddingChange(OnPaddingChangeListener listener) { return (MaterialViewGroup$Binding) super.onPaddingChange(listener); }

		public abstract MaterialViewGroup$Binding onStateChildrenChanged(OnStateChildrenChangedListener listener);

		// ---------- Method : Ended ---------- \\
	}

	public static abstract class OnStateChildrenChangedListener {
		public abstract void onAttachedChildren(MaterialView view);
		public abstract void onDetachedChildren(MaterialView view);
	}

	private static class ListenerInformation {
		public OnStateChildrenChangedListener onStateChildrenChangedListener;
	}

	// ---------- Class : Ended ---------- \\
}
