package com.mddt.components.material.design.kit.resource.binding;

import com.mddt.components.material.design.kit.application.MaterialContext;
import com.mddt.components.material.design.kit.widget.view.design.MaterialView;

public abstract class MaterialBinding {
	private final MaterialContext context;
	private MaterialView _root;

	public MaterialBinding(
			MaterialContext context
	) { this.context = context; }

	public final MaterialContext getMaterialContext() {
		return this.context;
	}

	public MaterialView getRoot() { return null; }
}
