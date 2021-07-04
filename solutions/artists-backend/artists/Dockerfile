# STEP 1 -----------------------------------------------
FROM mcr.microsoft.com/dotnet/core/sdk:3.1 AS build
WORKDIR /app

########################
ENV APP_NAME=artists-api
########################

# copy csproj and restore as distinct layers
COPY *.sln .
COPY ${APP_NAME}/*.csproj ./${APP_NAME}/
RUN dotnet restore

# copy everything else and build app
COPY ${APP_NAME}/. ./${APP_NAME}/
WORKDIR /app/${APP_NAME}
RUN dotnet publish -c Release -o out


# STEP 2 -----------------------------------------------
FROM mcr.microsoft.com/dotnet/core/aspnet:3.1 AS runtime
WORKDIR /app

########################
ENV APP_NAME=artists-api
########################

COPY --from=build /app/${APP_NAME}/out ./
ENTRYPOINT ["dotnet", "artists-api.dll"]