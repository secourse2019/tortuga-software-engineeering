using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    public class GroundTransport : Transport
    {
        public List<Blogger> Bloggers { get; set; }
        public Validator Validator { get; private set; }

        public GroundTransport()
        {
            this.Validator = new Validator();
        }

        public GroundTransport(Driver driver, List<DateTime> timetable, int amount, int stock)
            : base(driver, timetable, amount, stock)
        {
            this.Validator = new Validator();
        }
    }
}
