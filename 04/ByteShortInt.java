public class ByteShortInt
{
    public static void main(String[] args)
    {
        // Integer has a width of 32
        int myInt = 5;
        int myMaxValue = 2_147_483_647;
        int myMinValue = -2_147_483_648;
        int myNewInt = myInt / 2;

        // Byte has a width of 8
        byte myByte = 10;
        byte myMinByte = -128;
        byte myMaxByte = 127;
        byte myNewByte = (byte) (myByte / 2);

        // Short has a width of 16
        short myShort = 30000;
        short myMinShort = -32768;
        short myMaxShort = 32767;
        short myNewshort = (short) (myShort / 2);

        // Long has a width of 64
        long myLongValue = 20000L;
        long myMinLong = -9_223_372_036_854_775_808L;
        long myMaxLong = 9_223_372_036_854_775_807L;  
        long myNewLong = myLongValue / 2;	// No need to cast for long or integer variables
    }
}

