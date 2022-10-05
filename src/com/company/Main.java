package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {4, 4, 6, 11, -2, 3};
        int[] b = {5, 11, 11, -3, 3, 5};
        int[] symDiff = new int[a.length + b.length];

        boolean noneSame;
        int counter = 0;

        for (int aa : a)
        {
            noneSame = true;
            for (int bb : b)
            {
                    if (aa == bb)
                    {
                        noneSame = false;
                    }
            }
            if (noneSame == true)
            {
                symDiff[counter] = aa;
                counter++;
            }
        }

        for (int bb : b)
        {
            noneSame = true;
            for (int aa : a)
            {
                if (aa == bb)
                {
                    noneSame = false;
                }
            }
            if (noneSame == true)
            {
                symDiff[counter] = bb;
                counter++;
            }
        }

        // delete extra 0's
        int[] symDiffL = new int[counter];
        for (int i = 0; i < counter; i++)
            symDiffL[i] = symDiff[i];

        // print the symmetric difference
        System.out.print("symDiff:");
        for (int s : symDiffL)
            System.out.print(" " + s);
    }
}
