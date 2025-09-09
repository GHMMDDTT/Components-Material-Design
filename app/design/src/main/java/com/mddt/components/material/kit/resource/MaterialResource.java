package com.mddt.components.material.kit.resource;

import com.mddt.components.material.kit.application.MaterialContext;

public abstract class MaterialResource {
	private final MaterialContext context;

	public MaterialResource(MaterialContext context) { this.context = context; }

	public final MaterialContext getMaterialContext() { return context; }
}