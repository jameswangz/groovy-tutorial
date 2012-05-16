package evaluator

import evaluator.Foo

Random random = new Random()
foo = new Foo()

['name', 'description'].each { field ->
    def value = 'hello evaluator'
    println Eval.x(foo, "x.${field} = '${value}'")
}


//def field='name'
//println Eval.xy(foo, 'name', "x.${field} = 'james'")
println foo.dump()

//println Eval.xy(foo, 'name', "x.y = 'james'")



//foo.class.getMethod("name").set(foo, "james")
//
//println foo.dump()