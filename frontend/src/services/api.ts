import axios from 'axios';
import { BASE_URL_API } from 'utils/requests';

// const NEXT_PUBLIC = `${process.env.NEXT_PUBLIC}`;
// const NEXT_PRODUCTION = `${process.env.NEXT_PRODUCTION}`;
// console.log('NEXT_PUBLIC: ', NEXT_PUBLIC);
// console.log('NEXT_PRODUCTION: ', NEXT_PRODUCTION);
console.log(BASE_URL_API);

const api = axios.create({
  withCredentials: true,
  baseURL: `${process.env.NEXT_PRODUCTION}`,
  headers: { 'Access-Control-Allow-Origin': '*' }
});

export { api };
