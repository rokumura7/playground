export type Color = 'default' | 'primary' | 'success' | 'warning' | 'danger'
export const getColorSet = (color: Color): ColorSet => colors[color]

interface ColorSet {
  text: string
  bg: string
  bgHover: string
  border: string
}

interface Colors {
  primary: ColorSet
  success: ColorSet
  warning: ColorSet
  danger: ColorSet
  default: ColorSet
}

const colors = {
  primary: {
    text: 'text-indigo-600',
    bg: 'bg-indigo-500',
    bgHover: 'hover:bg-indigo-600',
    border: 'border-indigo-600',
  },
  success: {
    text: 'text-green-600',
    bg: 'bg-green-500',
    bgHover: 'hover:bg-green-600',
    border: 'border-green-600',
  },
  warning: {
    text: 'text-yellow-600',
    bg: 'bg-yellow-500',
    bgHover: 'hover:bg-yellow-600',
    border: 'border-yellow-600',
  },
  danger: {
    text: 'text-red-600',
    bg: 'bg-red-500',
    bgHover: 'hover:bg-red-600',
    border: 'border-red-600',
  },
  default: {
    text: 'text-gray-600',
    bg: 'bg-gray-500',
    bgHover: 'hover:bg-gray-600',
    border: 'border-gray-600',
  },
} as Colors
