package com.mddt.components.material.design.kit.resource;

import com.mddt.components.material.design.kit.application.MaterialContext;
import com.mddt.components.material.design.kit.resource.themes.MaterialTheme;

public abstract class Resource {
	private final MaterialContext context;

	public Resource(
			MaterialContext context
	) { this.context = context; }

	public final MaterialContext getMaterialContext() { return context; }
}