import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc . nextInt();
    char [] [] arr = new char [n][n];
    char [] [] arr2 = new char [n][n];;
    for(int i=0;i<n;i++){
      arr[i]=sc.next().toCharArray();
      arr2[i]=arr[i];
    }
    for(int i=1;i<n-1;i++){
      for(int j=1;j<n-1;j++){
        if( arr[i][j]>arr[i+1][j]&&arr[i][j]>arr[i][j+1]&&arr[i][j]>arr[i-1][j]&&arr[i][j]>arr[i][j-1]){
          arr2[i][j]='X';

        }
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(arr2[i][j]);
      }
      System.out.println();
    }
  }
}