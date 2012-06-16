<?xml version="1.0" encoding="UTF-8"?>
<dsl:DSLProject xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:dsl="http://www.borland.com/dsl/2007/dsl" name="Use Case" brandingProvider="blubb" basePackage="test.org" pluginProject="true">
  <deploymentProject pluginId="test.org.ui" pluginName="Use Case UI Project" pluginVersion="1.0" pluginProvider="blubb" localizationClass="test.org.ui.Messages" activatorClass="test.org.ui.Activator">
    <wizard wizardId="test.org.ui.wizards.id" wizardName="Use Case Project Wizard" wizardDescription="Use Case Wizard" className="test.org.ui.wizards.NewDslProjectWizard">
      <category categoryId="test.org.wizards.category" categoryName="Use Case"/>
      <finalPerspective className="test.org.ui.DslPerspective" perspectiveId="test.org.perspective" perspectiveName="Use Case Perspective" perspectiveDescription="Perspective for Use Case"/>
    </wizard>
    <activity activityId="test.org.activity" activityName="Use Case" activityDescription="Use Use Case DSL features." categoryId="test.org.category" categoryName="Use Case" categoryDescription="Use Use Case DSL features."/>
  </deploymentProject>
  <deploymentFeature generate="true" projectId="test.org-feature" featureId="test.org" featureName="Use Case Feature" featureProvider="blubb"/>
</dsl:DSLProject>
