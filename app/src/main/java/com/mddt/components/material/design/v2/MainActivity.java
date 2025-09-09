package com.mddt.components.material.design.v2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.mddt.components.material.kit.application.MaterialActivity;
import com.mddt.components.material.kit.resource.binding.MaterialBinding;
import com.mddt.components.material.kit.resource.layouts.MaterialLayout;
import com.mddt.components.material.kit.widget.view.design.MaterialView;
import com.mddt.components.material.kit.widget.view.design.MaterialView.MaterialView$Binding;

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

	public class MyLayoutClass extends MaterialView$Binding {
		public MyLayoutClass() {
			super(MainActivity.this.getMaterialContext());
		}

		@Override
		public MaterialView$Binding onInflate() {
			return backgroundColor(getMaterialTheme().getTheme().getColorOnSurface()).onHoldClick(new MaterialView.OnHoldClickListener() {
				@Override
				public void onHold(
						MaterialView view,
						long holdTime
				) {
					backgroundColor(getMaterialTheme().getTheme().getColorSurface());
					if (holdTime > 500) backgroundColor(getMaterialTheme().getTheme().getColorSecondary());
					if (holdTime > 1000) backgroundColor(getMaterialTheme().getTheme().getColorBackground());
					if (holdTime > 1500) backgroundColor(getMaterialTheme().getTheme().getColorOnSurface());
				}
			});
		}
	}
}