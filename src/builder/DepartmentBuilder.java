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
            ((Department) parent).addTeam((Team) child);
            return;
        }
        if (Team.class.isInstance(parent)) {
            ((Team) parent).addMember((Member) child);
            return;
        }
        throw new UnsupportedOperationException("not yet implemented -> setParent (parent " + parent + ", child " + child + ")");
    }

    @Override
    protected Object createNode(Object name) {
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
