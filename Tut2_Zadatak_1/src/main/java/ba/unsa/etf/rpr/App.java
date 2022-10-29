package ba.unsa.etf.rpr;

public class App 
{
    public static void main( String[] args )
    {
        Matematika mat = new Matematika();

        int firstArg;
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
                System.out.println("Sinus je " + mat.Sinus(firstArg) + ", a faktorijel je " + mat.Faktorijel(firstArg) +  ".");
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
}
