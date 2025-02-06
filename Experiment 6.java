class main
{
    public static void main(String arg[])
    {
        int decimalNumber = 156;
        
        String binaryString = Integer.toBinaryString(decimalNumber);
        
        System.out.println("Decimal number " + decimalNumber);
        System.out.println("Binary number " + binaryString);
        
        String octalString = Integer.toOctalString(decimalNumber);
        
        System.out.println("Octal number " + octalString);
    }
}