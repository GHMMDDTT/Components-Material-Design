package com.mddt.components.material.kit.resource.layouts;

import com.mddt.components.material.kit.application.MaterialContext;
import com.mddt.components.material.kit.resource.MaterialResource;
import com.mddt.components.material.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.kit.widget.framelayout.design.MaterialFrameLayout;
import com.mddt.components.material.kit.widget.framelayout.design.MaterialFrameLayout.MaterialFrameLayout$Binding;
import com.mddt.components.material.kit.widget.view.design.MaterialView;
import com.mddt.components.material.kit.widget.view.design.MaterialView.MaterialView$Binding;

public abstract class MaterialLayout
		extends MaterialResource {

	public MaterialLayout(MaterialContext context) { super(context); }

	public abstract MaterialBinding onInflate();

	public MaterialView$Binding MaterialView$LayoutBinding(MaterialView$Binding listener) {
		if (listener != null) return new MaterialView(listener.getMaterialContext(), listener).getMaterialBinding();
		throw new UnsupportedOperationException("Not supported the 'MaterialView$LayoutBinding(listener: MaterialLayoutBinding<MaterialView$Binding>): MaterialBinding' method with a null parameter.");
	}

	public MaterialFrameLayout$Binding MaterialFrameLayout$LayoutBinding(MaterialFrameLayout$Binding listener) {
		if (listener != null) return new MaterialFrameLayout(listener.getMaterialContext(), listener).getMaterialBinding();
		throw new UnsupportedOperationException("Not supported the 'MaterialFrameLayout$LayoutBinding(listener: MaterialLayoutBinding<MaterialFrameLayout$Binding>): MaterialBinding' method with a null parameter.");
	}
}
