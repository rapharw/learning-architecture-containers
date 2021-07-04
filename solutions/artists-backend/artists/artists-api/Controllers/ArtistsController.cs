using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using artists_api.Services;

namespace artists_api.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class ArtistsController : ControllerBase
    {

        private readonly ILogger _logger;

        public ArtistsController(ILogger<ArtistsController> logger) {
            _logger = logger;
        }

        [HttpGet]
        public IEnumerable<Artist> Get([FromQuery(Name = "ageGreaterThanEqual")] string ageGreaterThanEqual)
        {
            _logger.LogInformation("[GET /api/artists?ageGreaterThanEqual={ageGreaterThanEqual}]", ageGreaterThanEqual);

            FindArtists findArtists = new FindArtists();
            List<Artist> artists = findArtists.Get(ageGreaterThanEqual);

            _logger.LogInformation("Returning {size} artists", artists.Count);

            return artists;
        }

        [HttpGet("{id}")]
        public Artist GetOne([FromRoute(Name = "id")] int id)
        {
            _logger.LogInformation("[GET /api/artists/{id}]", id);

            FindArtists findArtists = new FindArtists();
            Artist artist = findArtists.GetOne(id);

            _logger.LogInformation("Returning artist {}", artist.Name);

            return artist;
        }

    }
}
