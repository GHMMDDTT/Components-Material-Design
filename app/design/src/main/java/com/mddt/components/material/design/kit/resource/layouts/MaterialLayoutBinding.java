package com.mddt.components.material.design.kit.resource.layouts;

import com.mddt.components.material.design.kit.application.MaterialContext;
import com.mddt.components.material.design.kit.resource.Resource;
import com.mddt.components.material.design.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.design.kit.widget.view.design.MaterialView.MaterialView$Binding;

public abstract class MaterialLayoutBinding<T extends MaterialBinding>
		extends Resource {

	private T _root;

	public MaterialLayoutBinding(MaterialContext context) { super(context); }

	public abstract T onInflate();

	public final T getRoot() {
		if (this._root == null) {
			_root = (T) new MaterialView$Binding(getMaterialContext());
		}
		return _root;
	}
}
