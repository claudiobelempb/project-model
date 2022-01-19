import { BrandDefault } from "../BrandDefault";
import { ButtonDefault } from "../ButtonDefault";
import { IHeaderoneyProps } from "./IHeaderoneyProps";

import styles from "./styles.module.scss";

const HeaderDtMoney: React.FC<IHeaderoneyProps> = ({
  onOpenNenTransactionModal,
}) => {
  return (
    <header className={`container ${styles.header__container}`}>
      <section className={`content`}>
        <div className="grid__2">
          <BrandDefault type={"brand-img"} href="/" />
          <ButtonDefault
            className="dflex dflex__end"
            title="Nova transação"
            size="medium"
            type="button"
            onClick={onOpenNenTransactionModal}
          />
        </div>
      </section>
    </header>
  );
};

export default HeaderDtMoney;
