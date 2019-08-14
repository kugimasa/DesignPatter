package Prototype;

class Main {
    public static void main(String args[]) {
        Parameter max = new Parameter(100);
        Parameter min = new Parameter(1);
        Parameter def = new Parameter(10);

        //Creating Random Parameter
        Parameter samples[] = new Parameter[100];
        java.util.Random rand = new java.util.Random();
        try{
            for(int i = 0; i < 100; i++){
                int r = rand.nextInt(10);
                if(r > 8){
                    samples[i] = (Parameter) max.clone();
                } else if (r >6 ){
                    samples[i] = (Parameter) min.clone();
                } else {
                    samples[i] = (Parameter) def.clone();
                }
                System.out.println(samples[i].value);
            }
        } catch ( CloneNotSupportedException ex ){
            //For Error
        }
    }
}