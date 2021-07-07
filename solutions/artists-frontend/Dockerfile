FROM nginx:1.21.1-alpine
ENV APP_NAME=artists-frontend
COPY nginx.conf /etc/nginx/nginx.conf
COPY /dist/${APP_NAME} /usr/share/nginx/html