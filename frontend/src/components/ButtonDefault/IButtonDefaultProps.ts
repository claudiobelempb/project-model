import { ButtonHTMLAttributes, ReactNode } from 'react';

export interface IButtonDefaultProps
  extends ButtonHTMLAttributes<HTMLButtonElement> {
  title?: string;
  type: 'submit' | 'button' | 'reset';
  size:
    | 'full'
    | 'large'
    | 'medium'
    | 'small'
    | 'full'
    | 'link'
    | 'close'
    | 'icon';
  children?: ReactNode;
  className?: string;
  alt?: string;
  hasError?: boolean;
  src?: string;
  href?: string | null;
  disabled?: boolean;
  bgcolor?:
    | 'bgcolor__black_000'
    | 'bgcolor__black_100'
    | 'bgcolor__white_000'
    | 'bgcolor__white_200'
    | 'bgcolor__green_100'
    | 'bgcolor__green_rgba'
    | 'bgcolor__green_300'
    | 'bgcolor__green_400'
    | 'bgcolor__green_500'
    | 'bgcolor__gray_200'
    | 'bgcolor__gray_300'
    | 'bgcolor__gray_500'
    | 'bgcolor__gray_700'
    | 'bgcolor__gray_900'
    | 'bgcolor__blue_100'
    | 'bgcolor__blue_200'
    | 'bgcolor__blue_500'
    | 'bgcolor__blue_600'
    | 'bgcolor__yellow_000'
    | 'bgcolor__yellow_800'
    | 'bgcolor__pink_800'
    | 'bgcolor__pink_200'
    | 'bgcolor__red_rgba'
    | 'bgcolor__red_300'
    | 'bgcolor__red_500';

  color?:
    | 'color__black_000'
    | 'color__black_100'
    | 'color__white_000'
    | 'color__white_200'
    | 'color__green_100'
    | 'color__green_rgba'
    | 'color__green_300'
    | 'color__green_400'
    | 'color__green_500'
    | 'color__gray_200'
    | 'color__gray_300'
    | 'color__gray_500'
    | 'color__gray_700'
    | 'color__gray_900'
    | 'color__blue_100'
    | 'color__blue_200'
    | 'color__blue_500'
    | 'color__blue_600'
    | 'color__yellow_000'
    | 'color__yellow_800'
    | 'color__pink_800'
    | 'color__pink_200'
    | 'color__red_rgba'
    | 'color__red_300'
    | 'color__red_500';
}
