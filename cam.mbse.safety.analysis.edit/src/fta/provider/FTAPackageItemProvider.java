/**
 */
package fta.provider;


import fta.FTAPackage;
import fta.Fta_Factory;
import fta.Fta_Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fta.FTAPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FTAPackageItemProvider extends FTAElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTAPackageItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_FTAPackage_interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FTAPackage_interface_feature", "_UI_FTAPackage_type"),
				 Fta_Package.Literals.FTA_PACKAGE__INTERFACE,
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
			childrenFeatures.add(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS);
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
	 * This returns FTAPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FTAPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FTAPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_FTAPackage_type") :
			getString("_UI_FTAPackage_type") + " " + label;
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

		switch (notification.getFeatureID(FTAPackage.class)) {
			case Fta_Package.FTA_PACKAGE__ELEMENTS:
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
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createFTAPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createFTAPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createComponentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createANDGate()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createORGate()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createInibitGate()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createSubtree()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createInTriangle()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createOutTriangle()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createTopEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createConditioningEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createBasicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createUndevelopedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Fta_Package.Literals.FTA_PACKAGE__ELEMENTS,
				 Fta_Factory.eINSTANCE.createIntermediateEvent()));
	}

}
