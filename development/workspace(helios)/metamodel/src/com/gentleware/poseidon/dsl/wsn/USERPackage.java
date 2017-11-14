/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.gentleware.poseidon.dsl.wsn.USERFactory
 * @model kind="package"
 * @generated
 */
public interface USERPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wsn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.wsn.ecore.package";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	USERPackage eINSTANCE = com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ObjectivesImpl <em>Objectives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ObjectivesImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getObjectives()
	 * @generated
	 */
	int OBJECTIVES = 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVES__POWER = 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVES__MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Packetloss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVES__PACKETLOSS = 2;

	/**
	 * The number of structural features of the '<em>Objectives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.SensorImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ActuatorImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ID = 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActuatingImpl <em>Actuating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ActuatingImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActuating()
	 * @generated
	 */
	int ACTUATING = 3;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING__TASK = 0;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING__ACTUATOR = 1;

	/**
	 * The number of structural features of the '<em>Actuating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.TaskImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Behavior Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BEHAVIOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Activation Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACTIVATION_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROFILE = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.SensingImpl <em>Sensing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.SensingImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getSensing()
	 * @generated
	 */
	int SENSING = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING__TASK = 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING__SENSOR = 1;

	/**
	 * The number of structural features of the '<em>Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.NodeImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TASK = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.EventImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.NetworkImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 8;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OBJECTIVES = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NODES = 1;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.CommunicationImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 9;

	/**
	 * The feature id for the '<em><b>Comm Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__COMM_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Comm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__COMM_DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.DataImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getData()
	 * @generated
	 */
	int DATA = 10;

	/**
	 * The feature id for the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SHARED = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.StateImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getState()
	 * @generated
	 */
	int STATE = 11;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 12;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = 0;

	/**
	 * The feature id for the '<em><b>Triggerevent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGEREVENT = 1;

	/**
	 * The feature id for the '<em><b>Transition From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_FROM = 2;

	/**
	 * The feature id for the '<em><b>Transition To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_TO = 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.InitialStateImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 13;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__EXIT = STATE__EXIT;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.FinalStateImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 14;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXIT = STATE__EXIT;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ClusterImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 15;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NODE = 0;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__HEAD = 1;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ClusterHeadImpl <em>Cluster Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ClusterHeadImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getClusterHead()
	 * @generated
	 */
	int CLUSTER_HEAD = 16;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD__TASK = NODE__TASK;

	/**
	 * The number of structural features of the '<em>Cluster Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.SinkImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 17;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__TASK = NODE__TASK;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 18;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IN = 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUT = 1;

	/**
	 * The feature id for the '<em><b>Is Joint Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_JOINT_POINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = 3;

	/**
	 * The feature id for the '<em><b>Initial Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INITIAL_NODE = 4;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EDGES = 5;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.StateMachineImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 19;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.TimingImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 20;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TIMER = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TASK = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.TimerImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 21;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__TIME = 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.PlatformImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 22;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SLOT = 1;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.PlatformElementImpl <em>Platform Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.PlatformElementImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getPlatformElement()
	 * @generated
	 */
	int PLATFORM_ELEMENT = 51;

	/**
	 * The number of structural features of the '<em>Platform Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ResourcesImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 23;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__MEMORY = PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__FLASH = PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = PLATFORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ParametersImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 24;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__NETWORK = PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__MAC = PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radioduty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__RADIODUTY = PLATFORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sleep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__SLEEP = PLATFORM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = PLATFORM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.EnergySourceImpl <em>Energy Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.EnergySourceImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getEnergySource()
	 * @generated
	 */
	int ENERGY_SOURCE = 25;

	/**
	 * The number of structural features of the '<em>Energy Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_SOURCE_FEATURE_COUNT = PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.HarvesterImpl <em>Harvester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.HarvesterImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getHarvester()
	 * @generated
	 */
	int HARVESTER = 26;

	/**
	 * The number of structural features of the '<em>Harvester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARVESTER_FEATURE_COUNT = ENERGY_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.BatteryImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getBattery()
	 * @generated
	 */
	int BATTERY = 27;

	/**
	 * The feature id for the '<em><b>Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__FULL = ENERGY_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__EMPTY = ENERGY_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_FEATURE_COUNT = ENERGY_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ActivityNodeImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 32;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 28;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.AspectImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 29;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__POINTCUT = 0;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ADVICE = 1;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.PointcutImpl <em>Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.PointcutImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getPointcut()
	 * @generated
	 */
	int POINTCUT = 30;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.AdviceImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 31;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__IN = ACTIVITY__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__OUT = ACTIVITY__OUT;

	/**
	 * The feature id for the '<em><b>Is Joint Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__IS_JOINT_POINT = ACTIVITY__IS_JOINT_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Initial Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__INITIAL_NODE = ACTIVITY__INITIAL_NODE;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__EDGES = ACTIVITY__EDGES;

	/**
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.InitialNodeImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 33;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.FinalNodeImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 34;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.DecisionNodeImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 35;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.MergeNodeImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 36;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ActivityEdgeImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 37;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.OpaqueActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getOpaqueAction()
	 * @generated
	 */
	int OPAQUE_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__LANGUAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__TYPE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__CODE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__FILE = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.SensingActionImpl <em>Sensing Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.SensingActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getSensingAction()
	 * @generated
	 */
	int SENSING_ACTION = 39;

	/**
	 * The feature id for the '<em><b>Sensor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_ACTION__SENSOR_ID = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_ACTION__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensing Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActuatingActionImpl <em>Actuating Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ActuatingActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActuatingAction()
	 * @generated
	 */
	int ACTUATING_ACTION = 40;

	/**
	 * The feature id for the '<em><b>Actuator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_ACTION__ACTUATOR_ID = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_ACTION__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuating Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TimingActionImpl <em>Timing Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.TimingActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTimingAction()
	 * @generated
	 */
	int TIMING_ACTION = 41;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ACTION__TIME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timing Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.VariableImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 42;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SIGNED = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.DataLinkImpl <em>Data Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.DataLinkImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getDataLink()
	 * @generated
	 */
	int DATA_LINK = 43;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__TASK = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__DATA = 1;

	/**
	 * The number of structural features of the '<em>Data Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.UpdatePoolActionImpl <em>Update Pool Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.UpdatePoolActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getUpdatePoolAction()
	 * @generated
	 */
	int UPDATE_POOL_ACTION = 44;

	/**
	 * The number of structural features of the '<em>Update Pool Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_POOL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.GetNodeActionImpl <em>Get Node Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.GetNodeActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getGetNodeAction()
	 * @generated
	 */
	int GET_NODE_ACTION = 45;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_NODE_ACTION__QUERY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Node Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_NODE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.RemoteTriggerActionImpl <em>Remote Trigger Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.RemoteTriggerActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getRemoteTriggerAction()
	 * @generated
	 */
	int REMOTE_TRIGGER_ACTION = 46;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TRIGGER_ACTION__CODE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TRIGGER_ACTION__DATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remote Trigger Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TRIGGER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.GetDataActionImpl <em>Get Data Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.GetDataActionImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getGetDataAction()
	 * @generated
	 */
	int GET_DATA_ACTION = 47;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DATA_ACTION__QUERY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DATA_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl <em>Activation Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivationProfile()
	 * @generated
	 */
	int ACTIVATION_PROFILE = 48;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE__SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE__ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Dongle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE__DONGLE = 2;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE__BATTERY = 3;

	/**
	 * The feature id for the '<em><b>Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE__NEIGHBORS = 4;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE__SPECIFIC = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE__CH = 7;

	/**
	 * The number of structural features of the '<em>Activation Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROFILE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.RuntimeImpl <em>Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.RuntimeImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getRuntime()
	 * @generated
	 */
	int RUNTIME = 49;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__ENVIRONMENT = PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__MOTE = PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FEATURE_COUNT = PLATFORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.impl.PlatformSlotImpl <em>Platform Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.impl.PlatformSlotImpl
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getPlatformSlot()
	 * @generated
	 */
	int PLATFORM_SLOT = 50;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SLOT__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Platform Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SLOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.RoutingType <em>Routing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.RoutingType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getRoutingType()
	 * @generated
	 */
	int ROUTING_TYPE = 52;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.optimizationLevel <em>optimization Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getoptimizationLevel()
	 * @generated
	 */
	int OPTIMIZATION_LEVEL = 53;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.MoteType <em>Mote Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.MoteType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getMoteType()
	 * @generated
	 */
	int MOTE_TYPE = 54;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.rdcType <em>rdc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.rdcType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getrdcType()
	 * @generated
	 */
	int RDC_TYPE = 55;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.macType <em>mac Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.macType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getmacType()
	 * @generated
	 */
	int MAC_TYPE = 56;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.netType <em>net Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.netType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getnetType()
	 * @generated
	 */
	int NET_TYPE = 57;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.sleepType <em>sleep Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.sleepType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getsleepType()
	 * @generated
	 */
	int SLEEP_TYPE = 58;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.Languages <em>Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.Languages
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 59;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.VariableType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 60;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.EventType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 61;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType <em>Remote Trigger Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getRemoteTriggerDataType()
	 * @generated
	 */
	int REMOTE_TRIGGER_DATA_TYPE = 62;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.ActivationType <em>Activation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivationType()
	 * @generated
	 */
	int ACTIVATION_TYPE = 63;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.OpaqueType <em>Opaque Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getOpaqueType()
	 * @generated
	 */
	int OPAQUE_TYPE = 64;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.wsn.EnvironmentType <em>Environment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.wsn.EnvironmentType
	 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getEnvironmentType()
	 * @generated
	 */
	int ENVIRONMENT_TYPE = 65;


	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Objectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objectives</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Objectives
	 * @generated
	 */
	EClass getObjectives();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Objectives#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Objectives#getPower()
	 * @see #getObjectives()
	 * @generated
	 */
	EAttribute getObjectives_Power();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Objectives#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Objectives#getMemory()
	 * @see #getObjectives()
	 * @generated
	 */
	EAttribute getObjectives_Memory();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Objectives#getPacketloss <em>Packetloss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packetloss</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Objectives#getPacketloss()
	 * @see #getObjectives()
	 * @generated
	 */
	EAttribute getObjectives_Packetloss();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Sensor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Sensor#getId()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Id();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Actuator#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Actuator#getId()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Id();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Actuating <em>Actuating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuating</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Actuating
	 * @generated
	 */
	EClass getActuating();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Actuating#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Actuating#getTask()
	 * @see #getActuating()
	 * @generated
	 */
	EReference getActuating_Task();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Actuating#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Actuating#getActuator()
	 * @see #getActuating()
	 * @generated
	 */
	EReference getActuating_Actuator();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Task#getBehaviorName <em>Behavior Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Name</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Task#getBehaviorName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_BehaviorName();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Task#getActivationProfile <em>Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Profile</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Task#getActivationProfile()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ActivationProfile();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.wsn.Task#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Task#getBehavior()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Behavior();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Task#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Task#getProfile()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Profile();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Sensing <em>Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensing</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Sensing
	 * @generated
	 */
	EClass getSensing();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Sensing#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Sensing#getTask()
	 * @see #getSensing()
	 * @generated
	 */
	EReference getSensing_Task();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Sensing#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Sensing#getSensor()
	 * @see #getSensing()
	 * @generated
	 */
	EReference getSensing_Sensor();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.gentleware.poseidon.dsl.wsn.Node#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Node#getTask()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Task();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Network#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objectives</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Network#getObjectives()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Objectives();

	/**
	 * Returns the meta object for the containment reference list '{@link com.gentleware.poseidon.dsl.wsn.Network#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Network#getNodes()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Nodes();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Communication#getCommSource <em>Comm Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Source</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Communication#getCommSource()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_CommSource();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Communication#getCommDestination <em>Comm Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Destination</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Communication#getCommDestination()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_CommDestination();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Data#isShared <em>Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Data#isShared()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Shared();

	/**
	 * Returns the meta object for the containment reference list '{@link com.gentleware.poseidon.dsl.wsn.Data#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Data#getVariable()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Variable();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Entry();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Exit();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Guard();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Transition#getTriggerevent <em>Triggerevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggerevent</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Transition#getTriggerevent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Triggerevent();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Transition#getTransitionFrom <em>Transition From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition From</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Transition#getTransitionFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TransitionFrom();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Transition#getTransitionTo <em>Transition To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition To</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Transition#getTransitionTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TransitionTo();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the reference list '{@link com.gentleware.poseidon.dsl.wsn.Cluster#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Cluster#getNode()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Node();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.wsn.Cluster#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Cluster#getHead()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Head();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.ClusterHead <em>Cluster Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Head</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ClusterHead
	 * @generated
	 */
	EClass getClusterHead();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Activity#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Activity#getIn()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_In();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Activity#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Activity#getOut()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Out();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Activity#isIsJointPoint <em>Is Joint Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Joint Point</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Activity#isIsJointPoint()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsJointPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Activity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Activity#getId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Id();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.wsn.Activity#getInitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Node</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Activity#getInitialNode()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InitialNode();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.wsn.Activity#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edges</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Activity#getEdges()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Edges();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Timing#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Timing#getTimer()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Timer();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.Timing#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Timing#getTask()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Task();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Timer#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Timer#getTime()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_Time();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.wsn.Platform#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aspect</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Platform#getAspect()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Aspect();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.wsn.Platform#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Platform#getSlot()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Slot();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Resources#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Resources#getMemory()
	 * @see #getResources()
	 * @generated
	 */
	EAttribute getResources_Memory();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Resources#getFlash <em>Flash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flash</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Resources#getFlash()
	 * @see #getResources()
	 * @generated
	 */
	EAttribute getResources_Flash();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Parameters#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Parameters#getNetwork()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Network();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Parameters#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Parameters#getMac()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Mac();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Parameters#getRadioduty <em>Radioduty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radioduty</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Parameters#getRadioduty()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Radioduty();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Parameters#getSleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sleep</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Parameters#getSleep()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Sleep();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.EnergySource <em>Energy Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Source</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.EnergySource
	 * @generated
	 */
	EClass getEnergySource();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Harvester <em>Harvester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Harvester</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Harvester
	 * @generated
	 */
	EClass getHarvester();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Battery
	 * @generated
	 */
	EClass getBattery();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Battery#getFull <em>Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Battery#getFull()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_Full();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Battery#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Battery#getEmpty()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_Empty();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.wsn.Aspect#getPointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointcut</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Aspect#getPointcut()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Pointcut();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.wsn.Aspect#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advice</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Aspect#getAdvice()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Advice();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Pointcut
	 * @generated
	 */
	EClass getPointcut();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Pointcut#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Pointcut#getExpression()
	 * @see #getPointcut()
	 * @generated
	 */
	EAttribute getPointcut_Expression();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueAction
	 * @generated
	 */
	EClass getOpaqueAction();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueAction#getLanguage()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EAttribute getOpaqueAction_Language();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueAction#getType()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EAttribute getOpaqueAction_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueAction#getCode()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EAttribute getOpaqueAction_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueAction#getFile()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EAttribute getOpaqueAction_File();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.SensingAction <em>Sensing Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensing Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.SensingAction
	 * @generated
	 */
	EClass getSensingAction();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.SensingAction#getSensorId <em>Sensor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Id</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.SensingAction#getSensorId()
	 * @see #getSensingAction()
	 * @generated
	 */
	EAttribute getSensingAction_SensorId();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.SensingAction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.SensingAction#getData()
	 * @see #getSensingAction()
	 * @generated
	 */
	EAttribute getSensingAction_Data();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.ActuatingAction <em>Actuating Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuating Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActuatingAction
	 * @generated
	 */
	EClass getActuatingAction();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActuatingAction#getActuatorId <em>Actuator Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Id</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActuatingAction#getActuatorId()
	 * @see #getActuatingAction()
	 * @generated
	 */
	EAttribute getActuatingAction_ActuatorId();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActuatingAction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActuatingAction#getData()
	 * @see #getActuatingAction()
	 * @generated
	 */
	EAttribute getActuatingAction_Data();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.TimingAction <em>Timing Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.TimingAction
	 * @generated
	 */
	EClass getTimingAction();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.TimingAction#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.TimingAction#getTime()
	 * @see #getTimingAction()
	 * @generated
	 */
	EAttribute getTimingAction_Time();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Variable#isSigned <em>Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signed</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Variable#isSigned()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Signed();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Variable#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Variable#getInitial()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Initial();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.DataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Link</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.DataLink
	 * @generated
	 */
	EClass getDataLink();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.DataLink#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.DataLink#getTask()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Task();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.DataLink#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.DataLink#getData()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Data();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.UpdatePoolAction <em>Update Pool Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Pool Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.UpdatePoolAction
	 * @generated
	 */
	EClass getUpdatePoolAction();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.GetNodeAction <em>Get Node Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Node Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.GetNodeAction
	 * @generated
	 */
	EClass getGetNodeAction();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.GetNodeAction#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.GetNodeAction#getQuery()
	 * @see #getGetNodeAction()
	 * @generated
	 */
	EAttribute getGetNodeAction_Query();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction <em>Remote Trigger Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Trigger Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction
	 * @generated
	 */
	EClass getRemoteTriggerAction();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction#getCode()
	 * @see #getRemoteTriggerAction()
	 * @generated
	 */
	EAttribute getRemoteTriggerAction_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction#getData()
	 * @see #getRemoteTriggerAction()
	 * @generated
	 */
	EAttribute getRemoteTriggerAction_Data();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.GetDataAction <em>Get Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Data Action</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.GetDataAction
	 * @generated
	 */
	EClass getGetDataAction();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.GetDataAction#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.GetDataAction#getQuery()
	 * @see #getGetDataAction()
	 * @generated
	 */
	EAttribute getGetDataAction_Query();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile <em>Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Profile</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile
	 * @generated
	 */
	EClass getActivationProfile();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile#getSensor()
	 * @see #getActivationProfile()
	 * @generated
	 */
	EAttribute getActivationProfile_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile#getActuator()
	 * @see #getActivationProfile()
	 * @generated
	 */
	EAttribute getActivationProfile_Actuator();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getDongle <em>Dongle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dongle</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile#getDongle()
	 * @see #getActivationProfile()
	 * @generated
	 */
	EAttribute getActivationProfile_Dongle();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile#getBattery()
	 * @see #getActivationProfile()
	 * @generated
	 */
	EAttribute getActivationProfile_Battery();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getNeighbors <em>Neighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neighbors</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile#getNeighbors()
	 * @see #getActivationProfile()
	 * @generated
	 */
	EAttribute getActivationProfile_Neighbors();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile#getSpecific()
	 * @see #getActivationProfile()
	 * @generated
	 */
	EAttribute getActivationProfile_Specific();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile#getValue()
	 * @see #getActivationProfile()
	 * @generated
	 */
	EAttribute getActivationProfile_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getCh <em>Ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ch</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationProfile#getCh()
	 * @see #getActivationProfile()
	 * @generated
	 */
	EAttribute getActivationProfile_Ch();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Runtime
	 * @generated
	 */
	EClass getRuntime();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Runtime#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Runtime#getEnvironment()
	 * @see #getRuntime()
	 * @generated
	 */
	EAttribute getRuntime_Environment();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.wsn.Runtime#getMote <em>Mote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mote</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Runtime#getMote()
	 * @see #getRuntime()
	 * @generated
	 */
	EAttribute getRuntime_Mote();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.PlatformSlot <em>Platform Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Slot</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.PlatformSlot
	 * @generated
	 */
	EClass getPlatformSlot();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.wsn.PlatformSlot#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.PlatformSlot#getElement()
	 * @see #getPlatformSlot()
	 * @generated
	 */
	EReference getPlatformSlot_Element();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.wsn.PlatformElement <em>Platform Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Element</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.PlatformElement
	 * @generated
	 */
	EClass getPlatformElement();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.RoutingType <em>Routing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Routing Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.RoutingType
	 * @generated
	 */
	EEnum getRoutingType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.optimizationLevel <em>optimization Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>optimization Level</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
	 * @generated
	 */
	EEnum getoptimizationLevel();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.MoteType <em>Mote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mote Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.MoteType
	 * @generated
	 */
	EEnum getMoteType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.rdcType <em>rdc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>rdc Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.rdcType
	 * @generated
	 */
	EEnum getrdcType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.macType <em>mac Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>mac Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.macType
	 * @generated
	 */
	EEnum getmacType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.netType <em>net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>net Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.netType
	 * @generated
	 */
	EEnum getnetType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.sleepType <em>sleep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>sleep Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.sleepType
	 * @generated
	 */
	EEnum getsleepType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Languages</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.Languages
	 * @generated
	 */
	EEnum getLanguages();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType <em>Remote Trigger Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Remote Trigger Data Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType
	 * @generated
	 */
	EEnum getRemoteTriggerDataType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.ActivationType <em>Activation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activation Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @generated
	 */
	EEnum getActivationType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.OpaqueType <em>Opaque Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Opaque Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueType
	 * @generated
	 */
	EEnum getOpaqueType();

	/**
	 * Returns the meta object for enum '{@link com.gentleware.poseidon.dsl.wsn.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Environment Type</em>'.
	 * @see com.gentleware.poseidon.dsl.wsn.EnvironmentType
	 * @generated
	 */
	EEnum getEnvironmentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	USERFactory getUSERFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ObjectivesImpl <em>Objectives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ObjectivesImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getObjectives()
		 * @generated
		 */
		EClass OBJECTIVES = eINSTANCE.getObjectives();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVES__POWER = eINSTANCE.getObjectives_Power();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVES__MEMORY = eINSTANCE.getObjectives_Memory();

		/**
		 * The meta object literal for the '<em><b>Packetloss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVES__PACKETLOSS = eINSTANCE.getObjectives_Packetloss();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.SensorImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__ID = eINSTANCE.getSensor_Id();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ActuatorImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__ID = eINSTANCE.getActuator_Id();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActuatingImpl <em>Actuating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ActuatingImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActuating()
		 * @generated
		 */
		EClass ACTUATING = eINSTANCE.getActuating();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATING__TASK = eINSTANCE.getActuating_Task();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATING__ACTUATOR = eINSTANCE.getActuating_Actuator();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.TaskImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Behavior Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__BEHAVIOR_NAME = eINSTANCE.getTask_BehaviorName();

		/**
		 * The meta object literal for the '<em><b>Activation Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ACTIVATION_PROFILE = eINSTANCE.getTask_ActivationProfile();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__BEHAVIOR = eINSTANCE.getTask_Behavior();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PROFILE = eINSTANCE.getTask_Profile();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.SensingImpl <em>Sensing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.SensingImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getSensing()
		 * @generated
		 */
		EClass SENSING = eINSTANCE.getSensing();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSING__TASK = eINSTANCE.getSensing_Task();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSING__SENSOR = eINSTANCE.getSensing_Sensor();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.NodeImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TASK = eINSTANCE.getNode_Task();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.EventImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.NetworkImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__OBJECTIVES = eINSTANCE.getNetwork_Objectives();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__NODES = eINSTANCE.getNetwork_Nodes();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.CommunicationImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Comm Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__COMM_SOURCE = eINSTANCE.getCommunication_CommSource();

		/**
		 * The meta object literal for the '<em><b>Comm Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__COMM_DESTINATION = eINSTANCE.getCommunication_CommDestination();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.DataImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__SHARED = eINSTANCE.getData_Shared();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__VARIABLE = eINSTANCE.getData_Variable();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.StateImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__EXIT = eINSTANCE.getState_Exit();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Triggerevent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRIGGEREVENT = eINSTANCE.getTransition_Triggerevent();

		/**
		 * The meta object literal for the '<em><b>Transition From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION_FROM = eINSTANCE.getTransition_TransitionFrom();

		/**
		 * The meta object literal for the '<em><b>Transition To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION_TO = eINSTANCE.getTransition_TransitionTo();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.InitialStateImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.FinalStateImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ClusterImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__NODE = eINSTANCE.getCluster_Node();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__HEAD = eINSTANCE.getCluster_Head();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ClusterHeadImpl <em>Cluster Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ClusterHeadImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getClusterHead()
		 * @generated
		 */
		EClass CLUSTER_HEAD = eINSTANCE.getClusterHead();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.SinkImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IN = eINSTANCE.getActivity_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__OUT = eINSTANCE.getActivity_Out();

		/**
		 * The meta object literal for the '<em><b>Is Joint Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_JOINT_POINT = eINSTANCE.getActivity_IsJointPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ID = eINSTANCE.getActivity_Id();

		/**
		 * The meta object literal for the '<em><b>Initial Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INITIAL_NODE = eINSTANCE.getActivity_InitialNode();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EDGES = eINSTANCE.getActivity_Edges();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.StateMachineImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.TimingImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__TIMER = eINSTANCE.getTiming_Timer();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__TASK = eINSTANCE.getTiming_Task();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.TimerImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__TIME = eINSTANCE.getTimer_Time();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.PlatformImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Aspect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__ASPECT = eINSTANCE.getPlatform_Aspect();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__SLOT = eINSTANCE.getPlatform_Slot();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ResourcesImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES__MEMORY = eINSTANCE.getResources_Memory();

		/**
		 * The meta object literal for the '<em><b>Flash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES__FLASH = eINSTANCE.getResources_Flash();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ParametersImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__NETWORK = eINSTANCE.getParameters_Network();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__MAC = eINSTANCE.getParameters_Mac();

		/**
		 * The meta object literal for the '<em><b>Radioduty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__RADIODUTY = eINSTANCE.getParameters_Radioduty();

		/**
		 * The meta object literal for the '<em><b>Sleep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__SLEEP = eINSTANCE.getParameters_Sleep();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.EnergySourceImpl <em>Energy Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.EnergySourceImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getEnergySource()
		 * @generated
		 */
		EClass ENERGY_SOURCE = eINSTANCE.getEnergySource();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.HarvesterImpl <em>Harvester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.HarvesterImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getHarvester()
		 * @generated
		 */
		EClass HARVESTER = eINSTANCE.getHarvester();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.BatteryImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getBattery()
		 * @generated
		 */
		EClass BATTERY = eINSTANCE.getBattery();

		/**
		 * The meta object literal for the '<em><b>Full</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__FULL = eINSTANCE.getBattery_Full();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__EMPTY = eINSTANCE.getBattery_Empty();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.AspectImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Pointcut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__POINTCUT = eINSTANCE.getAspect_Pointcut();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ADVICE = eINSTANCE.getAspect_Advice();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.PointcutImpl <em>Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.PointcutImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getPointcut()
		 * @generated
		 */
		EClass POINTCUT = eINSTANCE.getPointcut();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTCUT__EXPRESSION = eINSTANCE.getPointcut_Expression();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.AdviceImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ActivityNodeImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.InitialNodeImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.FinalNodeImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.DecisionNodeImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.MergeNodeImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ActivityEdgeImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.OpaqueActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getOpaqueAction()
		 * @generated
		 */
		EClass OPAQUE_ACTION = eINSTANCE.getOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_ACTION__LANGUAGE = eINSTANCE.getOpaqueAction_Language();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_ACTION__TYPE = eINSTANCE.getOpaqueAction_Type();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_ACTION__CODE = eINSTANCE.getOpaqueAction_Code();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_ACTION__FILE = eINSTANCE.getOpaqueAction_File();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.SensingActionImpl <em>Sensing Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.SensingActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getSensingAction()
		 * @generated
		 */
		EClass SENSING_ACTION = eINSTANCE.getSensingAction();

		/**
		 * The meta object literal for the '<em><b>Sensor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSING_ACTION__SENSOR_ID = eINSTANCE.getSensingAction_SensorId();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSING_ACTION__DATA = eINSTANCE.getSensingAction_Data();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActuatingActionImpl <em>Actuating Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ActuatingActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActuatingAction()
		 * @generated
		 */
		EClass ACTUATING_ACTION = eINSTANCE.getActuatingAction();

		/**
		 * The meta object literal for the '<em><b>Actuator Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATING_ACTION__ACTUATOR_ID = eINSTANCE.getActuatingAction_ActuatorId();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATING_ACTION__DATA = eINSTANCE.getActuatingAction_Data();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.TimingActionImpl <em>Timing Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.TimingActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getTimingAction()
		 * @generated
		 */
		EClass TIMING_ACTION = eINSTANCE.getTimingAction();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_ACTION__TIME = eINSTANCE.getTimingAction_Time();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.VariableImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Signed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SIGNED = eINSTANCE.getVariable_Signed();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INITIAL = eINSTANCE.getVariable_Initial();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.DataLinkImpl <em>Data Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.DataLinkImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getDataLink()
		 * @generated
		 */
		EClass DATA_LINK = eINSTANCE.getDataLink();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__TASK = eINSTANCE.getDataLink_Task();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__DATA = eINSTANCE.getDataLink_Data();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.UpdatePoolActionImpl <em>Update Pool Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.UpdatePoolActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getUpdatePoolAction()
		 * @generated
		 */
		EClass UPDATE_POOL_ACTION = eINSTANCE.getUpdatePoolAction();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.GetNodeActionImpl <em>Get Node Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.GetNodeActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getGetNodeAction()
		 * @generated
		 */
		EClass GET_NODE_ACTION = eINSTANCE.getGetNodeAction();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_NODE_ACTION__QUERY = eINSTANCE.getGetNodeAction_Query();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.RemoteTriggerActionImpl <em>Remote Trigger Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.RemoteTriggerActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getRemoteTriggerAction()
		 * @generated
		 */
		EClass REMOTE_TRIGGER_ACTION = eINSTANCE.getRemoteTriggerAction();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_TRIGGER_ACTION__CODE = eINSTANCE.getRemoteTriggerAction_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_TRIGGER_ACTION__DATA = eINSTANCE.getRemoteTriggerAction_Data();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.GetDataActionImpl <em>Get Data Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.GetDataActionImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getGetDataAction()
		 * @generated
		 */
		EClass GET_DATA_ACTION = eINSTANCE.getGetDataAction();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DATA_ACTION__QUERY = eINSTANCE.getGetDataAction_Query();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl <em>Activation Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivationProfile()
		 * @generated
		 */
		EClass ACTIVATION_PROFILE = eINSTANCE.getActivationProfile();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROFILE__SENSOR = eINSTANCE.getActivationProfile_Sensor();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROFILE__ACTUATOR = eINSTANCE.getActivationProfile_Actuator();

		/**
		 * The meta object literal for the '<em><b>Dongle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROFILE__DONGLE = eINSTANCE.getActivationProfile_Dongle();

		/**
		 * The meta object literal for the '<em><b>Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROFILE__BATTERY = eINSTANCE.getActivationProfile_Battery();

		/**
		 * The meta object literal for the '<em><b>Neighbors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROFILE__NEIGHBORS = eINSTANCE.getActivationProfile_Neighbors();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROFILE__SPECIFIC = eINSTANCE.getActivationProfile_Specific();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROFILE__VALUE = eINSTANCE.getActivationProfile_Value();

		/**
		 * The meta object literal for the '<em><b>Ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROFILE__CH = eINSTANCE.getActivationProfile_Ch();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.RuntimeImpl <em>Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.RuntimeImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getRuntime()
		 * @generated
		 */
		EClass RUNTIME = eINSTANCE.getRuntime();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME__ENVIRONMENT = eINSTANCE.getRuntime_Environment();

		/**
		 * The meta object literal for the '<em><b>Mote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME__MOTE = eINSTANCE.getRuntime_Mote();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.PlatformSlotImpl <em>Platform Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.PlatformSlotImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getPlatformSlot()
		 * @generated
		 */
		EClass PLATFORM_SLOT = eINSTANCE.getPlatformSlot();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_SLOT__ELEMENT = eINSTANCE.getPlatformSlot_Element();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.impl.PlatformElementImpl <em>Platform Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.impl.PlatformElementImpl
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getPlatformElement()
		 * @generated
		 */
		EClass PLATFORM_ELEMENT = eINSTANCE.getPlatformElement();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.RoutingType <em>Routing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.RoutingType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getRoutingType()
		 * @generated
		 */
		EEnum ROUTING_TYPE = eINSTANCE.getRoutingType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.optimizationLevel <em>optimization Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getoptimizationLevel()
		 * @generated
		 */
		EEnum OPTIMIZATION_LEVEL = eINSTANCE.getoptimizationLevel();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.MoteType <em>Mote Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.MoteType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getMoteType()
		 * @generated
		 */
		EEnum MOTE_TYPE = eINSTANCE.getMoteType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.rdcType <em>rdc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.rdcType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getrdcType()
		 * @generated
		 */
		EEnum RDC_TYPE = eINSTANCE.getrdcType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.macType <em>mac Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.macType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getmacType()
		 * @generated
		 */
		EEnum MAC_TYPE = eINSTANCE.getmacType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.netType <em>net Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.netType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getnetType()
		 * @generated
		 */
		EEnum NET_TYPE = eINSTANCE.getnetType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.sleepType <em>sleep Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.sleepType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getsleepType()
		 * @generated
		 */
		EEnum SLEEP_TYPE = eINSTANCE.getsleepType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.Languages <em>Languages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.Languages
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getLanguages()
		 * @generated
		 */
		EEnum LANGUAGES = eINSTANCE.getLanguages();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.VariableType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.EventType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType <em>Remote Trigger Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getRemoteTriggerDataType()
		 * @generated
		 */
		EEnum REMOTE_TRIGGER_DATA_TYPE = eINSTANCE.getRemoteTriggerDataType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.ActivationType <em>Activation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getActivationType()
		 * @generated
		 */
		EEnum ACTIVATION_TYPE = eINSTANCE.getActivationType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.OpaqueType <em>Opaque Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.OpaqueType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getOpaqueType()
		 * @generated
		 */
		EEnum OPAQUE_TYPE = eINSTANCE.getOpaqueType();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.wsn.EnvironmentType <em>Environment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.wsn.EnvironmentType
		 * @see com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl#getEnvironmentType()
		 * @generated
		 */
		EEnum ENVIRONMENT_TYPE = eINSTANCE.getEnvironmentType();

	}

} //USERPackage
