/** @type {import('next').NextConfig} */
module.exports = {
  reactStrictMode: true,
  // distDir: 'frontend/build',

  images: {
    domains: ['localhost', 'https://www.themoviedb.org', 'www.themoviedb.org']
  },

  env: {
    NEXT_PRODUCTION: process.env.NEXT_PRODUCTION
  }
};
