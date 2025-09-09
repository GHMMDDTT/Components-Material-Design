package com.mddt.components.material.kit.application;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.annotation.Nullable;

import com.mddt.components.material.kit.resource.layouts.MaterialLayout;
import com.mddt.components.material.kit.resource.themes.MaterialTheme;
import com.mddt.components.material.kit.widget.view.design.MaterialView;

public class MaterialActivity
		extends Activity
		implements MaterialContext {

	private MaterialTheme mMaterialTheme = new MaterialTheme(this);

	public void onInitializeActivity(@Nullable Bundle savedInstanceState) {}

	@Override
	public void setMaterialTheme(MaterialTheme theme) {
		this.mMaterialTheme = theme;
	}

	@Override
	public MaterialTheme getMaterialTheme() {
		return mMaterialTheme;
	}

	@Override
	public final MaterialContext getMaterialContext() {
		return this;
	}

	public void onCreateActivity(@Nullable Bundle savedInstanceState) {
		throw new UnsupportedOperationException("Override 'onCreateActivity(savedInstanceState: Bundle): void' instead");
	}

	public MaterialLayout getMaterialLayout() {
		throw new UnsupportedOperationException("Override 'getMaterialLayout(): MaterialLayout' instead");
	}

	@Override
	protected final void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(getMaterialLayout().onInflate().getRoot());

		setMaterialTheme(new MaterialTheme(getMaterialContext()));
		onCreateActivity(savedInstanceState);
		onInitializeActivity(savedInstanceState);
	}

	@Override
	public final void onCreate(
			@Nullable Bundle savedInstanceState,
			@Nullable PersistableBundle persistentState
	) {
		super.onCreate(savedInstanceState, persistentState);
	}

	// Method remove for the 'Android-in-Java':

	@Override
	public final void setContentView(View view) { throw new UnsupportedOperationException("Use 'getRootView(): MaterialBinding' instead"); }

	@Override
	public final void setContentView(int layoutResID) { throw new UnsupportedOperationException("Use 'getRootView(): MaterialBinding' instead"); }

	@Override
	public final void setContentView(
			View view,
			ViewGroup.LayoutParams params
	) { throw new UnsupportedOperationException("Use 'getRootView(): MaterialBinding' instead"); }

	@Override
	public final void addContentView(
			View view,
			ViewGroup.LayoutParams params
	) { throw new UnsupportedOperationException("Use 'getRootView(): MaterialBinding' instead"); }

	@Override
	public final void setTheme(@Nullable Resources.Theme theme) { throw new UnsupportedOperationException("Use 'setMaterialTheme(theme: MaterialThemeDesign): void' instead"); }

	@Override
	public final void setTitle(int titleId) { throw new UnsupportedOperationException("Use 'MaterialToolbar.setTitle(title: int): void' instead"); }

	@Override
	public final void setTitle(CharSequence title) { throw new UnsupportedOperationException("Use 'MaterialToolbar.setTitle(title: CharSequence): void' instead"); }

	@Override
	public final void setTitleColor(int textColor) { throw new UnsupportedOperationException("Use 'MaterialToolbar.setTitleColor(textColor: int): void' instead"); }

	@Override
	public final void setActionBar(@Nullable Toolbar toolbar) { throw new UnsupportedOperationException("Use 'MaterialToolbar(toolbar: Toolbar): constructor' instead"); }

	@Override
	public final void setVisible(boolean visible) { super.setVisible(visible); }

	@Override
	public View findViewById(int id) { throw new UnsupportedOperationException("Use 'findViewByIds(id: int): T' instead"); }

	public <T extends MaterialView> T getViewById(int id) { return super.findViewById(id); }

	@Override
	public Context getContext() { return this; }

	@Override
	public final void setTheme(int resid) {
		if (resid == 2131755554) {
			super.setTheme(androidx.appcompat.R.style.Theme_AppCompat_NoActionBar);
			return;
		}
		throw new UnsupportedOperationException("Use 'setMaterialTheme(theme: MaterialThemeDesign): void' instead");
	}

	@Override
	public final Resources getResources() { return super.getResources(); }
}
