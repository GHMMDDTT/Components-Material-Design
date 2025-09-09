package com.mddt.components.material.kit.resource;

import com.mddt.components.material.kit.application.MaterialContext;

public abstract class Resource {
	private final MaterialContext context;

	public Resource(
			MaterialContext context
	) { this.context = context; }

	public final MaterialContext getMaterialContext() { return context; }
}