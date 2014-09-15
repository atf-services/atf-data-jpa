package atf.jpa

class Main {
    static void main(String[] args) {
        def context = ServiceContext.instance
        def person = context.createPerson('Todd', 'Crone')
        println "Person with ID=${person.id}"
    }
}
