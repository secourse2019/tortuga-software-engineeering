namespace FIrstUMLLab
{
    public class Worker : Person
    {
        public int Salary { get; private set; }

        public Worker(int salary, string name, string surname, int age)
            : base(name, surname, age)
        {
            this.Salary = salary;
        }
    }
}
