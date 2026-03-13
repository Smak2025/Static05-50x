List<Person> createPersons(String[] lastname, String[] firstname){
    List<Person> lst = new ArrayList<>();
    for (int i = 0; i < lastname.length; i++) {
        lst.add(new Person(lastname[i], firstname[i]));
        System.out.println(lst.getLast());
    }
    return lst;
}

void showAll(List<Person> persons){
    for (Person person : persons) {
        System.out.println(person);
    }
}

void main() {
    System.out.println(Person.getPersonCount());
    var persons = createPersons(
            new String[]{"Иванов", "Петров", "Макарова"},
            new String[]{"Иван", "Петр", "Анна"}
    );
    //....
    System.out.println("==============================");
    showAll(persons);
    System.out.println(Person.getPersonCount());
    System.out.println("==============================");
    persons.add(persons.get(1).copy());
    System.out.println(persons.getLast());

    System.out.println("==============================");
    showAll(persons);
    System.out.println(Person.getPersonCount());

}