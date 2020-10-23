<template>
  <span
    class="text-white rounded-full uppercase px-2 py-1 text-xs font-bold mr-3"
    :class="[getColor]"
  >
    {{ label }}
  </span>
</template>

<script lang="ts">
import Vue, { PropOptions } from 'vue'
import { Color, getColorSet } from '../../mixins/Colors'

export default Vue.extend({
  name: 'MyChip',
  props: {
    label: {
      type: String,
      required: false,
      default: 'info',
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
