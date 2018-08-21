#include <stdio.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
  int i = 0;
  int seqA = -1;
  int seqB = -1;
  int seqC = -1;
  

  if(argc == 2) {
    seqA = atoi(argv[1]);
 
    for (i = 1; i <= seqA; i++) {
      printf("%d ", i);
    }
  } else if(argc == 3){
    
    seqA = atoi(argv[1]);
    seqB = atoi(argv[2]);
    
    for (i = seqA; i<= seqB; i++) {
      printf("%d ", i);
    }
  } else if(argc == 4){
    
    seqA = atoi(argv[1]);
    seqB = atoi(argv[2]);
    seqC = atoi(argv[3]);
    
    for (i = seqA; i <= seqC; i += seqB) {
      printf("%d ", i);
    }
  }

  printf("\n");

  return 0;
}
