using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    class Bus : GroundTransport
    {
        public void FillFuel()
        {
            TransportDriver.FillFuel();
        }

        public Bus()
        { }

        public Bus(Driver driver, List<DateTime> timetable, int amount, int stock)
            : base(driver, timetable, amount, stock)
        { }
    }
}
