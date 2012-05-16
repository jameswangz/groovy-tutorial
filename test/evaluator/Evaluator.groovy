package evaluator

import evaluator.Foo


Binding binding = new Binding()
binding.setVariable("o", new Foo())
binding.setVariable("field", 'name')
GroovyShell shell = new GroovyShell(binding)

shell.evaluate("o.field = 'evaluatoruator'")