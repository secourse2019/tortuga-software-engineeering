using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    class Trolley : GroundTransport
    {
        public Trolley(Driver driver, List<DateTime> timetable, int amount, int stock)
            : base(driver, timetable, amount, stock)
        { }
    }
}
