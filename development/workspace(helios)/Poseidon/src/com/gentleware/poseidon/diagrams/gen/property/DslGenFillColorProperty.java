package com.gentleware.poseidon.diagrams.gen.property;

import java.awt.Color;
import com.gentleware.poseidon.diagrams.base.PoseidonDiagramProperty;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public abstract class DslGenFillColorProperty extends PoseidonDiagramProperty {

	public static String propertyName = "fill";
	protected Color defaultValue = new Color(255, 255, 255);
	protected Color value = defaultValue;

	public String getPropertyName() {
		return propertyName;
	}

	public Object getDefaultValue() {
		return defaultValue;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object newValue) throws IllegalArgumentException {
		if (!(newValue instanceof Color)) {
			throw new IllegalArgumentException();
		} else {
			value = (Color) newValue;
		}
	}
}
