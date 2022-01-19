import type { NextPage } from 'next';

import { HeaderDsMovie } from '../components/HeaderDsMovie';

import styles from './styles.module.scss';

import { PaginationDefault } from 'components/PaginationDefault';
import { MovieCard } from 'components/MovieCard';
import { api } from 'services/api';
import { useEffect, useState } from 'react';
import { MoviePage } from 'types/MoviePage';

const Home: NextPage = () => {
  const [pageNumer, setPageNumber] = useState(0);

  const [page, setPage] = useState<MoviePage>({
    content: [],
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 12,
    number: 0,
    first: true,
    numberOfElements: 0,
    empty: true
  });

  useEffect(() => {
    api.get(`/movies?page=${pageNumer}&size=12&sort=id,asc`).then(resp => {
      const data = resp.data as MoviePage;
      console.log('Movie', data);

      setPage(data);
    });
  }, [pageNumer]);

  const handlePageChange = (newPageNumber: number) => {
    setPageNumber(newPageNumber);
  };

  return (
    <div className=''>
      <HeaderDsMovie title='Home' />
      <main className={`container`}>
        <div className='content'>
          <PaginationDefault page={page} onClick={handlePageChange} />
        </div>
        <div className='content'>
          <section className={`grid grid_3 ${styles.home__container}`}>
            {page.content.map(movie => (
              <MovieCard key={movie.id} movie={movie} />
            ))}
          </section>
        </div>
      </main>
    </div>
  );
};

export default Home;
