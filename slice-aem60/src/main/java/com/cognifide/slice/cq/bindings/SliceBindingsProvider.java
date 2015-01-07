package com.cognifide.slice.cq.bindings;

import javax.script.Bindings;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.scripting.api.BindingsValuesProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognifide.slice.api.model.ModelClassResolver;

@Component
@Service
public class SliceBindingsProvider implements BindingsValuesProvider {

	private static final Logger LOG = LoggerFactory.getLogger(SliceBindingsProvider.class);

	@Reference
	private ModelClassResolver modelClassNameResolver;

	@Override
	public void addBindings(Bindings bindings) {
		final Resource resource = (Resource) bindings.get("resource");
		if (resource == null) {
			return;
		}
		try {
			final Class<?> modelClass = modelClassNameResolver.getModelClass(resource.getResourceType());
			if (modelClass != null) {
				bindings.put("model", resource.adaptTo(modelClass));
			}
		} catch (ClassNotFoundException e) {
			LOG.error("Can't resolver Slice model class", e);
		}
	}

}
