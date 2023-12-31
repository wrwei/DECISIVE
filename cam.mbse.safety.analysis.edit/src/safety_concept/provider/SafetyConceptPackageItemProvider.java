/**
 */
package safety_concept.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import safety_concept.SafetyConceptPackage;
import safety_concept.Safety_concept_Factory;
import safety_concept.Safety_concept_Package;

/**
 * This is the item provider adapter for a {@link safety_concept.SafetyConceptPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyConceptPackageItemProvider extends ConceptElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyConceptPackageItemProvider(AdapterFactory adapterFactory) {
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

			addInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyConceptPackage_interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyConceptPackage_interface_feature", "_UI_SafetyConceptPackage_type"),
				 Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE__INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SafetyConceptPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SafetyConceptPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SafetyConceptPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_SafetyConceptPackage_type") :
			getString("_UI_SafetyConceptPackage_type") + " " + label;
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

		switch (notification.getFeatureID(SafetyConceptPackage.class)) {
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT,
				 Safety_concept_Factory.eINSTANCE.createSafetyConceptPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT,
				 Safety_concept_Factory.eINSTANCE.createSafetyConceptPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT,
				 Safety_concept_Factory.eINSTANCE.createSafetyConceptPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT,
				 Safety_concept_Factory.eINSTANCE.createSafety_Concept()));

		newChildDescriptors.add
			(createChildParameter
				(Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT,
				 Safety_concept_Factory.eINSTANCE.createRequirementRelationship()));
	}

}
