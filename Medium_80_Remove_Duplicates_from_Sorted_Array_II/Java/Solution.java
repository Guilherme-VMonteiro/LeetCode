package Medium_80_Remove_Duplicates_from_Sorted_Array_II.Java;

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 }));
    }

    public static int removeDuplicates(int[] nums) {
        
        int index = 1;      //Representa a posicao onde podemos alterar do array.
        int duplicados = 1; //Representa a quantidade de elementos duplicados que devem ser ate 2 ou < 3.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {   //Se o numero atual for igual ao anterior, temos numeros duplicados
                duplicados++;
            }else{                          //Se o numero for diferente, nao temos duplicados
                duplicados = 1;
            }
            if (duplicados<3) {             //Se os numeros duplicados forem menores que 3, ou seja , 2 ou 1.
                nums[index] = nums[i];      //Fazemos com que a posicao que podemos alterar receba o numero atual,
                index++;                    //seguindo a ordem padrao so que sem ter elementos triplicados :D
            }
        }

        return index;
    }
}
