/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Venkatesh
 */
public class compute {
    public static void comp()
    {
        double[] vals=new double[info_sec_prj.pairs];
        int k=0;
        for(int j=0;j<5;j++)
        {
            k=0;
            vals[k]+=info_sec_prj.ctrs_ID[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_WU[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_WI[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_RW[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_UD[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_RU[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_ID[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_RD[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_WD[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_RWD[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_RWU[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_WUD[j];
            k++;
            vals[k]+=info_sec_prj.ctrs_WUI[j];
        }
        double largest=vals[0];
        int x=0;
        for(int i=0;i<info_sec_prj.pairs;i++)
        {
            if(largest<vals[i])
            {
                largest=vals[i];
                x=i;
            }
        }
        largest/=5;
        switch(x)
        {
            case 0:
                System.out.println("Max Accuracy: "+largest+" in Individual Assignment");
                break;
            case 1:
                System.out.println("Max Accuracy: "+largest+" in Write-Update pair");
                break;
            case 2:
                System.out.println("Max Accuracy: "+largest+" in Write-Insert pair");
                break;
            case 3:
                System.out.println("Max Accuracy: "+largest+" in Read-Write pair");
                break;
            case 4:
                System.out.println("Max Accuracy: "+largest+" in Update-Delete pair");
                break;
            case 5:
                System.out.println("Max Accuracy: "+largest+" in Read-Update pair");
                break;
            case 6:
                System.out.println("Max Accuracy: "+largest+" in Insert-Delete pair");
                break;
            case 7:
                System.out.println("Max Accuracy: "+largest+" in Read-Delete pair");
                break;
            case 8:
                System.out.println("Max Accuracy: "+largest+" in Write-Delete pair");
                break;
            case 9:
                System.out.println("Max Accuracy: "+largest+" in Read-Write-Delete pair");
                break;
            case 10:
                System.out.println("Max Accuracy: "+largest+" in Read-Write-Update pair");
                break;
            case 11:
                System.out.println("Max Accuracy: "+largest+" in Write-Update-Delete pair");
                break;
            case 12:
                System.out.println("Max Accuracy: "+largest+" in Write-Update-Insert pair");
                break;
            
        }                
    }
}
