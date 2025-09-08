package com.mddt.components.material.design.v2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.mddt.components.material.design.kit.application.MaterialActivity;
import com.mddt.components.material.design.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.design.kit.resource.layouts.MaterialLayout;
import com.mddt.components.material.design.kit.resource.layouts.MaterialLayoutBinding;
import com.mddt.components.material.design.kit.widget.view.design.MaterialView;
import com.mddt.components.material.design.kit.widget.view.design.MaterialView.MaterialView$Binding;


public class MainActivity
		extends MaterialActivity {

	@Override
	public void onCreateActivity(
			@Nullable Bundle savedInstanceState
	) {
		Toast.makeText(MainActivity.this, "Welcome to Component Metrial Design :D", Toast.LENGTH_SHORT).show();
		Toast.makeText(MainActivity.this, "Created by: MDDT (Modification Design Developer Team) powered by: GHMMDDTT | 1.0 Alpha", Toast.LENGTH_SHORT).show();
	}

	@Override
	public MaterialLayout getMaterialLayout() {
		return new MaterialLayout(getMaterialContext()) {
			@Override
			public MaterialBinding onInflate() {
				return MaterialView$LayoutBinding(new MyLayoutClass());
			}
		};
	}

	public class MyLayoutClass extends MaterialLayoutBinding<MaterialView$Binding> {
		public MyLayoutClass() {
			super(MainActivity.this.getMaterialContext());
		}

		@Override
		public MaterialView$Binding onInflate() {
			return getRoot().backgroundColor(getMaterialTheme().getTheme().getColorOnSurface());
		}
	}
}