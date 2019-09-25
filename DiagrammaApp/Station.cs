using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiagrammaApp
{
    class Station
    {
        public string Name { get; set; }
        public Point Coordinates { get; set; }
        
        public Station(string name, Point coordinates)
        {
            Name = name;
            Coordinates = coordinates;
        }
    }
}
