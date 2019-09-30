namespace FIrstUMLLab
{
    class Subway : UndergroundTransport
    {
        public Turnstiles Turnstiles { get; private set; }

        public Subway()
        {
            this.Turnstiles = new Turnstiles();
        }
    }
}
