using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiagrammaApp
{
    class Trolley : UndergroundTransport
    {
        public List<Passager> Passagers { get; set; }

        public Trolley() { }
    }
}
