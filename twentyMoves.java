/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20moves;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ibraheem
 */
/*
        the goal is to go therough every combination of the rubiks cube 
        the rubiks cube can be solved in 20 moves or less at any given point
        
        
        there are 12 moves that can be done for the rubiks cube
        go through every combination 20 times
        
        there are 
        3833759992447475122176
        
        different combinations
        
        3 833 759 992 447 475 122 176
              quad tri bil mil     hund
        
        a long can hold a number 2 * 10 to the 63
        so a long will be used for the counter
        */
public class twentyMoves 
{

    /**
     * @param args the command line arguments
     */
    public static int Cube_colors[][] = new int[6][9];
    public static int Cube_colors_1[][] = new int [6][9];
    public static boolean solved = false;
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        
        long counter = 0;
        
        Cube_colors = getColors();
        
        
        for(int z = 0; z < 9; z++)
        {
            Cube_colors_1[0][z] = Cube_colors[0][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors_1[1][z] = Cube_colors[1][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors_1[2][z] = Cube_colors[2][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors_1[3][z] = Cube_colors[3][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors_1[4][z] = Cube_colors[4][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors_1[5][z] = Cube_colors[5][z];
        }
        
        for(int a = 1; a < 13; a++)
        {
            for(int b = 1; b < 13; b++)
            {
                for(int c = 1; c < 13; c++)
                {
                    for(int d = 1; d < 13; d++)
                    {
                        for(int e = 1; e < 13; e++)
                        {
                            for(int f = 1; f < 13; f++)
                            {
                                for(int g = 1; g < 13; g++)
                                {
                                    for(int h = 1; h < 13; h++)
                                    {
                                        for(int i = 1; i < 13; i++)
                                        {
                                            for(int j = 1; j < 13; j++)
                                            {
                                                for(int k = 1; k < 13; k++)
                                                {
                                                    for(int l = 1; l < 13; l++)
                                                    {
                                                        for(int m = 1; m < 13; m++)
                                                        {
                                                            for(int n = 1; n < 13; n++)
                                                            {
                                                                for(int o = 1; o < 13; o++)
                                                                {
                                                                    for(int p = 1; p < 13; p++)
                                                                    {
                                                                        for(int q = 1; q < 13; q++)
                                                                        {
                                                                            for(int r = 1; r < 13; r++)
                                                                            {
                                                                                for(int s = 1; s < 13; s++)
                                                                                {
                                                                                    for(int t = 1; t < 13; t++)
                                                                                    {         
                                                                                        /*
                                                                                        System.out.println("BEFORE");
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[0][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[1][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[2][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[3][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[4][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[5][z]);
                                                                                        }
                                                                                        */
                                                                                        System.out.println("Testing combination: " + counter);
                                                                                        solved = test(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
                                                                                        
                                                                                                
                                                                                        
                                                                                        
                                                                                        //<editor-fold defaultstate="collapsed" desc="if it was solved print out the solution">
                                                                                        if(solved)
                                                                                        {                                                                                           
                                                                                            System.out.println(a);
                                                                                            System.out.println(b);
                                                                                            System.out.println(c);
                                                                                            System.out.println(d);
                                                                                            System.out.println(e);
                                                                                            System.out.println(f);
                                                                                            System.out.println(g);
                                                                                            System.out.println(h);
                                                                                            System.out.println(i);
                                                                                            System.out.println(j);
                                                                                            System.out.println(k);
                                                                                            System.out.println(l);
                                                                                            System.out.println(m);
                                                                                            System.out.println(n);
                                                                                            System.out.println(o);
                                                                                            System.out.println(p);
                                                                                            System.out.println(q);
                                                                                            System.out.println(r);
                                                                                            System.out.println(s);
                                                                                            System.out.println(t);
                                                                                            System.out.println("SOLVED"); 
                                                                                        }
                                                                                        
                                                                                        //</editor-fold>
                                                                                        
                                                                                        
                                                                                        /*
                                                                                        System.out.println("AFTER");
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[0][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[1][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[2][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[3][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[4][z]);
                                                                                        }
                                                                                        for(int z = 0; z < 9; z++)
                                                                                        {
                                                                                            System.out.println(Cube_colors[5][z]);
                                                                                        }
                                                                                        */
                                                                                        resetColors();
                                                                                        
                                                                                        counter++;
                                                                                        if(solved)
                                                                                        {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if(solved)
                                                                                    {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if(solved)
                                                                                {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if(solved)
                                                                            {
                                                                                break;
                                                                            }
                                                                        }
                                                                        if(solved)
                                                                        {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if(solved)
                                                                    {
                                                                        break;
                                                                    }
                                                                }
                                                                if(solved)
                                                                {
                                                                    break;
                                                                }
                                                            }
                                                            if(solved)
                                                            {
                                                                break;
                                                            }
                                                        }
                                                        if(solved)
                                                        {
                                                            break;
                                                        }
                                                    }
                                                    if(solved)
                                                    {
                                                        break;
                                                    }
                                                }
                                                if(solved)
                                                {
                                                    break;
                                                }
                                            }
                                            if(solved)
                                            {
                                                break;
                                            }
                                        }
                                        if(solved)
                                        {
                                            break;
                                        }
                                    }
                                    if(solved)
                                    {
                                        break;
                                    }
                                }
                                if(solved)
                                {
                                    break;
                                }
                            }
                            if(solved)
                            {
                                break;
                            }
                        }
                        if(solved)
                        {
                            break;
                        }
                    }
                    if(solved)
                    {
                        break;
                    }
                }
                if(solved)
                {
                    break;
                }
            }
            if(solved)
            {
                break;
            }
        } 
    }
    
    //<editor-fold defaultstate="collapsed" desc="Turns">
    public static int[][] GreenCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[0][0];
        primaryFace[1] = colors[0][1];
        primaryFace[2] = colors[0][2];
        primaryFace[3] = colors[0][3];
        primaryFace[4] = colors[0][4];
        primaryFace[5] = colors[0][5];
        primaryFace[6] = colors[0][6];
        primaryFace[7] = colors[0][7];
        primaryFace[8] = colors[0][8];
        
        colors[0][2] = primaryFace[0];
        colors[0][5] = primaryFace[1];
        colors[0][8] = primaryFace[2];
        colors[0][1] = primaryFace[3];
        colors[0][4] = primaryFace[4];
        colors[0][7] = primaryFace[5];
        colors[0][0] = primaryFace[6];
        colors[0][3] = primaryFace[7];
        colors[0][6] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[40] = colors[4][0];
        primaryOuter[43] = colors[4][3];
        primaryOuter[46] = colors[4][6];
        primaryOuter[10] = colors[1][0];
        primaryOuter[13] = colors[1][3];
        primaryOuter[16] = colors[1][6];
        primaryOuter[50] = colors[5][0];
        primaryOuter[53] = colors[5][3];
        primaryOuter[56] = colors[5][6];
        primaryOuter[38] = colors[3][8];
        primaryOuter[35] = colors[3][5];
        primaryOuter[32] = colors[3][2];
        
        colors[1][0] = primaryOuter[40];
        colors[1][3] = primaryOuter[43];
        colors[1][6] = primaryOuter[46];
        colors[5][0] = primaryOuter[10];
        colors[5][3] = primaryOuter[13];
        colors[5][6] = primaryOuter[16];
        colors[3][8] = primaryOuter[50];
        colors[3][5] = primaryOuter[53];
        colors[3][2] = primaryOuter[56];
        colors[4][0] = primaryOuter[38];
        colors[4][3] = primaryOuter[35];
        colors[4][6] = primaryOuter[32];
        
        //System.out.println(colors[1][6]);
        //now you have to new values ater turning the green clockwise once
        System.out.println("GreenClockWise");
        return colors;
    }
    public static int[][] GreenCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[0][0];
        primaryFace[1] = colors[0][1];
        primaryFace[2] = colors[0][2];
        primaryFace[3] = colors[0][3];
        primaryFace[4] = colors[0][4];
        primaryFace[5] = colors[0][5];
        primaryFace[6] = colors[0][6];
        primaryFace[7] = colors[0][7];
        primaryFace[8] = colors[0][8];
        
        colors[0][6] = primaryFace[0];
        colors[0][3] = primaryFace[1];
        colors[0][0] = primaryFace[2];
        colors[0][7] = primaryFace[3];
        colors[0][4] = primaryFace[4];
        colors[0][1] = primaryFace[5];
        colors[0][8] = primaryFace[6];
        colors[0][5] = primaryFace[7];
        colors[0][2] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[40] = colors[4][0];
        primaryOuter[43] = colors[4][3];
        primaryOuter[46] = colors[4][6];
        primaryOuter[10] = colors[1][0];
        primaryOuter[13] = colors[1][3];
        primaryOuter[16] = colors[1][6];
        primaryOuter[50] = colors[5][0];
        primaryOuter[53] = colors[5][3];
        primaryOuter[56] = colors[5][6];
        primaryOuter[38] = colors[3][8];
        primaryOuter[35] = colors[3][5];
        primaryOuter[32] = colors[3][2];
        
        colors[3][8] = primaryOuter[40];
        colors[3][5] = primaryOuter[43];
        colors[3][2] = primaryOuter[46];
        colors[4][0] = primaryOuter[10];
        colors[4][3] = primaryOuter[13];
        colors[4][6] = primaryOuter[16];
        colors[1][0] = primaryOuter[50];
        colors[1][3] = primaryOuter[53];
        colors[1][6] = primaryOuter[56];
        colors[5][0] = primaryOuter[38];
        colors[5][3] = primaryOuter[35];
        colors[5][6] = primaryOuter[32];
        
        //now you have to new values ater turning the green clockwise once
        System.out.println("GreenCounterClockWise");
        return colors;
    }
    public static int[][] WhiteCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[1][0];
        primaryFace[1] = colors[1][1];
        primaryFace[2] = colors[1][2];
        primaryFace[3] = colors[1][3];
        primaryFace[4] = colors[1][4];
        primaryFace[5] = colors[1][5];
        primaryFace[6] = colors[1][6];
        primaryFace[7] = colors[1][7];
        primaryFace[8] = colors[1][8];
        
        colors[1][2] = primaryFace[0];
        colors[1][5] = primaryFace[1];
        colors[1][8] = primaryFace[2];
        colors[1][1] = primaryFace[3];
        colors[1][4] = primaryFace[4];
        colors[1][7] = primaryFace[5];
        colors[1][0] = primaryFace[6];
        colors[1][3] = primaryFace[7];
        colors[1][6] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[46] = colors[4][6];
        primaryOuter[47] = colors[4][7];
        primaryOuter[48] = colors[4][8];
        primaryOuter[20] = colors[2][0];
        primaryOuter[23] = colors[2][3];
        primaryOuter[26] = colors[2][6];
        primaryOuter[52] = colors[5][2];
        primaryOuter[51] = colors[5][1];
        primaryOuter[50] = colors[5][0];
        primaryOuter[8] = colors[0][8];
        primaryOuter[5] = colors[0][5];
        primaryOuter[2] = colors[0][2];
        
        colors[2][0] = primaryOuter[46];
        colors[2][3] = primaryOuter[47];
        colors[2][6] = primaryOuter[48];
        colors[5][2] = primaryOuter[20];
        colors[5][1] = primaryOuter[23];
        colors[5][0] = primaryOuter[26];
        colors[0][8] = primaryOuter[52];
        colors[0][5] = primaryOuter[51];
        colors[0][2] = primaryOuter[50];
        colors[4][6] = primaryOuter[8];
        colors[4][7] = primaryOuter[5];
        colors[4][8] = primaryOuter[2];
        
        //now you have to new values ater turning the White clockwise once
        System.out.println("WhiteClockWise");
        return colors;
    }
    public static int[][] WhiteCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[1][0];
        primaryFace[1] = colors[1][1];
        primaryFace[2] = colors[1][2];
        primaryFace[3] = colors[1][3];
        primaryFace[4] = colors[1][4];
        primaryFace[5] = colors[1][5];
        primaryFace[6] = colors[1][6];
        primaryFace[7] = colors[1][7];
        primaryFace[8] = colors[1][8];
        
        colors[1][6] = primaryFace[0];
        colors[1][3] = primaryFace[1];
        colors[1][0] = primaryFace[2];
        colors[1][7] = primaryFace[3];
        colors[1][4] = primaryFace[4];
        colors[1][1] = primaryFace[5];
        colors[1][8] = primaryFace[6];
        colors[1][5] = primaryFace[7];
        colors[1][2] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[46] = colors[4][6];
        primaryOuter[47] = colors[4][7];
        primaryOuter[48] = colors[4][8];
        primaryOuter[20] = colors[2][0];
        primaryOuter[23] = colors[2][3];
        primaryOuter[26] = colors[2][6];
        primaryOuter[52] = colors[5][8];
        primaryOuter[51] = colors[5][5];
        primaryOuter[50] = colors[5][2];
        primaryOuter[8] = colors[0][8];
        primaryOuter[5] = colors[0][5];
        primaryOuter[2] = colors[0][2];
        
        colors[0][8] = primaryOuter[46];
        colors[0][5] = primaryOuter[47];
        colors[0][2] = primaryOuter[48];
        colors[4][6] = primaryOuter[20];
        colors[4][7] = primaryOuter[23];
        colors[4][8] = primaryOuter[26];
        colors[2][0] = primaryOuter[52];
        colors[2][3] = primaryOuter[51];
        colors[2][6] = primaryOuter[50];
        colors[5][2] = primaryOuter[8];
        colors[5][1] = primaryOuter[5];
        colors[5][0] = primaryOuter[2];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("WhiteCounterClockWise");
        return colors;
    }
    public static int[][] BlueCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[2][0];
        primaryFace[1] = colors[2][1];
        primaryFace[2] = colors[2][2];
        primaryFace[3] = colors[2][3];
        primaryFace[4] = colors[2][4];
        primaryFace[5] = colors[2][5];
        primaryFace[6] = colors[2][6];
        primaryFace[7] = colors[2][7];
        primaryFace[8] = colors[2][8];
        
        colors[2][2] = primaryFace[0];
        colors[2][5] = primaryFace[1];
        colors[2][8] = primaryFace[2];
        colors[2][1] = primaryFace[3];
        colors[2][4] = primaryFace[4];
        colors[2][7] = primaryFace[5];
        colors[2][0] = primaryFace[6];
        colors[2][3] = primaryFace[7];
        colors[2][6] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[48] = colors[4][8];
        primaryOuter[45] = colors[4][5];
        primaryOuter[42] = colors[4][2];
        primaryOuter[30] = colors[3][0];
        primaryOuter[33] = colors[3][3];
        primaryOuter[36] = colors[3][6];
        primaryOuter[58] = colors[5][8];
        primaryOuter[55] = colors[5][5];
        primaryOuter[52] = colors[5][2];
        primaryOuter[18] = colors[1][8];
        primaryOuter[15] = colors[1][5];
        primaryOuter[12] = colors[1][2];
        
        colors[3][0] = primaryOuter[48];
        colors[3][3] = primaryOuter[45];
        colors[3][6] = primaryOuter[42];
        colors[5][8] = primaryOuter[30];
        colors[5][5] = primaryOuter[33];
        colors[5][2] = primaryOuter[36];
        colors[1][8] = primaryOuter[58];
        colors[1][5] = primaryOuter[55];
        colors[1][2] = primaryOuter[52];
        colors[4][8] = primaryOuter[18];
        colors[4][5] = primaryOuter[15];
        colors[4][2] = primaryOuter[12];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("BlueClockWise");
        return colors;
    }
    public static int[][] BlueCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[2][0];
        primaryFace[1] = colors[2][1];
        primaryFace[2] = colors[2][2];
        primaryFace[3] = colors[2][3];
        primaryFace[4] = colors[2][4];
        primaryFace[5] = colors[2][5];
        primaryFace[6] = colors[2][6];
        primaryFace[7] = colors[2][7];
        primaryFace[8] = colors[2][8];
        
        colors[2][6] = primaryFace[0];
        colors[2][3] = primaryFace[1];
        colors[2][0] = primaryFace[2];
        colors[2][7] = primaryFace[3];
        colors[2][4] = primaryFace[4];
        colors[2][1] = primaryFace[5];
        colors[2][8] = primaryFace[6];
        colors[2][5] = primaryFace[7];
        colors[2][2] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[48] = colors[4][8];
        primaryOuter[45] = colors[4][5];
        primaryOuter[42] = colors[4][2];
        primaryOuter[30] = colors[3][0];
        primaryOuter[33] = colors[3][3];
        primaryOuter[36] = colors[3][6];
        primaryOuter[58] = colors[5][8];
        primaryOuter[55] = colors[5][5];
        primaryOuter[52] = colors[5][2];
        primaryOuter[18] = colors[1][8];
        primaryOuter[15] = colors[1][5];
        primaryOuter[12] = colors[1][2];
        
        colors[1][8] = primaryOuter[48];
        colors[1][5] = primaryOuter[45];
        colors[1][2] = primaryOuter[42];
        colors[4][8] = primaryOuter[30];
        colors[4][5] = primaryOuter[33];
        colors[4][2] = primaryOuter[36];
        colors[3][0] = primaryOuter[58];
        colors[3][3] = primaryOuter[55];
        colors[3][6] = primaryOuter[52];
        colors[5][8] = primaryOuter[18];
        colors[5][5] = primaryOuter[15];
        colors[5][2] = primaryOuter[12];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("BlueCounterClockWise");
        return colors;
    }
    public static int[][] YellowCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[3][0];
        primaryFace[1] = colors[3][1];
        primaryFace[2] = colors[3][2];
        primaryFace[3] = colors[3][3];
        primaryFace[4] = colors[3][4];
        primaryFace[5] = colors[3][5];
        primaryFace[6] = colors[3][6];
        primaryFace[7] = colors[3][7];
        primaryFace[8] = colors[3][8];
        
        colors[3][2] = primaryFace[0];
        colors[3][5] = primaryFace[1];
        colors[3][8] = primaryFace[2];
        colors[3][1] = primaryFace[3];
        colors[3][4] = primaryFace[4];
        colors[3][7] = primaryFace[5];
        colors[3][0] = primaryFace[6];
        colors[3][3] = primaryFace[7];
        colors[3][6] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[42] = colors[4][2];
        primaryOuter[41] = colors[4][1];
        primaryOuter[40] = colors[4][0];
        primaryOuter[00] = colors[0][0];
        primaryOuter[03] = colors[0][3];
        primaryOuter[06] = colors[0][6];
        primaryOuter[56] = colors[5][6];
        primaryOuter[57] = colors[5][7];
        primaryOuter[58] = colors[5][8];
        primaryOuter[28] = colors[2][8];
        primaryOuter[25] = colors[2][5];
        primaryOuter[22] = colors[2][2];
        
        colors[0][0] = primaryOuter[42];
        colors[0][3] = primaryOuter[41];
        colors[0][6] = primaryOuter[40];
        colors[5][6] = primaryOuter[00];
        colors[5][7] = primaryOuter[03];
        colors[5][8] = primaryOuter[06];
        colors[2][8] = primaryOuter[56];
        colors[2][5] = primaryOuter[57];
        colors[2][2] = primaryOuter[58];
        colors[4][2] = primaryOuter[28];
        colors[4][1] = primaryOuter[25];
        colors[4][0] = primaryOuter[22];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("YellowClockWise");
        return colors;
    }
    public static int[][] YellowCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[3][0];
        primaryFace[1] = colors[3][1];
        primaryFace[2] = colors[3][2];
        primaryFace[3] = colors[3][3];
        primaryFace[4] = colors[3][4];
        primaryFace[5] = colors[3][5];
        primaryFace[6] = colors[3][6];
        primaryFace[7] = colors[3][7];
        primaryFace[8] = colors[3][8];
        
        colors[3][6] = primaryFace[0];
        colors[3][3] = primaryFace[1];
        colors[3][0] = primaryFace[2];
        colors[3][7] = primaryFace[3];
        colors[3][4] = primaryFace[4];
        colors[3][1] = primaryFace[5];
        colors[3][8] = primaryFace[6];
        colors[3][5] = primaryFace[7];
        colors[3][2] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[42] = colors[4][2];
        primaryOuter[41] = colors[4][1];
        primaryOuter[40] = colors[4][0];
        primaryOuter[00] = colors[0][0];
        primaryOuter[03] = colors[0][3];
        primaryOuter[06] = colors[0][6];
        primaryOuter[56] = colors[5][6];
        primaryOuter[57] = colors[5][7];
        primaryOuter[58] = colors[5][8];
        primaryOuter[28] = colors[2][8];
        primaryOuter[25] = colors[2][5];
        primaryOuter[22] = colors[2][2];
        
        colors[2][8] = primaryOuter[42];
        colors[2][5] = primaryOuter[41];
        colors[2][2] = primaryOuter[40];
        colors[4][2] = primaryOuter[00];
        colors[4][1] = primaryOuter[03];
        colors[4][0] = primaryOuter[06];
        colors[0][0] = primaryOuter[56];
        colors[0][3] = primaryOuter[57];
        colors[0][6] = primaryOuter[58];
        colors[5][6] = primaryOuter[28];
        colors[5][7] = primaryOuter[25];
        colors[5][8] = primaryOuter[22];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("YellowCounterClockWise");
        return colors;
    }
    public static int[][] OrangeCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[4][0];
        primaryFace[1] = colors[4][1];
        primaryFace[2] = colors[4][2];
        primaryFace[3] = colors[4][3];
        primaryFace[4] = colors[4][4];
        primaryFace[5] = colors[4][5];
        primaryFace[6] = colors[4][6];
        primaryFace[7] = colors[4][7];
        primaryFace[8] = colors[4][8];
        
        colors[4][2] = primaryFace[0];
        colors[4][5] = primaryFace[1];
        colors[4][8] = primaryFace[2];
        colors[4][1] = primaryFace[3];
        colors[4][4] = primaryFace[4];
        colors[4][7] = primaryFace[5];
        colors[4][0] = primaryFace[6];
        colors[4][3] = primaryFace[7];
        colors[4][6] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[32] = colors[3][2];
        primaryOuter[31] = colors[3][1];
        primaryOuter[30] = colors[3][0];
        primaryOuter[22] = colors[2][2];
        primaryOuter[21] = colors[2][1];
        primaryOuter[20] = colors[2][0];
        primaryOuter[12] = colors[1][2];
        primaryOuter[11] = colors[1][1];
        primaryOuter[10] = colors[1][0];
        primaryOuter[02] = colors[0][2];
        primaryOuter[01] = colors[0][1];
        primaryOuter[00] = colors[0][0];
        
        colors[2][2] = primaryOuter[32];
        colors[2][1] = primaryOuter[31];
        colors[2][0] = primaryOuter[30];
        colors[1][2] = primaryOuter[22];
        colors[1][1] = primaryOuter[21];
        colors[1][0] = primaryOuter[20];
        colors[0][2] = primaryOuter[12];
        colors[0][1] = primaryOuter[11];
        colors[0][0] = primaryOuter[10];
        colors[3][2] = primaryOuter[02];
        colors[3][1] = primaryOuter[01];
        colors[3][0] = primaryOuter[00];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("OrangeClockWise");
        return colors;
    }
    public static int[][] OrangeCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[4][0];
        primaryFace[1] = colors[4][1];
        primaryFace[2] = colors[4][2];
        primaryFace[3] = colors[4][3];
        primaryFace[4] = colors[4][4];
        primaryFace[5] = colors[4][5];
        primaryFace[6] = colors[4][6];
        primaryFace[7] = colors[4][7];
        primaryFace[8] = colors[4][8];
        
        colors[4][6] = primaryFace[0];
        colors[4][3] = primaryFace[1];
        colors[4][0] = primaryFace[2];
        colors[4][7] = primaryFace[3];
        colors[4][4] = primaryFace[4];
        colors[4][1] = primaryFace[5];
        colors[4][8] = primaryFace[6];
        colors[4][5] = primaryFace[7];
        colors[4][2] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[32] = colors[3][2];
        primaryOuter[31] = colors[3][1];
        primaryOuter[30] = colors[3][0];
        primaryOuter[22] = colors[2][2];
        primaryOuter[21] = colors[2][1];
        primaryOuter[20] = colors[2][0];
        primaryOuter[12] = colors[1][2];
        primaryOuter[11] = colors[1][1];
        primaryOuter[10] = colors[1][0];
        primaryOuter[02] = colors[0][2];
        primaryOuter[01] = colors[0][1];
        primaryOuter[00] = colors[0][0];
        
        colors[0][2] = primaryOuter[32];
        colors[0][1] = primaryOuter[31];
        colors[0][0] = primaryOuter[30];
        colors[3][2] = primaryOuter[22];
        colors[3][1] = primaryOuter[21];
        colors[3][0] = primaryOuter[20];
        colors[2][2] = primaryOuter[12];
        colors[2][1] = primaryOuter[11];
        colors[2][0] = primaryOuter[10];
        colors[1][2] = primaryOuter[02];
        colors[1][1] = primaryOuter[01];
        colors[1][0] = primaryOuter[00];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("OrangeCounerClockWise");
        return colors;
    }
    public static int[][] RedCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[5][0];
        primaryFace[1] = colors[5][1];
        primaryFace[2] = colors[5][2];
        primaryFace[3] = colors[5][3];
        primaryFace[4] = colors[5][4];
        primaryFace[5] = colors[5][5];
        primaryFace[6] = colors[5][6];
        primaryFace[7] = colors[5][7];
        primaryFace[8] = colors[5][8];
        
        colors[5][2] = primaryFace[0];
        colors[5][5] = primaryFace[1];
        colors[5][8] = primaryFace[2];
        colors[5][1] = primaryFace[3];
        colors[5][4] = primaryFace[4];
        colors[5][7] = primaryFace[5];
        colors[5][0] = primaryFace[6];
        colors[5][3] = primaryFace[7];
        colors[5][6] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[16] = colors[1][6];
        primaryOuter[17] = colors[1][7];
        primaryOuter[18] = colors[1][8];
        primaryOuter[26] = colors[2][6];
        primaryOuter[27] = colors[2][7];
        primaryOuter[28] = colors[2][8];
        primaryOuter[36] = colors[3][6];
        primaryOuter[37] = colors[3][7];
        primaryOuter[38] = colors[3][8];
        primaryOuter[6] = colors[0][6];
        primaryOuter[7] = colors[0][7];
        primaryOuter[8] = colors[0][8];
        
        colors[2][6] = primaryOuter[16];
        colors[2][7] = primaryOuter[17];
        colors[2][8] = primaryOuter[18];
        colors[3][6] = primaryOuter[26];
        colors[3][7] = primaryOuter[27];
        colors[3][8] = primaryOuter[28];
        colors[0][6] = primaryOuter[36];
        colors[0][7] = primaryOuter[37];
        colors[0][8] = primaryOuter[38];
        colors[1][6] = primaryOuter[6];
        colors[1][7] = primaryOuter[7];
        colors[1][8] = primaryOuter[8];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("RedClockWise");
        return colors;
    }
    public static int[][] RedCCW(int colors[][])
    
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[5][0];
        primaryFace[1] = colors[5][1];
        primaryFace[2] = colors[5][2];
        primaryFace[3] = colors[5][3];
        primaryFace[4] = colors[5][4];
        primaryFace[5] = colors[5][5];
        primaryFace[6] = colors[5][6];
        primaryFace[7] = colors[5][7];
        primaryFace[8] = colors[5][8];
        
        colors[5][6] = primaryFace[0];
        colors[5][3] = primaryFace[1];
        colors[5][0] = primaryFace[2];
        colors[5][7] = primaryFace[3];
        colors[5][4] = primaryFace[4];
        colors[5][1] = primaryFace[5];
        colors[5][8] = primaryFace[6];
        colors[5][5] = primaryFace[7];
        colors[5][2] = primaryFace[8];
        
        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[16] = colors[1][6];
        primaryOuter[17] = colors[1][7];
        primaryOuter[18] = colors[1][8];
        primaryOuter[26] = colors[2][6];
        primaryOuter[27] = colors[2][7];
        primaryOuter[28] = colors[2][8];
        primaryOuter[36] = colors[3][6];
        primaryOuter[37] = colors[3][7];
        primaryOuter[38] = colors[3][8];
        primaryOuter[6] = colors[0][6];
        primaryOuter[7] = colors[0][7];
        primaryOuter[8] = colors[0][8];
        
        colors[0][6] = primaryOuter[16];
        colors[0][7] = primaryOuter[17];
        colors[0][8] = primaryOuter[18];
        colors[1][6] = primaryOuter[26];
        colors[1][7] = primaryOuter[27];
        colors[1][8] = primaryOuter[28];
        colors[2][6] = primaryOuter[36];
        colors[2][7] = primaryOuter[37];
        colors[2][8] = primaryOuter[38];
        colors[3][6] = primaryOuter[6];
        colors[3][7] = primaryOuter[7];
        colors[3][8] = primaryOuter[8];
        
        //now you have to new values ater turning the White CounterClokwise once
        System.out.println("RedCounterClockWise");
        return colors;
    }
//</editor-fold>
    
    public static int[][] getColors()//input is the colors that we get and it will be returned as so
    {
        int input[][] = new int[6][9];
        //initiate the counter
        int counter_0 = 0;
        int counter_1 = 0;
        //initiate the scanner for the imput
        Scanner in = new Scanner(System.in);
        //Collect the data
        
                //Get the data for the green side
                System.out.println("Enter the colors for the green side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
                        + "The orange side should be on top\n"
                        + "The red side is on the bottom\n"
                        + "The white side to the right\n"
                        + "And the yellow side to the left");
                while(counter_0 <= 8)
                { 
                        //System.out.println(counter_0);
                        counter_1 = 0;
                        input[0][counter_0] = Integer.parseInt(in.nextLine());
                        counter_0++;
                }
                //Enter the colors for the white side
                System.out.println("Enter the colors for the white side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
                        + "The orange side should be on top\n"
                        + "The red side should be on the bottom\n"
                        + "The blue side to the right\n"
                        + "And the green side to the left");
                //reset the counter
                counter_0 = 0;
                while(counter_0 <= 8)
                {
                        counter_1 = 0;
                        input[1][counter_0] = Integer.parseInt(in.nextLine());
                        counter_0++;
                }
                //Enter the colors for the blue side
                System.out.println("Enter the colors for the blue side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
                        + "Orange on top\n"
                        + "red on bottom\n"
                        + "yellow to the right\n"
                        + "And Red on bottom");
                counter_0 = 0;
                while(counter_0 <= 8)
                {
                        counter_1 = 0;
                        input[2][counter_0] = Integer.parseInt(in.nextLine());
                        counter_0++;
                }
              //Enter the colors for the yellow side
                System.out.println("Enter the colors for the yellow side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
                        + "Orange on top\n"
                        + "red on bottom\n"
                        + "green to right\n"
                        + "blue to left");
                counter_0 = 0;
                while(counter_0 <= 8)
                {
                        counter_1 = 0;
                        input[3][counter_0] = Integer.parseInt(in.nextLine());
                        counter_0++;
                }
              //Enter the colors for the orange side
                System.out.println("Enter the colors for the orange side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED");
                counter_0 = 0;
                while(counter_0 <= 8)
                {
                        counter_1 = 0;
                        input[4][counter_0] = Integer.parseInt(in.nextLine());
                        counter_0++;
                }
              //Enter the colors for the red side
                System.out.println("Enter the colors for the red side\n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED");
                counter_0 = 0;
                while(counter_0 <= 8)
                {
                        counter_1 = 0;
                        input[5][counter_0] = Integer.parseInt(in.nextLine());
                        counter_0++;
                }
                
        
        return input;
    }
    
    public static boolean test(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t)
    {
        boolean result1 = true;
        
        //<editor-fold defaultstate="collapsed" desc="a">
        if(a == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(a == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(a == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(a == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(a == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(a == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(a == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(a == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(a == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(a == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(a == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(a == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="b">
        if(b == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(b == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(b == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(b == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(b == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(b == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(b == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(b == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(b == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(b == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(b == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(b == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="c">
        if(c == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(c == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(c == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(c == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(c == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(c == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(c == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(c == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(c == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(c == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(c == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(c == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="d">
        if(d == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(d == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(d == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(d == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(d == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(d == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(d == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(d == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(d == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(d == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(d == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(d == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="e">
        if(e == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(e == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(e == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(e == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(e == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(e == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(e == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(e == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(e == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(e == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(e == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(e == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="f">
        if(f == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(f == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(f == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(f == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(f == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(f == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(f == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(f == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(f == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(f == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(f == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(f == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="g">
        if(g == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(g == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(g == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(g == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(g == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(g == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(g == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(g == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(g == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(g == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(g == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(g == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="h">
        if(h == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(h == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(h == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(h == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(h == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(h == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(h == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(h == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(h == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(h == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(h == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(h == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="i">
        if(i == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(i == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(i == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(i == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(i == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(i == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(i == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(i == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(i == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(i == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(i == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(i == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="j">
        if(j == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(j == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(j == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(j == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(j == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(j == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(j == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(j == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(j == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(j == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(j == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(j == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="k">
        if(k == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(k == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(k == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(k == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(k == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(k == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(k == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(k == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(k == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(k == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(k == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(k == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="l">
        if(l == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(l == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(l == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(l == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(l == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(l == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(l == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(l == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(l == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(l == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(l == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(l == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="m">
        if(m == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(m == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(m == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(m == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(m == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(m == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(m == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(m == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(m == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(m == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(m == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(m == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="n">
        if(n == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(n == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(n == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(n == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(n == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(n == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(n == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(n == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(n == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(n == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(n == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(n == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="o">
        if(o == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(o == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(o == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(o == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(o == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(o == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(o == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(o == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(o == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(o == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(o == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(o == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="p">
        if(p == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(p == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(p == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(p == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(p == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(p == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(p == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(p == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(p == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(p == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(p == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(p == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="q">
        if(q == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(q == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(q == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(q == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(q == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(q == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(q == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(q == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(q == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(q == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(q == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(q == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="r">
        if(r == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(r == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(r == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(r == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(r == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(r == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(r == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(r == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(r == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(r == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(r == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(r == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="s">
        if(s == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(s == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(s == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(s == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(s == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(s == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(s == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(s == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(s == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(s == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(s == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(s == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="t">
        if(t == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(t == 2)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(t == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(t == 4)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(t == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(t == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(t == 7)
        {
            Cube_colors = YellowCW(Cube_colors);
        }
        else if(t == 8)
        {
            Cube_colors = YellowCCW(Cube_colors);
        }
        else if(t == 9)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(t == 10)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(t == 11)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(t == 12)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        //</editor-fold>
        //check to see if it is solved
        
        //<editor-fold defaultstate="collapsed" desc="check to see if they are all in the right place">
        for(int z = 0; z < 9; z++)
        {
            if(Cube_colors[0][z] != 1)
            {
                result1 = false;
            }
        }
        for(int z = 0; z < 9; z++)
        {
            if(Cube_colors[1][z] != 2)
            {
                result1 = false;
            }
        }
        for(int z = 0; z < 9; z++)
        {
            if(Cube_colors[2][z] != 3)
            {                
                result1 = false;
            }
        }
        for(int z = 0; z < 9; z++)
        {
            if(Cube_colors[3][z] != 4)
            {
                result1 = false;
            }
        }
        for(int z = 0; z < 9; z++)
        {
            if(Cube_colors[4][z] != 5)
            {
                result1 = false;
            }
        }
        for(int z = 0; z < 9; z++)
        {
            if(Cube_colors[5][z] != 6)
            {
                result1 = false;
            }
        }
//</editor-fold>
        
        return result1;
    }
    
    public static void resetColors()
    {
        for(int z = 0; z < 9; z++)
        {
            Cube_colors[0][z] = Cube_colors_1[0][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors[1][z] = Cube_colors_1[1][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors[2][z] = Cube_colors_1[2][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors[3][z] = Cube_colors_1[3][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors[4][z] = Cube_colors_1[4][z];
        }
        for(int z = 0; z < 9; z++)
        {
            Cube_colors[5][z] = Cube_colors_1[5][z];
        }
    }

    
}
