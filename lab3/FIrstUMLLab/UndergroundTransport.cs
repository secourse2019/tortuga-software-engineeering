using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    class UndergroundTransport : Transport
    {
        public Driver Driver { get; private set; }
        public Security Security { get; private set; }

        public UndergroundTransport()
        { }

        public UndergroundTransport(Driver driver, Security security,
            List<DateTime> timetable, int amount, int stock) : base(driver, timetable, amount, stock)
        {

        }
    }
}
