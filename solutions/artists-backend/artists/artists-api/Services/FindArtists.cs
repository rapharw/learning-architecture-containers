using System.Collections.Generic;

using artists_api.Domain;
using artists_api.Repository;

namespace artists_api.Services
{
    public class FindArtists
    {

        public FindArtists()
        {
            
        }

        public List<Artist> Get(string ageGreaterThanEqual = null)
        {
            List<Artist> artists = ArtistsRepository.FindAll();

            if (!string.IsNullOrEmpty(ageGreaterThanEqual))
            {
                int age = int.Parse(ageGreaterThanEqual);
                return ArtistsFilter.AgeGreaterThanEqual(artists, age);
            }

            return artists;
        }

        public Artist GetOne(int id)
        {
            List<Artist> artists = ArtistsRepository.FindAll();

            return ArtistsFilter.ById(artists, id);
        }

    }
}
