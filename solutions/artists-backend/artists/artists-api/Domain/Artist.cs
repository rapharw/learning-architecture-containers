using System;

namespace artists_api
{
    public class Artist
    {
        
        public int Id { get; }
        public string Name { get; }
        public DateTime Birthday { get; }
        public string Area { get; }

        public Artist(int id, string name, DateTime birthday, string area)
        {
            Id = id;
            Name = name;
            Birthday = birthday;
            Area = area;
        }

        public int GetAge(DateTime now)
        {
            int age = now.Year - Birthday.Year;

            if (now.Month < Birthday.Month || (now.Month == Birthday.Month && now.Day < Birthday.Day))
                age--;

            return age;
        }
    }

}
