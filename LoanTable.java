
//Luke Bradaric
public class LoanTable
{
    public LoanTable()
    {
    }

    public void paymentLoan(int loan, int years, double interestLow, double interestHigh){
        interestLow = interestLow * .01;
        interestHigh = interestHigh * .01 + .0001;
        while(interestLow <= interestHigh){
            double exit = 0;
            double k = interestLow / 12;
            double n = years * 12;
            double c = Math.pow((1 + k), n);
            exit = (loan * k * c) / (c - 1);
            String s = Double.toString(interestLow);
            String intFix = s.substring(0,4);
            System.out.print(intFix + "     ");
            System.out.println(exit);
            interestLow += .0025;
        }   
    }
}
