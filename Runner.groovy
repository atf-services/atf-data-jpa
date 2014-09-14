import pkg.*

context = ServiceContext.instance
person = context.createPerson('Todd', 'Crone')
println "Person with ID=${person.id}"
