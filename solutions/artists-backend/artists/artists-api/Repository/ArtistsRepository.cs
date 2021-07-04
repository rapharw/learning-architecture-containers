using System;
using System.Collections.Generic;

namespace artists_api.Repository
{
    public class ArtistsRepository
    {
        
        public ArtistsRepository()
        {
        }

        public static List<Artist> FindAll()
        {

            Artist _1 = new Artist(1, "Amy Winehouse", DateTime.Parse("1983-09-14"), "Music");
            Artist _2 = new Artist(2, "Kurt Cobain", DateTime.Parse("1967-02-20"), "Music");
            Artist _3 = new Artist(3, "Vincent van Gogh", DateTime.Parse("1853-03-30"), "Painter");
            Artist _4 = new Artist(4, "J. R. R. Tolkien", DateTime.Parse("1892-01-01"), "Writer");
            Artist _5 = new Artist(5, "Jane Austen", DateTime.Parse("1775-12-16"), "Writer");

            List<Artist> Artists = new List<Artist>();

            Artists.Add(_1);
            Artists.Add(_2);
            Artists.Add(_3);
            Artists.Add(_4);
            Artists.Add(_5);


            return Artists;
        }


    }
}
