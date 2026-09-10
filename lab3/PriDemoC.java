package B;
import A;
public class PriDemoC extends PriDemoP {
    public static void main(String[] args) {
        PriDemoC pd = new PriDemoC();
        pd.show();
        IO.println(pd.x);
    }
}

/*
    Write pridemop first
    it has no output

    Output:
    This is a private class
    20
    
*/
