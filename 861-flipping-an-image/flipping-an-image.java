class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
  
        int n = image[0].length-1;
     
         for(int i=0 ;i<image.length ;i++){
            for(int j=0 ; j<image[0].length/2;j++){
               int temp = image[i][j];
               image[i][j] =  image[i][n-j] ;
                image[i][n-j] = temp;
            }
        }

           for(int i=0 ;i<image.length ;i++){
            for(int j=0 ; j<image[0].length ;j++){
                if(image[i][j]==0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }

        return image;
    }
}