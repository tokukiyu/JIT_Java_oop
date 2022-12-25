class password {
    static boolean checkPassValidity(String a) {
        int b;
        int numhkr = 0;
        int charChkr = 0;
        if (a.length() >= 6 & a.length() <= 8) {
            for (int i = 0; i < a.length(); i++) {
                b = (int) (a.charAt(i));
                if (b >= 33 && b <= 122)
                    if (b >= 67 && b <= 122)
                        charChkr = 1;
                if (b >= 48 && b <= 57) {
                    numhkr = 1;
                }

            }
        }
        if (charChkr == 1 & numhkr == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "aaaaadd00";
        System.out.println(checkPassValidity(str));
    }

}
