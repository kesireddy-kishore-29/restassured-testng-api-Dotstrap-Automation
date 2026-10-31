# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-5c6de37b-cdeb-4f39-8014-3453657528b6` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-23156502-532d-4ac6-9db0-6ff8243f6e55` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-a77957ca-a9a7-4959-92cf-a16f9c97535b` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-cdc4ccd7-61a4-44cc-b08b-2808ad11c35e` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-3988ea8e-ec93-40bc-9a3c-5ad311eb6809` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-a83344bd-180a-4458-b2de-a310e6738135` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-29af3a58-29f4-429c-a1b4-6b06fecb3424` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 4 | `qa-cd7c1151-99b4-4838-9f22-4573c20f188f` |
| 9 | `GET /v1/credits/balance` | 200 | 12 | `qa-a4bbf35d-772c-4896-bb89-6bbf271edf59` |
| 10 | `POST /v1/conversations` | 402 | 14 | `qa-43d1ee25-a8cc-4166-a099-795063d19d3b` |
| 11 | `GET /v1/credits/ledger` | 200 | 14 | `qa-8c9a899f-6a8e-463c-a4fe-a4248035a5fd` |
| 12 | `POST /v1/auth/token` | 200 | 9 | `qa-e158f5c6-a558-48ae-941e-a4dbcf05e93c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-afa4f120-7bba-43fa-9cf1-f1ccd97ea75d` |
| 14 | `POST /v1/auth/token` | 401 | 2 | `qa-d5f3a27a-be32-4b4f-bb5d-e78d04ebd827` |
| 15 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9238341b-9059-4898-b069-539c45dc7b5e` |
| 16 | `POST /v1/auth/token` | 401 | 10 | `qa-59b9696b-4596-4678-9f12-8cee28653fa6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5c6de37b-cdeb-4f39-8014-3453657528b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c6de37b-cdeb-4f39-8014-3453657528b6
Content-Type: application/json

