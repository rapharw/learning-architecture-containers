using System.Collections.Generic;

using artists_api.Domain;
using artists_api.Repository;

namespace artists_api.Services
{
    public class FindArtists
    {
        private ArtistsRepository artistsRepository;

        public FindArtists()
        {
            this.artistsRepository = new ArtistsRepository();
        }

        public List<Artist> Get(string ageGreaterThanEqual = null)
        {
            List<Artist> artists = artistsRepository.FindAll();

            if (!string.IsNullOrEmpty(ageGreaterThanEqual))
            {
                int age = int.Parse(ageGreaterThanEqual);
                return ArtistsFilter.AgeGreaterThanEqual(artists, age);
            }

            return artists;
        }

        public Artist GetOne(int id)
        {
            List<Artist> artists = artistsRepository.FindAll();

            return ArtistsFilter.ById(artists, id);
        }

    }
}
