package builder;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private String lead;
    private List<Member> members = new ArrayList<Member>();

    public Team(String name, String lead) {
        this.name = name;
        this.lead = lead;
    }

    public String getLead() {
        return lead;
    }

    public String getName() {
        return name;
    }

    public Team addMember(Member member) {
        this.members.add(member);
        return this;
    }

    public List<Member> getMembers() {
        return members;
    }
}
