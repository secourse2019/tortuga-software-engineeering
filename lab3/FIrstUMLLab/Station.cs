namespace FIrstUMLLab
{
    class Station
    {
        public string Name { get; private set; }
        public Point Coordinates { get; private set; }

        public Station(string name, Point coordinates)
        {
            this.Name = name;
            this.Coordinates = coordinates;
        }
    }
}
