namespace FIrstUMLLab
{
    public class Person
    {
        public string Name { get; private set; }
        public string Surname { get; private set; }
        public int Age { get; private set; }

        public Person()
        { }

        public Person(string name, string surname, int age)
        {
            this.Name = name;
            this.Surname = surname;
            this.Age = age;
        }
    }
}
