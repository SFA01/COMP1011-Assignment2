package ca.georgiancollege.comp1011assignment2;


    import javafx.scene.chart.XYChart;

    import java.sql.*;
    import java.util.ArrayList;

    /* Singleton */
    public class DBManager
    {
        /********************* SINGLETON SECTION *****************************/
        // Step 1. private static instance member variable
        private static DBManager m_instance = null;
        // Step 2. make the default constructor private
        private DBManager() {}
        // Step 3. create a public static entry point / instance method
        public static DBManager Instance()
        {
            // Step 4. Check if the private instance member variable is null
            if(m_instance == null)
            {
                // Step 5. Instantiate a new DBManager instance
                m_instance = new DBManager();
            }
            return m_instance;
        }
        /*********************************************************************/

        // private instance member variables
        private String m_user = "root";
        private String m_password = "";
        private String m_connectURL = "jdbc:mysql://localhost:3306/world";

        /**
         * This method reads the vectors table from the MySQL database
         * and returns an ArrayList of Vector2D type
         * @return
         */
        public ArrayList<CountryData> readTable()
        {
            // Instantiates an ArrayList collection of type Countries (empty container)
            ArrayList<CountryData> Countries = new ArrayList<CountryData>();

            String sql = "SELECT country.Code, name, continent, region, population FROM country group by country.Code";

            try
                    (
                            Connection connection = DriverManager.getConnection(m_connectURL, m_user, m_password);
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql);
                    )
            {
                // while there is another record...loop
                while(resultSet.next())
                {
                    // deserialize (decode) the data from database table
                    String Code = resultSet.getString("Code");
                    String name = resultSet.getString("name");
                    String continent = resultSet.getString("continent");
                    String region = resultSet.getString("region");
                    int population = resultSet.getInt("population");

                    // create an anonymous Vector2D object with the data from the database
                    // then add the new Vector2D object to the vectors ArrayList
                    Countries.add(new CountryData(Code, name, continent, region, population));
                }
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }

            return Countries;
        }

    }


