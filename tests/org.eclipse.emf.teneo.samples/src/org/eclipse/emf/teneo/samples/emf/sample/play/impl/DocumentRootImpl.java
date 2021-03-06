/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.2 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.play.ActType;
import org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.sample.play.FmType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayType;
import org.eclipse.emf.teneo.samples.emf.sample.play.SceneType;
import org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getAct <em>Act</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getFm <em>Fm</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getGroupDescription <em>Group Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getPersonae <em>Personae</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getPersonaGroup <em>Persona Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getPlay <em>Play</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getPlaySubTitle <em>Play Sub Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getSceneDescription <em>Scene Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getStageDirections <em>Stage Directions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed = null;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap = null;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation = null;

	/**
	 * The default value of the '{@link #getGroupDescription() <em>Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected static final String P_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPersona() <em>Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPlaySubTitle() <em>Play Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaySubTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAY_SUB_TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSceneDescription() <em>Scene Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpeaker() <em>Speaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeaker()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEAKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStageDirections() <em>Stage Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageDirections()
	 * @generated
	 * @ordered
	 */
	protected static final String STAGE_DIRECTIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlayPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, PlayPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PlayPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PlayPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActType getAct() {
		return (ActType)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__ACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAct(ActType newAct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PlayPackage.Literals.DOCUMENT_ROOT__ACT, newAct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAct(ActType newAct) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__ACT, newAct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmType getFm() {
		return (FmType)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__FM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFm(FmType newFm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PlayPackage.Literals.DOCUMENT_ROOT__FM, newFm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFm(FmType newFm) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__FM, newFm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupDescription() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__GROUP_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupDescription(String newGroupDescription) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__GROUP_DESCRIPTION, newGroupDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__LINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(String newLine) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__LINE, newLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__P, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(String newP) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__P, newP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersona() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__PERSONA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersona(String newPersona) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__PERSONA, newPersona);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonaeType getPersonae() {
		return (PersonaeType)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__PERSONAE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonae(PersonaeType newPersonae, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PlayPackage.Literals.DOCUMENT_ROOT__PERSONAE, newPersonae, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonae(PersonaeType newPersonae) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__PERSONAE, newPersonae);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonaGroupType getPersonaGroup() {
		return (PersonaGroupType)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__PERSONA_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonaGroup(PersonaGroupType newPersonaGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PlayPackage.Literals.DOCUMENT_ROOT__PERSONA_GROUP, newPersonaGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonaGroup(PersonaGroupType newPersonaGroup) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__PERSONA_GROUP, newPersonaGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayType getPlay() {
		return (PlayType)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__PLAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlay(PlayType newPlay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PlayPackage.Literals.DOCUMENT_ROOT__PLAY, newPlay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlay(PlayType newPlay) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__PLAY, newPlay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaySubTitle() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__PLAY_SUB_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaySubTitle(String newPlaySubTitle) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__PLAY_SUB_TITLE, newPlaySubTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneType getScene() {
		return (SceneType)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__SCENE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScene(SceneType newScene, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PlayPackage.Literals.DOCUMENT_ROOT__SCENE, newScene, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScene(SceneType newScene) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__SCENE, newScene);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSceneDescription() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__SCENE_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneDescription(String newSceneDescription) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__SCENE_DESCRIPTION, newSceneDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpeaker() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__SPEAKER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeaker(String newSpeaker) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__SPEAKER, newSpeaker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechType getSpeech() {
		return (SpeechType)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__SPEECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeech(SpeechType newSpeech, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PlayPackage.Literals.DOCUMENT_ROOT__SPEECH, newSpeech, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeech(SpeechType newSpeech) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__SPEECH, newSpeech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStageDirections() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__STAGE_DIRECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStageDirections(String newStageDirections) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__STAGE_DIRECTIONS, newStageDirections);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)getMixed().get(PlayPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		((FeatureMap.Internal)getMixed()).set(PlayPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlayPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case PlayPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case PlayPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case PlayPackage.DOCUMENT_ROOT__ACT:
				return basicSetAct(null, msgs);
			case PlayPackage.DOCUMENT_ROOT__FM:
				return basicSetFm(null, msgs);
			case PlayPackage.DOCUMENT_ROOT__PERSONAE:
				return basicSetPersonae(null, msgs);
			case PlayPackage.DOCUMENT_ROOT__PERSONA_GROUP:
				return basicSetPersonaGroup(null, msgs);
			case PlayPackage.DOCUMENT_ROOT__PLAY:
				return basicSetPlay(null, msgs);
			case PlayPackage.DOCUMENT_ROOT__SCENE:
				return basicSetScene(null, msgs);
			case PlayPackage.DOCUMENT_ROOT__SPEECH:
				return basicSetSpeech(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlayPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case PlayPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case PlayPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case PlayPackage.DOCUMENT_ROOT__ACT:
				return getAct();
			case PlayPackage.DOCUMENT_ROOT__FM:
				return getFm();
			case PlayPackage.DOCUMENT_ROOT__GROUP_DESCRIPTION:
				return getGroupDescription();
			case PlayPackage.DOCUMENT_ROOT__LINE:
				return getLine();
			case PlayPackage.DOCUMENT_ROOT__P:
				return getP();
			case PlayPackage.DOCUMENT_ROOT__PERSONA:
				return getPersona();
			case PlayPackage.DOCUMENT_ROOT__PERSONAE:
				return getPersonae();
			case PlayPackage.DOCUMENT_ROOT__PERSONA_GROUP:
				return getPersonaGroup();
			case PlayPackage.DOCUMENT_ROOT__PLAY:
				return getPlay();
			case PlayPackage.DOCUMENT_ROOT__PLAY_SUB_TITLE:
				return getPlaySubTitle();
			case PlayPackage.DOCUMENT_ROOT__SCENE:
				return getScene();
			case PlayPackage.DOCUMENT_ROOT__SCENE_DESCRIPTION:
				return getSceneDescription();
			case PlayPackage.DOCUMENT_ROOT__SPEAKER:
				return getSpeaker();
			case PlayPackage.DOCUMENT_ROOT__SPEECH:
				return getSpeech();
			case PlayPackage.DOCUMENT_ROOT__STAGE_DIRECTIONS:
				return getStageDirections();
			case PlayPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlayPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__ACT:
				setAct((ActType)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__FM:
				setFm((FmType)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__GROUP_DESCRIPTION:
				setGroupDescription((String)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__LINE:
				setLine((String)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__P:
				setP((String)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__PERSONA:
				setPersona((String)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__PERSONAE:
				setPersonae((PersonaeType)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__PERSONA_GROUP:
				setPersonaGroup((PersonaGroupType)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__PLAY:
				setPlay((PlayType)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__PLAY_SUB_TITLE:
				setPlaySubTitle((String)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__SCENE:
				setScene((SceneType)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__SCENE_DESCRIPTION:
				setSceneDescription((String)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__SPEAKER:
				setSpeaker((String)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__SPEECH:
				setSpeech((SpeechType)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__STAGE_DIRECTIONS:
				setStageDirections((String)newValue);
				return;
			case PlayPackage.DOCUMENT_ROOT__TITLE:
				setTitle((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlayPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case PlayPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case PlayPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case PlayPackage.DOCUMENT_ROOT__ACT:
				setAct((ActType)null);
				return;
			case PlayPackage.DOCUMENT_ROOT__FM:
				setFm((FmType)null);
				return;
			case PlayPackage.DOCUMENT_ROOT__GROUP_DESCRIPTION:
				setGroupDescription(GROUP_DESCRIPTION_EDEFAULT);
				return;
			case PlayPackage.DOCUMENT_ROOT__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case PlayPackage.DOCUMENT_ROOT__P:
				setP(P_EDEFAULT);
				return;
			case PlayPackage.DOCUMENT_ROOT__PERSONA:
				setPersona(PERSONA_EDEFAULT);
				return;
			case PlayPackage.DOCUMENT_ROOT__PERSONAE:
				setPersonae((PersonaeType)null);
				return;
			case PlayPackage.DOCUMENT_ROOT__PERSONA_GROUP:
				setPersonaGroup((PersonaGroupType)null);
				return;
			case PlayPackage.DOCUMENT_ROOT__PLAY:
				setPlay((PlayType)null);
				return;
			case PlayPackage.DOCUMENT_ROOT__PLAY_SUB_TITLE:
				setPlaySubTitle(PLAY_SUB_TITLE_EDEFAULT);
				return;
			case PlayPackage.DOCUMENT_ROOT__SCENE:
				setScene((SceneType)null);
				return;
			case PlayPackage.DOCUMENT_ROOT__SCENE_DESCRIPTION:
				setSceneDescription(SCENE_DESCRIPTION_EDEFAULT);
				return;
			case PlayPackage.DOCUMENT_ROOT__SPEAKER:
				setSpeaker(SPEAKER_EDEFAULT);
				return;
			case PlayPackage.DOCUMENT_ROOT__SPEECH:
				setSpeech((SpeechType)null);
				return;
			case PlayPackage.DOCUMENT_ROOT__STAGE_DIRECTIONS:
				setStageDirections(STAGE_DIRECTIONS_EDEFAULT);
				return;
			case PlayPackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlayPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case PlayPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case PlayPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case PlayPackage.DOCUMENT_ROOT__ACT:
				return getAct() != null;
			case PlayPackage.DOCUMENT_ROOT__FM:
				return getFm() != null;
			case PlayPackage.DOCUMENT_ROOT__GROUP_DESCRIPTION:
				return GROUP_DESCRIPTION_EDEFAULT == null ? getGroupDescription() != null : !GROUP_DESCRIPTION_EDEFAULT.equals(getGroupDescription());
			case PlayPackage.DOCUMENT_ROOT__LINE:
				return LINE_EDEFAULT == null ? getLine() != null : !LINE_EDEFAULT.equals(getLine());
			case PlayPackage.DOCUMENT_ROOT__P:
				return P_EDEFAULT == null ? getP() != null : !P_EDEFAULT.equals(getP());
			case PlayPackage.DOCUMENT_ROOT__PERSONA:
				return PERSONA_EDEFAULT == null ? getPersona() != null : !PERSONA_EDEFAULT.equals(getPersona());
			case PlayPackage.DOCUMENT_ROOT__PERSONAE:
				return getPersonae() != null;
			case PlayPackage.DOCUMENT_ROOT__PERSONA_GROUP:
				return getPersonaGroup() != null;
			case PlayPackage.DOCUMENT_ROOT__PLAY:
				return getPlay() != null;
			case PlayPackage.DOCUMENT_ROOT__PLAY_SUB_TITLE:
				return PLAY_SUB_TITLE_EDEFAULT == null ? getPlaySubTitle() != null : !PLAY_SUB_TITLE_EDEFAULT.equals(getPlaySubTitle());
			case PlayPackage.DOCUMENT_ROOT__SCENE:
				return getScene() != null;
			case PlayPackage.DOCUMENT_ROOT__SCENE_DESCRIPTION:
				return SCENE_DESCRIPTION_EDEFAULT == null ? getSceneDescription() != null : !SCENE_DESCRIPTION_EDEFAULT.equals(getSceneDescription());
			case PlayPackage.DOCUMENT_ROOT__SPEAKER:
				return SPEAKER_EDEFAULT == null ? getSpeaker() != null : !SPEAKER_EDEFAULT.equals(getSpeaker());
			case PlayPackage.DOCUMENT_ROOT__SPEECH:
				return getSpeech() != null;
			case PlayPackage.DOCUMENT_ROOT__STAGE_DIRECTIONS:
				return STAGE_DIRECTIONS_EDEFAULT == null ? getStageDirections() != null : !STAGE_DIRECTIONS_EDEFAULT.equals(getStageDirections());
			case PlayPackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
