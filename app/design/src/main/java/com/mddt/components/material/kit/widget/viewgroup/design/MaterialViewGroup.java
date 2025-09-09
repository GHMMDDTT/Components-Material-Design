package com.mddt.components.material.kit.widget.viewgroup.design;

import android.graphics.Canvas;

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

	// ---------- Method : Ended ---------- \\

	// ---------- Class : Started ---------- \\

	public abstract static class MaterialViewGroup$Binding extends MaterialView$Binding {

		// ---------- Constructor : Started ---------- \\

		public MaterialViewGroup$Binding(MaterialContext context) {
			super(context);
		}

		// ---------- Constructor : Ended ---------- \\

		// ---------- Method : Started ---------- \\

		public abstract void childView(MaterialBinding child);

		public abstract void childView(MaterialBinding child, int index);

		public abstract void removeChildView(MaterialBinding child);

		public abstract void removeChildViewAt(int index);

		public abstract MaterialBinding getChildViewAt(int index);

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
