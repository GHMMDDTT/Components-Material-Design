package com.mddt.components.material.design.kit.resource.themes;

import android.content.res.Configuration;

import com.mddt.components.material.design.kit.application.MaterialContext;

public class MaterialTheme {
	private final MaterialContext context;
	private final MaterialThemeDesign themeDesignDay;
	private final MaterialThemeDesign themeDesignNight;

	public MaterialTheme(
			MaterialContext context
	) {
		this.context = context;
		this.themeDesignDay = new MaterialThemeDesign.MaterialThemeDesign$DayColor(context);
		this.themeDesignNight = new MaterialThemeDesign.MaterialThemeDesign$NightColor(context);
	}

	public MaterialThemeDesign getTheme() {
		return isNightMode() ? themeDesignNight : themeDesignDay;
	}

	public MaterialThemeDesign getThemeDesignDay() { return themeDesignDay; }

	public MaterialThemeDesign getThemeDesignNight() {
		return themeDesignNight;
	}

	public final boolean isNightMode() {
		return (context.getContext()
				.getResources()
				.getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;
	}

	public final boolean isDayMode() { return !isNightMode(); }

	public final MaterialContext getContext() { return context; }
}
