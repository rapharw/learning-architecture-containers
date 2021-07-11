using System;
using System.Collections.Generic;
using System.Data.SqlClient;

namespace artists_api.Repository
{
    public class ArtistsRepository: ConnectionDBFactory
    {
        
        public ArtistsRepository()
        {
        }

        public List<Artist> FindAll()
        {

            List<Artist> Artists = new List<Artist>();
            
            using (SqlConnection connection = GetConnection())
            {
                connection.Open();

                String sql = "SELECT id, name, birthday, area FROM artists";

                using (SqlCommand command = new SqlCommand(sql, connection))
                {
                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            int id = reader.GetInt32(0);
                            string name = reader.GetString(1);
                            DateTime birthday = reader.GetDateTime(2);
                            string area = reader.GetString(3);

                            Artist artist = new Artist(id, name, birthday, area);

                            Artists.Add(artist);
                        }
                    }
                }
            }

            return Artists;
        }

    }
}
