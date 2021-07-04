using System;
using System.Collections.Generic;

namespace artists_api.Domain
{
    public class ArtistsFilter
    {
        public ArtistsFilter()
        {
        }

        public static List<Artist> AgeGreaterThanEqual(List<Artist> Artists, int Age)
        {
            DateTime now = DateTime.Now;
            return Artists.FindAll((Artist obj) => obj.GetAge(now) >= Age);
        }

        public static Artist ById(List<Artist> Artists, int Id)
        {
            return Artists.Find((Artist obj) => obj.Id == Id);
        }

    }
}
