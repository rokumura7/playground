<template>
  <h2
    class="font-bold text-white bg-gradient-to-r from-green-400 to-blue-500 text-center px-20 py-5"
  >
    {{ label }}
  </h2>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'CardHeader',
  props: {
    label: {
      type: String,
      default: "I'm label!",
    },
  },
})
</script>
