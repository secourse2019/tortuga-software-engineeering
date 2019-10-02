using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    class Tram : GroundTransport
    {
        public Tram(Driver driver, List<DateTime> timetable, int amount, int stock)
            : base(driver, timetable, amount, stock)
        { }
    }
}
