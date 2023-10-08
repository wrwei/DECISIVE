/**
 */
package safety_concept.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import safety_concept.Safety_Concept;
import safety_concept.Safety_concept_Package;

/**
 * This is the item provider adapter for a {@link safety_concept.Safety_Concept} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Safety_ConceptItemProvider extends ConceptElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Safety_ConceptItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAbstract_levelPropertyDescriptor(object);
			addAsilPropertyDescriptor(object);
			addSilPropertyDescriptor(object);
			addIdentityPropertyDescriptor(object);
			addDescPropertyDescriptor(object);
			addScriptPropertyDescriptor(object);
			addSatisfiedPropertyDescriptor(object);
			addRequirementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstract_levelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Safety_Concept_abstract_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Safety_Concept_abstract_level_feature", "_UI_Safety_Concept_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT__ABSTRACT_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Asil feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsilPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Safety_Concept_asil_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Safety_Concept_asil_feature", "_UI_Safety_Concept_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT__ASIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sil feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSilPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Safety_Concept_sil_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Safety_Concept_sil_feature", "_UI_Safety_Concept_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT__SIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Safety_Concept_identity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Safety_Concept_identity_feature", "_UI_Safety_Concept_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT__IDENTITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Desc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Safety_Concept_desc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Safety_Concept_desc_feature", "_UI_Safety_Concept_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT__DESC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Script feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Safety_Concept_script_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Safety_Concept_script_feature", "_UI_Safety_Concept_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT__SCRIPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Satisfied feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSatisfiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Safety_Concept_satisfied_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Safety_Concept_satisfied_feature", "_UI_Safety_Concept_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT__SATISFIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requirement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Safety_Concept_requirement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Safety_Concept_requirement_feature", "_UI_Safety_Concept_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT__REQUIREMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Safety_Concept.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Safety_Concept"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Safety_Concept)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_Safety_Concept_type") :
			getString("_UI_Safety_Concept_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Safety_Concept.class)) {
			case Safety_concept_Package.SAFETY_CONCEPT__ABSTRACT_LEVEL:
			case Safety_concept_Package.SAFETY_CONCEPT__ASIL:
			case Safety_concept_Package.SAFETY_CONCEPT__SIL:
			case Safety_concept_Package.SAFETY_CONCEPT__IDENTITY:
			case Safety_concept_Package.SAFETY_CONCEPT__DESC:
			case Safety_concept_Package.SAFETY_CONCEPT__SCRIPT:
			case Safety_concept_Package.SAFETY_CONCEPT__SATISFIED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
