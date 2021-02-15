<template>
  <input
    class="px-2 w-full rounded border border-blue-100 border-transparent focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent"
    :type="type"
    :placeholder="placeholder"
  />
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'MyInput',
  props: {
    type: {
      type: String,
      default: 'text',
    },
    placeholder: {
      type: String,
      default: '',
    },
  },
})
</script>
