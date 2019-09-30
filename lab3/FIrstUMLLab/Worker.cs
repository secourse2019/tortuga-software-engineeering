using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FIrstUMLLab
{
    public class Worker : Person
    {
        public int Salary { get; private set; }

        public Worker(int salary)
        {
            this.Salary = salary;
        }
    }
}
