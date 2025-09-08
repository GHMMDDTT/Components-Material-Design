package com.mddt.components.material.design.kit.resource.themes;

import com.mddt.components.material.design.kit.application.MaterialContext;
import com.mddt.components.material.design.kit.resource.Resource;

public abstract class MaterialThemeDesign extends Resource {
	public MaterialThemeDesign(MaterialContext context) {
		super(context);
	}

	public abstract int getColorOnContainer();
	public abstract int getColorOnContainerUnchecked();

	public abstract int getColorOnError();
	public abstract int getColorOnErrorContainer();

	public abstract int getColorOnPrimary();
	public abstract int getColorOnPrimaryContainer();
	public abstract int getColorOnPrimaryFixed();
	public abstract int getColorOnPrimaryFixedVariant();
	public abstract int getColorOnPrimarySurface();

	public abstract int getColorOnSecondary();
	public abstract int getColorOnSecondaryContainer();
	public abstract int getColorOnSecondaryFixed();
	public abstract int getColorOnSecondaryFixedVariant();

	public abstract int getColorOnSurface();
	public abstract int getColorOnSurfaceInverse();
	public abstract int getColorOnSurfaceVariant();

	public abstract int getColorOnTertiary();
	public abstract int getColorOnTertiaryContainer();
	public abstract int getColorOnTertiaryFixed();
	public abstract int getColorOnTertiaryFixedVariant();

	public abstract int getColorOnBackground();
	public abstract int getColorOnBackgroundContainer();
	public abstract int getColorOnBackgroundFloating();

	public abstract int getColorOutline();
	public abstract int getColorOutlineVariant();

	public abstract int getColorPrimary();
	public abstract int getColorPrimaryContainer();
	public abstract int getColorPrimaryFixed();
	public abstract int getColorPrimaryFixedDim();
	public abstract int getColorPrimaryInverse();
	public abstract int getColorPrimarySurface();
	public abstract int getColorPrimaryVariant();

	public abstract int getColorSecondary();
	public abstract int getColorSecondaryContainer();
	public abstract int getColorSecondaryFixed();
	public abstract int getColorSecondaryFixedDim();
	public abstract int getColorSecondaryVariant();

	public abstract int getColorSurface();
	public abstract int getColorSurfaceBright();
	public abstract int getColorSurfaceContainer();
	public abstract int getColorSurfaceContainerHigh();
	public abstract int getColorSurfaceContainerHighest();
	public abstract int getColorSurfaceContainerLow();
	public abstract int getColorSurfaceContainerLowest();
	public abstract int getColorSurfaceDim();
	public abstract int getColorSurfaceInverse();
	public abstract int getColorSurfaceVariant();

	public abstract int getColorTertiary();
	public abstract int getColorTertiaryContainer();
	public abstract int getColorTertiaryFixed();
	public abstract int getColorTertiaryFixedDim();

	public abstract int getColorAccent();

	public abstract int getColorControlNormal();
	public abstract int getColorControlActivated();
	public abstract int getColorControlHighlight();

	public abstract int getColorButtonNormal();

	public abstract int getColorSwitchThumbNormal();

	public abstract int getColorBackground();
	public abstract int getColorBackgroundContainer();
	public abstract int getColorBackgroundFloating();

	public abstract int getColorError();

	public static class MaterialThemeDesign$DayColor extends MaterialThemeDesign {
		public MaterialThemeDesign$DayColor(MaterialContext context) {
			super(context);
		}

		@Override public int getColorOnContainer()               { return 0x00000000; }
		@Override public int getColorOnContainerUnchecked()      { return 0x00000000; }

		@Override public int getColorOnError()                   { return 0xFFFFFFFF; }
		@Override public int getColorOnErrorContainer()          { return 0xFF410002; }

		@Override public int getColorOnPrimary()                 { return 0xFFFFFFFF; }
		@Override public int getColorOnPrimaryContainer()        { return 0xFF331100; }
		@Override public int getColorOnPrimaryFixed()            { return 0xFF331100; }
		@Override public int getColorOnPrimaryFixedVariant()     { return 0xFF703714; }
		@Override public int getColorOnPrimarySurface()          { return 0xFFFFFFFF; }

		@Override public int getColorOnSecondary()               { return 0xFFFFFFFF; }
		@Override public int getColorOnSecondaryContainer()      { return 0xFF2B160A; }
		@Override public int getColorOnSecondaryFixed()          { return 0xFF2B160A; }
		@Override public int getColorOnSecondaryFixedVariant()   { return 0xFF5C4132; }

