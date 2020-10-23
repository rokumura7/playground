<template>
  <button
    class="text-white uppercase font-bold py-1 px-2 rounded"
    :class="[getColor]"
  >
    {{ label }}
  </button>
</template>

<script lang="ts">
import Vue, { PropOptions } from 'vue'
import { Color, getColorSet } from '../../mixins/Colors'

export default Vue.extend({
  name: 'MyButton',
  props: {
    label: {
      type: String,
      required: true,
      default: '',
    },
    color: {
      type: String,
      required: false,
      default: 'default',
    } as PropOptions<Color>,
  },
  computed: {
    getColor(): String {
      const colorSet = getColorSet(this.color)
      return [colorSet.bg, colorSet.bgHover].join(' ')
    },
  },
})
</script>
