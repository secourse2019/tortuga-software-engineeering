using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiagrammaApp
{
    class Passager : Person
    {
        public bool isPayed = false;
        public Transport UseTransport { get; }


        public Passager(Transport useTransport)
        {
            UseTransport = useTransport;
        }

        public void Payed() { }
    }
}
