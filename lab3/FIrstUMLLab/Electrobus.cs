using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    class Electrobus : Bus
    {
        public Electrobus()
        { }

        public Electrobus(Driver driver, List<DateTime> timetable, int amount, int stock) 
            : base(driver, timetable, amount, stock)
        { }
    }
}
