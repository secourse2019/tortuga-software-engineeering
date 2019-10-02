using System;
using System.Collections.Generic;

namespace FIrstUMLLab
{
    class Route
    {
        public int Number { get; private set; }
        public Transport Transport { get; private set; }
        public List<Station> Stations { get; private set; }

        public Route(int num, Transport transport, List<Station> stations)
        {
            this.Number = num;
            this.Transport = transport;
            this.Stations = stations;
        }

        public double Driving()
        {
            return 0;
        }
    }
}