		@Override public int getColorOnSurface()                 { return 0xFF221A15; }
		@Override public int getColorOnSurfaceInverse()          { return 0xFF52443D; }
		@Override public int getColorOnSurfaceVariant()          { return 0xFF52443D; }

		@Override public int getColorOnTertiary()                { return 0xFFFFFFFF; }
		@Override public int getColorOnTertiaryContainer()       { return 0xFF1E1C00; }
		@Override public int getColorOnTertiaryFixed()           { return 0xFF1E1C00; }
		@Override public int getColorOnTertiaryFixedVariant()    { return 0xFF4B481D; }

		@Override public int getColorOnBackground()              { return 0xFF36261C; }
		@Override public int getColorOnBackgroundContainer()     { return 0xFF483022; }
		@Override public int getColorOnBackgroundFloating()      { return 0xFF170F09; }

		@Override public int getColorOutline()                   { return 0xFF827169; }
		@Override public int getColorOutlineVariant()            { return 0xFFD7C2B9; }

		@Override public int getColorPrimary()                   { return 0xFF8D4E2A; }
		@Override public int getColorPrimaryContainer()          { return 0xFFFFDBCA; }
		@Override public int getColorPrimaryFixed()              { return 0xFFFFDBCA; }
		@Override public int getColorPrimaryFixedDim()           { return 0xFFFFDBCA; }
		@Override public int getColorPrimaryInverse()            { return 0xFFFFB68F; }
		@Override public int getColorPrimarySurface()            { return 0xFF8D4E2A; }
		@Override public int getColorPrimaryVariant()            { return 0xFF8D4E2A; }

		@Override public int getColorSecondary()                 { return 0xFF765848; }
		@Override public int getColorSecondaryContainer()        { return 0xFFFFDBCA; }
		@Override public int getColorSecondaryFixed()            { return 0xFFFFDBCA; }
		@Override public int getColorSecondaryFixedDim()         { return 0xFFE6BEAB; }
		@Override public int getColorSecondaryVariant()          { return 0xFF765848; }

		@Override public int getColorSurface()                   { return 0xFFFFF8F6; }
		@Override public int getColorSurfaceBright()             { return 0xFFFFF8F6; }
		@Override public int getColorSurfaceContainer()          { return 0xFFFCEAE3; }
		@Override public int getColorSurfaceContainerHigh()      { return 0xFFF6E5DD; }
		@Override public int getColorSurfaceContainerHighest()   { return 0xFFF0DFD8; }
		@Override public int getColorSurfaceContainerLow()       { return 0xFFFFF1EB; }
		@Override public int getColorSurfaceContainerLowest()    { return 0xFFFFFFFF; }
		@Override public int getColorSurfaceDim()                { return 0xFFE8D7CF; }
		@Override public int getColorSurfaceInverse()            { return 0xFF1A120D; }
		@Override public int getColorSurfaceVariant()            { return 0xFFF4DED4; }

		@Override public int getColorTertiary()                  { return 0xFF646032; }
		@Override public int getColorTertiaryContainer()         { return 0xFFEBE5AB; }
		@Override public int getColorTertiaryFixed()             { return 0xFFEBE5AB; }
		@Override public int getColorTertiaryFixedDim()          { return 0xFFCEC891; }

		@Override public int getColorAccent()                    { return 0xFFFFF8F6; }

		@Override public int getColorControlNormal()             { return 0x94000000; }
		@Override public int getColorControlActivated()          { return 0xFF765848; }
		@Override public int getColorControlHighlight()          { return 0x1F000000; }

		@Override public int getColorButtonNormal()              { return 0xFFD6D7D7; }

		@Override public int getColorSwitchThumbNormal()         { return 0x64000001; }

		@Override public int getColorBackground()                { return 0xD7000001; }
		@Override public int getColorBackgroundContainer()       { return 0xFF808080; }
		@Override public int getColorBackgroundFloating()        { return 0xFFFFFFFF; }

		@Override public int getColorError()                     { return 0xFF910052; }
	}

	public static class MaterialThemeDesign$NightColor extends MaterialThemeDesign {
		public MaterialThemeDesign$NightColor(MaterialContext context) {
			super(context);
		}

		@Override public int getColorOnContainer()               { return 0x00000000; }
		@Override public int getColorOnContainerUnchecked()      { return 0x00000000; }

		@Override public int getColorOnError()                   { return 0xFF690005; }
		@Override public int getColorOnErrorContainer()          { return 0xFFFFDAD6; }

