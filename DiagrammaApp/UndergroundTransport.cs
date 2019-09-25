using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiagrammaApp
{
    class UndergroundTransport : Transport
    {
        public Driver driver;
        public Security secunity;

        public UndergroundTransport() { }

        public UndergroundTransport(Driver driver, Security secunity)
        {
            this.driver = driver;
            this.secunity = secunity;
        }
    }
}
