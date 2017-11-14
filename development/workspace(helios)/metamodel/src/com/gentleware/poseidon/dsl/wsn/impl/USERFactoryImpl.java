/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.ActivationProfile;
import com.gentleware.poseidon.dsl.wsn.ActivationType;
import com.gentleware.poseidon.dsl.wsn.Activity;
import com.gentleware.poseidon.dsl.wsn.ActivityEdge;
import com.gentleware.poseidon.dsl.wsn.ActivityNode;
import com.gentleware.poseidon.dsl.wsn.Actuating;
import com.gentleware.poseidon.dsl.wsn.ActuatingAction;
import com.gentleware.poseidon.dsl.wsn.Actuator;
import com.gentleware.poseidon.dsl.wsn.Advice;
import com.gentleware.poseidon.dsl.wsn.Aspect;
import com.gentleware.poseidon.dsl.wsn.Battery;
import com.gentleware.poseidon.dsl.wsn.Cluster;
import com.gentleware.poseidon.dsl.wsn.ClusterHead;
import com.gentleware.poseidon.dsl.wsn.Communication;
import com.gentleware.poseidon.dsl.wsn.Data;
import com.gentleware.poseidon.dsl.wsn.DataLink;
import com.gentleware.poseidon.dsl.wsn.DecisionNode;
import com.gentleware.poseidon.dsl.wsn.EnvironmentType;
import com.gentleware.poseidon.dsl.wsn.Event;
import com.gentleware.poseidon.dsl.wsn.EventType;
import com.gentleware.poseidon.dsl.wsn.FinalNode;
import com.gentleware.poseidon.dsl.wsn.FinalState;
import com.gentleware.poseidon.dsl.wsn.GetDataAction;
import com.gentleware.poseidon.dsl.wsn.GetNodeAction;
import com.gentleware.poseidon.dsl.wsn.Harvester;
import com.gentleware.poseidon.dsl.wsn.InitialNode;
import com.gentleware.poseidon.dsl.wsn.InitialState;
import com.gentleware.poseidon.dsl.wsn.Languages;
import com.gentleware.poseidon.dsl.wsn.MergeNode;
import com.gentleware.poseidon.dsl.wsn.MoteType;
import com.gentleware.poseidon.dsl.wsn.Network;
import com.gentleware.poseidon.dsl.wsn.Node;
import com.gentleware.poseidon.dsl.wsn.Objectives;
import com.gentleware.poseidon.dsl.wsn.OpaqueAction;
import com.gentleware.poseidon.dsl.wsn.OpaqueType;
import com.gentleware.poseidon.dsl.wsn.Parameters;
import com.gentleware.poseidon.dsl.wsn.Platform;
import com.gentleware.poseidon.dsl.wsn.PlatformElement;
import com.gentleware.poseidon.dsl.wsn.PlatformSlot;
import com.gentleware.poseidon.dsl.wsn.Pointcut;
import com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction;
import com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType;
import com.gentleware.poseidon.dsl.wsn.Resources;
import com.gentleware.poseidon.dsl.wsn.RoutingType;
import com.gentleware.poseidon.dsl.wsn.Sensing;
import com.gentleware.poseidon.dsl.wsn.SensingAction;
import com.gentleware.poseidon.dsl.wsn.Sensor;
import com.gentleware.poseidon.dsl.wsn.Sink;
import com.gentleware.poseidon.dsl.wsn.State;
import com.gentleware.poseidon.dsl.wsn.StateMachine;
import com.gentleware.poseidon.dsl.wsn.Task;
import com.gentleware.poseidon.dsl.wsn.Timer;
import com.gentleware.poseidon.dsl.wsn.Timing;
import com.gentleware.poseidon.dsl.wsn.TimingAction;
import com.gentleware.poseidon.dsl.wsn.Transition;
import com.gentleware.poseidon.dsl.wsn.USERFactory;
import com.gentleware.poseidon.dsl.wsn.USERPackage;
import com.gentleware.poseidon.dsl.wsn.UpdatePoolAction;
import com.gentleware.poseidon.dsl.wsn.Variable;
import com.gentleware.poseidon.dsl.wsn.VariableType;
import com.gentleware.poseidon.dsl.wsn.macType;
import com.gentleware.poseidon.dsl.wsn.netType;
import com.gentleware.poseidon.dsl.wsn.optimizationLevel;
import com.gentleware.poseidon.dsl.wsn.rdcType;
import com.gentleware.poseidon.dsl.wsn.sleepType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class USERFactoryImpl extends EFactoryImpl implements USERFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static USERFactory init() {
		try {
			USERFactory theUSERFactory = (USERFactory)EPackage.Registry.INSTANCE.getEFactory("http://com.wsn.ecore.package"); 
			if (theUSERFactory != null) {
				return theUSERFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new USERFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USERFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case USERPackage.OBJECTIVES: return createObjectives();
			case USERPackage.SENSOR: return createSensor();
			case USERPackage.ACTUATOR: return createActuator();
			case USERPackage.ACTUATING: return createActuating();
			case USERPackage.TASK: return createTask();
			case USERPackage.SENSING: return createSensing();
			case USERPackage.NODE: return createNode();
			case USERPackage.EVENT: return createEvent();
			case USERPackage.NETWORK: return createNetwork();
			case USERPackage.COMMUNICATION: return createCommunication();
			case USERPackage.DATA: return createData();
			case USERPackage.STATE: return createState();
			case USERPackage.TRANSITION: return createTransition();
			case USERPackage.INITIAL_STATE: return createInitialState();
			case USERPackage.FINAL_STATE: return createFinalState();
			case USERPackage.CLUSTER: return createCluster();
			case USERPackage.CLUSTER_HEAD: return createClusterHead();
			case USERPackage.SINK: return createSink();
			case USERPackage.ACTIVITY: return createActivity();
			case USERPackage.STATE_MACHINE: return createStateMachine();
			case USERPackage.TIMING: return createTiming();
			case USERPackage.TIMER: return createTimer();
			case USERPackage.PLATFORM: return createPlatform();
			case USERPackage.RESOURCES: return createResources();
			case USERPackage.PARAMETERS: return createParameters();
			case USERPackage.HARVESTER: return createHarvester();
			case USERPackage.BATTERY: return createBattery();
			case USERPackage.ASPECT: return createAspect();
			case USERPackage.POINTCUT: return createPointcut();
			case USERPackage.ADVICE: return createAdvice();
			case USERPackage.ACTIVITY_NODE: return createActivityNode();
			case USERPackage.INITIAL_NODE: return createInitialNode();
			case USERPackage.FINAL_NODE: return createFinalNode();
			case USERPackage.DECISION_NODE: return createDecisionNode();
			case USERPackage.MERGE_NODE: return createMergeNode();
			case USERPackage.ACTIVITY_EDGE: return createActivityEdge();
			case USERPackage.OPAQUE_ACTION: return createOpaqueAction();
			case USERPackage.SENSING_ACTION: return createSensingAction();
			case USERPackage.ACTUATING_ACTION: return createActuatingAction();
			case USERPackage.TIMING_ACTION: return createTimingAction();
			case USERPackage.VARIABLE: return createVariable();
			case USERPackage.DATA_LINK: return createDataLink();
			case USERPackage.UPDATE_POOL_ACTION: return createUpdatePoolAction();
			case USERPackage.GET_NODE_ACTION: return createGetNodeAction();
			case USERPackage.REMOTE_TRIGGER_ACTION: return createRemoteTriggerAction();
			case USERPackage.GET_DATA_ACTION: return createGetDataAction();
			case USERPackage.ACTIVATION_PROFILE: return createActivationProfile();
			case USERPackage.RUNTIME: return createRuntime();
			case USERPackage.PLATFORM_SLOT: return createPlatformSlot();
			case USERPackage.PLATFORM_ELEMENT: return createPlatformElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case USERPackage.ROUTING_TYPE:
				return createRoutingTypeFromString(eDataType, initialValue);
			case USERPackage.OPTIMIZATION_LEVEL:
				return createoptimizationLevelFromString(eDataType, initialValue);
			case USERPackage.MOTE_TYPE:
				return createMoteTypeFromString(eDataType, initialValue);
			case USERPackage.RDC_TYPE:
				return createrdcTypeFromString(eDataType, initialValue);
			case USERPackage.MAC_TYPE:
				return createmacTypeFromString(eDataType, initialValue);
			case USERPackage.NET_TYPE:
				return createnetTypeFromString(eDataType, initialValue);
			case USERPackage.SLEEP_TYPE:
				return createsleepTypeFromString(eDataType, initialValue);
			case USERPackage.LANGUAGES:
				return createLanguagesFromString(eDataType, initialValue);
			case USERPackage.VARIABLE_TYPE:
				return createVariableTypeFromString(eDataType, initialValue);
			case USERPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case USERPackage.REMOTE_TRIGGER_DATA_TYPE:
				return createRemoteTriggerDataTypeFromString(eDataType, initialValue);
			case USERPackage.ACTIVATION_TYPE:
				return createActivationTypeFromString(eDataType, initialValue);
			case USERPackage.OPAQUE_TYPE:
				return createOpaqueTypeFromString(eDataType, initialValue);
			case USERPackage.ENVIRONMENT_TYPE:
				return createEnvironmentTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case USERPackage.ROUTING_TYPE:
				return convertRoutingTypeToString(eDataType, instanceValue);
			case USERPackage.OPTIMIZATION_LEVEL:
				return convertoptimizationLevelToString(eDataType, instanceValue);
			case USERPackage.MOTE_TYPE:
				return convertMoteTypeToString(eDataType, instanceValue);
			case USERPackage.RDC_TYPE:
				return convertrdcTypeToString(eDataType, instanceValue);
			case USERPackage.MAC_TYPE:
				return convertmacTypeToString(eDataType, instanceValue);
			case USERPackage.NET_TYPE:
				return convertnetTypeToString(eDataType, instanceValue);
			case USERPackage.SLEEP_TYPE:
				return convertsleepTypeToString(eDataType, instanceValue);
			case USERPackage.LANGUAGES:
				return convertLanguagesToString(eDataType, instanceValue);
			case USERPackage.VARIABLE_TYPE:
				return convertVariableTypeToString(eDataType, instanceValue);
			case USERPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case USERPackage.REMOTE_TRIGGER_DATA_TYPE:
				return convertRemoteTriggerDataTypeToString(eDataType, instanceValue);
			case USERPackage.ACTIVATION_TYPE:
				return convertActivationTypeToString(eDataType, instanceValue);
			case USERPackage.OPAQUE_TYPE:
				return convertOpaqueTypeToString(eDataType, instanceValue);
			case USERPackage.ENVIRONMENT_TYPE:
				return convertEnvironmentTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objectives createObjectives() {
		ObjectivesImpl objectives = new ObjectivesImpl();
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuating createActuating() {
		ActuatingImpl actuating = new ActuatingImpl();
		return actuating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensing createSensing() {
		SensingImpl sensing = new SensingImpl();
		return sensing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterHead createClusterHead() {
		ClusterHeadImpl clusterHead = new ClusterHeadImpl();
		return clusterHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink createSink() {
		SinkImpl sink = new SinkImpl();
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer createTimer() {
		TimerImpl timer = new TimerImpl();
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Harvester createHarvester() {
		HarvesterImpl harvester = new HarvesterImpl();
		return harvester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery createBattery() {
		BatteryImpl battery = new BatteryImpl();
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointcut createPointcut() {
		PointcutImpl pointcut = new PointcutImpl();
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice createAdvice() {
		AdviceImpl advice = new AdviceImpl();
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createActivityNode() {
		ActivityNodeImpl activityNode = new ActivityNodeImpl();
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode createFinalNode() {
		FinalNodeImpl finalNode = new FinalNodeImpl();
		return finalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createActivityEdge() {
		ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
		return activityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction createOpaqueAction() {
		OpaqueActionImpl opaqueAction = new OpaqueActionImpl();
		return opaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingAction createSensingAction() {
		SensingActionImpl sensingAction = new SensingActionImpl();
		return sensingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatingAction createActuatingAction() {
		ActuatingActionImpl actuatingAction = new ActuatingActionImpl();
		return actuatingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingAction createTimingAction() {
		TimingActionImpl timingAction = new TimingActionImpl();
		return timingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLink createDataLink() {
		DataLinkImpl dataLink = new DataLinkImpl();
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdatePoolAction createUpdatePoolAction() {
		UpdatePoolActionImpl updatePoolAction = new UpdatePoolActionImpl();
		return updatePoolAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetNodeAction createGetNodeAction() {
		GetNodeActionImpl getNodeAction = new GetNodeActionImpl();
		return getNodeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteTriggerAction createRemoteTriggerAction() {
		RemoteTriggerActionImpl remoteTriggerAction = new RemoteTriggerActionImpl();
		return remoteTriggerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDataAction createGetDataAction() {
		GetDataActionImpl getDataAction = new GetDataActionImpl();
		return getDataAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationProfile createActivationProfile() {
		ActivationProfileImpl activationProfile = new ActivationProfileImpl();
		return activationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.gentleware.poseidon.dsl.wsn.Runtime createRuntime() {
		RuntimeImpl runtime = new RuntimeImpl();
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformSlot createPlatformSlot() {
		PlatformSlotImpl platformSlot = new PlatformSlotImpl();
		return platformSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformElement createPlatformElement() {
		PlatformElementImpl platformElement = new PlatformElementImpl();
		return platformElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingType createRoutingTypeFromString(EDataType eDataType, String initialValue) {
		RoutingType result = RoutingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoutingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public optimizationLevel createoptimizationLevelFromString(EDataType eDataType, String initialValue) {
		optimizationLevel result = optimizationLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertoptimizationLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoteType createMoteTypeFromString(EDataType eDataType, String initialValue) {
		MoteType result = MoteType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMoteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rdcType createrdcTypeFromString(EDataType eDataType, String initialValue) {
		rdcType result = rdcType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertrdcTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public macType createmacTypeFromString(EDataType eDataType, String initialValue) {
		macType result = macType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmacTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public netType createnetTypeFromString(EDataType eDataType, String initialValue) {
		netType result = netType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertnetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sleepType createsleepTypeFromString(EDataType eDataType, String initialValue) {
		sleepType result = sleepType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertsleepTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Languages createLanguagesFromString(EDataType eDataType, String initialValue) {
		Languages result = Languages.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguagesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue) {
		VariableType result = VariableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteTriggerDataType createRemoteTriggerDataTypeFromString(EDataType eDataType, String initialValue) {
		RemoteTriggerDataType result = RemoteTriggerDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoteTriggerDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType createActivationTypeFromString(EDataType eDataType, String initialValue) {
		ActivationType result = ActivationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueType createOpaqueTypeFromString(EDataType eDataType, String initialValue) {
		OpaqueType result = OpaqueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpaqueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType createEnvironmentTypeFromString(EDataType eDataType, String initialValue) {
		EnvironmentType result = EnvironmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvironmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USERPackage getUSERPackage() {
		return (USERPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static USERPackage getPackage() {
		return USERPackage.eINSTANCE;
	}

} //USERFactoryImpl
