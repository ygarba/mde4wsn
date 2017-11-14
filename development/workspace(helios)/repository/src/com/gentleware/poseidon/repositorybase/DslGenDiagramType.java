package com.gentleware.poseidon.repositorybase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public final class DslGenDiagramType {
	private String name;
	private int value;

	public static final int DEFAULT = 0;
	public static final int NODE = 1;
	public static final int STATEMACHINE = 2;
	public static final int ACTIVITY = 3;
	public static final int PLATFORM = 4;

	public static final DslGenDiagramType DEFAULT_LITERAL = new DslGenDiagramType(
			DEFAULT, ""); //$NON-NLS-1$				
	public static final DslGenDiagramType NODE_LITERAL = new DslGenDiagramType(
			NODE, "Node"); //$NON-NLS-1$
	public static final DslGenDiagramType STATEMACHINE_LITERAL = new DslGenDiagramType(
			STATEMACHINE, "StateMachine"); //$NON-NLS-1$
	public static final DslGenDiagramType ACTIVITY_LITERAL = new DslGenDiagramType(
			ACTIVITY, "Activity"); //$NON-NLS-1$
	public static final DslGenDiagramType PLATFORM_LITERAL = new DslGenDiagramType(
			PLATFORM, "Platform"); //$NON-NLS-1$

	private static final DslGenDiagramType[] VALUES_ARRAY = new DslGenDiagramType[] {
			DEFAULT_LITERAL, NODE_LITERAL, STATEMACHINE_LITERAL,
			ACTIVITY_LITERAL, PLATFORM_LITERAL, };

	public static final List VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	public static DslGenDiagramType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DslGenDiagramType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	public static DslGenDiagramType get(int value) {
		switch (value) {
		case DEFAULT:
			return DEFAULT_LITERAL;
		case NODE:
			return NODE_LITERAL;
		case STATEMACHINE:
			return STATEMACHINE_LITERAL;
		case ACTIVITY:
			return ACTIVITY_LITERAL;
		case PLATFORM:
			return PLATFORM_LITERAL;
		}
		return null;
	}

	private DslGenDiagramType(int value, String name) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public static Integer[] getAllDiagramTypes() {
		return new Integer[] { DEFAULT, NODE, STATEMACHINE, ACTIVITY, PLATFORM, };
	}

}
