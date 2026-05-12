using System;
using System.Diagnostics.Contracts;

class Program
{
    static void Main()
    {
        while (intento != numeroSecreto)
        {
            Console.Write("Adivina el numero del 1 al 100");
            intento = int.Parse(Console.ReadLine());
            Constador++;

            if (intento > numeroSecreto)
                Console.WriteLine("Demasiado alto");
            else if (intento < numeroSecreto)
                Console.WriteLine("Demasiado bajo");
        }
    }
}