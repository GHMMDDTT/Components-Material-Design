package com.mddt.components.material.kit.resource.layouts;

import com.mddt.components.material.kit.application.MaterialContext;
import com.mddt.components.material.kit.resource.Resource;
import com.mddt.components.material.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.kit.widget.view.design.MaterialView.MaterialView$Binding;

public abstract class MaterialLayout
		extends Resource {

	public MaterialLayout(MaterialContext context) { super(context); }

	public abstract MaterialBinding onInflate();

	public <T extends MaterialBinding> T MaterialView$LayoutBinding(
			MaterialView$Binding listener
	) {

		if (listener != null) {
			return listener.onInflate();
		}
		throw new UnsupportedOperationException("Not supported the 'MaterialView$LayoutBinding(listener: MaterialLayoutBinding<MaterialView$Binding>): MaterialBinding' method with a null parameter.");
	}
}
