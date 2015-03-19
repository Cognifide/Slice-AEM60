package com.cognifide.slice.cq.mapper.processor;

import com.cognifide.slice.cq.qualifier.Inherited;
import com.cognifide.slice.mapper.api.processor.FieldProcessor;
import com.cognifide.slice.mapper.helper.ReflectionHelper;
import com.day.cq.commons.inherit.HierarchyNodeInheritanceValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import java.lang.reflect.Field;

public class InheritedFieldProcessor implements FieldProcessor {

    @Override
    public boolean accepts(Resource resource, Field field) {
        return field.isAnnotationPresent(Inherited.class);
    }

    @Override
    public Object mapResourceToField(Resource resource, ValueMap valueMap,
                                     Field field, String propertyName) {
        Class<?> propertyType = ReflectionHelper.getFieldType(field);
        return new HierarchyNodeInheritanceValueMap(resource).getInherited(propertyName, propertyType);
    }
}
