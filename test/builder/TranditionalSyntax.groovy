import builder.Department
import builder.Location
import builder.Team
import builder.Member

Department department = new Department('Foglight Dev', 'Yinghua Qin');
Location location = new Location();
location.setCountry("China");
location.setCity("Zhuhai");
department.setLocation(location);
Team apmTeam = new Team("apm", "Kevin Wang");
apmTeam.addMember(new Member("Alex Liang"));
apmTeam.addMember(new Member("Paul Zhou"));
apmTeam.addMember(new Member("Jerome Tang"));
department.addTeam(apmTeam);
Team dashboardTeam = new Team("dashboard", "Beam Liu");
dashboardTeam.addMember(new Member("Kyle Wang"));
dashboardTeam.addMember(new Member("Jacee Huang"));
department.addTeam(dashboardTeam);
Team enduserTeam = new Team("enduser", 'James Wang');
enduserTeam.addMember(new Member("Christian Chen"));
enduserTeam.addMember(new Member("Rabbit Xiao"));
department.addTeam(enduserTeam);


