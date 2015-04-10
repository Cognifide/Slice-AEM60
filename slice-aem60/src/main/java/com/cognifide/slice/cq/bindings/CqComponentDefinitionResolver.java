package com.cognifide.slice.cq.bindings;

import java.util.Map;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import com.cognifide.slice.api.provider.ComponentDefinitionResolver;
import com.day.cq.wcm.api.components.ComponentManager;

@Component
@Service
public class CqComponentDefinitionResolver implements ComponentDefinitionResolver {

	@Reference
	private ComponentManager componentManager;

	@Override
	public Map<String, Object> getComponentDefinition(String resourceType) {
		final com.day.cq.wcm.api.components.Component component = componentManager.getComponent(resourceType);
		if (component != null) {
			return component.getProperties();
		}
		return null;
	}

}
