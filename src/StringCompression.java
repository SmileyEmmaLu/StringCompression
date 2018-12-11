public class StringCompression {

    String original;

    public StringCompression(String original){
        this.original = original;
    }

    public String vowelRemover(){
        for(int i = 0; i<original.length();i++){
            if(original.charAt(i) == 'a' || original.charAt(i) == 'e'||original.charAt(i) == 'i'||original.charAt(i) == 'o'||original.charAt(i) == 'u'){
                original.substring(0,i).concat(original.substring(i+1));
            }
        }

        return original;

    }

    public String simpleCompression(){
        String compression = new String();
        for(int i = 0; i<original.length();i++){
            int count = 1;
            while(i != original.length() && original.charAt(i) == original.charAt(i+1)){
                count++;
                i++;
            }
            compression.concat(String.valueOf(original.charAt(i)));
            compression.concat(String.valueOf(count));

        }

        return compression;

    }
}
