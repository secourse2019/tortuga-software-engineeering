using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    class PetrolBus : Bus
    {
        public PetrolBus(Driver driver, List<DateTime> timetable, int amount, int stock)
            : base(driver, timetable, amount, stock)
        { }
    }
}
