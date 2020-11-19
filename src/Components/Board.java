package Components;




public class Board {

    String[] rows = new String[]{"A", "B", "C", "D"}; //rows for ships
    int[] columns = {1,2,3,4}; //defining place for ships
    String[] places;

    public void createTable()
            {

                for(int i = 0;i<(rows.length)*(columns.length);i++)
                {
                    System.out.println(i);
                }
            }


}