/**
 * Practice Program: Seq.java Authors: Ikhlas Ahmed, Devayan Mandal
 * CSC507 Lab1
 */

public class Seq {
    private static void usage() {
	System.err.println("Usage: error");
	System.exit(0);
    }

    public static void main(String[] args) {
	int num = 0;
	int seqA = -1;
	int seqB = -1;
	int seqC = -1;

	if (args.length == 0) {
	    num = 0;
	} else if (args.length == 1) {
	    num = 1;
	} else if (args.length == 2) {
	    num = 2;
	} else if (args.length == 3) {
	    num = 3;
	}

	if (num == 1) {
	    try {
		seqA = Integer.parseInt(args[0]);
	    } catch (NumberFormatException e) {
		System.err.println(e);
		usage();
	    }
	} else if (num == 2) {
	    try {
		seqA = Integer.parseInt(args[0]);
	    } catch (NumberFormatException e) {
		System.err.println(e);
		usage();
	    }
	    
	    try {
		seqB = Integer.parseInt(args[1]);
	    } catch (NumberFormatException e) {
		System.err.println(e);
		usage();
	    }
	} else if (num == 3) {
	    try {
		seqA = Integer.parseInt(args[0]);
	    } catch (NumberFormatException e) {
		System.err.println(e);
		usage();
	    }
	    
	    try {
		seqB = Integer.parseInt(args[1]);
	    } catch (NumberFormatException e) {
		System.err.println(e);
		usage();
	    }
	    
	    try {
		seqC = Integer.parseInt(args[2]);
	    } catch (NumberFormatException e) {
		System.err.println(e);
		usage();
	    }
	}

	if(num == 1){
	    for(int i = 1; i <= seqA; i++){
		System.out.print(i + " ");
	    }
	} else if(num == 2){
	    for(int i = seqA; i <= seqB; i++){
		System.out.print(i + " ");
	    }
	}else if(num == 3){
	    for(int i = seqA; i <= seqC; i+=seqB){
		System.out.print(i + " ");
	    }
	}
	System.out.println();
    }
}