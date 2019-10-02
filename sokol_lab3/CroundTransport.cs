using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiagrammaApp
{
    class GroundTransport : Transport
    {
        public Driver driver;
        public Blogger Bloggers { get; set; }

        public GroundTransport(Driver driver)
        {
            this.driver = driver;
        }
    }
}
