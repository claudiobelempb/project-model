import { ButtonDefault } from 'components/ButtonDefault';
import { FaAngleLeft, FaAngleRight } from 'react-icons/fa';
import { MoviePage } from 'types/MoviePage';
import styles from './styles.module.scss';

type PaginationProps = {
  page: MoviePage;
  onClick: Function;
};

const PaginationDefault: React.FC<PaginationProps> = ({ page, onClick }) => {
  return (
    <div className={styles.paginatoContainer}>
      <ButtonDefault
        onClick={() => onClick(page.number - 1)}
        size='icon'
        type='button'
        disabled={page.first}
      >
        <FaAngleLeft />
      </ButtonDefault>
      <span>{`${page.number + 1} de ${page.totalPages}`}</span>
      <ButtonDefault
        onClick={() => onClick(page.number + 1)}
        size='icon'
        type='button'
        disabled={page.last}
      >
        <FaAngleRight className='dsmovie-flip-horizontal' />
      </ButtonDefault>

      {/* <nav aria-label='Page navigation example'>
        <ul>
          <li>
            <a aria-disabled='true' href='#'>
              <FaAngleLeft />
            </a>
          </li>
          <li>
            <a href='#'>1</a>
          </li>
          <span>de</span>
          <li>
            <a href='#'>23</a>
          </li>

          <li>
            <a href='#'>
              <FaAngleRight />
            </a>
          </li>
        </ul>
      </nav> */}
    </div>
  );
};

export { PaginationDefault };