		@Override public int getColorOnPrimary()                 { return 0xFF532201; }
		@Override public int getColorOnPrimaryContainer()        { return 0xFFFFDBCA; }
		@Override public int getColorOnPrimaryFixed()            { return 0xFF331100; }
		@Override public int getColorOnPrimaryFixedVariant()     { return 0xFF703714; }
		@Override public int getColorOnPrimarySurface()          { return 0xFFF0DFD8; }

		@Override public int getColorOnSecondary()               { return 0xFF432B1D; }
		@Override public int getColorOnSecondaryContainer()      { return 0xFFFFDBCA; }
		@Override public int getColorOnSecondaryFixed()          { return 0xFF2B160A; }
		@Override public int getColorOnSecondaryFixedVariant()   { return 0xFF5C4132; }

		@Override public int getColorOnSurface()                 { return 0xFFF0DFD8; }
		@Override public int getColorOnSurfaceInverse()          { return 0xFF221A15; }
		@Override public int getColorOnSurfaceVariant()          { return 0xFFD7C2B9; }

		@Override public int getColorOnTertiary()                { return 0xFF343108; }
		@Override public int getColorOnTertiaryContainer()       { return 0xFFEBE5AB; }
		@Override public int getColorOnTertiaryFixed()           { return 0xFF1E1C00; }
		@Override public int getColorOnTertiaryFixedVariant()    { return 0xFF4B471D; }

		@Override public int getColorOnBackground()              { return 0xFFF1E8E5; }
		@Override public int getColorOnBackgroundContainer()     { return 0xFFDBD3D0; }
		@Override public int getColorOnBackgroundFloating()      { return 0xFFDEC6BC; }

		@Override public int getColorOutline()                   { return 0xFF9F8D84; }
		@Override public int getColorOutlineVariant()            { return 0xFF52443D; }

		@Override public int getColorPrimary()                   { return 0xFFFFB68F; }
		@Override public int getColorPrimaryContainer()          { return 0xFF703714; }
		@Override public int getColorPrimaryFixed()              { return 0xFFFFDBCA; }
		@Override public int getColorPrimaryFixedDim()           { return 0xFFFFDBCA; }
		@Override public int getColorPrimaryInverse()            { return 0xFF8D4E2A; }
		@Override public int getColorPrimarySurface()            { return 0xFF1A120D; }
		@Override public int getColorPrimaryVariant()            { return 0xFFDDB68F; }

		@Override public int getColorSecondary()                 { return 0xFFE6BEAB; }
		@Override public int getColorSecondaryContainer()        { return 0xFF5C4132; }
		@Override public int getColorSecondaryFixed()            { return 0xFFFFDBCA; }
		@Override public int getColorSecondaryFixedDim()         { return 0xFFE6BEAB; }
		@Override public int getColorSecondaryVariant()          { return 0xFFE6BEAB; }

		@Override public int getColorSurface()                   { return 0xFF1A120D; }
		@Override public int getColorSurfaceBright()             { return 0xFF413732; }
		@Override public int getColorSurfaceContainer()          { return 0xFF271E19; }
		@Override public int getColorSurfaceContainerHigh()      { return 0xFF322823; }
		@Override public int getColorSurfaceContainerHighest()   { return 0xFF3D332E; }
		@Override public int getColorSurfaceContainerLow()       { return 0xFF221A15; }
		@Override public int getColorSurfaceContainerLowest()    { return 0xFF140C09; }
		@Override public int getColorSurfaceDim()                { return 0xFF1A120D; }
		@Override public int getColorSurfaceInverse()            { return 0xFFFFF8F6; }
		@Override public int getColorSurfaceVariant()            { return 0xFF52443D; }

		@Override public int getColorTertiary()                  { return 0xFFCEC891; }
		@Override public int getColorTertiaryContainer()         { return 0xFF4B481D; }
		@Override public int getColorTertiaryFixed()             { return 0xFFEBE5AB; }
		@Override public int getColorTertiaryFixedDim()          { return 0xFFCEC891; }

		@Override public int getColorAccent()                    { return 0xFF1A120D; }

		@Override public int getColorControlNormal()             { return 0x8F000000; }
		@Override public int getColorControlActivated()          { return 0xFFE6BEAB; }
		@Override public int getColorControlHighlight()          { return 0x33FFFFFF; }

		@Override public int getColorButtonNormal()              { return 0xFF5A595B; }

		@Override public int getColorSwitchThumbNormal()         { return 0x63000001; }

		@Override public int getColorBackground()                { return 0xD7000001; }
		@Override public int getColorBackgroundContainer()       { return 0xFF110D0A; }
		@Override public int getColorBackgroundFloating()        { return 0xFF424242; }

		@Override public int getColorError()                     { return 0xFFFFDAD6; }
	}
}
