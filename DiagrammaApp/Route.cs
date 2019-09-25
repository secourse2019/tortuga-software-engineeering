using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiagrammaApp
{
    class Route
    {
        public int Number { get; set; }
        //public Transport transport;
        public List<Point> Stations { get; set; }

        public Route(int number, List<Point> stations)
        {
            Number = number;
            Stations = stations;
        }

        public double Driwing()
        {
            return 0;
        }


    }
}
