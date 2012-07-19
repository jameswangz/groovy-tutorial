package builder;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private String manager;
    private Location location;
    private List<Team> teams = new ArrayList<Team>();


    public Department(String name, String manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }

    public Department addTeam(Team team) {
        this.teams.add(team);
        return this;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
