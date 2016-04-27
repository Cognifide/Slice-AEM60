package com.cognifide.slice.cq.bindings;

import java.util.HashMap;
import java.util.Map;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;

import com.cognifide.slice.api.provider.ComponentDefinitionProvider;
import com.day.cq.wcm.commons.WCMUtils;

@Component
@Service
public class CqComponentDefinitionResolver implements ComponentDefinitionProvider {

	@Override
	public Map<String, Object> getComponentDefinition(Resource resource) {
		com.day.cq.wcm.api.components.Component component = WCMUtils.getComponent(resource);
		if (component != null) {
			Map<String, Object> values = component.getProperties();
			if (values != null) {
				return new HashMap<String, Object>(values);
			}
		}
		return null;
	}

}
