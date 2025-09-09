package com.mddt.components.material.kit.application;

import android.content.Context;

import com.mddt.components.material.kit.resource.themes.MaterialTheme;

public interface MaterialContext {
	public abstract Context getContext();
	public abstract MaterialContext getMaterialContext();
	public abstract MaterialTheme getMaterialTheme();
	public abstract void setMaterialTheme(MaterialTheme theme);
}