namespace FIrstUMLLab
{
    public class Passager : Person
    {
        public bool IsPayed { get; private set; } = false;
        public Transport UseTransport { get; set; }

        public Passager()
        {
        }

        public void Pay()
        {
        }
    }
}
