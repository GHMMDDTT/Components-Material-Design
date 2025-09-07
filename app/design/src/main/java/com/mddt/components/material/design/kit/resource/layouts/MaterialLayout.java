package com.mddt.components.material.design.kit.resource.layouts;

import android.util.Log;

import com.mddt.components.material.design.kit.application.MaterialContext;
import com.mddt.components.material.design.kit.resource.Resource;
import com.mddt.components.material.design.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.design.kit.widget.view.design.MaterialView$Binding;

public abstract class MaterialLayout
		extends Resource {

	public MaterialLayout(MaterialContext context) { super(context); }

	public abstract MaterialBinding onInflate();

	public <T extends MaterialBinding> T MaterialView$LayoutBinding(
			MaterialLayoutBinding<MaterialView$Binding> listener
	) {

		if (listener != null) {
			return (T) listener.onInflate();
		}
		throw new UnsupportedOperationException("Not supported the 'MaterialView$LayoutBinding(listener: MaterialLayoutBinding<MaterialView$Binding>): MaterialBinding' method with a null parameter.");
	}
}
