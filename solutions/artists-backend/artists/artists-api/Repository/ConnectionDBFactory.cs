using System;
using System.Data.SqlClient;

namespace artists_api.Repository
{
    public class ConnectionDBFactory
    {
        public ConnectionDBFactory()
        {
        }

        public SqlConnection GetConnection()
        {
            SqlConnectionStringBuilder builder = new SqlConnectionStringBuilder();

            builder.DataSource = Environment.GetEnvironmentVariable("MSSQL_SERVER");
            builder.UserID = Environment.GetEnvironmentVariable("MSSQL_USERNAME");
            builder.Password = Environment.GetEnvironmentVariable("MSSQL_PASSWORD");
            builder.InitialCatalog = Environment.GetEnvironmentVariable("MSSQL_DATABASE");

            return new SqlConnection(builder.ConnectionString);
        }

    }
}