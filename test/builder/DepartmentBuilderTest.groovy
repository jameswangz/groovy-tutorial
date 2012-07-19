import builder.DepartmentBuilder

def departmentBuilder = new DepartmentBuilder()

def department = departmentBuilder.department('Foglight Dev', manager : 'Yinghua Qin') {
    _ location : Location {
        _ country : 'China'
        _ city : 'Zhuhai'
    }
    team('apm', lead : 'Kevin Wang' ) {
        member('Alex Liang')
        member('Paul Zhou')
        member('Jerome Tang')
    }
    team('dashboard', lead : 'Beam Liu') {
        member('Kyle Wang')
        member('Jacee Huang')
    }
    team('enduser', lead : 'James Wang') {
        member('Christian Chen')
        member('Rabbit Xiao')
    }
}

println department.dump()
assert 'Foglight Dev' == department.name
assert 'Yinghua Qin' == department.manager
assert 'China' == department.location.country
assert 'Zhuhai' == department.location.city
assert 3 == department.teams.size()
def apmTeam = department.teams[0]
assert 'apm' == apmTeam.name
assert 'Kevin Wang', apmTeam.lead
assert 3 == apmTeam.members.size()
assert 'Alex Liang' == apmTeam.members[0].name
assert 'Paul Zhou' == apmTeam.members[1].name
assert 'Jerome Tang' == apmTeam.members[2].name
def dashboardTeam = department.teams[1]
assert 'dashboard' == dashboardTeam.name
assert 'Beam Liu' == dashboardTeam.lead
assert 2 == dashboardTeam.members.size()
assert 'Kyle Wang' == dashboardTeam.members[0].name
assert 'Jacee Huang' == dashboardTeam.members[1].name
def enduserTeam = department.teams[2]
assert 'enduser' == enduserTeam.name
assert 2 == enduserTeam.members.size()
assert 'Christian Chen' == enduserTeam.members[0].name
assert 'Rabbit Xiao' == enduserTeam.members[1].name

