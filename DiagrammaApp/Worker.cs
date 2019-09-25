using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiagrammaApp
{
    class Worker : Person
    {
        public int Salary { get; set; }

        public Worker() { }

        public Worker(int salary)
        {
            Salary = salary;
        }
    }
}