--- request body ---
{"handle":"qa-baa56583e8d9","displayName":"QA baa56583e8d9","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c6de37b-cdeb-4f39-8014-3453657528b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-baa56583e8d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d0de58a-40ee-403b-b287-ab6ea9736fc2","handle":"qa-baa56583e8d9","displayName":"QA baa56583e8d9","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.880878533Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-23156502-532d-4ac6-9db0-6ff8243f6e55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23156502-532d-4ac6-9db0-6ff8243f6e55
Content-Type: application/json

--- request body ---
{"handle":"qa-b33dac6ae467","displayName":"QA b33dac6ae467","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-23156502-532d-4ac6-9db0-6ff8243f6e55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Location: /v1/accounts/qa-b33dac6ae467
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49c5e8c4-3f26-43ea-8957-8994f684d8cd","handle":"qa-b33dac6ae467","displayName":"QA b33dac6ae467","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.904063321Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a77957ca-a9a7-4959-92cf-a16f9c97535b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a77957ca-a9a7-4959-92cf-a16f9c97535b
Content-Type: application/json

--- request body ---
{"handle":"qa-baa56583e8d9","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a77957ca-a9a7-4959-92cf-a16f9c97535b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d0de58a-40ee-403b-b287-ab6ea9736fc2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cdc4ccd7-61a4-44cc-b08b-2808ad11c35e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdc4ccd7-61a4-44cc-b08b-2808ad11c35e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b33dac6ae467","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdc4ccd7-61a4-44cc-b08b-2808ad11c35e
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
Location: /v1/conversations/cnv_009bd28e-99a3-4056-ba16-339152c5b17a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_009bd28e-99a3-4056-ba16-339152c5b17a","subject":"Error contract","status":"open","region":"eu","participants":["qa-baa56583e8d9","qa-b33dac6ae467"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.961088714Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_009bd28e-99a3-4056-ba16-339152c5b17a/messages
correlation: qa-3988ea8e-ec93-40bc-9a3c-5ad311eb6809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3988ea8e-ec93-40bc-9a3c-5ad311eb6809
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3988ea8e-ec93-40bc-9a3c-5ad311eb6809
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

{"id":"msg_c9a361f7-8f41-4aee-badf-6bfc57f3ee34","conversationId":"cnv_009bd28e-99a3-4056-ba16-339152c5b17a","sender":"qa-baa56583e8d9","body":"2","createdAt":"2026-10-28T08:42:52.984665985Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_009bd28e-99a3-4056-ba16-339152c5b17a/messages
correlation: qa-a83344bd-180a-4458-b2de-a310e6738135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a83344bd-180a-4458-b2de-a310e6738135
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a83344bd-180a-4458-b2de-a310e6738135
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

{"id":"msg_96f2278e-a43b-4a3b-85f0-2839794663d4","conversationId":"cnv_009bd28e-99a3-4056-ba16-339152c5b17a","sender":"qa-baa56583e8d9","body":"3","createdAt":"2026-10-28T08:42:53.006466807Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_009bd28e-99a3-4056-ba16-339152c5b17a/messages
correlation: qa-29af3a58-29f4-429c-a1b4-6b06fecb3424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29af3a58-29f4-429c-a1b4-6b06fecb3424
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-29af3a58-29f4-429c-a1b4-6b06fecb3424
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

{"id":"msg_7fc7b5d3-6c18-42f6-86d5-012d2ce952e7","conversationId":"cnv_009bd28e-99a3-4056-ba16-339152c5b17a","sender":"qa-baa56583e8d9","body":"4","createdAt":"2026-10-28T08:42:53.021666492Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_009bd28e-99a3-4056-ba16-339152c5b17a/messages
correlation: qa-cd7c1151-99b4-4838-9f22-4573c20f188f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd7c1151-99b4-4838-9f22-4573c20f188f
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd7c1151-99b4-4838-9f22-4573c20f188f
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

{"id":"msg_0aabd255-46c1-4a36-8721-f908baea28e8","conversationId":"cnv_009bd28e-99a3-4056-ba16-339152c5b17a","sender":"qa-baa56583e8d9","body":"5","createdAt":"2026-10-28T08:42:53.037644877Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-a4bbf35d-772c-4896-bb89-6bbf271edf59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4bbf35d-772c-4896-bb89-6bbf271edf59
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4bbf35d-772c-4896-bb89-6bbf271edf59
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

{"balance":0,"currency":"credits","accountId":"acc_2d0de58a-40ee-403b-b287-ab6ea9736fc2"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-43d1ee25-a8cc-4166-a099-795063d19d3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d1ee25-a8cc-4166-a099-795063d19d3b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b33dac6ae467","subject":"One more","message":"Hi"}

--- response: 402 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43d1ee25-a8cc-4166-a099-795063d19d3b
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
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-43d1ee25-a8cc-4166-a099-795063d19d3b"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8c9a899f-6a8e-463c-a4fe-a4248035a5fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9a899f-6a8e-463c-a4fe-a4248035a5fd
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c9a899f-6a8e-463c-a4fe-a4248035a5fd
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

{"items":[{"id":"led_2c21a9be-561f-484d-8869-f364344bf711","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-28T08:42:52.880887527Z"},{"id":"led_1f39ca4d-ad2a-4d73-993c-e5087507d89f","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_009bd28e-99a3-4056-ba16-339152c5b17a","createdAt":"2026-10-28T08:42:52.961080241Z"},{"id":"led_852c72a7-473d-40fb-b535-a0bfe2ba82da","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_c9a361f7-8f41-4aee-badf-6bfc57f3ee34","createdAt":"2026-10-28T08:42:52.984654828Z"},{"id":"led_d7910aae-a7d3-4cea-944f-2671d94917b8","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_96f2278e-a43b-4a3b-85f0-2839794663d4","createdAt":"2026-10-28T08:42:53.006458664Z"},{"id":"led_d3022903-8202-4b55-9425-648646fde72b","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_7fc7b5d3-6c18-42f6-86d5-012d2ce952e7","createdAt":"2026-10-28T08:42:53.021659231Z"},{"id":"led_8d100f6e-3328-41e0-bbf2-03004e3364d8","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_0aabd255-46c1-4a36-8721-f908baea28e8","createdAt":"2026-10-28T08:42:53.037638146Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e158f5c6-a558-48ae-941e-a4dbcf05e93c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e158f5c6-a558-48ae-941e-a4dbcf05e93c
Content-Type: application/json

--- request body ---
{"handle":"qa-b33dac6ae467","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e158f5c6-a558-48ae-941e-a4dbcf05e93c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49c5e8c4-3f26-43ea-8957-8994f684d8cd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afa4f120-7bba-43fa-9cf1-f1ccd97ea75d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afa4f120-7bba-43fa-9cf1-f1ccd97ea75d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afa4f120-7bba-43fa-9cf1-f1ccd97ea75d
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
correlation: qa-d5f3a27a-be32-4b4f-bb5d-e78d04ebd827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5f3a27a-be32-4b4f-bb5d-e78d04ebd827
Content-Type: application/json

--- request body ---
{"handle":"qa-b33dac6ae467","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5f3a27a-be32-4b4f-bb5d-e78d04ebd827
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5f3a27a-be32-4b4f-bb5d-e78d04ebd827"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9238341b-9059-4898-b069-539c45dc7b5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9238341b-9059-4898-b069-539c45dc7b5e
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9238341b-9059-4898-b069-539c45dc7b5e
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
correlation: qa-59b9696b-4596-4678-9f12-8cee28653fa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b9696b-4596-4678-9f12-8cee28653fa6
Content-Type: application/json

--- request body ---
{"handle":"qa-baa56583e8d9","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59b9696b-4596-4678-9f12-8cee28653fa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59b9696b-4596-4678-9f12-8cee28653fa6"}
```
