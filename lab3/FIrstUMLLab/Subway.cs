using System.Collections.Generic;

namespace FIrstUMLLab
{
    class Subway : UndergroundTransport
    {
        public List<Turnstiles> Turnstiles { get; private set; }

        public Subway()
        {
            this.Turnstiles = new List<Turnstiles>()
            {
                new Turnstiles(),
                new Turnstiles(),
                new Turnstiles()
            };
        }
    }
}
