# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-751ac18e-6509-4828-b942-976e9fa68e02` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-01fc9b72-2eb0-47e2-b547-16b15b25b881` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-6122feec-d189-443e-adc7-82cc827b8c87` |
| 4 | `POST /v1/conversations` | 201 | 34 | `qa-bce314f5-c0ae-4428-bf9f-a1b05013361b` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-1d4f7d94-9b16-4313-8f69-ba90d66437fa` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-3e71c170-01f1-4a77-a08c-cc04f6a046ea` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-57bcb6c0-efd4-46ca-a313-7d455cc4b757` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-51ee92d3-ed45-47ef-9cf3-430a9ccab06f` |
| 9 | `GET /v1/credits/balance` | 200 | 13 | `qa-39b4c110-4a9d-40cb-bbd9-223934151ff9` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 14 | `qa-2c0b42d4-56be-4179-af76-83c1389c497a` |
| 11 | `GET /v1/credits/ledger` | 200 | 17 | `qa-847206b9-504e-43fd-83a1-e5ae463ea17b` |
| 12 | `POST /v1/auth/token` | 200 | 9 | `qa-af4185ef-9ae9-4bc3-926c-d799a79dbbca` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e32f9170-2370-4fb4-bfa5-76688a462f69` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-2e7f734d-14de-4918-a642-8106d25657b9` |
| 15 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-1087db97-e1ce-40c6-adc6-29df748a2360` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-227f9d89-5eb9-44e3-a6df-6ef232bfaf5c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-751ac18e-6509-4828-b942-976e9fa68e02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-751ac18e-6509-4828-b942-976e9fa68e02
Content-Type: application/json

--- request body ---
{"handle":"qa-f57212c4ded3","displayName":"QA f57212c4ded3","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-751ac18e-6509-4828-b942-976e9fa68e02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-f57212c4ded3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0852b518-a6b6-4690-8789-bda06742a410","handle":"qa-f57212c4ded3","displayName":"QA f57212c4ded3","region":"eu","role":"user","createdAt":"2026-10-28T08:42:59.766072580Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-01fc9b72-2eb0-47e2-b547-16b15b25b881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01fc9b72-2eb0-47e2-b547-16b15b25b881
Content-Type: application/json

--- request body ---
{"handle":"qa-bfbbe94ba1b3","displayName":"QA bfbbe94ba1b3","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-01fc9b72-2eb0-47e2-b547-16b15b25b881
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-bfbbe94ba1b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_189e7cd5-0dac-4c66-9987-6b00bca86d14","handle":"qa-bfbbe94ba1b3","displayName":"QA bfbbe94ba1b3","region":"eu","role":"user","createdAt":"2026-10-28T08:42:59.796632219Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6122feec-d189-443e-adc7-82cc827b8c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6122feec-d189-443e-adc7-82cc827b8c87
Content-Type: application/json

--- request body ---
{"handle":"qa-f57212c4ded3","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6122feec-d189-443e-adc7-82cc827b8c87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0852b518-a6b6-4690-8789-bda06742a410"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bce314f5-c0ae-4428-bf9f-a1b05013361b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bce314f5-c0ae-4428-bf9f-a1b05013361b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bfbbe94ba1b3","subject":"Many messages","message":"1"}

--- response: 201 in 34 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bce314f5-c0ae-4428-bf9f-a1b05013361b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76","subject":"Many messages","status":"open","region":"eu","participants":["qa-f57212c4ded3","qa-bfbbe94ba1b3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:59.864696708Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76/messages
correlation: qa-1d4f7d94-9b16-4313-8f69-ba90d66437fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d4f7d94-9b16-4313-8f69-ba90d66437fa
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d4f7d94-9b16-4313-8f69-ba90d66437fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_8cdf41f2-edde-480e-a6b8-5739b8b69fcb","conversationId":"cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76","sender":"qa-f57212c4ded3","body":"2","createdAt":"2026-10-28T08:42:59.949432032Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76/messages
correlation: qa-3e71c170-01f1-4a77-a08c-cc04f6a046ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e71c170-01f1-4a77-a08c-cc04f6a046ea
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e71c170-01f1-4a77-a08c-cc04f6a046ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_9d6e9b6e-aa40-402c-afdb-bcb39628c222","conversationId":"cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76","sender":"qa-f57212c4ded3","body":"3","createdAt":"2026-10-28T08:42:59.972272591Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76/messages
correlation: qa-57bcb6c0-efd4-46ca-a313-7d455cc4b757

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57bcb6c0-efd4-46ca-a313-7d455cc4b757
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-57bcb6c0-efd4-46ca-a313-7d455cc4b757
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_441984ec-abb3-4ad6-9bfe-4334e210555e","conversationId":"cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76","sender":"qa-f57212c4ded3","body":"4","createdAt":"2026-10-28T08:42:59.988531355Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76/messages
correlation: qa-51ee92d3-ed45-47ef-9cf3-430a9ccab06f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51ee92d3-ed45-47ef-9cf3-430a9ccab06f
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-51ee92d3-ed45-47ef-9cf3-430a9ccab06f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_c0c58715-51be-4db4-96ee-efda6046caa9","conversationId":"cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76","sender":"qa-f57212c4ded3","body":"5","createdAt":"2026-10-28T08:42:59.999469143Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-39b4c110-4a9d-40cb-bbd9-223934151ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b4c110-4a9d-40cb-bbd9-223934151ff9
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-39b4c110-4a9d-40cb-bbd9-223934151ff9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_0852b518-a6b6-4690-8789-bda06742a410"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76/messages
correlation: qa-2c0b42d4-56be-4179-af76-83c1389c497a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c0b42d4-56be-4179-af76-83c1389c497a
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 14 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c0b42d4-56be-4179-af76-83c1389c497a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76/messages","correlationId":"qa-2c0b42d4-56be-4179-af76-83c1389c497a"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-847206b9-504e-43fd-83a1-e5ae463ea17b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-847206b9-504e-43fd-83a1-e5ae463ea17b
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-847206b9-504e-43fd-83a1-e5ae463ea17b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_b61bbe6c-8f5c-4b4b-abde-56ad0b49bdb8","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-28T08:42:59.766088023Z"},{"id":"led_fa20ebb9-a2a9-42ff-994b-9f3aa7ea3acf","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_8d8a46c7-7cc4-4c3b-a8ab-beb6d0d14a76","createdAt":"2026-10-28T08:42:59.864493592Z"},{"id":"led_616d26fa-a1ae-4287-87fe-66e651006d23","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_8cdf41f2-edde-480e-a6b8-5739b8b69fcb","createdAt":"2026-10-28T08:42:59.949397320Z"},{"id":"led_4fae1af9-cb6e-4ff6-91d5-3ddf771ca5c5","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_9d6e9b6e-aa40-402c-afdb-bcb39628c222","createdAt":"2026-10-28T08:42:59.972243087Z"},{"id":"led_87ed18f8-f739-4c53-8dd0-22585f675104","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_441984ec-abb3-4ad6-9bfe-4334e210555e","createdAt":"2026-10-28T08:42:59.988500879Z"},{"id":"led_c6842061-e2c3-4f7a-a6fe-22c11f747707","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_c0c58715-51be-4db4-96ee-efda6046caa9","createdAt":"2026-10-28T08:42:59.999440740Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-af4185ef-9ae9-4bc3-926c-d799a79dbbca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af4185ef-9ae9-4bc3-926c-d799a79dbbca
Content-Type: application/json

--- request body ---
{"handle":"qa-bfbbe94ba1b3","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-af4185ef-9ae9-4bc3-926c-d799a79dbbca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_189e7cd5-0dac-4c66-9987-6b00bca86d14"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e32f9170-2370-4fb4-bfa5-76688a462f69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e32f9170-2370-4fb4-bfa5-76688a462f69
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e32f9170-2370-4fb4-bfa5-76688a462f69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-2e7f734d-14de-4918-a642-8106d25657b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e7f734d-14de-4918-a642-8106d25657b9
Content-Type: application/json

--- request body ---
{"handle":"qa-bfbbe94ba1b3","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e7f734d-14de-4918-a642-8106d25657b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e7f734d-14de-4918-a642-8106d25657b9"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1087db97-e1ce-40c6-adc6-29df748a2360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1087db97-e1ce-40c6-adc6-29df748a2360
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1087db97-e1ce-40c6-adc6-29df748a2360
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-227f9d89-5eb9-44e3-a6df-6ef232bfaf5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227f9d89-5eb9-44e3-a6df-6ef232bfaf5c
Content-Type: application/json

--- request body ---
{"handle":"qa-f57212c4ded3","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-227f9d89-5eb9-44e3-a6df-6ef232bfaf5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-227f9d89-5eb9-44e3-a6df-6ef232bfaf5c"}
```
