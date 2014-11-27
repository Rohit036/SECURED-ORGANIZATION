
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Venkatesh
 */
public class ID{
    public static void ID_pair(int z) {
        //System.out.println("Write Insert Pair");
        double ctr=0;
        for(int i=0;i<12;i++)
        {
            List<String> l6 = new ArrayList<String>();
            for(int j=0;j<6;j++)
            {
                double random = Math.random();
                if(random>0.5)
                {
                    if(j==3||j==4)
                    {
                        //System.out.print(access[j+1]+" ");
                        l6.add(info_sec_prj.access[3]);
                        l6.add(info_sec_prj.access[4]);
                    }
                    //System.out.print(access[j]+" ");
                    else
                    {
                        l6.add(info_sec_prj.access[j]);
                    }
                    //l6.add(access[j]);
                }                    
            }
            HashSet hs = new HashSet();
            hs.addAll(l6);
            l6.clear();
            l6.addAll(hs);
            //System.out.println(l6);
            if(i==0 || i==5)
            {
                if(info_sec_prj.l1.containsAll(l6))
                    ctr++;
            }
            else if(i==1 || i==6)
            {
                if(info_sec_prj.l2.containsAll(l6))
                    ctr++;
            }
            else if(i==2 || i==7)
            {
                if(info_sec_prj.l3.containsAll(l6))
                    ctr++;
            }
            else if(i==3 || i==8 || i==10)
            {
                if(info_sec_prj.l4.containsAll(l6))
                    ctr++;
            }
            else if(i==4 || i==9 || i==11)
            {
                if(info_sec_prj.l5.containsAll(l6))
                    ctr++;
            }            
        }
        //System.out.println(ctr);
        double percent=(ctr/12)*100;
        //System.out.println(percent);
        info_sec_prj.ctrs_ID[z]=percent;
    }
}
