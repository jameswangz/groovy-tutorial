package builder;

import groovy.util.BuilderSupport;

import java.util.Map;


/**
 * @author James Wang
 */
public class DepartmentBuilder extends BuilderSupport {

    @Override
    protected void setParent(Object parent, Object child) {
        if (Department.class.isInstance(parent)) {
            if (Team.class.isInstance(child)) {
                ((Department) parent).addTeam((Team) child);
                return;
            }
        }
        if (Team.class.isInstance(parent)) {
            if (Member.class.isInstance(child)) {
                ((Team) parent).addMember((Member) child);
                return;
            }
        }
    }

    @Override
    protected Object createNode(Object name) {
        if ("Location".equals(name)) {
            return new Location();
        }
        throw new UnsupportedOperationException("not yet implemented -> createNode (name " + name + ")");
    }

    @Override
    protected Object createNode(Object name, Object value) {
        if ("member".equals(name)) {
            return new Member(value.toString());
        }
        throw new UnsupportedOperationException("not yet implemented -> createNode (name " + name + ", value " + value + ")");
    }

    @Override
    protected Object createNode(Object name, Map attributes) {
        if ("_".equals(name)) {
            Object current = getCurrent();

            for (Object attribute : attributes.entrySet()) {
                String key = (String) ((Map.Entry) attribute).getKey();
                Object value = ((Map.Entry) attribute).getValue();
                ReflectionUtils.setFieldValue(current, key, value);
            }

            return null;
        }
        throw new UnsupportedOperationException("not yet implemented -> createNode (name " + name + ", attributes " + attributes + ")");
    }

    @Override
    protected Object createNode(Object name, Map attributes, Object value) {
        if ("department".equals(name)) {
            return new Department(value.toString(), attributes.get("manager").toString());
        }
        if ("team".equals(name)) {
            return new Team(value.toString(), attributes.get("lead").toString());
        }

        throw new UnsupportedOperationException("not yet implemented -> createNode (name " + name + ", attributes " + attributes + ", value " +  value + ")");
    }

}
