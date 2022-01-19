import Image from 'next/image';

import StarFull from 'assets/images/dsmovie/star-full.svg';
import StarHalf from 'assets/images/dsmovie/star-half.svg';
import StarEmpty from 'assets/images/dsmovie/star-empty.svg';
import { ButtonDefault } from 'components/ButtonDefault';

import styles from './styles.module.scss';
import { Movie } from 'types/Movie';
import { MovieStar } from 'components/MovieStar';

type MovieCardProps = {
  movie: Movie;
  score?: number;
};

const MovieCard: React.FC<MovieCardProps> = ({ movie }) => {
  // const stars = [StarFull, StarHalf, StarEmpty];

  return (
    <>
      <article className={`${styles.movie__container_card}`}>
        <Image src={movie.image} width={260} height={150} alt={movie.title} />
        <div className={`${styles.movie__container_card_content}`}>
          <h2>{movie.title}</h2>
          <span>{movie.score > 0 ? movie.score.toFixed(1) : '-'}</span>
          <div className={styles.movie__star}>
            <MovieStar score={movie.score} />
          </div>
          <strong>{movie.count} avaliações</strong>
          <ButtonDefault
            title='Avaliar'
            size='link'
            type='button'
            className='bgcolor__blue_400'
            href={`/valuation/${movie.id}`}
          />
        </div>
      </article>
    </>
  );
};

export { MovieCard };
