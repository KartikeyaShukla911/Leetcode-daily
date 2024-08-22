/*
 * Problem Statement: We are given two arrays that represent the arrival and departure times of trains that stop at the platform. We need to find the minimum number of platforms needed at the railway station so that no train has to wait.

Examples 1:

Input: N=6, 
arr[] = {9:00, 9:45, 9:55, 11:00, 15:00, 18:00} 
dep[] = {9:20, 12:00, 11:30, 11:50, 19:00, 20:00}

Output:3
 */

 public static int minPlatform(int arr[],int n)
 {
    Arrays.sort(arrival);
    Arrays.sort(departure);

    int i,j, platform=1;

    i=0,j=0;
    while(i<n && j<n)
    {
        if(arrival[i]<=departure[j])
        {
            platform++;
            i++;            
        }
        else if(arrival[i]>departure[j])
        {
            maxi = Math.max(maxi,platform);
            platform--;
            if(platform<1)
                platform=1;
        }
    }
    return maxi;
 }