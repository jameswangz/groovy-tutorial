package builder;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public abstract class ReflectionUtils {

    public static void setFieldValue(Object object, String fieldName, Object value) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(object.getClass());
            for (PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {
                if (descriptor.getName().equals(fieldName)) {
                    descriptor.getWriteMethod().invoke(object, value);
                    return;
                }
            }
        } catch (Exception e) {
            throw new IllegalStateException("Couldn't set [" + value + "] for " + object.getClass() + "." + fieldName, e);
        }
        throw new IllegalArgumentException("Property [" + fieldName + "] not found in " + object.getClass());
    }

}
