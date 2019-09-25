namespace FIrstUMLLab
{
    public enum UnitPayments
    {
        ticket,
        card,
        token
    }

    public interface IPayment
    {
        bool PaymentMethod(UnitPayments payments);
    }
}
