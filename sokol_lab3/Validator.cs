using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiagrammaApp
{
    class Validator : IPaymnet
    {
        public bool PaymentMethod(UnitPayments unit) { return false; }
    }
}
