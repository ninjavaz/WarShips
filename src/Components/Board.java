package Components;



import java.util.ArrayList;

import static java.lang.String.join;

public class Board {

    String[] rows = {"A", "B", "C", "D"}; //rows for ships
    String[] columns = {"1","2","3","4"}; //defining place for ships


        ArrayList places = new ArrayList();

        ArrayList rows_list = new ArrayList();
        ArrayList columns_list = new ArrayList();

        public void createTable ()
        {
            if (rows.length == columns.length)
            {

                // creating pre-list of letters
                for (String row : rows) {
                    rows_list.add(row);
                }

                // creating pre-list of numbers
                for (String column : columns) {
                    columns_list.add(column);
                }

                for (int i = 0; i < (rows.length); i++) {
                    for (int a = 0; a < columns.length; a++)
                    {

                        places.add(String.join("", String.valueOf(rows_list.get(i)), String.valueOf(columns_list.get(a)))); //add to places[i] from rows_list
                    }

                }
                System.out.println(places);
            }
        }


}