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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-27551b19-3f97-433e-a2b9-5cf8aab58667` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-14f8d412-9913-4092-b1b4-12b9c3919dff` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-8e6892d6-8d3f-497b-b0bb-ebce25d885d3` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-9e022d1b-b505-48cb-b34e-91b7ba338e2c` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-fe0b3c51-6e53-4b13-bf25-86f02dd7c5c0` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-d9b8ff8c-ea54-43bd-870a-4bea1dd9ad10` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-f38108c1-3e4a-4f92-bd59-26c936eb3709` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-0823df22-b263-444b-81d4-336a89dc5754` |
| 9 | `GET /v1/credits/balance` | 200 | 5 | `qa-29ecde90-8746-4e65-a745-282c34cfb480` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 13 | `qa-8d0a3042-ac92-4a2e-8d01-44553561145d` |
| 11 | `GET /v1/credits/ledger` | 200 | 21 | `qa-25d28859-781b-4179-a666-848551615fcd` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-3d37b6cb-6f82-4520-8bf1-d6cfb0cd214a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-70ad7fc6-383f-48a2-aeb9-d55c1d83f8be` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-d28d1cb0-10a1-44db-a8a3-f3cb9b616b00` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-6b4d3f85-4805-4a37-b7e0-1087497e1f66` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-a34bb478-7b09-4a47-8591-0b2a7a98b5a0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-27551b19-3f97-433e-a2b9-5cf8aab58667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27551b19-3f97-433e-a2b9-5cf8aab58667
Content-Type: application/json

--- request body ---
{"handle":"qa-47c873d8c24a","displayName":"QA 47c873d8c24a","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-27551b19-3f97-433e-a2b9-5cf8aab58667
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-47c873d8c24a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7fbb8b34-d77c-404e-bf7b-aab6a1426e72","handle":"qa-47c873d8c24a","displayName":"QA 47c873d8c24a","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.973996158Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-14f8d412-9913-4092-b1b4-12b9c3919dff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14f8d412-9913-4092-b1b4-12b9c3919dff
Content-Type: application/json

--- request body ---
{"handle":"qa-dadd5e7cb264","displayName":"QA dadd5e7cb264","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-14f8d412-9913-4092-b1b4-12b9c3919dff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-dadd5e7cb264
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1aee0d0-e4ec-49a6-a48b-9dd0dad870ef","handle":"qa-dadd5e7cb264","displayName":"QA dadd5e7cb264","region":"eu","role":"user","createdAt":"2026-11-16T09:53:55.006174528Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8e6892d6-8d3f-497b-b0bb-ebce25d885d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e6892d6-8d3f-497b-b0bb-ebce25d885d3
Content-Type: application/json

--- request body ---
{"handle":"qa-47c873d8c24a","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e6892d6-8d3f-497b-b0bb-ebce25d885d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7fbb8b34-d77c-404e-bf7b-aab6a1426e72"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9e022d1b-b505-48cb-b34e-91b7ba338e2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e022d1b-b505-48cb-b34e-91b7ba338e2c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dadd5e7cb264","subject":"Many messages","message":"1"}

--- response: 201 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e022d1b-b505-48cb-b34e-91b7ba338e2c
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
Location: /v1/conversations/cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d","subject":"Many messages","status":"open","region":"eu","participants":["qa-47c873d8c24a","qa-dadd5e7cb264"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:55.057243052Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d/messages
correlation: qa-fe0b3c51-6e53-4b13-bf25-86f02dd7c5c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe0b3c51-6e53-4b13-bf25-86f02dd7c5c0
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe0b3c51-6e53-4b13-bf25-86f02dd7c5c0
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

{"id":"msg_76897e07-597a-4aed-a9d4-2efa04efae31","conversationId":"cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d","sender":"qa-47c873d8c24a","body":"2","createdAt":"2026-11-16T09:53:55.088675024Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d/messages
correlation: qa-d9b8ff8c-ea54-43bd-870a-4bea1dd9ad10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9b8ff8c-ea54-43bd-870a-4bea1dd9ad10
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9b8ff8c-ea54-43bd-870a-4bea1dd9ad10
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

{"id":"msg_5914c8c4-e648-447f-ac5a-14e15308fe75","conversationId":"cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d","sender":"qa-47c873d8c24a","body":"3","createdAt":"2026-11-16T09:53:55.126112557Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d/messages
correlation: qa-f38108c1-3e4a-4f92-bd59-26c936eb3709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f38108c1-3e4a-4f92-bd59-26c936eb3709
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f38108c1-3e4a-4f92-bd59-26c936eb3709
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

{"id":"msg_c12d97f3-d332-475e-938f-b31ae96db10c","conversationId":"cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d","sender":"qa-47c873d8c24a","body":"4","createdAt":"2026-11-16T09:53:55.156783224Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d/messages
correlation: qa-0823df22-b263-444b-81d4-336a89dc5754

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0823df22-b263-444b-81d4-336a89dc5754
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-0823df22-b263-444b-81d4-336a89dc5754
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

{"id":"msg_52bed834-e542-4b10-b5a2-2aeaae026131","conversationId":"cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d","sender":"qa-47c873d8c24a","body":"5","createdAt":"2026-11-16T09:53:55.171221920Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-29ecde90-8746-4e65-a745-282c34cfb480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29ecde90-8746-4e65-a745-282c34cfb480
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-29ecde90-8746-4e65-a745-282c34cfb480
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

{"balance":0,"currency":"credits","accountId":"acc_7fbb8b34-d77c-404e-bf7b-aab6a1426e72"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d/messages
correlation: qa-8d0a3042-ac92-4a2e-8d01-44553561145d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d0a3042-ac92-4a2e-8d01-44553561145d
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d0a3042-ac92-4a2e-8d01-44553561145d
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d/messages","correlationId":"qa-8d0a3042-ac92-4a2e-8d01-44553561145d"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-25d28859-781b-4179-a666-848551615fcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25d28859-781b-4179-a666-848551615fcd
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-25d28859-781b-4179-a666-848551615fcd
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

{"items":[{"id":"led_f52b5f98-964b-4b15-b2ba-6883c4098ad8","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-16T09:53:54.974013414Z"},{"id":"led_a0f7246d-99c1-4c1d-be49-08d75b502848","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_ded1d3fd-cf3e-4acf-99e6-d9323786e88d","createdAt":"2026-11-16T09:53:55.057229812Z"},{"id":"led_da54f72b-9355-4505-968d-929bdc4b7c3b","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_76897e07-597a-4aed-a9d4-2efa04efae31","createdAt":"2026-11-16T09:53:55.088656266Z"},{"id":"led_47223139-bcca-4f69-9ee6-3d7f967d0a55","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_5914c8c4-e648-447f-ac5a-14e15308fe75","createdAt":"2026-11-16T09:53:55.126083062Z"},{"id":"led_06642bb1-e8b6-4795-9755-35364bfa00af","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_c12d97f3-d332-475e-938f-b31ae96db10c","createdAt":"2026-11-16T09:53:55.156747530Z"},{"id":"led_6a024cfe-2025-43f1-9908-dfc476adcb39","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_52bed834-e542-4b10-b5a2-2aeaae026131","createdAt":"2026-11-16T09:53:55.171178985Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-3d37b6cb-6f82-4520-8bf1-d6cfb0cd214a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d37b6cb-6f82-4520-8bf1-d6cfb0cd214a
Content-Type: application/json

--- request body ---
{"handle":"qa-dadd5e7cb264","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d37b6cb-6f82-4520-8bf1-d6cfb0cd214a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1aee0d0-e4ec-49a6-a48b-9dd0dad870ef"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70ad7fc6-383f-48a2-aeb9-d55c1d83f8be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ad7fc6-383f-48a2-aeb9-d55c1d83f8be
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70ad7fc6-383f-48a2-aeb9-d55c1d83f8be
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
correlation: qa-d28d1cb0-10a1-44db-a8a3-f3cb9b616b00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d28d1cb0-10a1-44db-a8a3-f3cb9b616b00
Content-Type: application/json

--- request body ---
{"handle":"qa-dadd5e7cb264","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d28d1cb0-10a1-44db-a8a3-f3cb9b616b00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d28d1cb0-10a1-44db-a8a3-f3cb9b616b00"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b4d3f85-4805-4a37-b7e0-1087497e1f66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b4d3f85-4805-4a37-b7e0-1087497e1f66
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b4d3f85-4805-4a37-b7e0-1087497e1f66
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
correlation: qa-a34bb478-7b09-4a47-8591-0b2a7a98b5a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a34bb478-7b09-4a47-8591-0b2a7a98b5a0
Content-Type: application/json

--- request body ---
{"handle":"qa-47c873d8c24a","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a34bb478-7b09-4a47-8591-0b2a7a98b5a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a34bb478-7b09-4a47-8591-0b2a7a98b5a0"}
```
