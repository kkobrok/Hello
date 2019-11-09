package game;

public class NoughtsAndCrosses {
    private final int size;
    private char [] tab;
    public void clearTab() {
        for (int i = 0; i < tab.length; i++) {
            this.tab[i]='_';
        }
    }
    public NoughtsAndCrosses(int n) {
        this.size = n;
        tab = new char[n*n];
    }
    public void viewer() {
        for (int i = 0; i < tab.length; i++) {
            if (i% size ==0)
                System.out.println();
            System.out.print(tab[i]+" ");

        }
        System.out.println();
    }
    public boolean placeSignOnTab (Player player, int x, int y){
        this.tab[(y-1)* size +(x-1)]=player.getSymbol();
        this.viewer();
    return checkIfWinFromLastPosition(x,y);
    }
    private boolean checkIfWinFromLastPosition(int x, int y){
        boolean test= true ;//verse
        for (int j = (y-1)* size +1; j<y* size; j++){
            if (tab[j-1]!= tab[j])
                test=false;
        }
            if(test)
                return test;
        test= true ;//column
        for (int j = x-1+(size); j<(x-1)+(size -1)*(size +1); j=j+ size){
            if (tab[j- size]!= tab[j])
                test=false;
        }
            if(test)
                return test;
        if(x==y)/*cross 1*/{
            test= true ;
            for (int m = size+1;m<tab.length-1;m=m+size+1){
                if (tab[m]!= tab[m+size+1])
                    test=false;
            }
            if(!test)
                return test;
        }
        if(x==size+1-y)/*cross 2*/{
            test= true ;
            for (int m = 2*(size-1);m<tab.length-1;m=m+size-1){
                if (tab[m-(size-1)]!= tab[m])
                    test=false;
            }
            if(!test)
                return test;
        }
        return false;
    }

}



