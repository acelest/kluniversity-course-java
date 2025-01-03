package LabProgram;

public class SumElement {
  public static void main(String[] args) {
    int[] arr = {6, 6, 6, 6, 6};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("Sum of elements in array is " + sum);
  }
}

// on veut faire la somme des elements d'un tableau les elements sont 1,2,3,4,5
// voici les etapes pour le faire
// 1. on declare un tableau d'entiers
// avec ce code : int [] arr = {1,2,3,4,5};
// 2. on declare une variable somme et on l'initialise a 0
// avec ce code : int sum = 0;
// 3. on utilise une boucle for pour parcourir le tableau
// avec ce code : for (int i = 0; i < arr.length; i++) {
// 4. on ajoute chaque element du tableau a la variable somme
// avec ce code : sum += arr[i];
// 5. on affiche la valeur de la variable somme
// avec ce code : System.out.println("Sum of elements in array is " + sum);