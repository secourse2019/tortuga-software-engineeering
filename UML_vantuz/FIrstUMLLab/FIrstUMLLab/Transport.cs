using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    public class Transport
    {
        public List<DateTime> Timetable { get; private set; }
        public int Amount { get; private set; }
        public int Stock { get; private set; }
        public Driver TransportDriver { get; private set; }
        public List<Passager> Passagers { get; set; }

        public Transport()
        { }

        public Transport(Driver driver, List<DateTime> timetable, int amount, int stock)
        {
            this.TransportDriver = driver;
            this.Timetable = timetable;
            this.Amount = amount;
            this.Stock = stock;
        }
    }
}