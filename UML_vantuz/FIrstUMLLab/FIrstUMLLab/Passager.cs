using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FIrstUMLLab
{
    public class Passager : Person
    {
        public bool IsPayed { get; private set; } = false;
        public Transport UseTransport { get; private set; }

        public Passager(Transport transport)
        {
            this.UseTransport = transport;
        }

        public void Payed()
        {

        }
    }
}
