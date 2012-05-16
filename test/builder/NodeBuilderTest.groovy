def nodeBuilder = new NodeBuilder()

def people = nodeBuilder.people('US', kind : 'folks', groovy : true) {
    person(x : 123, name : 'James', cheese : 'edam') {
        project(name : 'groovy')
        project(name : 'geronimo')
    }
    person(x : 234, name : 'bob', cheese : 'cheddar') {
        project(name : 'groovy')
        project(name : 'drools')
    }
    person()
    person('Maria')
    person {
        project('enduser')
    }
}

println people
println people.dump()